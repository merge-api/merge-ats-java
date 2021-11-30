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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Scorecard Object ### Description The &#x60;Scorecard&#x60; object is used to represent a Scorecard for an interview  ### Usage Example Fetch from the &#x60;LIST Scorecards&#x60; endpoint and filter by &#x60;application&#x60; to show all scorecard for an applicant.
 */
@ApiModel(description = "# The Scorecard Object ### Description The `Scorecard` object is used to represent a Scorecard for an interview  ### Usage Example Fetch from the `LIST Scorecards` endpoint and filter by `application` to show all scorecard for an applicant.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T09:05:46.017673-05:00[America/New_York]")
public class ScorecardRequest {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private UUID application;

  public static final String SERIALIZED_NAME_INTERVIEW = "interview";
  @SerializedName(SERIALIZED_NAME_INTERVIEW)
  private UUID interview;

  public static final String SERIALIZED_NAME_INTERVIEWER = "interviewer";
  @SerializedName(SERIALIZED_NAME_INTERVIEWER)
  private UUID interviewer;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private OffsetDateTime submittedAt;


  public ScorecardRequest remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22234", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public ScorecardRequest application(UUID application) {
    
    this.application = application;
    return this;
  }

   /**
   * The application being scored.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The application being scored.")

  public UUID getApplication() {
    return application;
  }


  public void setApplication(UUID application) {
    this.application = application;
  }


  public ScorecardRequest interview(UUID interview) {
    
    this.interview = interview;
    return this;
  }

   /**
   * The interview being scored.
   * @return interview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The interview being scored.")

  public UUID getInterview() {
    return interview;
  }


  public void setInterview(UUID interview) {
    this.interview = interview;
  }


  public ScorecardRequest interviewer(UUID interviewer) {
    
    this.interviewer = interviewer;
    return this;
  }

   /**
   * The interviewer doing the scoring.
   * @return interviewer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bbb519a3-246e-4b95-b6b3-dba16107ba6b", value = "The interviewer doing the scoring.")

  public UUID getInterviewer() {
    return interviewer;
  }


  public void setInterviewer(UUID interviewer) {
    this.interviewer = interviewer;
  }


  public ScorecardRequest remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s scorecard was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's scorecard was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public ScorecardRequest submittedAt(OffsetDateTime submittedAt) {
    
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * When the scorecard was submitted.
   * @return submittedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the scorecard was submitted.")

  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }


  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardRequest scorecardRequest = (ScorecardRequest) o;
    return Objects.equals(this.remoteId, scorecardRequest.remoteId) &&
        Objects.equals(this.application, scorecardRequest.application) &&
        Objects.equals(this.interview, scorecardRequest.interview) &&
        Objects.equals(this.interviewer, scorecardRequest.interviewer) &&
        Objects.equals(this.remoteCreatedAt, scorecardRequest.remoteCreatedAt) &&
        Objects.equals(this.submittedAt, scorecardRequest.submittedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, application, interview, interviewer, remoteCreatedAt, submittedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardRequest {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    interview: ").append(toIndentedString(interview)).append("\n");
    sb.append("    interviewer: ").append(toIndentedString(interviewer)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
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

