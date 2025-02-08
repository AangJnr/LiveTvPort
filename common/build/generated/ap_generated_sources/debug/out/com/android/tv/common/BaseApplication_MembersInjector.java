package com.android.tv.common;

import com.android.tv.common.recording.RecordingStorageStatusManager;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class BaseApplication_MembersInjector implements MembersInjector<BaseApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RecordingStorageStatusManager> mRecordingStorageStatusManagerProvider;

  public BaseApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RecordingStorageStatusManager> mRecordingStorageStatusManagerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.mRecordingStorageStatusManagerProvider = mRecordingStorageStatusManagerProvider;
  }

  public static MembersInjector<BaseApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RecordingStorageStatusManager> mRecordingStorageStatusManagerProvider) {
    return new BaseApplication_MembersInjector(androidInjectorProvider, mRecordingStorageStatusManagerProvider);}

  @Override
  public void injectMembers(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectMRecordingStorageStatusManager(instance, DoubleCheck.lazy(mRecordingStorageStatusManagerProvider));
  }

  public static void injectMRecordingStorageStatusManager(BaseApplication instance,
      Lazy<RecordingStorageStatusManager> mRecordingStorageStatusManager) {
    instance.mRecordingStorageStatusManager = mRecordingStorageStatusManager;
  }
}
