package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.DvrFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class DefaultFlagsModule_ProvideDvrFlagsFactory implements Factory<DvrFlags> {
  private final DefaultFlagsModule module;

  public DefaultFlagsModule_ProvideDvrFlagsFactory(DefaultFlagsModule module) {
    this.module = module;
  }

  @Override
  public DvrFlags get() {
    return provideDvrFlags(module);
  }

  public static DefaultFlagsModule_ProvideDvrFlagsFactory create(DefaultFlagsModule module) {
    return new DefaultFlagsModule_ProvideDvrFlagsFactory(module);
  }

  public static DvrFlags provideDvrFlags(DefaultFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideDvrFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
