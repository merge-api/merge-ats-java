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
import java.net.URI;

/**
 * # The Url Object ### Description The &#x60;Url&#x60; object is used to represent a candidate&#39;s website.  ### Usage Example Fetch from the &#x60;GET Candidate&#x60; endpoint and view their website urls.
 */
@ApiModel(description = "# The Url Object ### Description The `Url` object is used to represent a candidate's website.  ### Usage Example Fetch from the `GET Candidate` endpoint and view their website urls.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-06T18:40:10.538858Z[Etc/UTC]")
public class UrlRequest {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private URI value;

  public static final String SERIALIZED_NAME_URL_TYPE = "url_type";
  @SerializedName(SERIALIZED_NAME_URL_TYPE)
  private String urlType;


  public UrlRequest value(URI value) {
    
    this.value = value;
    return this;
  }

   /**
   * The site&#39;s url.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/p749b", value = "The site's url.")

  public URI getValue() {
    return value;
  }


  public void setValue(URI value) {
    this.value = value;
  }


  public UrlRequest urlType(String urlType) {
    
    this.urlType = urlType;
    return this;
  }

   /**
   * Get urlType
   * @return urlType
  **/
  @ApiModelProperty(example = "PERSONAL", required = true, value = "")

  public String getUrlType() {
    return urlType;
  }


  public void setUrlType(String urlType) {
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
    UrlRequest urlRequest = (UrlRequest) o;
    return Objects.equals(this.value, urlRequest.value) &&
        Objects.equals(this.urlType, urlRequest.urlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, urlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
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

