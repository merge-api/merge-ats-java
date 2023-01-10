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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import merge_ats_client.model.LinkedAccountStatus;

/**
 * MetaResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class MetaResponse {
  public static final String SERIALIZED_NAME_REQUEST_SCHEMA = "request_schema";
  @SerializedName(SERIALIZED_NAME_REQUEST_SCHEMA)
  private Map<String, Object> requestSchema = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LinkedAccountStatus status;

  public static final String SERIALIZED_NAME_HAS_CONDITIONAL_PARAMS = "has_conditional_params";
  @SerializedName(SERIALIZED_NAME_HAS_CONDITIONAL_PARAMS)
  private Boolean hasConditionalParams;

  public static final String SERIALIZED_NAME_HAS_REQUIRED_LINKED_ACCOUNT_PARAMS = "has_required_linked_account_params";
  @SerializedName(SERIALIZED_NAME_HAS_REQUIRED_LINKED_ACCOUNT_PARAMS)
  private Boolean hasRequiredLinkedAccountParams;


  public MetaResponse requestSchema(Map<String, Object> requestSchema) {
    
    this.requestSchema = requestSchema;
    return this;
  }

  public MetaResponse putRequestSchemaItem(String key, Object requestSchemaItem) {
    this.requestSchema.put(key, requestSchemaItem);
    return this;
  }

   /**
   * Get requestSchema
   * @return requestSchema
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getRequestSchema() {
    return requestSchema;
  }


  public void setRequestSchema(Map<String, Object> requestSchema) {
    this.requestSchema = requestSchema;
  }


  public MetaResponse status(LinkedAccountStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkedAccountStatus getStatus() {
    return status;
  }


  public void setStatus(LinkedAccountStatus status) {
    this.status = status;
  }


  public MetaResponse hasConditionalParams(Boolean hasConditionalParams) {
    
    this.hasConditionalParams = hasConditionalParams;
    return this;
  }

   /**
   * Get hasConditionalParams
   * @return hasConditionalParams
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasConditionalParams() {
    return hasConditionalParams;
  }


  public void setHasConditionalParams(Boolean hasConditionalParams) {
    this.hasConditionalParams = hasConditionalParams;
  }


  public MetaResponse hasRequiredLinkedAccountParams(Boolean hasRequiredLinkedAccountParams) {
    
    this.hasRequiredLinkedAccountParams = hasRequiredLinkedAccountParams;
    return this;
  }

   /**
   * Get hasRequiredLinkedAccountParams
   * @return hasRequiredLinkedAccountParams
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasRequiredLinkedAccountParams() {
    return hasRequiredLinkedAccountParams;
  }


  public void setHasRequiredLinkedAccountParams(Boolean hasRequiredLinkedAccountParams) {
    this.hasRequiredLinkedAccountParams = hasRequiredLinkedAccountParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaResponse metaResponse = (MetaResponse) o;
    return Objects.equals(this.requestSchema, metaResponse.requestSchema) &&
        Objects.equals(this.status, metaResponse.status) &&
        Objects.equals(this.hasConditionalParams, metaResponse.hasConditionalParams) &&
        Objects.equals(this.hasRequiredLinkedAccountParams, metaResponse.hasRequiredLinkedAccountParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestSchema, status, hasConditionalParams, hasRequiredLinkedAccountParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaResponse {\n");
    sb.append("    requestSchema: ").append(toIndentedString(requestSchema)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hasConditionalParams: ").append(toIndentedString(hasConditionalParams)).append("\n");
    sb.append("    hasRequiredLinkedAccountParams: ").append(toIndentedString(hasRequiredLinkedAccountParams)).append("\n");
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

