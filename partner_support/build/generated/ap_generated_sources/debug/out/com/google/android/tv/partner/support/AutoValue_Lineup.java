
package com.google.android.tv.partner.support;

import androidx.annotation.Nullable;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Lineup extends Lineup {

  private final String id;
  private final int type;
  private final String name;
  private final List<String> channels;

  AutoValue_Lineup(
      String id,
      int type,
      @Nullable String name,
      List<String> channels) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    this.type = type;
    this.name = name;
    if (channels == null) {
      throw new NullPointerException("Null channels");
    }
    this.channels = channels;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public int getType() {
    return type;
  }

  @Nullable
  @Override
  public String getName() {
    return name;
  }

  @Override
  public List<String> getChannels() {
    return channels;
  }

  @Override
  public String toString() {
    return "Lineup{"
         + "id=" + id + ", "
         + "type=" + type + ", "
         + "name=" + name + ", "
         + "channels=" + channels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Lineup) {
      Lineup that = (Lineup) o;
      return (this.id.equals(that.getId()))
           && (this.type == that.getType())
           && ((this.name == null) ? (that.getName() == null) : this.name.equals(that.getName()))
           && (this.channels.equals(that.getChannels()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.type;
    h *= 1000003;
    h ^= (name == null) ? 0 : this.name.hashCode();
    h *= 1000003;
    h ^= this.channels.hashCode();
    return h;
  }

}
