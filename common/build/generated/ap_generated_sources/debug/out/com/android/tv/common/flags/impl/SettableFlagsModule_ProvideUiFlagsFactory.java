package com.android.tv.common.flags.impl;

import com.android.tv.common.flags.UiFlags;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class SettableFlagsModule_ProvideUiFlagsFactory implements Factory<UiFlags> {
  private final SettableFlagsModule module;

  public SettableFlagsModule_ProvideUiFlagsFactory(SettableFlagsModule module) {
    this.module = module;
  }

  @Override
  public UiFlags get() {
    return provideUiFlags(module);
  }

  public static SettableFlagsModule_ProvideUiFlagsFactory create(SettableFlagsModule module) {
    return new SettableFlagsModule_ProvideUiFlagsFactory(module);
  }

  public static UiFlags provideUiFlags(SettableFlagsModule instance) {
    return Preconditions.checkNotNull(instance.provideUiFlags(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
