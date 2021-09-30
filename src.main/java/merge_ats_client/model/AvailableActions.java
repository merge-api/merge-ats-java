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


package java.merge_ats_client.model;

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
import java.merge_ats_client.model.AccountIntegration;
import java.merge_ats_client.model.ModelOperation;
import java.util.ArrayList;
import java.util.List;

/**
 * # The AvailableActions Object ### Description The &#x60;Activity&#x60; object is used to see all available model/operation combinations for an integration.  ### Usage Example Fetch all the actions available for the &#x60;Zenefits&#x60; integration.
 */
@ApiModel(description = "# The AvailableActions Object ### Description The `Activity` object is used to see all available model/operation combinations for an integration.  ### Usage Example Fetch all the actions available for the `Zenefits` integration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-29T17:56:38.183878-07:00[America/Los_Angeles]")
public class AvailableActions {
  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private AccountIntegration integration;

  public static final String SERIALIZED_NAME_PASSTHROUGH_AVAILABLE = "passthrough_available";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH_AVAILABLE)
  private Boolean passthroughAvailable;

  public static final String SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS = "available_model_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS)
  private List<ModelOperation> availableModelOperations = null;


  public AvailableActions integration(AccountIntegration integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountIntegration getIntegration() {
    return integration;
  }


  public void setIntegration(AccountIntegration integration) {
    this.integration = integration;
  }


  public AvailableActions passthroughAvailable(Boolean passthroughAvailable) {
    
    this.passthroughAvailable = passthroughAvailable;
    return this;
  }

   /**
   * Get passthroughAvailable
   * @return passthroughAvailable
  **/
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getPassthroughAvailable() {
    return passthroughAvailable;
  }


  public void setPassthroughAvailable(Boolean passthroughAvailable) {
    this.passthroughAvailable = passthroughAvailable;
  }


  public AvailableActions availableModelOperations(List<ModelOperation> availableModelOperations) {
    
    this.availableModelOperations = availableModelOperations;
    return this;
  }

  public AvailableActions addAvailableModelOperationsItem(ModelOperation availableModelOperationsItem) {
    if (this.availableModelOperations == null) {
      this.availableModelOperations = new ArrayList<ModelOperation>();
    }
    this.availableModelOperations.add(availableModelOperationsItem);
    return this;
  }

   /**
   * Get availableModelOperations
   * @return availableModelOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"model_name\":\"Candidate\",\"available_operations\":[\"FETCH\",\"CREATE\"],\"required_post_parameters\":[\"remote_user_id\"],\"supported_fields\":[\"first_name\",\"last_name\",\"company\",\"title\"]}]", value = "")

  public List<ModelOperation> getAvailableModelOperations() {
    return availableModelOperations;
  }


  public void setAvailableModelOperations(List<ModelOperation> availableModelOperations) {
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
    AvailableActions availableActions = (AvailableActions) o;
    return Objects.equals(this.integration, availableActions.integration) &&
        Objects.equals(this.passthroughAvailable, availableActions.passthroughAvailable) &&
        Objects.equals(this.availableModelOperations, availableActions.availableModelOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integration, passthroughAvailable, availableModelOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableActions {\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    passthroughAvailable: ").append(toIndentedString(passthroughAvailable)).append("\n");
    sb.append("    availableModelOperations: ").append(toIndentedString(availableModelOperations)).append("\n");
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

