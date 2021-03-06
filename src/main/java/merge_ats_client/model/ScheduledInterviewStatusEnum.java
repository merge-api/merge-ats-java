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
 * Gets or Sets ScheduledInterviewStatusEnum
 */
@JsonAdapter(ScheduledInterviewStatusEnum.Adapter.class)
public enum ScheduledInterviewStatusEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  SCHEDULED("SCHEDULED"),
  
  AWAITING_FEEDBACK("AWAITING_FEEDBACK"),
  
  COMPLETE("COMPLETE");

  private String value;

  ScheduledInterviewStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScheduledInterviewStatusEnum fromValue(String value) {
    for (ScheduledInterviewStatusEnum b : ScheduledInterviewStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return ScheduledInterviewStatusEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<ScheduledInterviewStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScheduledInterviewStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScheduledInterviewStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScheduledInterviewStatusEnum.fromValue(value);
    }
  }
}

