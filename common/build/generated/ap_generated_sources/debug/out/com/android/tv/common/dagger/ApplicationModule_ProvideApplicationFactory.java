package com.android.tv.common.dagger;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideApplicationFactory implements Factory<Application> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return provideApplication(module);
  }

  public static ApplicationModule_ProvideApplicationFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideApplicationFactory(module);
  }

  public static Application provideApplication(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
