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

/**
 * DebugModelLogSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class DebugModelLogSummary {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;


  public DebugModelLogSummary url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "https://harvest.greenhouse.io/v1/candidates/", required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public DebugModelLogSummary method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "POST", required = true, value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public DebugModelLogSummary statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(example = "200", required = true, value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
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
    DebugModelLogSummary debugModelLogSummary = (DebugModelLogSummary) o;
    return Objects.equals(this.url, debugModelLogSummary.url) &&
        Objects.equals(this.method, debugModelLogSummary.method) &&
        Objects.equals(this.statusCode, debugModelLogSummary.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, method, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugModelLogSummary {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

