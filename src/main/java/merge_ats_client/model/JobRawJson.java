
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
 * # The Job Object ### Description The &#x60;Job&#x60; object is used to represent a Job offering at a company. ### Usage Example Fetch from the &#x60;LIST Jobs&#x60; endpoint to show all job postings.
 */
@ApiModel(description = "# The Job Object ### Description The `Job` object is used to represent a Job offering at a company. ### Usage Example Fetch from the `LIST Jobs` endpoint to show all job postings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:32:36.773068Z[Etc/UTC]")
public class JobRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private JsonElement description;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private JsonElement code;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_UPDATED_AT = "remote_updated_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_UPDATED_AT)
  private JsonElement remoteUpdatedAt;

  public static final String SERIALIZED_NAME_CONFIDENTIAL = "confidential";
  @SerializedName(SERIALIZED_NAME_CONFIDENTIAL)
  private JsonElement confidential;

  public static final String SERIALIZED_NAME_DEPARTMENTS = "departments";
  @SerializedName(SERIALIZED_NAME_DEPARTMENTS)
  private JsonElement departments;

  public static final String SERIALIZED_NAME_OFFICES = "offices";
  @SerializedName(SERIALIZED_NAME_OFFICES)
  private JsonElement offices;

  public static final String SERIALIZED_NAME_HIRING_MANAGERS = "hiring_managers";
  @SerializedName(SERIALIZED_NAME_HIRING_MANAGERS)
  private JsonElement hiringManagers;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public JobRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "022a2bef-57e5-4def-8ed2-7c41bd9a5ed8", value = "")

  public JsonElement getId() {
    return id;
  }

  public JobRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8765432", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public JobRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The job&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer (Merge is actually hiring btw)", value = "The job's name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public JobRawJson description(String description) {
    this.description = this.serializer.getGson().toJsonTree(description);
    return this;
  }

   /**
   * The job&#39;s description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<b>If you're reading this documentation, you might be a good fit for Merge!</b>", value = "The job's description.")

  public JsonElement getDescription() {
    return description;
  }
  public void setDescription(JsonElement description) {
    this.description = description;
  }

  public JobRawJson code(String code) {
    this.code = this.serializer.getGson().toJsonTree(code);
    return this;
  }

   /**
   * The job&#39;s code. Typically an additional identifier used to reference the particular job that is displayed on the ATS.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C0025", value = "The job's code. Typically an additional identifier used to reference the particular job that is displayed on the ATS.")

  public JsonElement getCode() {
    return code;
  }
  public void setCode(JsonElement code) {
    this.code = code;
  }

  public JobRawJson status(JobStatusEnum status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * The job&#39;s status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN", value = "The job's status.")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public JobRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the third party&#39;s job was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's job was created.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

  public JobRawJson remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    this.remoteUpdatedAt = this.serializer.getGson().toJsonTree(remoteUpdatedAt);
    return this;
  }

   /**
   * When the third party&#39;s job was updated.
   * @return remoteUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16T00:00Z", value = "When the third party's job was updated.")

  public JsonElement getRemoteUpdatedAt() {
    return remoteUpdatedAt;
  }
  public void setRemoteUpdatedAt(JsonElement remoteUpdatedAt) {
    this.remoteUpdatedAt = remoteUpdatedAt;
  }

  public JobRawJson confidential(Boolean confidential) {
    this.confidential = this.serializer.getGson().toJsonTree(confidential);
    return this;
  }

   /**
   * Whether the job is confidential.
   * @return confidential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the job is confidential.")

  public JsonElement getConfidential() {
    return confidential;
  }
  public void setConfidential(JsonElement confidential) {
    this.confidential = confidential;
  }

  public JobRawJson departments(List<UUID> departments) {
    this.departments = this.serializer.getGson().toJsonTree(departments);
    return this;
  }

   /**
   * IDs of &#x60;Department&#x60; objects for this &#x60;Job&#x60;.
   * @return departments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"5b3c1341-a20f-4e51-b72c-f3830a16c97b\",\"d6e687d6-0c36-48a1-8114-35324b5cb38f\"]", value = "IDs of `Department` objects for this `Job`.")

  public JsonElement getDepartments() {
    return departments;
  }
  public void setDepartments(JsonElement departments) {
    this.departments = departments;
  }

  public JobRawJson offices(List<UUID> offices) {
    this.offices = this.serializer.getGson().toJsonTree(offices);
    return this;
  }

   /**
   * IDs of &#x60;Office&#x60; objects for this &#x60;Job&#x60;.
   * @return offices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"9871b4a9-f5d2-4f3b-a66b-dfedbed42c46\"]", value = "IDs of `Office` objects for this `Job`.")

  public JsonElement getOffices() {
    return offices;
  }
  public void setOffices(JsonElement offices) {
    this.offices = offices;
  }

  public JobRawJson hiringManagers(List<UUID> hiringManagers) {
    this.hiringManagers = this.serializer.getGson().toJsonTree(hiringManagers);
    return this;
  }

   /**
   * IDs of &#x60;RemoteUser&#x60; objects that serve as hiring managers for this &#x60;Job&#x60;.
   * @return hiringManagers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"787ed912-33ec-444e-a215-8d71cc42fc12\"]", value = "IDs of `RemoteUser` objects that serve as hiring managers for this `Job`.")

  public JsonElement getHiringManagers() {
    return hiringManagers;
  }
  public void setHiringManagers(JsonElement hiringManagers) {
    this.hiringManagers = hiringManagers;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/positions\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    JobRawJson job = (JobRawJson) o;
    return Objects.equals(this.id.getAsString(), job.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), job.remoteId.getAsString()) &&
        Objects.equals(this.name.getAsString(), job.name.getAsString()) &&
        Objects.equals(this.description.getAsString(), job.description.getAsString()) &&
        Objects.equals(this.code.getAsString(), job.code.getAsString()) &&
        Objects.equals(this.status.getAsString(), job.status.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), job.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.remoteUpdatedAt.getAsString(), job.remoteUpdatedAt.getAsString()) &&
        Objects.equals(this.confidential.getAsString(), job.confidential.getAsString()) &&
        Objects.equals(this.departments.getAsString(), job.departments.getAsString()) &&
        Objects.equals(this.offices.getAsString(), job.offices.getAsString()) &&
        Objects.equals(this.hiringManagers.getAsString(), job.hiringManagers.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), job.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, description, code, status, remoteCreatedAt, remoteUpdatedAt, confidential, departments, offices, hiringManagers, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description.getAsString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
    sb.append("    remoteUpdatedAt: ").append(toIndentedString(remoteUpdatedAt.getAsString())).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential.getAsString())).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments.getAsString())).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices.getAsString())).append("\n");
    sb.append("    hiringManagers: ").append(toIndentedString(hiringManagers.getAsString())).append("\n");
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

