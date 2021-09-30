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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.merge_ats_client.model.EmailAddressTypeEnum;

/**
 * # The EmailAddress Object ### Description The &#x60;EmailAddress&#x60; object is used to represent a candidate&#39;s email address.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their email addresses.
 */
@ApiModel(description = "# The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-29T17:50:38.149290-07:00[America/Los_Angeles]")
public class EmailAddressRequest {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TYPE = "email_address_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TYPE)
  private EmailAddressTypeEnum emailAddressType;


  public EmailAddressRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The email address.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "merge_is_hiring@gmail.com", value = "The email address.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public EmailAddressRequest emailAddressType(EmailAddressTypeEnum emailAddressType) {
    
    this.emailAddressType = emailAddressType;
    return this;
  }

   /**
   * The type of email address.
   * @return emailAddressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "The type of email address.")

  public EmailAddressTypeEnum getEmailAddressType() {
    return emailAddressType;
  }


  public void setEmailAddressType(EmailAddressTypeEnum emailAddressType) {
    this.emailAddressType = emailAddressType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAddressRequest emailAddressRequest = (EmailAddressRequest) o;
    return Objects.equals(this.value, emailAddressRequest.value) &&
        Objects.equals(this.emailAddressType, emailAddressRequest.emailAddressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, emailAddressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddressRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    emailAddressType: ").append(toIndentedString(emailAddressType)).append("\n");
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

