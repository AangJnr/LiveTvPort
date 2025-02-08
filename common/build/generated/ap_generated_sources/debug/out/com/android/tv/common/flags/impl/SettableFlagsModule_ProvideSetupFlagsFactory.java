package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.SetupFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideSetupFlagsFactory implements Factory<SetupFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideSetupFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public SetupFlags get() {
    return provideSetupFlags(module);
  }

  public static SettableFlagsModule_ProvideSetupFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideSetupFlagsFactory(module);
  }

  public static SetupFlags provideSetupFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideSetupFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
