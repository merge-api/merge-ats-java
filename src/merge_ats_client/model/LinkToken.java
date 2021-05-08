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
 * LinkToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]")
public class LinkToken {
  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_INTEGRATION_NAME = "integration_name";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_NAME)
  private String integrationName;


  public LinkToken linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * Get linkToken
   * @return linkToken
  **/
  @ApiModelProperty(example = "necdP7FtdASl1fQwm62be2_dM4wBG8_GactqoUV0", required = true, value = "")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  public LinkToken integrationName(String integrationName) {
    
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Get integrationName
   * @return integrationName
  **/
  @ApiModelProperty(example = "Lever", required = true, value = "")

  public String getIntegrationName() {
    return integrationName;
  }


  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkToken linkToken = (LinkToken) o;
    return Objects.equals(this.linkToken, linkToken.linkToken) &&
        Objects.equals(this.integrationName, linkToken.integrationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkToken, integrationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkToken {\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
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

