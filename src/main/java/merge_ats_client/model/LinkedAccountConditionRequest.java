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
import java.util.UUID;

/**
 * LinkedAccountConditionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class LinkedAccountConditionRequest {
  public static final String SERIALIZED_NAME_CONDITION_SCHEMA_ID = "condition_schema_id";
  @SerializedName(SERIALIZED_NAME_CONDITION_SCHEMA_ID)
  private UUID conditionSchemaId;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;


  public LinkedAccountConditionRequest conditionSchemaId(UUID conditionSchemaId) {
    
    this.conditionSchemaId = conditionSchemaId;
    return this;
  }

   /**
   * The ID indicating which condition schema to use for a specific condition.
   * @return conditionSchemaId
  **/
  @ApiModelProperty(required = true, value = "The ID indicating which condition schema to use for a specific condition.")

  public UUID getConditionSchemaId() {
    return conditionSchemaId;
  }


  public void setConditionSchemaId(UUID conditionSchemaId) {
    this.conditionSchemaId = conditionSchemaId;
  }


  public LinkedAccountConditionRequest operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator for a specific condition.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "The operator for a specific condition.")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public LinkedAccountConditionRequest value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value for a specific condition.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The value for a specific condition.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccountConditionRequest linkedAccountConditionRequest = (LinkedAccountConditionRequest) o;
    return Objects.equals(this.conditionSchemaId, linkedAccountConditionRequest.conditionSchemaId) &&
        Objects.equals(this.operator, linkedAccountConditionRequest.operator) &&
        Objects.equals(this.value, linkedAccountConditionRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionSchemaId, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccountConditionRequest {\n");
    sb.append("    conditionSchemaId: ").append(toIndentedString(conditionSchemaId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
