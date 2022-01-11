
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
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_ats_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * # The EmailAddress Object ### Description The &#x60;EmailAddress&#x60; object is used to represent a candidate&#39;s email address.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their email addresses.
 */
@ApiModel(description = "# The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T15:52:25.875887Z[Etc/UTC]")
public class EmailAddressRequestRawJson {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private JsonElement value;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TYPE = "email_address_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TYPE)
  private JsonElement emailAddressType;

  private transient JSON serializer;

  public EmailAddressRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public EmailAddressRequestRawJson value(String value) {
    this.value = this.serializer.getGson().toJsonTree(value);
    return this;
  }

   /**
   * The email address.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "merge_is_hiring@merge.dev", value = "The email address.")

  public JsonElement getValue() {
    return value;
  }
  public void setValue(JsonElement value) {
    this.value = value;
  }

  public EmailAddressRequestRawJson emailAddressType(String emailAddressType) {
    this.emailAddressType = this.serializer.getGson().toJsonTree(emailAddressType);
    return this;
  }

   /**
   * Get emailAddressType
   * @return emailAddressType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PERSONAL", required = true, value = "")

  public JsonElement getEmailAddressType() {
    return emailAddressType;
  }
  public void setEmailAddressType(JsonElement emailAddressType) {
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
    EmailAddressRequestRawJson emailAddressRequest = (EmailAddressRequestRawJson) o;
    return Objects.equals(this.value.getAsString(), emailAddressRequest.value.getAsString()) &&
        Objects.equals(this.emailAddressType.getAsString(), emailAddressRequest.emailAddressType.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(value, emailAddressType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddressRequestRawJson {\n");
    sb.append("    value: ").append(toIndentedString(value.getAsString())).append("\n");
    sb.append("    emailAddressType: ").append(toIndentedString(emailAddressType.getAsString())).append("\n");
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


