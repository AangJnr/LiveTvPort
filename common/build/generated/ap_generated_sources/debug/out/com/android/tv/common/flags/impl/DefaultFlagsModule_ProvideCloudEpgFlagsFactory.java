package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.CloudEpgFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class DefaultFlagsModule_ProvideCloudEpgFlagsFactory implements Factory<CloudEpgFlags> {
  private final DefaultFlagsModule module;

  public DefaultFlagsModule_ProvideCloudEpgFlagsFactory(DefaultFlagsModule module) {
    this.module = module;
  }

  @Override
  public CloudEpgFlags get() {
    return provideCloudEpgFlags(module);
  }

  public static DefaultFlagsModule_ProvideCloudEpgFlagsFactory create(DefaultFlagsModule module) {
    return new DefaultFlagsModule_ProvideCloudEpgFlagsFactory(module);
  }

  public static CloudEpgFlags provideCloudEpgFlags(DefaultFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideCloudEpgFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
