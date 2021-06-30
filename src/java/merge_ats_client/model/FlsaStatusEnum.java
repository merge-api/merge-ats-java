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
 * Gets or Sets FlsaStatusEnum
 */
@JsonAdapter(FlsaStatusEnum.Adapter.class)
public enum FlsaStatusEnum {
  
  EXEMPT("EXEMPT"),
  
  SALARIED_NONEXEMPT("SALARIED_NONEXEMPT"),
  
  NONEXEMPT("NONEXEMPT"),
  
  OWNER("OWNER");

  private String value;

  FlsaStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FlsaStatusEnum fromValue(String value) {
    for (FlsaStatusEnum b : FlsaStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FlsaStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FlsaStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FlsaStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FlsaStatusEnum.fromValue(value);
    }
  }
}

