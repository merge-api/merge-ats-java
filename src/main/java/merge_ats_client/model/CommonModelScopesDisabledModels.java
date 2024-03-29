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
import merge_ats_client.model.CommonModelScopesDisabledModelsEnabledActionsEnum;

/**
 * CommonModelScopesDisabledModels
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class CommonModelScopesDisabledModels {
  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_ENABLED_ACTIONS = "enabled_actions";
  @SerializedName(SERIALIZED_NAME_ENABLED_ACTIONS)
  private List<CommonModelScopesDisabledModelsEnabledActionsEnum> enabledActions = new ArrayList<CommonModelScopesDisabledModelsEnabledActionsEnum>();

  public static final String SERIALIZED_NAME_IS_DISABLED = "is_disabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_DISABLED_FIELDS = "disabled_fields";
  @SerializedName(SERIALIZED_NAME_DISABLED_FIELDS)
  private List<String> disabledFields = new ArrayList<String>();


  public CommonModelScopesDisabledModels modelName(String modelName) {
    
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getModelName() {
    return modelName;
  }


  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public CommonModelScopesDisabledModels modelId(String modelId) {
    
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getModelId() {
    return modelId;
  }


  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public CommonModelScopesDisabledModels enabledActions(List<CommonModelScopesDisabledModelsEnabledActionsEnum> enabledActions) {
    
    this.enabledActions = enabledActions;
    return this;
  }

  public CommonModelScopesDisabledModels addEnabledActionsItem(CommonModelScopesDisabledModelsEnabledActionsEnum enabledActionsItem) {
    this.enabledActions.add(enabledActionsItem);
    return this;
  }

   /**
   * Get enabledActions
   * @return enabledActions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CommonModelScopesDisabledModelsEnabledActionsEnum> getEnabledActions() {
    return enabledActions;
  }


  public void setEnabledActions(List<CommonModelScopesDisabledModelsEnabledActionsEnum> enabledActions) {
    this.enabledActions = enabledActions;
  }


  public CommonModelScopesDisabledModels isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }


  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public CommonModelScopesDisabledModels disabledFields(List<String> disabledFields) {
    
    this.disabledFields = disabledFields;
    return this;
  }

  public CommonModelScopesDisabledModels addDisabledFieldsItem(String disabledFieldsItem) {
    this.disabledFields.add(disabledFieldsItem);
    return this;
  }

   /**
   * Get disabledFields
   * @return disabledFields
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getDisabledFields() {
    return disabledFields;
  }


  public void setDisabledFields(List<String> disabledFields) {
    this.disabledFields = disabledFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonModelScopesDisabledModels commonModelScopesDisabledModels = (CommonModelScopesDisabledModels) o;
    return Objects.equals(this.modelName, commonModelScopesDisabledModels.modelName) &&
        Objects.equals(this.modelId, commonModelScopesDisabledModels.modelId) &&
        Objects.equals(this.enabledActions, commonModelScopesDisabledModels.enabledActions) &&
        Objects.equals(this.isDisabled, commonModelScopesDisabledModels.isDisabled) &&
        Objects.equals(this.disabledFields, commonModelScopesDisabledModels.disabledFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelId, enabledActions, isDisabled, disabledFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonModelScopesDisabledModels {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    enabledActions: ").append(toIndentedString(enabledActions)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    disabledFields: ").append(toIndentedString(disabledFields)).append("\n");
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

