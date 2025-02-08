package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.LegacyFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class DefaultFlagsModule_ProvideLegacyFlagsFactory implements Factory<LegacyFlags> {
  private final DefaultFlagsModule module;

  public DefaultFlagsModule_ProvideLegacyFlagsFactory(DefaultFlagsModule module) {
    this.module = module;
  }

  @Override
  public LegacyFlags get() {
    return provideLegacyFlags(module);
  }

  public static DefaultFlagsModule_ProvideLegacyFlagsFactory create(DefaultFlagsModule module) {
    return new DefaultFlagsModule_ProvideLegacyFlagsFactory(module);
  }

  public static LegacyFlags provideLegacyFlags(DefaultFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideLegacyFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
