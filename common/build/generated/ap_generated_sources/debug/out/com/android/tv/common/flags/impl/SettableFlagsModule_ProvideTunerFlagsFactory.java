package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.TunerFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideTunerFlagsFactory implements Factory<TunerFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideTunerFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public TunerFlags get() {
    return provideTunerFlags(module);
  }

  public static SettableFlagsModule_ProvideTunerFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideTunerFlagsFactory(module);
  }

  public static TunerFlags provideTunerFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideTunerFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
