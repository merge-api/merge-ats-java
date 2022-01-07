
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
 * # The Url Object ### Description The &#x60;Url&#x60; object is used to represent a candidate&#39;s website.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their website urls.
 */
@ApiModel(description = "# The Url Object ### Description The `Url` object is used to represent a candidate's website.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their website urls.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T18:32:11.741718Z[Etc/UTC]")
public class UrlRequestRawJson {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private JsonElement value;

  public static final String SERIALIZED_NAME_URL_TYPE = "url_type";
  @SerializedName(SERIALIZED_NAME_URL_TYPE)
  private JsonElement urlType;

  private transient JSON serializer;

  public UrlRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public UrlRequestRawJson value(URI value) {
    this.value = this.serializer.getGson().toJsonTree(value);
    return this;
  }

   /**
   * The site&#39;s url.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/p749b", value = "The site's url.")

  public JsonElement getValue() {
    return value;
  }
  public void setValue(JsonElement value) {
    this.value = value;
  }

  public UrlRequestRawJson urlType(String urlType) {
    this.urlType = this.serializer.getGson().toJsonTree(urlType);
    return this;
  }

   /**
   * Get urlType
   * @return urlType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PERSONAL", required = true, value = "")

  public JsonElement getUrlType() {
    return urlType;
  }
  public void setUrlType(JsonElement urlType) {
    this.urlType = urlType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlRequestRawJson urlRequest = (UrlRequestRawJson) o;
    return Objects.equals(this.value.getAsString(), urlRequest.value.getAsString()) &&
        Objects.equals(this.urlType.getAsString(), urlRequest.urlType.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(value, urlType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlRequestRawJson {\n");
    sb.append("    value: ").append(toIndentedString(value.getAsString())).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType.getAsString())).append("\n");
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

