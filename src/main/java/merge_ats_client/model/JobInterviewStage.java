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

/**
 * # The JobInterviewStage Object ### Description The &#x60;JobInterviewStage&#x60; object is used to represent the stage of an interview  ### Usage Example Fetch from the &#x60;LIST JobInterviewStages&#x60; endpoint and view the job interview stages used by a company.
 */
@ApiModel(description = "# The JobInterviewStage Object ### Description The `JobInterviewStage` object is used to represent the stage of an interview  ### Usage Example Fetch from the `LIST JobInterviewStages` endpoint and view the job interview stages used by a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-13T23:26:10.470036Z[Etc/UTC]")
public class JobInterviewStage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private UUID job;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f9813dd5-e70b-484c-91d8-00acd6065b07", value = "")

  public UUID getId() {
    return id;
  }




  public JobInterviewStage remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "876556788", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public JobInterviewStage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The stage&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Phone Screen", value = "The stage's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobInterviewStage job(UUID job) {
    
    this.job = job;
    return this;
  }

   /**
   * If stages are specific to a job, this is the job that this stage belongs to.
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ba7d9648-5316-4a80-8d73-4e636cef5a90", value = "If stages are specific to a job, this is the job that this stage belongs to.")

  public UUID getJob() {
    return job;
  }


  public void setJob(UUID job) {
    this.job = job;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/interview-stages\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    JobInterviewStage jobInterviewStage = (JobInterviewStage) o;
    return Objects.equals(this.id, jobInterviewStage.id) &&
        Objects.equals(this.remoteId, jobInterviewStage.remoteId) &&
        Objects.equals(this.name, jobInterviewStage.name) &&
        Objects.equals(this.job, jobInterviewStage.job) &&
        Objects.equals(this.remoteData, jobInterviewStage.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, job, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInterviewStage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

