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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * # The Tag Object ### Description The &#x60;Tag&#x60; object is used to represent a tag for a candidate.  ### Usage Example Fetch from the &#x60;LIST Tags&#x60; endpoint and view the tags used within a company.
 */
@ApiModel(description = "# The Tag Object ### Description The `Tag` object is used to represent a tag for a candidate.  ### Usage Example Fetch from the `LIST Tags` endpoint and view the tags used within a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T21:09:25.697907Z[Etc/UTC]")
public class Tag {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<Map<String, Object>> remoteData = null;


  public Tag remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4567", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Tag name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The tag&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "High-Priority", value = "The tag's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tag remoteData(List<Map<String, Object>> remoteData) {
    
    this.remoteData = remoteData;
    return this;
  }

  public Tag addRemoteDataItem(Map<String, Object> remoteDataItem) {
    if (this.remoteData == null) {
      this.remoteData = new ArrayList<Map<String, Object>>();
    }
    this.remoteData.add(remoteDataItem);
    return this;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/tags\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<Map<String, Object>> getRemoteData() {
    return remoteData;
  }


  public void setRemoteData(List<Map<String, Object>> remoteData) {
    this.remoteData = remoteData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.remoteId, tag.remoteId) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.remoteData, tag.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, name, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
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

