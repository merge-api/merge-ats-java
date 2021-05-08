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
import java.util.UUID;
import merge_ats_client.model.AttachmentTypeEnum;

/**
 * # The Attachment Object ### Description The &#x60;Attachment&#x60; object is used to represent a attachment for a candidate.  ### Usage Example Fetch from the &#x60;LIST Attachments&#x60; endpoint and view attachments accessible by a company.
 */
@ApiModel(description = "# The Attachment Object ### Description The `Attachment` object is used to represent a attachment for a candidate.  ### Usage Example Fetch from the `LIST Attachments` endpoint and view attachments accessible by a company.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]")
public class AttachmentRequest {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_URL = "file_url";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private URI fileUrl;

  public static final String SERIALIZED_NAME_CANDIDATE = "candidate";
  @SerializedName(SERIALIZED_NAME_CANDIDATE)
  private UUID candidate;

  public static final String SERIALIZED_NAME_ATTACHMENT_TYPE = "attachment_type";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TYPE)
  private AttachmentTypeEnum attachmentType;


  public AttachmentRequest remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11167", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public AttachmentRequest fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * The attachment&#39;s name.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Candidate Resume", value = "The attachment's name.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public AttachmentRequest fileUrl(URI fileUrl) {
    
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * The attachment&#39;s url.
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/p749b", value = "The attachment's url.")

  public URI getFileUrl() {
    return fileUrl;
  }


  public void setFileUrl(URI fileUrl) {
    this.fileUrl = fileUrl;
  }


  public AttachmentRequest candidate(UUID candidate) {
    
    this.candidate = candidate;
    return this;
  }

   /**
   * Get candidate
   * @return candidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "")

  public UUID getCandidate() {
    return candidate;
  }


  public void setCandidate(UUID candidate) {
    this.candidate = candidate;
  }


  public AttachmentRequest attachmentType(AttachmentTypeEnum attachmentType) {
    
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * The attachment&#39;s type.
   * @return attachmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESUME", value = "The attachment's type.")

  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }


  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentRequest attachmentRequest = (AttachmentRequest) o;
    return Objects.equals(this.remoteId, attachmentRequest.remoteId) &&
        Objects.equals(this.fileName, attachmentRequest.fileName) &&
        Objects.equals(this.fileUrl, attachmentRequest.fileUrl) &&
        Objects.equals(this.candidate, attachmentRequest.candidate) &&
        Objects.equals(this.attachmentType, attachmentRequest.attachmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, fileName, fileUrl, candidate, attachmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRequest {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    candidate: ").append(toIndentedString(candidate)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

