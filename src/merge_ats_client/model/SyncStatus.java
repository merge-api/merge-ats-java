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
import org.threeten.bp.OffsetDateTime;

/**
 * # The SyncStatus Object ### Description The &#x60;SyncStatus&#x60; object is used to represent the syncing state of an account  ### Usage Example View the &#x60;SyncStatus&#x60; for an account to see how recently its models were synced.
 */
@ApiModel(description = "# The SyncStatus Object ### Description The `SyncStatus` object is used to represent the syncing state of an account  ### Usage Example View the `SyncStatus` for an account to see how recently its models were synced.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]")
public class SyncStatus {
  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_LAST_SYNC_START = "last_sync_start";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_START)
  private OffsetDateTime lastSyncStart;

  public static final String SERIALIZED_NAME_NEXT_SYNC_START = "next_sync_start";
  @SerializedName(SERIALIZED_NAME_NEXT_SYNC_START)
  private OffsetDateTime nextSyncStart;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_IS_INITIAL_SYNC = "is_initial_sync";
  @SerializedName(SERIALIZED_NAME_IS_INITIAL_SYNC)
  private Boolean isInitialSync;


  public SyncStatus modelName(String modelName) {
    
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @ApiModelProperty(example = "Candidate", required = true, value = "")

  public String getModelName() {
    return modelName;
  }


  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public SyncStatus modelId(String modelId) {
    
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "ats.Candidate", required = true, value = "")

  public String getModelId() {
    return modelId;
  }


  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public SyncStatus lastSyncStart(OffsetDateTime lastSyncStart) {
    
    this.lastSyncStart = lastSyncStart;
    return this;
  }

   /**
   * Get lastSyncStart
   * @return lastSyncStart
  **/
  @ApiModelProperty(example = "2021-03-30T19:44:18.695973Z", required = true, value = "")

  public OffsetDateTime getLastSyncStart() {
    return lastSyncStart;
  }


  public void setLastSyncStart(OffsetDateTime lastSyncStart) {
    this.lastSyncStart = lastSyncStart;
  }


  public SyncStatus nextSyncStart(OffsetDateTime nextSyncStart) {
    
    this.nextSyncStart = nextSyncStart;
    return this;
  }

   /**
   * Get nextSyncStart
   * @return nextSyncStart
  **/
  @ApiModelProperty(example = "2021-03-30T20:44:18.662942Z", required = true, value = "")

  public OffsetDateTime getNextSyncStart() {
    return nextSyncStart;
  }


  public void setNextSyncStart(OffsetDateTime nextSyncStart) {
    this.nextSyncStart = nextSyncStart;
  }


  public SyncStatus status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "SYNCING", required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public SyncStatus isInitialSync(Boolean isInitialSync) {
    
    this.isInitialSync = isInitialSync;
    return this;
  }

   /**
   * Get isInitialSync
   * @return isInitialSync
  **/
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getIsInitialSync() {
    return isInitialSync;
  }


  public void setIsInitialSync(Boolean isInitialSync) {
    this.isInitialSync = isInitialSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncStatus syncStatus = (SyncStatus) o;
    return Objects.equals(this.modelName, syncStatus.modelName) &&
        Objects.equals(this.modelId, syncStatus.modelId) &&
        Objects.equals(this.lastSyncStart, syncStatus.lastSyncStart) &&
        Objects.equals(this.nextSyncStart, syncStatus.nextSyncStart) &&
        Objects.equals(this.status, syncStatus.status) &&
        Objects.equals(this.isInitialSync, syncStatus.isInitialSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelId, lastSyncStart, nextSyncStart, status, isInitialSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStatus {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    lastSyncStart: ").append(toIndentedString(lastSyncStart)).append("\n");
    sb.append("    nextSyncStart: ").append(toIndentedString(nextSyncStart)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isInitialSync: ").append(toIndentedString(isInitialSync)).append("\n");
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

