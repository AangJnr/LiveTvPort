package com.android.tv.common.buildtype;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class BuildTypeFactory_Factory implements Factory<BuildTypeFactory> {
  private static final BuildTypeFactory_Factory INSTANCE = new BuildTypeFactory_Factory();

  @Override
  public BuildTypeFactory get() {
    return new BuildTypeFactory();
  }

  public static BuildTypeFactory_Factory create() {
    return INSTANCE;
  }

  public static BuildTypeFactory newInstance() {
    return new BuildTypeFactory();
  }
}
