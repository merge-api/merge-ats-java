
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
 * # The RejectReason Object ### Description The &#x60;RejectReason&#x60; object is used to represent a reason for rejecting an application. ### Usage Example Fetch from the &#x60;LIST RejectReasons&#x60; endpoint and filter by &#x60;ID&#x60; to show all reasons.
 */
@ApiModel(description = "# The RejectReason Object ### Description The `RejectReason` object is used to represent a reason for rejecting an application. ### Usage Example Fetch from the `LIST RejectReasons` endpoint and filter by `ID` to show all reasons.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class RejectReasonRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private JsonElement remoteWasDeleted;

  public static final String SERIALIZED_NAME_FIELD_MAPPINGS = "field_mappings";
  @SerializedName(SERIALIZED_NAME_FIELD_MAPPINGS)
  private JsonElement fieldMappings;

  private transient JSON serializer;

  public RejectReasonRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8be99a4a-f8d4-4339-bf1e-30eac970e217", value = "")

  public JsonElement getId() {
    return id;
  }

  public RejectReasonRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "876556788", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public RejectReasonRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The rejection reason’s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not passionate enough about APIs.", value = "The rejection reason’s name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/rejection-reasons\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }

   /**
   * Indicates whether or not this object has been deleted by third party webhooks.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted by third party webhooks.")

  public JsonElement getRemoteWasDeleted() {
    return remoteWasDeleted;
  }

   /**
   * Get fieldMappings
   * @return fieldMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"organization_defined_targets\":{\"custom_key\":\"custom_value\"},\"linked_account_defined_targets\":{\"custom_key\":\"custom_value\"}}", value = "")

  public JsonElement getFieldMappings() {
    return fieldMappings;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectReasonRawJson rejectReason = (RejectReasonRawJson) o;
    return Objects.equals(this.id.getAsString(), rejectReason.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), rejectReason.remoteId.getAsString()) &&
        Objects.equals(this.name.getAsString(), rejectReason.name.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), rejectReason.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), rejectReason.remoteWasDeleted.getAsString()) &&
        Objects.equals(this.fieldMappings.getAsString(), rejectReason.fieldMappings.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, remoteData, remoteWasDeleted, fieldMappings);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectReasonRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted.getAsString())).append("\n");
    sb.append("    fieldMappings: ").append(toIndentedString(fieldMappings.getAsString())).append("\n");
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


