package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.LegacyFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideLegacyFlagsFactory implements Factory<LegacyFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideLegacyFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public LegacyFlags get() {
    return provideLegacyFlags(module);
  }

  public static SettableFlagsModule_ProvideLegacyFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideLegacyFlagsFactory(module);
  }

  public static LegacyFlags provideLegacyFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideLegacyFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
