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
 * Gets or Sets CategoryEnum
 */
@JsonAdapter(CategoryEnum.Adapter.class)
public enum CategoryEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  HRIS("hris"),
  
  ATS("ats"),
  
  ACCOUNTING("accounting"),
  
  TICKETING("ticketing"),
  
  CRM("crm");

  private String value;

  CategoryEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CategoryEnum fromValue(String value) {
    for (CategoryEnum b : CategoryEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return CategoryEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<CategoryEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CategoryEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CategoryEnum.fromValue(value);
    }
  }
}

