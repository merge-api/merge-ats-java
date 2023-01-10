
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
 * # The AvailableActions Object ### Description The &#x60;Activity&#x60; object is used to see all available model/operation combinations for an integration.  ### Usage Example Fetch all the actions available for the &#x60;Zenefits&#x60; integration.
 */
@ApiModel(description = "# The AvailableActions Object ### Description The `Activity` object is used to see all available model/operation combinations for an integration.  ### Usage Example Fetch all the actions available for the `Zenefits` integration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class AvailableActionsRawJson {
  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private JsonElement integration;

  public static final String SERIALIZED_NAME_PASSTHROUGH_AVAILABLE = "passthrough_available";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH_AVAILABLE)
  private JsonElement passthroughAvailable;

  public static final String SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS = "available_model_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS)
  private JsonElement availableModelOperations;

  private transient JSON serializer;

  public AvailableActionsRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public AvailableActionsRawJson integration(AccountIntegration integration) {
    this.integration = this.serializer.getGson().toJsonTree(integration);
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getIntegration() {
    return integration;
  }
  public void setIntegration(JsonElement integration) {
    this.integration = integration;
  }

  public AvailableActionsRawJson passthroughAvailable(Boolean passthroughAvailable) {
    this.passthroughAvailable = this.serializer.getGson().toJsonTree(passthroughAvailable);
    return this;
  }

   /**
   * Get passthroughAvailable
   * @return passthroughAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public JsonElement getPassthroughAvailable() {
    return passthroughAvailable;
  }
  public void setPassthroughAvailable(JsonElement passthroughAvailable) {
    this.passthroughAvailable = passthroughAvailable;
  }

  public AvailableActionsRawJson availableModelOperations(List<ModelOperation> availableModelOperations) {
    this.availableModelOperations = this.serializer.getGson().toJsonTree(availableModelOperations);
    return this;
  }

   /**
   * Get availableModelOperations
   * @return availableModelOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"model_name\":\"Candidate\",\"available_operations\":[\"FETCH\",\"CREATE\"],\"required_post_parameters\":[\"remote_user_id\"],\"supported_fields\":[\"first_name\",\"last_name\",\"company\",\"title\"]}]", value = "")

  public JsonElement getAvailableModelOperations() {
    return availableModelOperations;
  }
  public void setAvailableModelOperations(JsonElement availableModelOperations) {
    this.availableModelOperations = availableModelOperations;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableActionsRawJson availableActions = (AvailableActionsRawJson) o;
    return Objects.equals(this.integration.getAsString(), availableActions.integration.getAsString()) &&
        Objects.equals(this.passthroughAvailable.getAsString(), availableActions.passthroughAvailable.getAsString()) &&
        Objects.equals(this.availableModelOperations.getAsString(), availableActions.availableModelOperations.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(integration, passthroughAvailable, availableModelOperations);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableActionsRawJson {\n");
    sb.append("    integration: ").append(toIndentedString(integration.getAsString())).append("\n");
    sb.append("    passthroughAvailable: ").append(toIndentedString(passthroughAvailable.getAsString())).append("\n");
    sb.append("    availableModelOperations: ").append(toIndentedString(availableModelOperations.getAsString())).append("\n");
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


