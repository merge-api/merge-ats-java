
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
 * # The Scorecard Object ### Description The &#x60;Scorecard&#x60; object is used to represent a Scorecard for an interview  ### Usage Example Fetch from the &#x60;LIST Scorecards&#x60; endpoint and filter by &#x60;application&#x60; to show all scorecard for an applicant.
 */
@ApiModel(description = "# The Scorecard Object ### Description The `Scorecard` object is used to represent a Scorecard for an interview  ### Usage Example Fetch from the `LIST Scorecards` endpoint and filter by `application` to show all scorecard for an applicant.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T18:32:11.741718Z[Etc/UTC]")
public class ScorecardRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private JsonElement application;

  public static final String SERIALIZED_NAME_INTERVIEW = "interview";
  @SerializedName(SERIALIZED_NAME_INTERVIEW)
  private JsonElement interview;

  public static final String SERIALIZED_NAME_INTERVIEWER = "interviewer";
  @SerializedName(SERIALIZED_NAME_INTERVIEWER)
  private JsonElement interviewer;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private JsonElement submittedAt;

  public static final String SERIALIZED_NAME_OVERALL_RECOMMENDATION = "overall_recommendation";
  @SerializedName(SERIALIZED_NAME_OVERALL_RECOMMENDATION)
  private JsonElement overallRecommendation;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public ScorecardRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3eab2f17-eeb1-450d-97f0-029d8be1e06f", value = "")

  public JsonElement getId() {
    return id;
  }

  public ScorecardRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22234", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public ScorecardRawJson application(UUID application) {
    this.application = this.serializer.getGson().toJsonTree(application);
    return this;
  }

   /**
   * The application being scored.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The application being scored.")

  public JsonElement getApplication() {
    return application;
  }
  public void setApplication(JsonElement application) {
    this.application = application;
  }

  public ScorecardRawJson interview(UUID interview) {
    this.interview = this.serializer.getGson().toJsonTree(interview);
    return this;
  }

   /**
   * The interview being scored.
   * @return interview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The interview being scored.")

  public JsonElement getInterview() {
    return interview;
  }
  public void setInterview(JsonElement interview) {
    this.interview = interview;
  }

  public ScorecardRawJson interviewer(UUID interviewer) {
    this.interviewer = this.serializer.getGson().toJsonTree(interviewer);
    return this;
  }

   /**
   * The interviewer doing the scoring.
   * @return interviewer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bbb519a3-246e-4b95-b6b3-dba16107ba6b", value = "The interviewer doing the scoring.")

  public JsonElement getInterviewer() {
    return interviewer;
  }
  public void setInterviewer(JsonElement interviewer) {
    this.interviewer = interviewer;
  }

  public ScorecardRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the third party&#39;s scorecard was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's scorecard was created.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

  public ScorecardRawJson submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = this.serializer.getGson().toJsonTree(submittedAt);
    return this;
  }

   /**
   * When the scorecard was submitted.
   * @return submittedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the scorecard was submitted.")

  public JsonElement getSubmittedAt() {
    return submittedAt;
  }
  public void setSubmittedAt(JsonElement submittedAt) {
    this.submittedAt = submittedAt;
  }

  public ScorecardRawJson overallRecommendation(String overallRecommendation) {
    this.overallRecommendation = this.serializer.getGson().toJsonTree(overallRecommendation);
    return this;
  }

   /**
   * Get overallRecommendation
   * @return overallRecommendation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "STRONG_YES", required = true, value = "")

  public JsonElement getOverallRecommendation() {
    return overallRecommendation;
  }
  public void setOverallRecommendation(JsonElement overallRecommendation) {
    this.overallRecommendation = overallRecommendation;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/ratings\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
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
    ScorecardRawJson scorecard = (ScorecardRawJson) o;
    return Objects.equals(this.id.getAsString(), scorecard.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), scorecard.remoteId.getAsString()) &&
        Objects.equals(this.application.getAsString(), scorecard.application.getAsString()) &&
        Objects.equals(this.interview.getAsString(), scorecard.interview.getAsString()) &&
        Objects.equals(this.interviewer.getAsString(), scorecard.interviewer.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), scorecard.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.submittedAt.getAsString(), scorecard.submittedAt.getAsString()) &&
        Objects.equals(this.overallRecommendation.getAsString(), scorecard.overallRecommendation.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), scorecard.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, application, interview, interviewer, remoteCreatedAt, submittedAt, overallRecommendation, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    application: ").append(toIndentedString(application.getAsString())).append("\n");
    sb.append("    interview: ").append(toIndentedString(interview.getAsString())).append("\n");
    sb.append("    interviewer: ").append(toIndentedString(interviewer.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt.getAsString())).append("\n");
    sb.append("    overallRecommendation: ").append(toIndentedString(overallRecommendation.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
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

