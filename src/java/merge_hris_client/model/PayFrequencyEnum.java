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


package java.merge_hris_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PayFrequencyEnum
 */
@JsonAdapter(PayFrequencyEnum.Adapter.class)
public enum PayFrequencyEnum {
  
  WEEKLY("WEEKLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  MONTHLY("MONTHLY"),
  
  QUARTERLY("QUARTERLY"),
  
  SEMIANNUALLY("SEMIANNUALLY"),
  
  ANNUALLY("ANNUALLY"),
  
  THIRTEEN_MONTHLY("THIRTEEN-MONTHLY"),
  
  PRO_RATA("PRO_RATA"),
  
  NULL("NULL");

  private String value;

  PayFrequencyEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayFrequencyEnum fromValue(String value) {
    for (PayFrequencyEnum b : PayFrequencyEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayFrequencyEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayFrequencyEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayFrequencyEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayFrequencyEnum.fromValue(value);
    }
  }
}

