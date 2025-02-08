package com.android.tv.common.buildtype;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class BuildTypeModule_ProvidesBuildTypeFactory implements Factory<HasBuildType.BuildType> {
  private final BuildTypeModule module;

  public BuildTypeModule_ProvidesBuildTypeFactory(BuildTypeModule module) {
    this.module = module;
  }

  @Override
  public HasBuildType.BuildType get() {
    return providesBuildType(module);
  }

  public static BuildTypeModule_ProvidesBuildTypeFactory create(BuildTypeModule module) {
    return new BuildTypeModule_ProvidesBuildTypeFactory(module);
  }

  public static HasBuildType.BuildType providesBuildType(BuildTypeModule instance) {
    return Preconditions.checkNotNull(instance.providesBuildType(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
