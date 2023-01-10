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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import merge_ats_client.model.EmailAddressTypeEnum;

/**
 * # The EmailAddress Object ### Description The &#x60;EmailAddress&#x60; object is used to represent a candidate&#39;s email address. ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their email addresses.
 */
@ApiModel(description = "# The EmailAddress Object ### Description The `EmailAddress` object is used to represent a candidate's email address. ### Usage Example Fetch from the `GET Candidate` endpoint and view their email addresses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class EmailAddressRequest {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_TYPE = "email_address_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_TYPE)
  private EmailAddressTypeEnum emailAddressType;

  public static final String SERIALIZED_NAME_INTEGRATION_PARAMS = "integration_params";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_PARAMS)
  private Map<String, Object> integrationParams = null;

  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS = "linked_account_params";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS)
  private Map<String, Object> linkedAccountParams = null;


  public EmailAddressRequest value(String value) {
    
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


  public EmailAddressRequest integrationParams(Map<String, Object> integrationParams) {
    
    this.integrationParams = integrationParams;
    return this;
  }

  public EmailAddressRequest putIntegrationParamsItem(String key, Object integrationParamsItem) {
    if (this.integrationParams == null) {
      this.integrationParams = new HashMap<String, Object>();
    }
    this.integrationParams.put(key, integrationParamsItem);
    return this;
  }

   /**
   * Get integrationParams
   * @return integrationParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_integration_field\":\"unique_integration_field_value\"}", value = "")

  public Map<String, Object> getIntegrationParams() {
    return integrationParams;
  }


  public void setIntegrationParams(Map<String, Object> integrationParams) {
    this.integrationParams = integrationParams;
  }


  public EmailAddressRequest linkedAccountParams(Map<String, Object> linkedAccountParams) {
    
    this.linkedAccountParams = linkedAccountParams;
    return this;
  }

  public EmailAddressRequest putLinkedAccountParamsItem(String key, Object linkedAccountParamsItem) {
    if (this.linkedAccountParams == null) {
      this.linkedAccountParams = new HashMap<String, Object>();
    }
    this.linkedAccountParams.put(key, linkedAccountParamsItem);
    return this;
  }

   /**
   * Get linkedAccountParams
   * @return linkedAccountParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_linked_account_field\":\"unique_linked_account_field_value\"}", value = "")

  public Map<String, Object> getLinkedAccountParams() {
    return linkedAccountParams;
  }


  public void setLinkedAccountParams(Map<String, Object> linkedAccountParams) {
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
    EmailAddressRequest emailAddressRequest = (EmailAddressRequest) o;
    return Objects.equals(this.value, emailAddressRequest.value) &&
        Objects.equals(this.emailAddressType, emailAddressRequest.emailAddressType) &&
        Objects.equals(this.integrationParams, emailAddressRequest.integrationParams) &&
        Objects.equals(this.linkedAccountParams, emailAddressRequest.linkedAccountParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, emailAddressType, integrationParams, linkedAccountParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddressRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    emailAddressType: ").append(toIndentedString(emailAddressType)).append("\n");
    sb.append("    integrationParams: ").append(toIndentedString(integrationParams)).append("\n");
    sb.append("    linkedAccountParams: ").append(toIndentedString(linkedAccountParams)).append("\n");
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

