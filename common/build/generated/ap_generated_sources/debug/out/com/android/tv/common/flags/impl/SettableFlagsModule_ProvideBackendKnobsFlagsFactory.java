package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.BackendKnobsFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideBackendKnobsFlagsFactory implements Factory<BackendKnobsFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideBackendKnobsFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public BackendKnobsFlags get() {
    return provideBackendKnobsFlags(module);
  }

  public static SettableFlagsModule_ProvideBackendKnobsFlagsFactory create(
      SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideBackendKnobsFlagsFactory(module);
  }

  public static BackendKnobsFlags provideBackendKnobsFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideBackendKnobsFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
