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
 * Gets or Sets DisabilityStatusEnum
 */
@JsonAdapter(DisabilityStatusEnum.Adapter.class)
public enum DisabilityStatusEnum {
  
  YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY("YES_I_HAVE_A_DISABILITY_OR_PREVIOUSLY_HAD_A_DISABILITY"),
  
  NO_I_DONT_HAVE_A_DISABILITY("NO_I_DONT_HAVE_A_DISABILITY"),
  
  I_DONT_WISH_TO_ANSWER("I_DONT_WISH_TO_ANSWER");

  private String value;

  DisabilityStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DisabilityStatusEnum fromValue(String value) {
    for (DisabilityStatusEnum b : DisabilityStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DisabilityStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DisabilityStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DisabilityStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DisabilityStatusEnum.fromValue(value);
    }
  }
}

