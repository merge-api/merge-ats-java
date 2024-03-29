
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

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_ats_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * # The PhoneNumber Object ### Description The &#x60;PhoneNumber&#x60; object is used to represent a candidate&#39;s phone number. ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their phone numbers.
 */
@ApiModel(description = "# The PhoneNumber Object ### Description The `PhoneNumber` object is used to represent a candidate's phone number. ### Usage Example Fetch from the `GET Candidate` endpoint and view their phone numbers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class PhoneNumberRawJson {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private JsonElement value;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_TYPE = "phone_number_type";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_TYPE)
  private JsonElement phoneNumberType;

  private transient JSON serializer;

  public PhoneNumberRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public PhoneNumberRawJson value(String value) {
    this.value = this.serializer.getGson().toJsonTree(value);
    return this;
  }

   /**
   * The phone number.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+3198675309", value = "The phone number.")

  public JsonElement getValue() {
    return value;
  }
  public void setValue(JsonElement value) {
    this.value = value;
  }

  public PhoneNumberRawJson phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = this.serializer.getGson().toJsonTree(phoneNumberType);
    return this;
  }

   /**
   * The type of phone number.
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOME", value = "The type of phone number.")

  public JsonElement getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(JsonElement phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberRawJson phoneNumber = (PhoneNumberRawJson) o;
    return Objects.equals(this.value.getAsString(), phoneNumber.value.getAsString()) &&
        Objects.equals(this.phoneNumberType.getAsString(), phoneNumber.phoneNumberType.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(value, phoneNumberType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberRawJson {\n");
    sb.append("    value: ").append(toIndentedString(value.getAsString())).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType.getAsString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


