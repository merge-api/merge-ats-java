
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
 * # The EEOC Object ### Description The &#x60;EEOC&#x60; object is used to represent the Equal Employment Opportunity Commission information for a candidate. ### Usage Example Fetch from the &#x60;LIST EEOCs&#x60; endpoint and filter by &#x60;candidate&#x60; to show all EEOC information for a candidate.
 */
@ApiModel(description = "# The EEOC Object ### Description The `EEOC` object is used to represent the Equal Employment Opportunity Commission information for a candidate. ### Usage Example Fetch from the `LIST EEOCs` endpoint and filter by `candidate` to show all EEOC information for a candidate.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class EEOCRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private JsonElement candidate;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private JsonElement submittedAt;

  public static final String SERIALIZED_NAME_RACE = "race";
  @SerializedName(SERIALIZED_NAME_RACE)
  private JsonElement race;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private JsonElement gender;

  public static final String SERIALIZED_NAME_VETERAN_STATUS = "veteran_status";
  @SerializedName(SERIALIZED_NAME_VETERAN_STATUS)
  private JsonElement veteranStatus;

  public static final String SERIALIZED_NAME_DISABILITY_STATUS = "disability_status";
  @SerializedName(SERIALIZED_NAME_DISABILITY_STATUS)
  private JsonElement disabilityStatus;

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

  public EEOCRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f7dd7b4f-237e-4772-8bd4-3246384c6c58", value = "")

  public JsonElement getId() {
    return id;
  }

  public EEOCRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public EEOCRawJson candidate(UUID candidate) {
    this.candidate = this.serializer.getGson().toJsonTree(candidate);
    return this;
  }

   /**
   * The candidate being represented.
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f963f34d-3d2f-4f77-b557-cf36bc7e6498", value = "The candidate being represented.")

  public JsonElement getCandidate() {
    return candidate;
  }
  public void setCandidate(JsonElement candidate) {
    this.candidate = candidate;
  }

  public EEOCRawJson submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = this.serializer.getGson().toJsonTree(submittedAt);
    return this;
  }

   /**
   * When the information was submitted.
   * @return submittedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the information was submitted.")

  public JsonElement getSubmittedAt() {
    return submittedAt;
  }
  public void setSubmittedAt(JsonElement submittedAt) {
    this.submittedAt = submittedAt;
  }

  public EEOCRawJson race(RaceEnum race) {
    this.race = this.serializer.getGson().toJsonTree(race);
    return this;
  }

   /**
   * The candidate&#39;s race.
   * @return race
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HISPANIC_OR_LATINO", value = "The candidate's race.")

  public JsonElement getRace() {
    return race;
  }
  public void setRace(JsonElement race) {
    this.race = race;
  }

  public EEOCRawJson gender(GenderEnum gender) {
    this.gender = this.serializer.getGson().toJsonTree(gender);
    return this;
  }

   /**
   * The candidate&#39;s gender.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FEMALE", value = "The candidate's gender.")

  public JsonElement getGender() {
    return gender;
  }
  public void setGender(JsonElement gender) {
    this.gender = gender;
  }

  public EEOCRawJson veteranStatus(VeteranStatusEnum veteranStatus) {
    this.veteranStatus = this.serializer.getGson().toJsonTree(veteranStatus);
    return this;
  }

   /**
   * The candidate&#39;s veteran status.
   * @return veteranStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I_AM_NOT_A_PROTECTED_VETERAN", value = "The candidate's veteran status.")

  public JsonElement getVeteranStatus() {
    return veteranStatus;
  }
  public void setVeteranStatus(JsonElement veteranStatus) {
    this.veteranStatus = veteranStatus;
  }

  public EEOCRawJson disabilityStatus(DisabilityStatusEnum disabilityStatus) {
    this.disabilityStatus = this.serializer.getGson().toJsonTree(disabilityStatus);
    return this;
  }

   /**
   * The candidate&#39;s disability status.
   * @return disabilityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I_DONT_WISH_TO_ANSWER", value = "The candidate's disability status.")

  public JsonElement getDisabilityStatus() {
    return disabilityStatus;
  }
  public void setDisabilityStatus(JsonElement disabilityStatus) {
    this.disabilityStatus = disabilityStatus;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/eeoc\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    EEOCRawJson EEOC = (EEOCRawJson) o;
    return Objects.equals(this.id.getAsString(), EEOC.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), EEOC.remoteId.getAsString()) &&
        Objects.equals(this.candidate.getAsString(), EEOC.candidate.getAsString()) &&
        Objects.equals(this.submittedAt.getAsString(), EEOC.submittedAt.getAsString()) &&
        Objects.equals(this.race.getAsString(), EEOC.race.getAsString()) &&
        Objects.equals(this.gender.getAsString(), EEOC.gender.getAsString()) &&
        Objects.equals(this.veteranStatus.getAsString(), EEOC.veteranStatus.getAsString()) &&
        Objects.equals(this.disabilityStatus.getAsString(), EEOC.disabilityStatus.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), EEOC.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), EEOC.remoteWasDeleted.getAsString()) &&
        Objects.equals(this.fieldMappings.getAsString(), EEOC.fieldMappings.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, candidate, submittedAt, race, gender, veteranStatus, disabilityStatus, remoteData, remoteWasDeleted, fieldMappings);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EEOCRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate.getAsString())).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt.getAsString())).append("\n");
    sb.append("    race: ").append(toIndentedString(race.getAsString())).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender.getAsString())).append("\n");
    sb.append("    veteranStatus: ").append(toIndentedString(veteranStatus.getAsString())).append("\n");
    sb.append("    disabilityStatus: ").append(toIndentedString(disabilityStatus.getAsString())).append("\n");
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


