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

/**
 * # The ModelOperation Object ### Description The &#x60;ModelOperation&#x60; object is used to represent the operations that are currently supported for a given model.  ### Usage Example View what operations are supported for the &#x60;Candidate&#x60; endpoint.
 */
@ApiModel(description = "# The ModelOperation Object ### Description The `ModelOperation` object is used to represent the operations that are currently supported for a given model.  ### Usage Example View what operations are supported for the `Candidate` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]")
public class ModelOperation {
  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public static final String SERIALIZED_NAME_AVAILABLE_OPERATIONS = "available_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_OPERATIONS)
  private List<String> availableOperations = new ArrayList<String>();

  public static final String SERIALIZED_NAME_REQUIRED_POST_PARAMETERS = "required_post_parameters";
  @SerializedName(SERIALIZED_NAME_REQUIRED_POST_PARAMETERS)
  private List<String> requiredPostParameters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SUPPORTED_FIELDS = "supported_fields";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_FIELDS)
  private List<String> supportedFields = new ArrayList<String>();


  public ModelOperation modelName(String modelName) {
    
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


  public ModelOperation availableOperations(List<String> availableOperations) {
    
    this.availableOperations = availableOperations;
    return this;
  }

  public ModelOperation addAvailableOperationsItem(String availableOperationsItem) {
    this.availableOperations.add(availableOperationsItem);
    return this;
  }

   /**
   * Get availableOperations
   * @return availableOperations
  **/
  @ApiModelProperty(example = "[\"FETCH\",\"CREATE\"]", required = true, value = "")

  public List<String> getAvailableOperations() {
    return availableOperations;
  }


  public void setAvailableOperations(List<String> availableOperations) {
    this.availableOperations = availableOperations;
  }


  public ModelOperation requiredPostParameters(List<String> requiredPostParameters) {
    
    this.requiredPostParameters = requiredPostParameters;
    return this;
  }

  public ModelOperation addRequiredPostParametersItem(String requiredPostParametersItem) {
    this.requiredPostParameters.add(requiredPostParametersItem);
    return this;
  }

   /**
   * Get requiredPostParameters
   * @return requiredPostParameters
  **/
  @ApiModelProperty(example = "[\"remote_user_id\"]", required = true, value = "")

  public List<String> getRequiredPostParameters() {
    return requiredPostParameters;
  }


  public void setRequiredPostParameters(List<String> requiredPostParameters) {
    this.requiredPostParameters = requiredPostParameters;
  }


  public ModelOperation supportedFields(List<String> supportedFields) {
    
    this.supportedFields = supportedFields;
    return this;
  }

  public ModelOperation addSupportedFieldsItem(String supportedFieldsItem) {
    this.supportedFields.add(supportedFieldsItem);
    return this;
  }

   /**
   * Get supportedFields
   * @return supportedFields
  **/
  @ApiModelProperty(example = "[\"first_name\",\"last_name\",\"company\",\"title\"]", required = true, value = "")

  public List<String> getSupportedFields() {
    return supportedFields;
  }


  public void setSupportedFields(List<String> supportedFields) {
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
    ModelOperation modelOperation = (ModelOperation) o;
    return Objects.equals(this.modelName, modelOperation.modelName) &&
        Objects.equals(this.availableOperations, modelOperation.availableOperations) &&
        Objects.equals(this.requiredPostParameters, modelOperation.requiredPostParameters) &&
        Objects.equals(this.supportedFields, modelOperation.supportedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, availableOperations, requiredPostParameters, supportedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOperation {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    availableOperations: ").append(toIndentedString(availableOperations)).append("\n");
    sb.append("    requiredPostParameters: ").append(toIndentedString(requiredPostParameters)).append("\n");
    sb.append("    supportedFields: ").append(toIndentedString(supportedFields)).append("\n");
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

