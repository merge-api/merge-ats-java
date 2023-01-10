
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
 * LinkedAccountSelectiveSyncConfigurationListRequestRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class LinkedAccountSelectiveSyncConfigurationListRequestRawJson {
  public static final String SERIALIZED_NAME_SYNC_CONFIGURATIONS = "sync_configurations";
  @SerializedName(SERIALIZED_NAME_SYNC_CONFIGURATIONS)
  private JsonElement syncConfigurations;

  private transient JSON serializer;

  public LinkedAccountSelectiveSyncConfigurationListRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public LinkedAccountSelectiveSyncConfigurationListRequestRawJson syncConfigurations(List<LinkedAccountSelectiveSyncConfigurationRequest> syncConfigurations) {
    this.syncConfigurations = this.serializer.getGson().toJsonTree(syncConfigurations);
    return this;
  }

   /**
   * The selective syncs associated with a linked account.
   * @return syncConfigurations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The selective syncs associated with a linked account.")

  public JsonElement getSyncConfigurations() {
    return syncConfigurations;
  }
  public void setSyncConfigurations(JsonElement syncConfigurations) {
    this.syncConfigurations = syncConfigurations;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccountSelectiveSyncConfigurationListRequestRawJson linkedAccountSelectiveSyncConfigurationListRequest = (LinkedAccountSelectiveSyncConfigurationListRequestRawJson) o;
    return Objects.equals(this.syncConfigurations.getAsString(), linkedAccountSelectiveSyncConfigurationListRequest.syncConfigurations.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(syncConfigurations);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccountSelectiveSyncConfigurationListRequestRawJson {\n");
    sb.append("    syncConfigurations: ").append(toIndentedString(syncConfigurations.getAsString())).append("\n");
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


