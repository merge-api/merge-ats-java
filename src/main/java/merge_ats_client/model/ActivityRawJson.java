
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
 * # The Activity Object ### Description The &#x60;Activity&#x60; object is used to represent an activity performed by a user. ### Usage Example Fetch from the &#x60;LIST Activities&#x60; endpoint and filter by &#x60;ID&#x60; to show all activities.
 */
@ApiModel(description = "# The Activity Object ### Description The `Activity` object is used to represent an activity performed by a user. ### Usage Example Fetch from the `LIST Activities` endpoint and filter by `ID` to show all activities.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class ActivityRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private JsonElement user;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private JsonElement activityType;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private JsonElement subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private JsonElement body;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private JsonElement visibility;

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

  public ActivityRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ecbe05ac-62a3-46c5-ab31-4b478b37d1b4", value = "")

  public JsonElement getId() {
    return id;
  }

  public ActivityRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "198123", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public ActivityRawJson user(UUID user) {
    this.user = this.serializer.getGson().toJsonTree(user);
    return this;
  }

   /**
   * The user the performed the action.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9d892439-5fab-4dbb-8bd8-34f7f96c7912", value = "The user the performed the action.")

  public JsonElement getUser() {
    return user;
  }
  public void setUser(JsonElement user) {
    this.user = user;
  }

  public ActivityRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the third party&#39;s activity was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's activity was created.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

  public ActivityRawJson activityType(ActivityTypeEnum activityType) {
    this.activityType = this.serializer.getGson().toJsonTree(activityType);
    return this;
  }

   /**
   * The activity&#39;s type.
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NOTE", value = "The activity's type.")

  public JsonElement getActivityType() {
    return activityType;
  }
  public void setActivityType(JsonElement activityType) {
    this.activityType = activityType;
  }

  public ActivityRawJson subject(String subject) {
    this.subject = this.serializer.getGson().toJsonTree(subject);
    return this;
  }

   /**
   * The activity&#39;s subject.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gil Feig's interview", value = "The activity's subject.")

  public JsonElement getSubject() {
    return subject;
  }
  public void setSubject(JsonElement subject) {
    this.subject = subject;
  }

  public ActivityRawJson body(String body) {
    this.body = this.serializer.getGson().toJsonTree(body);
    return this;
  }

   /**
   * The activity&#39;s body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Candidate loves integrations!!.", value = "The activity's body.")

  public JsonElement getBody() {
    return body;
  }
  public void setBody(JsonElement body) {
    this.body = body;
  }

  public ActivityRawJson visibility(VisibilityEnum visibility) {
    this.visibility = this.serializer.getGson().toJsonTree(visibility);
    return this;
  }

   /**
   * The activity&#39;s visibility.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRIVATE", value = "The activity's visibility.")

  public JsonElement getVisibility() {
    return visibility;
  }
  public void setVisibility(JsonElement visibility) {
    this.visibility = visibility;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/actions\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    ActivityRawJson activity = (ActivityRawJson) o;
    return Objects.equals(this.id.getAsString(), activity.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), activity.remoteId.getAsString()) &&
        Objects.equals(this.user.getAsString(), activity.user.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), activity.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.activityType.getAsString(), activity.activityType.getAsString()) &&
        Objects.equals(this.subject.getAsString(), activity.subject.getAsString()) &&
        Objects.equals(this.body.getAsString(), activity.body.getAsString()) &&
        Objects.equals(this.visibility.getAsString(), activity.visibility.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), activity.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), activity.remoteWasDeleted.getAsString()) &&
        Objects.equals(this.fieldMappings.getAsString(), activity.fieldMappings.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, user, remoteCreatedAt, activityType, subject, body, visibility, remoteData, remoteWasDeleted, fieldMappings);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    user: ").append(toIndentedString(user.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType.getAsString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject.getAsString())).append("\n");
    sb.append("    body: ").append(toIndentedString(body.getAsString())).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility.getAsString())).append("\n");
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


