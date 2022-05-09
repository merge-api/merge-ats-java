
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
 * DebugModelLogSummaryRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:17:34.959180Z[Etc/UTC]")
public class DebugModelLogSummaryRawJson {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private JsonElement url;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private JsonElement method;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private JsonElement statusCode;

  private transient JSON serializer;

  public DebugModelLogSummaryRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public DebugModelLogSummaryRawJson url(String url) {
    this.url = this.serializer.getGson().toJsonTree(url);
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://harvest.greenhouse.io/v1/candidates/", required = true, value = "")

  public JsonElement getUrl() {
    return url;
  }
  public void setUrl(JsonElement url) {
    this.url = url;
  }

  public DebugModelLogSummaryRawJson method(String method) {
    this.method = this.serializer.getGson().toJsonTree(method);
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "POST", required = true, value = "")

  public JsonElement getMethod() {
    return method;
  }
  public void setMethod(JsonElement method) {
    this.method = method;
  }

  public DebugModelLogSummaryRawJson statusCode(Integer statusCode) {
    this.statusCode = this.serializer.getGson().toJsonTree(statusCode);
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "")

  public JsonElement getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(JsonElement statusCode) {
    this.statusCode = statusCode;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugModelLogSummaryRawJson debugModelLogSummary = (DebugModelLogSummaryRawJson) o;
    return Objects.equals(this.url.getAsString(), debugModelLogSummary.url.getAsString()) &&
        Objects.equals(this.method.getAsString(), debugModelLogSummary.method.getAsString()) &&
        Objects.equals(this.statusCode.getAsString(), debugModelLogSummary.statusCode.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(url, method, statusCode);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugModelLogSummaryRawJson {\n");
    sb.append("    url: ").append(toIndentedString(url.getAsString())).append("\n");
    sb.append("    method: ").append(toIndentedString(method.getAsString())).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode.getAsString())).append("\n");
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


