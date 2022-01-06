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
 * Issue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-06T15:56:50.758120Z[Etc/UTC]")
public class Issue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_END_USER = "end_user";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private Map<String, Object> endUser = null;

  public static final String SERIALIZED_NAME_FIRST_INCIDENT_TIME = "first_incident_time";
  @SerializedName(SERIALIZED_NAME_FIRST_INCIDENT_TIME)
  private OffsetDateTime firstIncidentTime;

  public static final String SERIALIZED_NAME_LAST_INCIDENT_TIME = "last_incident_time";
  @SerializedName(SERIALIZED_NAME_LAST_INCIDENT_TIME)
  private OffsetDateTime lastIncidentTime;

  public static final String SERIALIZED_NAME_IS_MUTED = "is_muted";
  @SerializedName(SERIALIZED_NAME_IS_MUTED)
  private Boolean isMuted;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }




   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }




  public Issue errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(required = true, value = "")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


   /**
   * Get endUser
   * @return endUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getEndUser() {
    return endUser;
  }




  public Issue firstIncidentTime(OffsetDateTime firstIncidentTime) {
    
    this.firstIncidentTime = firstIncidentTime;
    return this;
  }

   /**
   * Get firstIncidentTime
   * @return firstIncidentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFirstIncidentTime() {
    return firstIncidentTime;
  }


  public void setFirstIncidentTime(OffsetDateTime firstIncidentTime) {
    this.firstIncidentTime = firstIncidentTime;
  }


  public Issue lastIncidentTime(OffsetDateTime lastIncidentTime) {
    
    this.lastIncidentTime = lastIncidentTime;
    return this;
  }

   /**
   * Get lastIncidentTime
   * @return lastIncidentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastIncidentTime() {
    return lastIncidentTime;
  }


  public void setLastIncidentTime(OffsetDateTime lastIncidentTime) {
    this.lastIncidentTime = lastIncidentTime;
  }


   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMuted() {
    return isMuted;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.id, issue.id) &&
        Objects.equals(this.status, issue.status) &&
        Objects.equals(this.errorDescription, issue.errorDescription) &&
        Objects.equals(this.endUser, issue.endUser) &&
        Objects.equals(this.firstIncidentTime, issue.firstIncidentTime) &&
        Objects.equals(this.lastIncidentTime, issue.lastIncidentTime) &&
        Objects.equals(this.isMuted, issue.isMuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, errorDescription, endUser, firstIncidentTime, lastIncidentTime, isMuted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
    sb.append("    firstIncidentTime: ").append(toIndentedString(firstIncidentTime)).append("\n");
    sb.append("    lastIncidentTime: ").append(toIndentedString(lastIncidentTime)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
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

