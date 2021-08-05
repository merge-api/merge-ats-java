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

/**
 * # The RemoteResponse Object ### Description The &#x60;RemoteResponse&#x60; object is used to represent information returned from a third-party endpoint.  ### Usage Example View the &#x60;RemoteResponse&#x60; returned from your &#x60;DataPassthrough&#x60;.
 */
@ApiModel(description = "# The RemoteResponse Object ### Description The `RemoteResponse` object is used to represent information returned from a third-party endpoint.  ### Usage Example View the `RemoteResponse` returned from your `DataPassthrough`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-04T15:38:16.862482-07:00[America/Los_Angeles]")
public class RemoteResponse {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private Map<String, Object> response = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, Object> headers = null;


  public RemoteResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "GET", required = true, value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public RemoteResponse path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "/scooters", required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public RemoteResponse status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "200", required = true, value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public RemoteResponse response(Map<String, Object> response) {
    
    this.response = response;
    return this;
  }

  public RemoteResponse putResponseItem(String key, Object responseItem) {
    this.response.put(key, responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "{\"scooters\":[{\"company\":\"Lime\",\"model\":\"Gen 2.5\"},{\"company\":\"Bird\",\"model\":\"Bird Zero\"}]}", required = true, value = "")

  public Map<String, Object> getResponse() {
    return response;
  }


  public void setResponse(Map<String, Object> response) {
    this.response = response;
  }


  public RemoteResponse headers(Map<String, Object> headers) {
    
    this.headers = headers;
    return this;
  }

  public RemoteResponse putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, Object>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"EXTRA-HEADER\":\"value\",\"Authorization\":\"<redacted>\"}", value = "")

  public Map<String, Object> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteResponse remoteResponse = (RemoteResponse) o;
    return Objects.equals(this.method, remoteResponse.method) &&
        Objects.equals(this.path, remoteResponse.path) &&
        Objects.equals(this.status, remoteResponse.status) &&
        Objects.equals(this.response, remoteResponse.response) &&
        Objects.equals(this.headers, remoteResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, path, status, response, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteResponse {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

