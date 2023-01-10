
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
 * LinkedAccountStatusRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class LinkedAccountStatusRawJson {
  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_STATUS = "linked_account_status";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_STATUS)
  private JsonElement linkedAccountStatus;

  public static final String SERIALIZED_NAME_CAN_MAKE_REQUEST = "can_make_request";
  @SerializedName(SERIALIZED_NAME_CAN_MAKE_REQUEST)
  private JsonElement canMakeRequest;

  private transient JSON serializer;

  public LinkedAccountStatusRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public LinkedAccountStatusRawJson linkedAccountStatus(String linkedAccountStatus) {
    this.linkedAccountStatus = this.serializer.getGson().toJsonTree(linkedAccountStatus);
    return this;
  }

   /**
   * Get linkedAccountStatus
   * @return linkedAccountStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getLinkedAccountStatus() {
    return linkedAccountStatus;
  }
  public void setLinkedAccountStatus(JsonElement linkedAccountStatus) {
    this.linkedAccountStatus = linkedAccountStatus;
  }

  public LinkedAccountStatusRawJson canMakeRequest(Boolean canMakeRequest) {
    this.canMakeRequest = this.serializer.getGson().toJsonTree(canMakeRequest);
    return this;
  }

   /**
   * Get canMakeRequest
   * @return canMakeRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getCanMakeRequest() {
    return canMakeRequest;
  }
  public void setCanMakeRequest(JsonElement canMakeRequest) {
    this.canMakeRequest = canMakeRequest;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccountStatusRawJson linkedAccountStatus = (LinkedAccountStatusRawJson) o;
    return Objects.equals(this.linkedAccountStatus.getAsString(), linkedAccountStatus.linkedAccountStatus.getAsString()) &&
        Objects.equals(this.canMakeRequest.getAsString(), linkedAccountStatus.canMakeRequest.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(linkedAccountStatus, canMakeRequest);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccountStatusRawJson {\n");
    sb.append("    linkedAccountStatus: ").append(toIndentedString(linkedAccountStatus.getAsString())).append("\n");
    sb.append("    canMakeRequest: ").append(toIndentedString(canMakeRequest.getAsString())).append("\n");
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


