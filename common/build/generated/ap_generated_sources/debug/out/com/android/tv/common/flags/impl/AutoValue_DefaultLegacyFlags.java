
package com.android.tv.common.flags.impl;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_DefaultLegacyFlags extends DefaultLegacyFlags {

  private final boolean compiled;
  private final boolean enableDeveloperFeatures;
  private final boolean enableQaFeatures;
  private final boolean enableUnratedContentSettings;

  private AutoValue_DefaultLegacyFlags(
      boolean compiled,
      boolean enableDeveloperFeatures,
      boolean enableQaFeatures,
      boolean enableUnratedContentSettings) {
    this.compiled = compiled;
    this.enableDeveloperFeatures = enableDeveloperFeatures;
    this.enableQaFeatures = enableQaFeatures;
    this.enableUnratedContentSettings = enableUnratedContentSettings;
  }

  @Override
  public boolean compiled() {
    return compiled;
  }

  @Override
  public boolean enableDeveloperFeatures() {
    return enableDeveloperFeatures;
  }

  @Override
  public boolean enableQaFeatures() {
    return enableQaFeatures;
  }

  @Override
  public boolean enableUnratedContentSettings() {
    return enableUnratedContentSettings;
  }

  @Override
  public String toString() {
    return "DefaultLegacyFlags{"
         + "compiled=" + compiled + ", "
         + "enableDeveloperFeatures=" + enableDeveloperFeatures + ", "
         + "enableQaFeatures=" + enableQaFeatures + ", "
         + "enableUnratedContentSettings=" + enableUnratedContentSettings
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DefaultLegacyFlags) {
      DefaultLegacyFlags that = (DefaultLegacyFlags) o;
      return (this.compiled == that.compiled())
           && (this.enableDeveloperFeatures == that.enableDeveloperFeatures())
           && (this.enableQaFeatures == that.enableQaFeatures())
           && (this.enableUnratedContentSettings == that.enableUnratedContentSettings());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.compiled ? 1231 : 1237;
    h *= 1000003;
    h ^= this.enableDeveloperFeatures ? 1231 : 1237;
    h *= 1000003;
    h ^= this.enableQaFeatures ? 1231 : 1237;
    h *= 1000003;
    h ^= this.enableUnratedContentSettings ? 1231 : 1237;
    return h;
  }

  static final class Builder extends DefaultLegacyFlags.Builder {
    private Boolean compiled;
    private Boolean enableDeveloperFeatures;
    private Boolean enableQaFeatures;
    private Boolean enableUnratedContentSettings;
    Builder() {
    }
    @Override
    public DefaultLegacyFlags.Builder compiled(boolean compiled) {
      this.compiled = compiled;
      return this;
    }
    @Override
    public DefaultLegacyFlags.Builder enableDeveloperFeatures(boolean enableDeveloperFeatures) {
      this.enableDeveloperFeatures = enableDeveloperFeatures;
      return this;
    }
    @Override
    public DefaultLegacyFlags.Builder enableQaFeatures(boolean enableQaFeatures) {
      this.enableQaFeatures = enableQaFeatures;
      return this;
    }
    @Override
    public DefaultLegacyFlags.Builder enableUnratedContentSettings(boolean enableUnratedContentSettings) {
      this.enableUnratedContentSettings = enableUnratedContentSettings;
      return this;
    }
    @Override
    public DefaultLegacyFlags build() {
      String missing = "";
      if (this.compiled == null) {
        missing += " compiled";
      }
      if (this.enableDeveloperFeatures == null) {
        missing += " enableDeveloperFeatures";
      }
      if (this.enableQaFeatures == null) {
        missing += " enableQaFeatures";
      }
      if (this.enableUnratedContentSettings == null) {
        missing += " enableUnratedContentSettings";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DefaultLegacyFlags(
          this.compiled,
          this.enableDeveloperFeatures,
          this.enableQaFeatures,
          this.enableUnratedContentSettings);
    }
  }

}
