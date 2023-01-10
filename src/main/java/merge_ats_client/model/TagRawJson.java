
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
 * # The Tag Object ### Description The &#x60;Tag&#x60; object is used to represent a tag for a candidate. ### Usage Example Fetch from the &#x60;LIST Tags&#x60; endpoint and view the tags used within a company.
 */
@ApiModel(description = "# The Tag Object ### Description The `Tag` object is used to represent a tag for a candidate. ### Usage Example Fetch from the `LIST Tags` endpoint and view the tags used within a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class TagRawJson {
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

  public TagRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public TagRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4567", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public TagRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The tag&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "High-Priority", value = "The tag's name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public TagRawJson remoteData(List<Map<String, Object>> remoteData) {
    this.remoteData = this.serializer.getGson().toJsonTree(remoteData);
    return this;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/tags\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }
  public void setRemoteData(JsonElement remoteData) {
    this.remoteData = remoteData;
  }

  public TagRawJson remoteWasDeleted(Boolean remoteWasDeleted) {
    this.remoteWasDeleted = this.serializer.getGson().toJsonTree(remoteWasDeleted);
    return this;
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
  public void setRemoteWasDeleted(JsonElement remoteWasDeleted) {
    this.remoteWasDeleted = remoteWasDeleted;
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
    TagRawJson tag = (TagRawJson) o;
    return Objects.equals(this.remoteId.getAsString(), tag.remoteId.getAsString()) &&
        Objects.equals(this.name.getAsString(), tag.name.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), tag.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), tag.remoteWasDeleted.getAsString()) &&
        Objects.equals(this.fieldMappings.getAsString(), tag.fieldMappings.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(remoteId, name, remoteData, remoteWasDeleted, fieldMappings);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagRawJson {\n");
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


