/*
 * Merge ATS API
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_ats_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MethodEnum
 */
@JsonAdapter(MethodEnum.Adapter.class)
public enum MethodEnum {
  
  GET("GET"),
  
  OPTIONS("OPTIONS"),
  
  HEAD("HEAD"),
  
  POST("POST"),
  
  PUT("PUT"),
  
  PATCH("PATCH"),
  
  DELETE("DELETE");

  private String value;

  MethodEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MethodEnum fromValue(String value) {
    for (MethodEnum b : MethodEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MethodEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MethodEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MethodEnum.fromValue(value);
    }
  }
}

