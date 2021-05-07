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
import merge_ats_client.model.JobStatusEnum;
import merge_ats_client.model.RemoteData;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Job Object ### Description The &#x60;Job&#x60; object is used to represent a Job offering at a company.  ### Usage Example Fetch from the &#x60;LIST Jobs&#x60; endpoint to show all job postings.
 */
@ApiModel(description = "# The Job Object ### Description The `Job` object is used to represent a Job offering at a company.  ### Usage Example Fetch from the `LIST Jobs` endpoint to show all job postings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-06T16:51:45.473844-07:00[America/Los_Angeles]")
public class Job {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JobStatusEnum status = null;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_UPDATED_AT = "remote_updated_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_UPDATED_AT)
  private OffsetDateTime remoteUpdatedAt;

  public static final String SERIALIZED_NAME_CONFIDENTIAL = "confidential";
  @SerializedName(SERIALIZED_NAME_CONFIDENTIAL)
  private Boolean confidential;

  public static final String SERIALIZED_NAME_DEPARTMENTS = "departments";
  @SerializedName(SERIALIZED_NAME_DEPARTMENTS)
  private List<UUID> departments = null;

  public static final String SERIALIZED_NAME_OFFICES = "offices";
  @SerializedName(SERIALIZED_NAME_OFFICES)
  private List<UUID> offices = null;

  public static final String SERIALIZED_NAME_HIRING_MANAGERS = "hiring_managers";
  @SerializedName(SERIALIZED_NAME_HIRING_MANAGERS)
  private List<UUID> hiringManagers = null;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "022a2bef-57e5-4def-8ed2-7c41bd9a5ed8", value = "")

  public UUID getId() {
    return id;
  }




  public Job remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8765432", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Job name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The job&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer (Merge is actually hiring btw)", value = "The job's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Job description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The job&#39;s description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "If you're reading this documentation. You might be a good fit!", value = "The job's description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Job status(JobStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The job&#39;s status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN", value = "The job's status.")

  public JobStatusEnum getStatus() {
    return status;
  }


  public void setStatus(JobStatusEnum status) {
    this.status = status;
  }


  public Job remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s job was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the third party's job was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public Job remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    
    this.remoteUpdatedAt = remoteUpdatedAt;
    return this;
  }

   /**
   * When the third party&#39;s job was updated.
   * @return remoteUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the third party's job was updated.")

  public OffsetDateTime getRemoteUpdatedAt() {
    return remoteUpdatedAt;
  }


  public void setRemoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    this.remoteUpdatedAt = remoteUpdatedAt;
  }


  public Job confidential(Boolean confidential) {
    
    this.confidential = confidential;
    return this;
  }

   /**
   * Whether the job is confidential.
   * @return confidential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the job is confidential.")

  public Boolean getConfidential() {
    return confidential;
  }


  public void setConfidential(Boolean confidential) {
    this.confidential = confidential;
  }


  public Job departments(List<UUID> departments) {
    
    this.departments = departments;
    return this;
  }

  public Job addDepartmentsItem(UUID departmentsItem) {
    if (this.departments == null) {
      this.departments = new ArrayList<UUID>();
    }
    this.departments.add(departmentsItem);
    return this;
  }

   /**
   * Get departments
   * @return departments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"5b3c1341-a20f-4e51-b72c-f3830a16c97b\",\"d6e687d6-0c36-48a1-8114-35324b5cb38f\"]", value = "")

  public List<UUID> getDepartments() {
    return departments;
  }


  public void setDepartments(List<UUID> departments) {
    this.departments = departments;
  }


  public Job offices(List<UUID> offices) {
    
    this.offices = offices;
    return this;
  }

  public Job addOfficesItem(UUID officesItem) {
    if (this.offices == null) {
      this.offices = new ArrayList<UUID>();
    }
    this.offices.add(officesItem);
    return this;
  }

   /**
   * Get offices
   * @return offices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"9871b4a9-f5d2-4f3b-a66b-dfedbed42c46\"]", value = "")

  public List<UUID> getOffices() {
    return offices;
  }


  public void setOffices(List<UUID> offices) {
    this.offices = offices;
  }


  public Job hiringManagers(List<UUID> hiringManagers) {
    
    this.hiringManagers = hiringManagers;
    return this;
  }

  public Job addHiringManagersItem(UUID hiringManagersItem) {
    if (this.hiringManagers == null) {
      this.hiringManagers = new ArrayList<UUID>();
    }
    this.hiringManagers.add(hiringManagersItem);
    return this;
  }

   /**
   * Get hiringManagers
   * @return hiringManagers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"787ed912-33ec-444e-a215-8d71cc42fc12\"]", value = "")

  public List<UUID> getHiringManagers() {
    return hiringManagers;
  }


  public void setHiringManagers(List<UUID> hiringManagers) {
    this.hiringManagers = hiringManagers;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/positions\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.remoteId, job.remoteId) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.description, job.description) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.remoteCreatedAt, job.remoteCreatedAt) &&
        Objects.equals(this.remoteUpdatedAt, job.remoteUpdatedAt) &&
        Objects.equals(this.confidential, job.confidential) &&
        Objects.equals(this.departments, job.departments) &&
        Objects.equals(this.offices, job.offices) &&
        Objects.equals(this.hiringManagers, job.hiringManagers) &&
        Objects.equals(this.remoteData, job.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, description, status, remoteCreatedAt, remoteUpdatedAt, confidential, departments, offices, hiringManagers, remoteData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    remoteUpdatedAt: ").append(toIndentedString(remoteUpdatedAt)).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments)).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
    sb.append("    hiringManagers: ").append(toIndentedString(hiringManagers)).append("\n");
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

