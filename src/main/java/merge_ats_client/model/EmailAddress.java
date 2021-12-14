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

/**
 * # The EmailAddress Object ### Description The &#x60;EmailAddress&#x60; object is used to represent a candidate&#39;s email address.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their email addresses.
 */
@ApiModel(description = "# The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T17:46:21.413167Z[Etc/UTC]")
public class EmailAddress {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TYPE = "email_address_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TYPE)
  private String emailAddressType;


  public EmailAddress value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The email address.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "merge_is_hiring@merge.dev", value = "The email address.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public EmailAddress emailAddressType(String emailAddressType) {
    
    this.emailAddressType = emailAddressType;
    return this;
  }

   /**
   * Get emailAddressType
   * @return emailAddressType
  **/
  @ApiModelProperty(example = "PERSONAL", required = true, value = "")

  public String getEmailAddressType() {
    return emailAddressType;
  }


  public void setEmailAddressType(String emailAddressType) {
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
    EmailAddress emailAddress = (EmailAddress) o;
    return Objects.equals(this.value, emailAddress.value) &&
        Objects.equals(this.emailAddressType, emailAddress.emailAddressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, emailAddressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
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

