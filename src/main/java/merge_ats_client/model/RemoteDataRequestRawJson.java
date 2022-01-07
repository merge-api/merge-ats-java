
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
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_ats_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * RemoteDataRequestRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T18:32:11.741718Z[Etc/UTC]")
public class RemoteDataRequestRawJson {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private JsonElement path;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private JsonElement data;

  private transient JSON serializer;

  public RemoteDataRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public RemoteDataRequestRawJson path(String path) {
    this.path = this.serializer.getGson().toJsonTree(path);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getPath() {
    return path;
  }
  public void setPath(JsonElement path) {
    this.path = path;
  }

  public RemoteDataRequestRawJson data(Map<String, Object> data) {
    this.data = this.serializer.getGson().toJsonTree(data);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getData() {
    return data;
  }
  public void setData(JsonElement data) {
    this.data = data;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteDataRequestRawJson remoteDataRequest = (RemoteDataRequestRawJson) o;
    return Objects.equals(this.path.getAsString(), remoteDataRequest.path.getAsString()) &&
        Objects.equals(this.data.getAsString(), remoteDataRequest.data.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(path, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteDataRequestRawJson {\n");
    sb.append("    path: ").append(toIndentedString(path.getAsString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data.getAsString())).append("\n");
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

