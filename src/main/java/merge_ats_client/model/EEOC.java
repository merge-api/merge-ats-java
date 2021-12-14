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
 * # The EEOC Object ### Description The &#x60;EEOC&#x60; object is used to represent the Equal Employment Opportunity Commission information for a candidate.  ### Usage Example Fetch from the &#x60;LIST EEOCs&#x60; endpoint and filter by &#x60;candidate&#x60; to show all EEOC information for a candidate.
 */
@ApiModel(description = "# The EEOC Object ### Description The `EEOC` object is used to represent the Equal Employment Opportunity Commission information for a candidate.  ### Usage Example Fetch from the `LIST EEOCs` endpoint and filter by `candidate` to show all EEOC information for a candidate.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-14T00:33:16.748520Z[Etc/UTC]")
public class EEOC {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private UUID candidate;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private OffsetDateTime submittedAt;

  public static final String SERIALIZED_NAME_RACE = "race";
  @SerializedName(SERIALIZED_NAME_RACE)
  private String race;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_VETERAN_STATUS = "veteran_status";
  @SerializedName(SERIALIZED_NAME_VETERAN_STATUS)
  private String veteranStatus;

  public static final String SERIALIZED_NAME_DISABILITY_STATUS = "disability_status";
  @SerializedName(SERIALIZED_NAME_DISABILITY_STATUS)
  private String disabilityStatus;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f7dd7b4f-237e-4772-8bd4-3246384c6c58", value = "")

  public UUID getId() {
    return id;
  }




  public EEOC remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public EEOC candidate(UUID candidate) {
    
    this.candidate = candidate;
    return this;
  }

   /**
   * The candidate being represented.
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f963f34d-3d2f-4f77-b557-cf36bc7e6498", value = "The candidate being represented.")

  public UUID getCandidate() {
    return candidate;
  }


  public void setCandidate(UUID candidate) {
    this.candidate = candidate;
  }


  public EEOC submittedAt(OffsetDateTime submittedAt) {
    
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * When the information was submitted.
   * @return submittedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the information was submitted.")

  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }


  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }


   /**
   * Get race
   * @return race
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HISPANIC_OR_LATINO", value = "")

  public String getRace() {
    return race;
  }




   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FEMALE", value = "")

  public String getGender() {
    return gender;
  }




   /**
   * Get veteranStatus
   * @return veteranStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I_AM_NOT_A_PROTECTED_VETERAN", value = "")

  public String getVeteranStatus() {
    return veteranStatus;
  }




   /**
   * Get disabilityStatus
   * @return disabilityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I_DONT_WISH_TO_ANSWER", value = "")

  public String getDisabilityStatus() {
    return disabilityStatus;
  }




   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/eeoc\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    EEOC EEOC = (EEOC) o;
    return Objects.equals(this.id, EEOC.id) &&
        Objects.equals(this.remoteId, EEOC.remoteId) &&
        Objects.equals(this.candidate, EEOC.candidate) &&
        Objects.equals(this.submittedAt, EEOC.submittedAt) &&
        Objects.equals(this.race, EEOC.race) &&
        Objects.equals(this.gender, EEOC.gender) &&
        Objects.equals(this.veteranStatus, EEOC.veteranStatus) &&
        Objects.equals(this.disabilityStatus, EEOC.disabilityStatus) &&
        Objects.equals(this.remoteData, EEOC.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, candidate, submittedAt, race, gender, veteranStatus, disabilityStatus, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EEOC {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    veteranStatus: ").append(toIndentedString(veteranStatus)).append("\n");
    sb.append("    disabilityStatus: ").append(toIndentedString(disabilityStatus)).append("\n");
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

