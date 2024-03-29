
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
 * LinkedAccountSelectiveSyncConfigurationRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class LinkedAccountSelectiveSyncConfigurationRawJson {
  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_CONDITIONS = "linked_account_conditions";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_CONDITIONS)
  private JsonElement linkedAccountConditions;

  private transient JSON serializer;

  public LinkedAccountSelectiveSyncConfigurationRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * The conditions belonging to a selective sync.
   * @return linkedAccountConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conditions belonging to a selective sync.")

  public JsonElement getLinkedAccountConditions() {
    return linkedAccountConditions;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccountSelectiveSyncConfigurationRawJson linkedAccountSelectiveSyncConfiguration = (LinkedAccountSelectiveSyncConfigurationRawJson) o;
    return Objects.equals(this.linkedAccountConditions.getAsString(), linkedAccountSelectiveSyncConfiguration.linkedAccountConditions.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(linkedAccountConditions);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccountSelectiveSyncConfigurationRawJson {\n");
    sb.append("    linkedAccountConditions: ").append(toIndentedString(linkedAccountConditions.getAsString())).append("\n");
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


