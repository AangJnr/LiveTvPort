package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.BackendKnobsFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class DefaultFlagsModule_ProvideBackendKnobsFlagsFactory implements Factory<BackendKnobsFlags> {
  private final DefaultFlagsModule module;

  public DefaultFlagsModule_ProvideBackendKnobsFlagsFactory(DefaultFlagsModule module) {
    this.module = module;
  }

  @Override
  public BackendKnobsFlags get() {
    return provideBackendKnobsFlags(module);
  }

  public static DefaultFlagsModule_ProvideBackendKnobsFlagsFactory create(
      DefaultFlagsModule module) {
    return new DefaultFlagsModule_ProvideBackendKnobsFlagsFactory(module);
  }

  public static BackendKnobsFlags provideBackendKnobsFlags(DefaultFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideBackendKnobsFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
