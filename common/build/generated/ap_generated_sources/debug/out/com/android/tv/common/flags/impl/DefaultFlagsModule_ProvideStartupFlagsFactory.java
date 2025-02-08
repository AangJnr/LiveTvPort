package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.StartupFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class DefaultFlagsModule_ProvideStartupFlagsFactory implements Factory<StartupFlags> {
  private final DefaultFlagsModule module;

  public DefaultFlagsModule_ProvideStartupFlagsFactory(DefaultFlagsModule module) {
    this.module = module;
  }

  @Override
  public StartupFlags get() {
    return provideStartupFlags(module);
  }

  public static DefaultFlagsModule_ProvideStartupFlagsFactory create(DefaultFlagsModule module) {
    return new DefaultFlagsModule_ProvideStartupFlagsFactory(module);
  }

  public static StartupFlags provideStartupFlags(DefaultFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideStartupFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
