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
import merge_ats_client.model.OverallRecommendationEnum;
import merge_ats_client.model.RemoteData;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Scorecard Object ### Description The &#x60;Scorecard&#x60; object is used to represent a Scorecard for an interview ### Usage Example Fetch from the &#x60;LIST Scorecards&#x60; endpoint and filter by &#x60;application&#x60; to show all scorecard for an applicant.
 */
@ApiModel(description = "# The Scorecard Object ### Description The `Scorecard` object is used to represent a Scorecard for an interview ### Usage Example Fetch from the `LIST Scorecards` endpoint and filter by `application` to show all scorecard for an applicant.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:32:36.773068Z[Etc/UTC]")
public class Scorecard {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

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

  public static final String SERIALIZED_NAME_OVERALL_RECOMMENDATION = "overall_recommendation";
  @SerializedName(SERIALIZED_NAME_OVERALL_RECOMMENDATION)
  private OverallRecommendationEnum overallRecommendation;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3eab2f17-eeb1-450d-97f0-029d8be1e06f", value = "")

  public UUID getId() {
    return id;
  }




  public Scorecard remoteId(String remoteId) {
    
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


  public Scorecard application(UUID application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "")

  public UUID getApplication() {
    return application;
  }


  public void setApplication(UUID application) {
    this.application = application;
  }


  public Scorecard interview(UUID interview) {
    
    this.interview = interview;
    return this;
  }

   /**
   * Get interview
   * @return interview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "")

  public UUID getInterview() {
    return interview;
  }


  public void setInterview(UUID interview) {
    this.interview = interview;
  }


  public Scorecard interviewer(UUID interviewer) {
    
    this.interviewer = interviewer;
    return this;
  }

   /**
   * Get interviewer
   * @return interviewer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bbb519a3-246e-4b95-b6b3-dba16107ba6b", value = "")

  public UUID getInterviewer() {
    return interviewer;
  }


  public void setInterviewer(UUID interviewer) {
    this.interviewer = interviewer;
  }


  public Scorecard remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
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


  public Scorecard submittedAt(OffsetDateTime submittedAt) {
    
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


  public Scorecard overallRecommendation(OverallRecommendationEnum overallRecommendation) {
    
    this.overallRecommendation = overallRecommendation;
    return this;
  }

   /**
   * The inteviewer&#39;s recommendation.
   * @return overallRecommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STRONG_YES", value = "The inteviewer's recommendation.")

  public OverallRecommendationEnum getOverallRecommendation() {
    return overallRecommendation;
  }


  public void setOverallRecommendation(OverallRecommendationEnum overallRecommendation) {
    this.overallRecommendation = overallRecommendation;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/ratings\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Scorecard scorecard = (Scorecard) o;
    return Objects.equals(this.id, scorecard.id) &&
        Objects.equals(this.remoteId, scorecard.remoteId) &&
        Objects.equals(this.application, scorecard.application) &&
        Objects.equals(this.interview, scorecard.interview) &&
        Objects.equals(this.interviewer, scorecard.interviewer) &&
        Objects.equals(this.remoteCreatedAt, scorecard.remoteCreatedAt) &&
        Objects.equals(this.submittedAt, scorecard.submittedAt) &&
        Objects.equals(this.overallRecommendation, scorecard.overallRecommendation) &&
        Objects.equals(this.remoteData, scorecard.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, application, interview, interviewer, remoteCreatedAt, submittedAt, overallRecommendation, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scorecard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    interview: ").append(toIndentedString(interview)).append("\n");
    sb.append("    interviewer: ").append(toIndentedString(interviewer)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    overallRecommendation: ").append(toIndentedString(overallRecommendation)).append("\n");
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

