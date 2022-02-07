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
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import merge_ats_client.JSON;
import merge_ats_client.model.AttachmentRequest;

/**
 * AttachmentEndpointRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:32:36.773068Z[Etc/UTC]")
public class AttachmentEndpointRequest {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private JsonElement model;

  public static final String SERIALIZED_NAME_REMOTE_USER_ID = "remote_user_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_USER_ID)
  private String remoteUserId;


  public AttachmentEndpointRequest model(AttachmentRequest model, JSON serializer) {
    this.model = serializer.getGson().toJsonTree(model);
    return this;
}

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")

  public JsonElement getModel() {
    return model;
  }


  public void setModel(JsonElement model) {
    this.model = model;
  }


  public AttachmentEndpointRequest remoteUserId(String remoteUserId) {
    
    this.remoteUserId = remoteUserId;
    return this;
  }

   /**
   * Get remoteUserId
   * @return remoteUserId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getRemoteUserId() {
    return remoteUserId;
  }


  public void setRemoteUserId(String remoteUserId) {
    this.remoteUserId = remoteUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentEndpointRequest attachmentEndpointRequest = (AttachmentEndpointRequest) o;
    return Objects.equals(this.model, attachmentEndpointRequest.model) &&
        Objects.equals(this.remoteUserId, attachmentEndpointRequest.remoteUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, remoteUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentEndpointRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    remoteUserId: ").append(toIndentedString(remoteUserId)).append("\n");
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

