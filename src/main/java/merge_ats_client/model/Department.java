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
import java.util.UUID;
import merge_ats_client.model.RemoteData;

/**
 * # The Department Object ### Description The &#x60;Department&#x60; object is used to represent a department within a company. ### Usage Example Fetch from the &#x60;LIST Departments&#x60; endpoint and view the departments within a company.
 */
@ApiModel(description = "# The Department Object ### Description The `Department` object is used to represent a department within a company. ### Usage Example Fetch from the `LIST Departments` endpoint and view the departments within a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:59:08.199624Z[Etc/UTC]")
public class Department {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private Boolean remoteWasDeleted;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5b3c1341-a20f-4e51-b72c-f3830a16c97b", value = "")

  public UUID getId() {
    return id;
  }




  public Department remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23456", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Department name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The department&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Engineering", value = "The department's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/departments\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
    return remoteData;
  }




   /**
   * Indicates whether or not this object has been deleted on the third-party.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted on the third-party.")

  public Boolean getRemoteWasDeleted() {
    return remoteWasDeleted;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(this.id, department.id) &&
        Objects.equals(this.remoteId, department.remoteId) &&
        Objects.equals(this.name, department.name) &&
        Objects.equals(this.remoteData, department.remoteData) &&
        Objects.equals(this.remoteWasDeleted, department.remoteWasDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, remoteData, remoteWasDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted)).append("\n");
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

