package com.android.tv.common.recording;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class RecordingStorageStatusManager_Factory implements Factory<RecordingStorageStatusManager> {
  private final Provider<Context> contextProvider;

  public RecordingStorageStatusManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RecordingStorageStatusManager get() {
    return new RecordingStorageStatusManager(contextProvider.get());
  }

  public static RecordingStorageStatusManager_Factory create(Provider<Context> contextProvider) {
    return new RecordingStorageStatusManager_Factory(contextProvider);
  }

  public static RecordingStorageStatusManager newInstance(Context context) {
    return new RecordingStorageStatusManager(context);
  }
}
