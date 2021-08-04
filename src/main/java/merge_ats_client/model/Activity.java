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


package main.java.merge_ats_client.model;

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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.java.merge_ats_client.model.ActivityTypeEnum;
import main.java.merge_ats_client.model.RemoteData;
import main.java.merge_ats_client.model.VisibilityEnum;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Activity Object ### Description The &#x60;Activity&#x60; object is used to represent an activity performed by a user.  ### Usage Example Fetch from the &#x60;LIST Activities&#x60; endpoint and filter by &#x60;ID&#x60; to show all activities.
 */
@ApiModel(description = "# The Activity Object ### Description The `Activity` object is used to represent an activity performed by a user.  ### Usage Example Fetch from the `LIST Activities` endpoint and filter by `ID` to show all activities.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-04T15:38:16.862482-07:00[America/Los_Angeles]")
public class Activity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UUID user;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private ActivityTypeEnum activityType;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ecbe05ac-62a3-46c5-ab31-4b478b37d1b4", value = "")

  public UUID getId() {
    return id;
  }




  public Activity remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "198123", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Activity user(UUID user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user the performed the action.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9d892439-5fab-4dbb-8bd8-34f7f96c7912", value = "The user the performed the action.")

  public UUID getUser() {
    return user;
  }


  public void setUser(UUID user) {
    this.user = user;
  }


  public Activity remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s activity was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the third party's activity was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public Activity activityType(ActivityTypeEnum activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * The activity&#39;s type.
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NOTE", value = "The activity's type.")

  public ActivityTypeEnum getActivityType() {
    return activityType;
  }


  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }


  public Activity subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The activity&#39;s subject.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gil Feig's applicant status", value = "The activity's subject.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Activity body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The activity&#39;s body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Candidate will only join if we provide a Barry's subsidy.", value = "The activity's body.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Activity visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The activity&#39;s visibility.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRIVATE", value = "The activity's visibility.")

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/actions\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
    return remoteData;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.id, activity.id) &&
        Objects.equals(this.remoteId, activity.remoteId) &&
        Objects.equals(this.user, activity.user) &&
        Objects.equals(this.remoteCreatedAt, activity.remoteCreatedAt) &&
        Objects.equals(this.activityType, activity.activityType) &&
        Objects.equals(this.subject, activity.subject) &&
        Objects.equals(this.body, activity.body) &&
        Objects.equals(this.visibility, activity.visibility) &&
        Objects.equals(this.remoteData, activity.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, user, remoteCreatedAt, activityType, subject, body, visibility, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
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

