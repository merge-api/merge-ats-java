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
 * Gets or Sets VeteranStatusEnum
 */
@JsonAdapter(VeteranStatusEnum.Adapter.class)
public enum VeteranStatusEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  AM_NOT_A_PROTECTED_VETERAN("I_AM_NOT_A_PROTECTED_VETERAN"),
  
  IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN("I_IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN"),
  
  DONT_WISH_TO_ANSWER("I_DONT_WISH_TO_ANSWER");

  private String value;

  VeteranStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VeteranStatusEnum fromValue(String value) {
    for (VeteranStatusEnum b : VeteranStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return VeteranStatusEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<VeteranStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final VeteranStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VeteranStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VeteranStatusEnum.fromValue(value);
    }
  }
}

