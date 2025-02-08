package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.DvrFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideDvrFlagsFactory implements Factory<DvrFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideDvrFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public DvrFlags get() {
    return provideDvrFlags(module);
  }

  public static SettableFlagsModule_ProvideDvrFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideDvrFlagsFactory(module);
  }

  public static DvrFlags provideDvrFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideDvrFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
