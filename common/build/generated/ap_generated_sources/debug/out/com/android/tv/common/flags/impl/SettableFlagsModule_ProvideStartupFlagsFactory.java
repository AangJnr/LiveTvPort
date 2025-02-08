package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.StartupFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideStartupFlagsFactory implements Factory<StartupFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideStartupFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public StartupFlags get() {
    return provideStartupFlags(module);
  }

  public static SettableFlagsModule_ProvideStartupFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideStartupFlagsFactory(module);
  }

  public static StartupFlags provideStartupFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideStartupFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
