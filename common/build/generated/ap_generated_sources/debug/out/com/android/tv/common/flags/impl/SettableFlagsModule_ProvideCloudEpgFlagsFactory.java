package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.CloudEpgFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideCloudEpgFlagsFactory implements Factory<CloudEpgFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideCloudEpgFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public CloudEpgFlags get() {
    return provideCloudEpgFlags(module);
  }

  public static SettableFlagsModule_ProvideCloudEpgFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideCloudEpgFlagsFactory(module);
  }

  public static CloudEpgFlags provideCloudEpgFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideCloudEpgFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
