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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import merge_ats_client.model.PhoneNumberTypeEnum;

/**
 * # The PhoneNumber Object ### Description The &#x60;PhoneNumber&#x60; object is used to represent a candidate&#39;s phone number.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their phone numbers.
 */
@ApiModel(description = "# The PhoneNumber Object ### Description The `PhoneNumber` object is used to represent a candidate's phone number.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their phone numbers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]")
public class PhoneNumberRequest {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_TYPE = "phone_number_type";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_TYPE)
  private PhoneNumberTypeEnum phoneNumberType;


  public PhoneNumberRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The phone number.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+3198675309", value = "The phone number.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public PhoneNumberRequest phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * The type of phone number.
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOME", value = "The type of phone number.")

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }


  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
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
    PhoneNumberRequest phoneNumberRequest = (PhoneNumberRequest) o;
    return Objects.equals(this.value, phoneNumberRequest.value) &&
        Objects.equals(this.phoneNumberType, phoneNumberRequest.phoneNumberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, phoneNumberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
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

