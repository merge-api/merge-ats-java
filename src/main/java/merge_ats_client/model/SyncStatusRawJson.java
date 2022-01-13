
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
 * # The SyncStatus Object ### Description The &#x60;SyncStatus&#x60; object is used to represent the syncing state of an account  ### Usage Example View the &#x60;SyncStatus&#x60; for an account to see how recently its models were synced.
 */
@ApiModel(description = "# The SyncStatus Object ### Description The `SyncStatus` object is used to represent the syncing state of an account  ### Usage Example View the `SyncStatus` for an account to see how recently its models were synced.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T18:46:24.846598Z[Etc/UTC]")
public class SyncStatusRawJson {
  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private JsonElement modelName;

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private JsonElement modelId;

  public static final String SERIALIZED_NAME_LAST_SYNC_START = "last_sync_start";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_START)
  private JsonElement lastSyncStart;

  public static final String SERIALIZED_NAME_NEXT_SYNC_START = "next_sync_start";
  @SerializedName(SERIALIZED_NAME_NEXT_SYNC_START)
  private JsonElement nextSyncStart;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_IS_INITIAL_SYNC = "is_initial_sync";
  @SerializedName(SERIALIZED_NAME_IS_INITIAL_SYNC)
  private JsonElement isInitialSync;

  private transient JSON serializer;

  public SyncStatusRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public SyncStatusRawJson modelName(String modelName) {
    this.modelName = this.serializer.getGson().toJsonTree(modelName);
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Candidate", required = true, value = "")

  public JsonElement getModelName() {
    return modelName;
  }
  public void setModelName(JsonElement modelName) {
    this.modelName = modelName;
  }

  public SyncStatusRawJson modelId(String modelId) {
    this.modelId = this.serializer.getGson().toJsonTree(modelId);
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ats.Candidate", required = true, value = "")

  public JsonElement getModelId() {
    return modelId;
  }
  public void setModelId(JsonElement modelId) {
    this.modelId = modelId;
  }

  public SyncStatusRawJson lastSyncStart(OffsetDateTime lastSyncStart) {
    this.lastSyncStart = this.serializer.getGson().toJsonTree(lastSyncStart);
    return this;
  }

   /**
   * Get lastSyncStart
   * @return lastSyncStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-03-30T19:44:18.695973Z", required = true, value = "")

  public JsonElement getLastSyncStart() {
    return lastSyncStart;
  }
  public void setLastSyncStart(JsonElement lastSyncStart) {
    this.lastSyncStart = lastSyncStart;
  }

  public SyncStatusRawJson nextSyncStart(OffsetDateTime nextSyncStart) {
    this.nextSyncStart = this.serializer.getGson().toJsonTree(nextSyncStart);
    return this;
  }

   /**
   * Get nextSyncStart
   * @return nextSyncStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-03-30T20:44:18.662942Z", required = true, value = "")

  public JsonElement getNextSyncStart() {
    return nextSyncStart;
  }
  public void setNextSyncStart(JsonElement nextSyncStart) {
    this.nextSyncStart = nextSyncStart;
  }

  public SyncStatusRawJson status(String status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SYNCING", required = true, value = "")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public SyncStatusRawJson isInitialSync(Boolean isInitialSync) {
    this.isInitialSync = this.serializer.getGson().toJsonTree(isInitialSync);
    return this;
  }

   /**
   * Get isInitialSync
   * @return isInitialSync
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public JsonElement getIsInitialSync() {
    return isInitialSync;
  }
  public void setIsInitialSync(JsonElement isInitialSync) {
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
    SyncStatusRawJson syncStatus = (SyncStatusRawJson) o;
    return Objects.equals(this.modelName.getAsString(), syncStatus.modelName.getAsString()) &&
        Objects.equals(this.modelId.getAsString(), syncStatus.modelId.getAsString()) &&
        Objects.equals(this.lastSyncStart.getAsString(), syncStatus.lastSyncStart.getAsString()) &&
        Objects.equals(this.nextSyncStart.getAsString(), syncStatus.nextSyncStart.getAsString()) &&
        Objects.equals(this.status.getAsString(), syncStatus.status.getAsString()) &&
        Objects.equals(this.isInitialSync.getAsString(), syncStatus.isInitialSync.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelId, lastSyncStart, nextSyncStart, status, isInitialSync);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStatusRawJson {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName.getAsString())).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId.getAsString())).append("\n");
    sb.append("    lastSyncStart: ").append(toIndentedString(lastSyncStart.getAsString())).append("\n");
    sb.append("    nextSyncStart: ").append(toIndentedString(nextSyncStart.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    isInitialSync: ").append(toIndentedString(isInitialSync.getAsString())).append("\n");
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


