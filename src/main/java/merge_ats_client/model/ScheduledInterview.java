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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import merge_ats_client.model.RemoteData;
import org.threeten.bp.OffsetDateTime;

/**
 * # The ScheduledInterview Object ### Description The &#x60;ScheduledInterview&#x60; object is used to represent an interview  ### Usage Example Fetch from the &#x60;LIST ScheduledInterviews&#x60; endpoint and filter by &#x60;interviewers&#x60; to show all office locations.
 */
@ApiModel(description = "# The ScheduledInterview Object ### Description The `ScheduledInterview` object is used to represent an interview  ### Usage Example Fetch from the `LIST ScheduledInterviews` endpoint and filter by `interviewers` to show all office locations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T21:09:25.697907Z[Etc/UTC]")
public class ScheduledInterview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private UUID application;

  public static final String SERIALIZED_NAME_JOB_INTERVIEW_STAGE = "job_interview_stage";
  @SerializedName(SERIALIZED_NAME_JOB_INTERVIEW_STAGE)
  private UUID jobInterviewStage;

  public static final String SERIALIZED_NAME_ORGANIZER = "organizer";
  @SerializedName(SERIALIZED_NAME_ORGANIZER)
  private UUID organizer;

  public static final String SERIALIZED_NAME_INTERVIEWERS = "interviewers";
  @SerializedName(SERIALIZED_NAME_INTERVIEWERS)
  private List<UUID> interviewers = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private OffsetDateTime startAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private OffsetDateTime endAt;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_UPDATED_AT = "remote_updated_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_UPDATED_AT)
  private OffsetDateTime remoteUpdatedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b8faf072-98b9-4445-8a9a-6b4950efca19", value = "")

  public UUID getId() {
    return id;
  }




  public ScheduledInterview remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public ScheduledInterview application(UUID application) {
    
    this.application = application;
    return this;
  }

   /**
   * The application being interviewed.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92e8a369-fffe-430d-b93a-f7e8a16563f1", value = "The application being interviewed.")

  public UUID getApplication() {
    return application;
  }


  public void setApplication(UUID application) {
    this.application = application;
  }


  public ScheduledInterview jobInterviewStage(UUID jobInterviewStage) {
    
    this.jobInterviewStage = jobInterviewStage;
    return this;
  }

   /**
   * The stage of the interview.
   * @return jobInterviewStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2f7adb59-3fe6-4b5b-aef6-563f72bd13dc", value = "The stage of the interview.")

  public UUID getJobInterviewStage() {
    return jobInterviewStage;
  }


  public void setJobInterviewStage(UUID jobInterviewStage) {
    this.jobInterviewStage = jobInterviewStage;
  }


  public ScheduledInterview organizer(UUID organizer) {
    
    this.organizer = organizer;
    return this;
  }

   /**
   * The user organizing the interview.
   * @return organizer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The user organizing the interview.")

  public UUID getOrganizer() {
    return organizer;
  }


  public void setOrganizer(UUID organizer) {
    this.organizer = organizer;
  }


  public ScheduledInterview interviewers(List<UUID> interviewers) {
    
    this.interviewers = interviewers;
    return this;
  }

  public ScheduledInterview addInterviewersItem(UUID interviewersItem) {
    if (this.interviewers == null) {
      this.interviewers = new ArrayList<UUID>();
    }
    this.interviewers.add(interviewersItem);
    return this;
  }

   /**
   * Array of &#x60;RemoteUser&#x60; IDs.
   * @return interviewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"f9813dd5-e70b-484c-91d8-00acd6065b07\",\"89a86fcf-d540-4e6b-ac3d-ce07c4ec9b3c\"]", value = "Array of `RemoteUser` IDs.")

  public List<UUID> getInterviewers() {
    return interviewers;
  }


  public void setInterviewers(List<UUID> interviewers) {
    this.interviewers = interviewers;
  }


  public ScheduledInterview location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The interview&#39;s location.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Embarcadero Center 2", value = "The interview's location.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ScheduledInterview startAt(OffsetDateTime startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * When the interview was started.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the interview was started.")

  public OffsetDateTime getStartAt() {
    return startAt;
  }


  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }


  public ScheduledInterview endAt(OffsetDateTime endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * When the interview was ended.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T02:00Z", value = "When the interview was ended.")

  public OffsetDateTime getEndAt() {
    return endAt;
  }


  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }


  public ScheduledInterview remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s interview was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's interview was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public ScheduledInterview remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    
    this.remoteUpdatedAt = remoteUpdatedAt;
    return this;
  }

   /**
   * When the third party&#39;s interview was updated.
   * @return remoteUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's interview was updated.")

  public OffsetDateTime getRemoteUpdatedAt() {
    return remoteUpdatedAt;
  }


  public void setRemoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    this.remoteUpdatedAt = remoteUpdatedAt;
  }


  public ScheduledInterview status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "SCHEDULED", required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/interviews\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    ScheduledInterview scheduledInterview = (ScheduledInterview) o;
    return Objects.equals(this.id, scheduledInterview.id) &&
        Objects.equals(this.remoteId, scheduledInterview.remoteId) &&
        Objects.equals(this.application, scheduledInterview.application) &&
        Objects.equals(this.jobInterviewStage, scheduledInterview.jobInterviewStage) &&
        Objects.equals(this.organizer, scheduledInterview.organizer) &&
        Objects.equals(this.interviewers, scheduledInterview.interviewers) &&
        Objects.equals(this.location, scheduledInterview.location) &&
        Objects.equals(this.startAt, scheduledInterview.startAt) &&
        Objects.equals(this.endAt, scheduledInterview.endAt) &&
        Objects.equals(this.remoteCreatedAt, scheduledInterview.remoteCreatedAt) &&
        Objects.equals(this.remoteUpdatedAt, scheduledInterview.remoteUpdatedAt) &&
        Objects.equals(this.status, scheduledInterview.status) &&
        Objects.equals(this.remoteData, scheduledInterview.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, application, jobInterviewStage, organizer, interviewers, location, startAt, endAt, remoteCreatedAt, remoteUpdatedAt, status, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledInterview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    jobInterviewStage: ").append(toIndentedString(jobInterviewStage)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
    sb.append("    interviewers: ").append(toIndentedString(interviewers)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    remoteUpdatedAt: ").append(toIndentedString(remoteUpdatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

