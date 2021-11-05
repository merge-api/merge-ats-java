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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Application Object ### Description The &#x60;Application&#x60; object is used to represent an Application for a job position.  ### Usage Example Fetch from the &#x60;LIST Applications&#x60; endpoint and filter by &#x60;ID&#x60; to show all applications.
 */
@ApiModel(description = "# The Application Object ### Description The `Application` object is used to represent an Application for a job position.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-02T17:09:04.691904-07:00[America/Los_Angeles]")
public class ApplicationRequest {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private UUID candidate;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private UUID job;

  public static final String SERIALIZED_NAME_APPLIED_AT = "applied_at";
  @SerializedName(SERIALIZED_NAME_APPLIED_AT)
  private OffsetDateTime appliedAt;

  public static final String SERIALIZED_NAME_REJECTED_AT = "rejected_at";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT)
  private OffsetDateTime rejectedAt;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_CREDITED_TO = "credited_to";
  @SerializedName(SERIALIZED_NAME_CREDITED_TO)
  private UUID creditedTo;

  public static final String SERIALIZED_NAME_CURRENT_STAGE = "current_stage";
  @SerializedName(SERIALIZED_NAME_CURRENT_STAGE)
  private UUID currentStage;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private UUID rejectReason;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, Object> customFields = null;


  public ApplicationRequest remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "98796", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public ApplicationRequest candidate(UUID candidate) {
    
    this.candidate = candidate;
    return this;
  }

   /**
   * The candidate applying.
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The candidate applying.")

  public UUID getCandidate() {
    return candidate;
  }


  public void setCandidate(UUID candidate) {
    this.candidate = candidate;
  }


  public ApplicationRequest job(UUID job) {
    
    this.job = job;
    return this;
  }

   /**
   * The job being applied for.
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The job being applied for.")

  public UUID getJob() {
    return job;
  }


  public void setJob(UUID job) {
    this.job = job;
  }


  public ApplicationRequest appliedAt(OffsetDateTime appliedAt) {
    
    this.appliedAt = appliedAt;
    return this;
  }

   /**
   * When the application was submitted.
   * @return appliedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the application was submitted.")

  public OffsetDateTime getAppliedAt() {
    return appliedAt;
  }


  public void setAppliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
  }


  public ApplicationRequest rejectedAt(OffsetDateTime rejectedAt) {
    
    this.rejectedAt = rejectedAt;
    return this;
  }

   /**
   * When the application was rejected.
   * @return rejectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-15T00:00Z", value = "When the application was rejected.")

  public OffsetDateTime getRejectedAt() {
    return rejectedAt;
  }


  public void setRejectedAt(OffsetDateTime rejectedAt) {
    this.rejectedAt = rejectedAt;
  }


  public ApplicationRequest source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The application&#39;s source.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campus recruiting event", value = "The application's source.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public ApplicationRequest creditedTo(UUID creditedTo) {
    
    this.creditedTo = creditedTo;
    return this;
  }

   /**
   * The user credited for this application.
   * @return creditedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "58166795-8d68-4b30-9bfb-bfd402479484", value = "The user credited for this application.")

  public UUID getCreditedTo() {
    return creditedTo;
  }


  public void setCreditedTo(UUID creditedTo) {
    this.creditedTo = creditedTo;
  }


  public ApplicationRequest currentStage(UUID currentStage) {
    
    this.currentStage = currentStage;
    return this;
  }

   /**
   * The application&#39;s current stage.
   * @return currentStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d578dfdc-7b0a-4ab6-a2b0-4b40f20eb9ea", value = "The application's current stage.")

  public UUID getCurrentStage() {
    return currentStage;
  }


  public void setCurrentStage(UUID currentStage) {
    this.currentStage = currentStage;
  }


  public ApplicationRequest rejectReason(UUID rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * The application&#39;s reason for rejection.
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "59b25f2b-da02-40f5-9656-9fa0db555784", value = "The application's reason for rejection.")

  public UUID getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(UUID rejectReason) {
    this.rejectReason = rejectReason;
  }


  public ApplicationRequest customFields(Map<String, Object> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public ApplicationRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Custom fields configured for a given model.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom fields configured for a given model.")

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRequest applicationRequest = (ApplicationRequest) o;
    return Objects.equals(this.remoteId, applicationRequest.remoteId) &&
        Objects.equals(this.candidate, applicationRequest.candidate) &&
        Objects.equals(this.job, applicationRequest.job) &&
        Objects.equals(this.appliedAt, applicationRequest.appliedAt) &&
        Objects.equals(this.rejectedAt, applicationRequest.rejectedAt) &&
        Objects.equals(this.source, applicationRequest.source) &&
        Objects.equals(this.creditedTo, applicationRequest.creditedTo) &&
        Objects.equals(this.currentStage, applicationRequest.currentStage) &&
        Objects.equals(this.rejectReason, applicationRequest.rejectReason) &&
        Objects.equals(this.customFields, applicationRequest.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, candidate, job, appliedAt, rejectedAt, source, creditedTo, currentStage, rejectReason, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRequest {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
    sb.append("    rejectedAt: ").append(toIndentedString(rejectedAt)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    creditedTo: ").append(toIndentedString(creditedTo)).append("\n");
    sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

