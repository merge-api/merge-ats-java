
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
 * # The Application Object ### Description The &#x60;Application&#x60; object is used to represent an Application for a job position. This is separate from the Candidate object, although some systems may only allow a Candidate to have one Application.  Please note: Application objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the &#x60;LIST Applications&#x60; endpoint and filter by &#x60;ID&#x60; to show all applications.
 */
@ApiModel(description = "# The Application Object ### Description The `Application` object is used to represent an Application for a job position. This is separate from the Candidate object, although some systems may only allow a Candidate to have one Application.  Please note: Application objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class ApplicationRequestRawJson {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private JsonElement candidate;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private JsonElement job;

  public static final String SERIALIZED_NAME_APPLIED_AT = "applied_at";
  @SerializedName(SERIALIZED_NAME_APPLIED_AT)
  private JsonElement appliedAt;

  public static final String SERIALIZED_NAME_REJECTED_AT = "rejected_at";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT)
  private JsonElement rejectedAt;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private JsonElement source;

  public static final String SERIALIZED_NAME_CREDITED_TO = "credited_to";
  @SerializedName(SERIALIZED_NAME_CREDITED_TO)
  private JsonElement creditedTo;

  public static final String SERIALIZED_NAME_CURRENT_STAGE = "current_stage";
  @SerializedName(SERIALIZED_NAME_CURRENT_STAGE)
  private JsonElement currentStage;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private JsonElement rejectReason;

  public static final String SERIALIZED_NAME_REMOTE_TEMPLATE_ID = "remote_template_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_TEMPLATE_ID)
  private JsonElement remoteTemplateId;

  public static final String SERIALIZED_NAME_INTEGRATION_PARAMS = "integration_params";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_PARAMS)
  private JsonElement integrationParams;

  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS = "linked_account_params";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_PARAMS)
  private JsonElement linkedAccountParams;

  private transient JSON serializer;

  public ApplicationRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public ApplicationRequestRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "98796", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public ApplicationRequestRawJson candidate(UUID candidate) {
    this.candidate = this.serializer.getGson().toJsonTree(candidate);
    return this;
  }

   /**
   * The candidate applying.
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The candidate applying.")

  public JsonElement getCandidate() {
    return candidate;
  }
  public void setCandidate(JsonElement candidate) {
    this.candidate = candidate;
  }

  public ApplicationRequestRawJson job(UUID job) {
    this.job = this.serializer.getGson().toJsonTree(job);
    return this;
  }

   /**
   * The job being applied for.
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The job being applied for.")

  public JsonElement getJob() {
    return job;
  }
  public void setJob(JsonElement job) {
    this.job = job;
  }

  public ApplicationRequestRawJson appliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = this.serializer.getGson().toJsonTree(appliedAt);
    return this;
  }

   /**
   * When the application was submitted.
   * @return appliedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the application was submitted.")

  public JsonElement getAppliedAt() {
    return appliedAt;
  }
  public void setAppliedAt(JsonElement appliedAt) {
    this.appliedAt = appliedAt;
  }

  public ApplicationRequestRawJson rejectedAt(OffsetDateTime rejectedAt) {
    this.rejectedAt = this.serializer.getGson().toJsonTree(rejectedAt);
    return this;
  }

   /**
   * When the application was rejected.
   * @return rejectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-15T00:00Z", value = "When the application was rejected.")

  public JsonElement getRejectedAt() {
    return rejectedAt;
  }
  public void setRejectedAt(JsonElement rejectedAt) {
    this.rejectedAt = rejectedAt;
  }

  public ApplicationRequestRawJson source(String source) {
    this.source = this.serializer.getGson().toJsonTree(source);
    return this;
  }

   /**
   * The application&#39;s source.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campus recruiting event", value = "The application's source.")

  public JsonElement getSource() {
    return source;
  }
  public void setSource(JsonElement source) {
    this.source = source;
  }

  public ApplicationRequestRawJson creditedTo(UUID creditedTo) {
    this.creditedTo = this.serializer.getGson().toJsonTree(creditedTo);
    return this;
  }

   /**
   * The user credited for this application.
   * @return creditedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "58166795-8d68-4b30-9bfb-bfd402479484", value = "The user credited for this application.")

  public JsonElement getCreditedTo() {
    return creditedTo;
  }
  public void setCreditedTo(JsonElement creditedTo) {
    this.creditedTo = creditedTo;
  }

  public ApplicationRequestRawJson currentStage(UUID currentStage) {
    this.currentStage = this.serializer.getGson().toJsonTree(currentStage);
    return this;
  }

   /**
   * The application&#39;s current stage.
   * @return currentStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d578dfdc-7b0a-4ab6-a2b0-4b40f20eb9ea", value = "The application's current stage.")

  public JsonElement getCurrentStage() {
    return currentStage;
  }
  public void setCurrentStage(JsonElement currentStage) {
    this.currentStage = currentStage;
  }

  public ApplicationRequestRawJson rejectReason(UUID rejectReason) {
    this.rejectReason = this.serializer.getGson().toJsonTree(rejectReason);
    return this;
  }

   /**
   * The application&#39;s reason for rejection.
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "59b25f2b-da02-40f5-9656-9fa0db555784", value = "The application's reason for rejection.")

  public JsonElement getRejectReason() {
    return rejectReason;
  }
  public void setRejectReason(JsonElement rejectReason) {
    this.rejectReason = rejectReason;
  }

  public ApplicationRequestRawJson remoteTemplateId(String remoteTemplateId) {
    this.remoteTemplateId = this.serializer.getGson().toJsonTree(remoteTemplateId);
    return this;
  }

   /**
   * Get remoteTemplateId
   * @return remoteTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92830948203", value = "")

  public JsonElement getRemoteTemplateId() {
    return remoteTemplateId;
  }
  public void setRemoteTemplateId(JsonElement remoteTemplateId) {
    this.remoteTemplateId = remoteTemplateId;
  }

  public ApplicationRequestRawJson integrationParams(Map<String, Object> integrationParams) {
    this.integrationParams = this.serializer.getGson().toJsonTree(integrationParams);
    return this;
  }

   /**
   * Get integrationParams
   * @return integrationParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_integration_field\":\"unique_integration_field_value\"}", value = "")

  public JsonElement getIntegrationParams() {
    return integrationParams;
  }
  public void setIntegrationParams(JsonElement integrationParams) {
    this.integrationParams = integrationParams;
  }

  public ApplicationRequestRawJson linkedAccountParams(Map<String, Object> linkedAccountParams) {
    this.linkedAccountParams = this.serializer.getGson().toJsonTree(linkedAccountParams);
    return this;
  }

   /**
   * Get linkedAccountParams
   * @return linkedAccountParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"unique_linked_account_field\":\"unique_linked_account_field_value\"}", value = "")

  public JsonElement getLinkedAccountParams() {
    return linkedAccountParams;
  }
  public void setLinkedAccountParams(JsonElement linkedAccountParams) {
    this.linkedAccountParams = linkedAccountParams;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRequestRawJson applicationRequest = (ApplicationRequestRawJson) o;
    return Objects.equals(this.remoteId.getAsString(), applicationRequest.remoteId.getAsString()) &&
        Objects.equals(this.candidate.getAsString(), applicationRequest.candidate.getAsString()) &&
        Objects.equals(this.job.getAsString(), applicationRequest.job.getAsString()) &&
        Objects.equals(this.appliedAt.getAsString(), applicationRequest.appliedAt.getAsString()) &&
        Objects.equals(this.rejectedAt.getAsString(), applicationRequest.rejectedAt.getAsString()) &&
        Objects.equals(this.source.getAsString(), applicationRequest.source.getAsString()) &&
        Objects.equals(this.creditedTo.getAsString(), applicationRequest.creditedTo.getAsString()) &&
        Objects.equals(this.currentStage.getAsString(), applicationRequest.currentStage.getAsString()) &&
        Objects.equals(this.rejectReason.getAsString(), applicationRequest.rejectReason.getAsString()) &&
        Objects.equals(this.remoteTemplateId.getAsString(), applicationRequest.remoteTemplateId.getAsString()) &&
        Objects.equals(this.integrationParams.getAsString(), applicationRequest.integrationParams.getAsString()) &&
        Objects.equals(this.linkedAccountParams.getAsString(), applicationRequest.linkedAccountParams.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(remoteId, candidate, job, appliedAt, rejectedAt, source, creditedTo, currentStage, rejectReason, remoteTemplateId, integrationParams, linkedAccountParams);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRequestRawJson {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate.getAsString())).append("\n");
    sb.append("    job: ").append(toIndentedString(job.getAsString())).append("\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt.getAsString())).append("\n");
    sb.append("    rejectedAt: ").append(toIndentedString(rejectedAt.getAsString())).append("\n");
    sb.append("    source: ").append(toIndentedString(source.getAsString())).append("\n");
    sb.append("    creditedTo: ").append(toIndentedString(creditedTo.getAsString())).append("\n");
    sb.append("    currentStage: ").append(toIndentedString(currentStage.getAsString())).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason.getAsString())).append("\n");
    sb.append("    remoteTemplateId: ").append(toIndentedString(remoteTemplateId.getAsString())).append("\n");
    sb.append("    integrationParams: ").append(toIndentedString(integrationParams.getAsString())).append("\n");
    sb.append("    linkedAccountParams: ").append(toIndentedString(linkedAccountParams.getAsString())).append("\n");
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


