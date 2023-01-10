
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
 * LinkedAccountConditionRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class LinkedAccountConditionRawJson {
  public static final String SERIALIZED_NAME_CONDITION_SCHEMA_ID = "condition_schema_id";
  @SerializedName(SERIALIZED_NAME_CONDITION_SCHEMA_ID)
  private JsonElement conditionSchemaId;

  public static final String SERIALIZED_NAME_COMMON_MODEL = "common_model";
  @SerializedName(SERIALIZED_NAME_COMMON_MODEL)
  private JsonElement commonModel;

  public static final String SERIALIZED_NAME_NATIVE_NAME = "native_name";
  @SerializedName(SERIALIZED_NAME_NATIVE_NAME)
  private JsonElement nativeName;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private JsonElement operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private JsonElement value;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private JsonElement fieldName;

  private transient JSON serializer;

  public LinkedAccountConditionRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public LinkedAccountConditionRawJson conditionSchemaId(UUID conditionSchemaId) {
    this.conditionSchemaId = this.serializer.getGson().toJsonTree(conditionSchemaId);
    return this;
  }

   /**
   * The ID indicating which condition schema to use for a specific condition.
   * @return conditionSchemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID indicating which condition schema to use for a specific condition.")

  public JsonElement getConditionSchemaId() {
    return conditionSchemaId;
  }
  public void setConditionSchemaId(JsonElement conditionSchemaId) {
    this.conditionSchemaId = conditionSchemaId;
  }

   /**
   * The common model for a specific condition.
   * @return commonModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The common model for a specific condition.")

  public JsonElement getCommonModel() {
    return commonModel;
  }

  public LinkedAccountConditionRawJson nativeName(String nativeName) {
    this.nativeName = this.serializer.getGson().toJsonTree(nativeName);
    return this;
  }

   /**
   * User-facing *native condition* name. e.g. \&quot;Skip Manager\&quot;.
   * @return nativeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "User-facing *native condition* name. e.g. \"Skip Manager\".")

  public JsonElement getNativeName() {
    return nativeName;
  }
  public void setNativeName(JsonElement nativeName) {
    this.nativeName = nativeName;
  }

  public LinkedAccountConditionRawJson operator(String operator) {
    this.operator = this.serializer.getGson().toJsonTree(operator);
    return this;
  }

   /**
   * The operator for a specific condition.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The operator for a specific condition.")

  public JsonElement getOperator() {
    return operator;
  }
  public void setOperator(JsonElement operator) {
    this.operator = operator;
  }

   /**
   * The value for a condition.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value for a condition.")

  public JsonElement getValue() {
    return value;
  }

  public LinkedAccountConditionRawJson fieldName(String fieldName) {
    this.fieldName = this.serializer.getGson().toJsonTree(fieldName);
    return this;
  }

   /**
   * The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \&quot;location_type\&quot;.
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \"location_type\".")

  public JsonElement getFieldName() {
    return fieldName;
  }
  public void setFieldName(JsonElement fieldName) {
    this.fieldName = fieldName;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccountConditionRawJson linkedAccountCondition = (LinkedAccountConditionRawJson) o;
    return Objects.equals(this.conditionSchemaId.getAsString(), linkedAccountCondition.conditionSchemaId.getAsString()) &&
        Objects.equals(this.commonModel.getAsString(), linkedAccountCondition.commonModel.getAsString()) &&
        Objects.equals(this.nativeName.getAsString(), linkedAccountCondition.nativeName.getAsString()) &&
        Objects.equals(this.operator.getAsString(), linkedAccountCondition.operator.getAsString()) &&
        Objects.equals(this.value.getAsString(), linkedAccountCondition.value.getAsString()) &&
        Objects.equals(this.fieldName.getAsString(), linkedAccountCondition.fieldName.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(conditionSchemaId, commonModel, nativeName, operator, value, fieldName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccountConditionRawJson {\n");
    sb.append("    conditionSchemaId: ").append(toIndentedString(conditionSchemaId.getAsString())).append("\n");
    sb.append("    commonModel: ").append(toIndentedString(commonModel.getAsString())).append("\n");
    sb.append("    nativeName: ").append(toIndentedString(nativeName.getAsString())).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator.getAsString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value.getAsString())).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName.getAsString())).append("\n");
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


