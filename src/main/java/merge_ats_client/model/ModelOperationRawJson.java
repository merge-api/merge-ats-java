
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
 * # The ModelOperation Object ### Description The &#x60;ModelOperation&#x60; object is used to represent the operations that are currently supported for a given model.  ### Usage Example View what operations are supported for the &#x60;Candidate&#x60; endpoint.
 */
@ApiModel(description = "# The ModelOperation Object ### Description The `ModelOperation` object is used to represent the operations that are currently supported for a given model.  ### Usage Example View what operations are supported for the `Candidate` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class ModelOperationRawJson {
  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private JsonElement modelName;

  public static final String SERIALIZED_NAME_AVAILABLE_OPERATIONS = "available_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_OPERATIONS)
  private JsonElement availableOperations;

  public static final String SERIALIZED_NAME_REQUIRED_POST_PARAMETERS = "required_post_parameters";
  @SerializedName(SERIALIZED_NAME_REQUIRED_POST_PARAMETERS)
  private JsonElement requiredPostParameters;

  public static final String SERIALIZED_NAME_SUPPORTED_FIELDS = "supported_fields";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_FIELDS)
  private JsonElement supportedFields;

  private transient JSON serializer;

  public ModelOperationRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public ModelOperationRawJson modelName(String modelName) {
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

  public ModelOperationRawJson availableOperations(List<String> availableOperations) {
    this.availableOperations = this.serializer.getGson().toJsonTree(availableOperations);
    return this;
  }

   /**
   * Get availableOperations
   * @return availableOperations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FETCH\",\"CREATE\"]", required = true, value = "")

  public JsonElement getAvailableOperations() {
    return availableOperations;
  }
  public void setAvailableOperations(JsonElement availableOperations) {
    this.availableOperations = availableOperations;
  }

  public ModelOperationRawJson requiredPostParameters(List<String> requiredPostParameters) {
    this.requiredPostParameters = this.serializer.getGson().toJsonTree(requiredPostParameters);
    return this;
  }

   /**
   * Get requiredPostParameters
   * @return requiredPostParameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"remote_user_id\"]", required = true, value = "")

  public JsonElement getRequiredPostParameters() {
    return requiredPostParameters;
  }
  public void setRequiredPostParameters(JsonElement requiredPostParameters) {
    this.requiredPostParameters = requiredPostParameters;
  }

  public ModelOperationRawJson supportedFields(List<String> supportedFields) {
    this.supportedFields = this.serializer.getGson().toJsonTree(supportedFields);
    return this;
  }

   /**
   * Get supportedFields
   * @return supportedFields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"first_name\",\"last_name\",\"company\",\"title\"]", required = true, value = "")

  public JsonElement getSupportedFields() {
    return supportedFields;
  }
  public void setSupportedFields(JsonElement supportedFields) {
    this.supportedFields = supportedFields;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOperationRawJson modelOperation = (ModelOperationRawJson) o;
    return Objects.equals(this.modelName.getAsString(), modelOperation.modelName.getAsString()) &&
        Objects.equals(this.availableOperations.getAsString(), modelOperation.availableOperations.getAsString()) &&
        Objects.equals(this.requiredPostParameters.getAsString(), modelOperation.requiredPostParameters.getAsString()) &&
        Objects.equals(this.supportedFields.getAsString(), modelOperation.supportedFields.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(modelName, availableOperations, requiredPostParameters, supportedFields);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOperationRawJson {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName.getAsString())).append("\n");
    sb.append("    availableOperations: ").append(toIndentedString(availableOperations.getAsString())).append("\n");
    sb.append("    requiredPostParameters: ").append(toIndentedString(requiredPostParameters.getAsString())).append("\n");
    sb.append("    supportedFields: ").append(toIndentedString(supportedFields.getAsString())).append("\n");
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


