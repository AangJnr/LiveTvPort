package com.android.tv.common.dagger;

import com.android.tv.common.util.Clock;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidesClockFactory implements Factory<Clock> {
  private static final ApplicationModule_ProvidesClockFactory INSTANCE = new ApplicationModule_ProvidesClockFactory();

  @Override
  public Clock get() {
    return providesClock();
  }

  public static ApplicationModule_ProvidesClockFactory create() {
    return INSTANCE;
  }

  public static Clock providesClock() {
    return Preconditions.checkNotNull(ApplicationModule.providesClock(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
