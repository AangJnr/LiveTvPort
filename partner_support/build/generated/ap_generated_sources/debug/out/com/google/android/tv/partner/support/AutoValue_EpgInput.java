
package com.google.android.tv.partner.support;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_EpgInput extends EpgInput {

  private final long id;
  private final String inputId;
  private final String lineupId;

  AutoValue_EpgInput(
      long id,
      String inputId,
      String lineupId) {
    this.id = id;
    if (inputId == null) {
      throw new NullPointerException("Null inputId");
    }
    this.inputId = inputId;
    if (lineupId == null) {
      throw new NullPointerException("Null lineupId");
    }
    this.lineupId = lineupId;
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public String getInputId() {
    return inputId;
  }

  @Override
  public String getLineupId() {
    return lineupId;
  }

  @Override
  public String toString() {
    return "EpgInput{"
         + "id=" + id + ", "
         + "inputId=" + inputId + ", "
         + "lineupId=" + lineupId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EpgInput) {
      EpgInput that = (EpgInput) o;
      return (this.id == that.getId())
           && (this.inputId.equals(that.getInputId()))
           && (this.lineupId.equals(that.getLineupId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (int) ((this.id >>> 32) ^ this.id);
    h *= 1000003;
    h ^= this.inputId.hashCode();
    h *= 1000003;
    h ^= this.lineupId.hashCode();
    return h;
  }

}
