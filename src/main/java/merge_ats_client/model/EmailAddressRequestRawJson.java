
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
 * # The EmailAddress Object ### Description The &#x60;EmailAddress&#x60; object is used to represent a candidate&#39;s email address. ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their email addresses.
 */
@ApiModel(description = "# The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address. ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class EmailAddressRequestRawJson {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private JsonElement value;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TYPE = "email_address_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TYPE)
  private JsonElement emailAddressType;

  public static final String SERIALIZED_NAME_INTEGRATION_PARAMS = "integration_params";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_PARAMS)
  private JsonElement integrationParams;

  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS = "linked_account_params";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS)
  private JsonElement linkedAccountParams;

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

  public EmailAddressRequestRawJson emailAddressType(EmailAddressTypeEnum emailAddressType) {
    this.emailAddressType = this.serializer.getGson().toJsonTree(emailAddressType);
    return this;
  }

   /**
   * The type of email address.
   * @return emailAddressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "The type of email address.")

  public JsonElement getEmailAddressType() {
    return emailAddressType;
  }
  public void setEmailAddressType(JsonElement emailAddressType) {
    this.emailAddressType = emailAddressType;
  }

  public EmailAddressRequestRawJson integrationParams(Map<String, Object> integrationParams) {
    this.integrationParams = this.serializer.getGson().toJsonTree(integrationParams);
    return this;
  }

   /**
   * Get integrationParams
   * @return integrationParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_integration_field\":\"unique_integration_field_value\"}", value = "")

  public JsonElement getIntegrationParams() {
    return integrationParams;
  }
  public void setIntegrationParams(JsonElement integrationParams) {
    this.integrationParams = integrationParams;
  }

  public EmailAddressRequestRawJson linkedAccountParams(Map<String, Object> linkedAccountParams) {
    this.linkedAccountParams = this.serializer.getGson().toJsonTree(linkedAccountParams);
    return this;
  }

   /**
   * Get linkedAccountParams
   * @return linkedAccountParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_linked_account_field\":\"unique_linked_account_field_value\"}", value = "")

  public JsonElement getLinkedAccountParams() {
    return linkedAccountParams;
  }
  public void setLinkedAccountParams(JsonElement linkedAccountParams) {
    this.linkedAccountParams = linkedAccountParams;
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
        Objects.equals(this.emailAddressType.getAsString(), emailAddressRequest.emailAddressType.getAsString()) &&
        Objects.equals(this.integrationParams.getAsString(), emailAddressRequest.integrationParams.getAsString()) &&
        Objects.equals(this.linkedAccountParams.getAsString(), emailAddressRequest.linkedAccountParams.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(value, emailAddressType, integrationParams, linkedAccountParams);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddressRequestRawJson {\n");
    sb.append("    value: ").append(toIndentedString(value.getAsString())).append("\n");
    sb.append("    emailAddressType: ").append(toIndentedString(emailAddressType.getAsString())).append("\n");
    sb.append("    integrationParams: ").append(toIndentedString(integrationParams.getAsString())).append("\n");
    sb.append("    linkedAccountParams: ").append(toIndentedString(linkedAccountParams.getAsString())).append("\n");
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


