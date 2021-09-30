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
 * Gets or Sets OverallRecommendationEnum
 */
@JsonAdapter(OverallRecommendationEnum.Adapter.class)
public enum OverallRecommendationEnum {
  
  DEFINITELY_NO("DEFINITELY_NO"),
  
  NO("NO"),
  
  YES("YES"),
  
  STRONG_YES("STRONG_YES"),
  
  NO_DECISION("NO_DECISION");

  private String value;

  OverallRecommendationEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OverallRecommendationEnum fromValue(String value) {
    for (OverallRecommendationEnum b : OverallRecommendationEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OverallRecommendationEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final OverallRecommendationEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OverallRecommendationEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OverallRecommendationEnum.fromValue(value);
    }
  }
}
