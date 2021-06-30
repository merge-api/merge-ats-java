/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package java.merge_ats_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GenderEnum
 */
@JsonAdapter(GenderEnum.Adapter.class)
public enum GenderEnum {
  
  MALE("MALE"),
  
  FEMALE("FEMALE"),
  
  NON_BINARY("NON-BINARY"),
  
  OTHER("OTHER"),
  
  PREFER_NOT_TO_DISCLOSE("PREFER_NOT_TO_DISCLOSE");

  private String value;

  GenderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GenderEnum fromValue(String value) {
    for (GenderEnum b : GenderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GenderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GenderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GenderEnum.fromValue(value);
    }
  }
}

