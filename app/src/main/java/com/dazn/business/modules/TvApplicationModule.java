/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dazn.business.modules;

import android.content.Context;

import com.dazn.business.MainActivity;
import com.dazn.business.SetupPassthroughActivity;
import com.dazn.business.TvApplication;
import com.dazn.business.common.buildtype.BuildTypeModule;
import com.dazn.business.common.concurrent.NamedThreadFactory;
import com.dazn.business.common.dagger.ApplicationModule;
import com.dazn.business.common.dagger.annotations.ApplicationContext;
import com.dazn.business.data.ChannelDataManager;
import com.dazn.business.data.ChannelDataManagerFactory;
import com.dazn.business.data.epg.EpgFetchService;
import com.dazn.business.data.epg.EpgFetcher;
import com.dazn.business.data.epg.EpgFetcherImpl;
import com.dazn.business.dialog.PinDialogFragment;
import com.dazn.business.dvr.DvrDataManager;
import com.dazn.business.dvr.DvrDataManagerImpl;
import com.dazn.business.dvr.DvrManager;
import com.dazn.business.dvr.WritableDvrDataManager;
import com.dazn.business.dvr.provider.DvrDbFuture.DvrQueryScheduleFuture;
import com.dazn.business.dvr.provider.DvrDbSync;
import com.dazn.business.dvr.provider.DvrDbSyncFactory;
import com.dazn.business.dvr.provider.DvrQueryScheduleFutureFactory;
import com.dazn.business.dvr.ui.playback.DvrPlaybackActivity;
import com.dazn.business.menu.MenuRowFactory;
import com.dazn.business.menu.MenuRowFactoryFactory;
import com.dazn.business.menu.TvOptionsRowAdapter;
import com.dazn.business.menu.TvOptionsRowAdapterFactory;
import com.dazn.business.onboarding.OnboardingActivity;
import com.dazn.business.onboarding.SetupSourcesFragment;
import com.dazn.business.setup.SystemSetupActivity;
import com.dazn.business.ui.DetailsActivity;
import com.dazn.business.util.AsyncDbTask;
import com.dazn.business.util.TvInputManagerHelper;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

import com.dazn.business.common.flags.LegacyFlags;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

/** Dagger module for {@link TvApplication}. */
@Module(
        includes = {
            ApplicationModule.class,
            BuildTypeModule.class,
            DetailsActivity.Module.class,
            DvrPlaybackActivity.Module.class,
            MainActivity.Module.class,
            OnboardingActivity.Module.class,
            SetupPassthroughActivity.Module.class,
            SetupSourcesFragment.ContentFragment.Module.class,
            SystemSetupActivity.Module.class,
            TvSingletonsModule.class,
        })
public abstract class TvApplicationModule {
    private static final NamedThreadFactory THREAD_FACTORY = new NamedThreadFactory("tv-app-db");

    @Provides
    @AsyncDbTask.DbExecutor
    @Singleton
    static Executor providesDbExecutor() {
        return Executors.newSingleThreadExecutor(THREAD_FACTORY);
    }

    @Provides
    @Singleton
    static TvInputManagerHelper providesTvInputManagerHelper(
            @ApplicationContext Context context, LegacyFlags legacyFlags) {
        TvInputManagerHelper tvInputManagerHelper = new TvInputManagerHelper(context, legacyFlags);
        tvInputManagerHelper.start();
        // Since this is injected as a Lazy in the application start is delayed.
        return tvInputManagerHelper;
    }

    @Provides
    @Singleton
    static ChannelDataManager providesChannelDataManager(ChannelDataManagerFactory factory) {
        ChannelDataManager channelDataManager = factory.create();
        channelDataManager.start();
        // Since this is injected as a Lazy in the application start is delayed.
        return channelDataManager;
    }

    @Provides
    @Singleton
    static DvrManager providesDvrManager(@ApplicationContext Context context) {
        return new DvrManager(context);
    }

    @Binds
    @Singleton
    abstract DvrDataManager providesDvrDataManager(DvrDataManagerImpl impl);

    @Binds
    @Singleton
    abstract WritableDvrDataManager providesWritableDvrDataManager(DvrDataManagerImpl impl);

    @Binds
    @Singleton
    abstract EpgFetcher epgFetcher(EpgFetcherImpl impl);

    @Binds
    abstract DvrDbSync.Factory dvrDbSyncFactory(DvrDbSyncFactory dvrDbSyncFactory);

    @Binds
    abstract DvrQueryScheduleFuture.Factory dvrQueryScheduleFutureFactory(
            DvrQueryScheduleFutureFactory dvrQueryScheduleFutureFactory);

    @Binds
    abstract TvOptionsRowAdapter.Factory tvOptionsRowAdapterFactory(
            TvOptionsRowAdapterFactory impl);

    @Binds
    abstract MenuRowFactory.Factory menuRowFactoryFactory(MenuRowFactoryFactory impl);

    @ContributesAndroidInjector
    abstract PinDialogFragment contributesPinDialogFragment();

    @ContributesAndroidInjector
    abstract EpgFetchService contributesEpgFetchService();
}
