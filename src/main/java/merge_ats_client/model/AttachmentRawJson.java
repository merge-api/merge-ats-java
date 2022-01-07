
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
 * # The Attachment Object ### Description The &#x60;Attachment&#x60; object is used to represent a attachment for a candidate.  ### Usage Example Fetch from the &#x60;LIST Attachments&#x60; endpoint and view attachments accessible by a company.
 */
@ApiModel(description = "# The Attachment Object ### Description The `Attachment` object is used to represent a attachment for a candidate.  ### Usage Example Fetch from the `LIST Attachments` endpoint and view attachments accessible by a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T18:32:11.741718Z[Etc/UTC]")
public class AttachmentRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private JsonElement fileName;

  public static final String SERIALIZED_NAME_FILE_URL = "file_url";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private JsonElement fileUrl;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private JsonElement candidate;

  public static final String SERIALIZED_NAME_ATTACHMENT_TYPE = "attachment_type";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TYPE)
  private JsonElement attachmentType;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public AttachmentRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c640b80b-fac9-409f-aa19-1f9221aec445", value = "")

  public JsonElement getId() {
    return id;
  }

  public AttachmentRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11167", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public AttachmentRawJson fileName(String fileName) {
    this.fileName = this.serializer.getGson().toJsonTree(fileName);
    return this;
  }

   /**
   * The attachment&#39;s name.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Candidate Resume", value = "The attachment's name.")

  public JsonElement getFileName() {
    return fileName;
  }
  public void setFileName(JsonElement fileName) {
    this.fileName = fileName;
  }

  public AttachmentRawJson fileUrl(URI fileUrl) {
    this.fileUrl = this.serializer.getGson().toJsonTree(fileUrl);
    return this;
  }

   /**
   * The attachment&#39;s url.
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/p749b", value = "The attachment's url.")

  public JsonElement getFileUrl() {
    return fileUrl;
  }
  public void setFileUrl(JsonElement fileUrl) {
    this.fileUrl = fileUrl;
  }

  public AttachmentRawJson candidate(UUID candidate) {
    this.candidate = this.serializer.getGson().toJsonTree(candidate);
    return this;
  }

   /**
   * Get candidate
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "")

  public JsonElement getCandidate() {
    return candidate;
  }
  public void setCandidate(JsonElement candidate) {
    this.candidate = candidate;
  }

  public AttachmentRawJson attachmentType(String attachmentType) {
    this.attachmentType = this.serializer.getGson().toJsonTree(attachmentType);
    return this;
  }

   /**
   * Get attachmentType
   * @return attachmentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RESUME", required = true, value = "")

  public JsonElement getAttachmentType() {
    return attachmentType;
  }
  public void setAttachmentType(JsonElement attachmentType) {
    this.attachmentType = attachmentType;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/attachments\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentRawJson attachment = (AttachmentRawJson) o;
    return Objects.equals(this.id.getAsString(), attachment.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), attachment.remoteId.getAsString()) &&
        Objects.equals(this.fileName.getAsString(), attachment.fileName.getAsString()) &&
        Objects.equals(this.fileUrl.getAsString(), attachment.fileUrl.getAsString()) &&
        Objects.equals(this.candidate.getAsString(), attachment.candidate.getAsString()) &&
        Objects.equals(this.attachmentType.getAsString(), attachment.attachmentType.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), attachment.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, fileName, fileUrl, candidate, attachmentType, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName.getAsString())).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl.getAsString())).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate.getAsString())).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
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


