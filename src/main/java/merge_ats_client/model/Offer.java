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
import org.threeten.bp.OffsetDateTime;

/**
 * # The Offer Object ### Description The &#x60;Offer&#x60; object is used to represent an offer for an application.  ### Usage Example Fetch from the &#x60;LIST Offers&#x60; endpoint and filter by &#x60;ID&#x60; to show all offers.
 */
@ApiModel(description = "# The Offer Object ### Description The `Offer` object is used to represent an offer for an application.  ### Usage Example Fetch from the `LIST Offers` endpoint and filter by `ID` to show all offers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T20:24:40.629470Z[Etc/UTC]")
public class Offer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private UUID application;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private UUID creator;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_CLOSED_AT = "closed_at";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private OffsetDateTime closedAt;

  public static final String SERIALIZED_NAME_SENT_AT = "sent_at";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd85625c-6a59-446f-a317-6de64d83bae7", value = "")

  public UUID getId() {
    return id;
  }




  public Offer remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9876", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Offer application(UUID application) {
    
    this.application = application;
    return this;
  }

   /**
   * The application who is receiving the offer.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The application who is receiving the offer.")

  public UUID getApplication() {
    return application;
  }


  public void setApplication(UUID application) {
    this.application = application;
  }


  public Offer creator(UUID creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * The user who created the offer.
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The user who created the offer.")

  public UUID getCreator() {
    return creator;
  }


  public void setCreator(UUID creator) {
    this.creator = creator;
  }


  public Offer remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s offer was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's offer was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public Offer closedAt(OffsetDateTime closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * When the offer was closed.
   * @return closedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16T00:00Z", value = "When the offer was closed.")

  public OffsetDateTime getClosedAt() {
    return closedAt;
  }


  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }


  public Offer sentAt(OffsetDateTime sentAt) {
    
    this.sentAt = sentAt;
    return this;
  }

   /**
   * When the offer was sent.
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the offer was sent.")

  public OffsetDateTime getSentAt() {
    return sentAt;
  }


  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public Offer startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The employment start date on the offer.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-15T00:00Z", value = "The employment start date on the offer.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Offer status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "SENT", required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/offers\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
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
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.remoteId, offer.remoteId) &&
        Objects.equals(this.application, offer.application) &&
        Objects.equals(this.creator, offer.creator) &&
        Objects.equals(this.remoteCreatedAt, offer.remoteCreatedAt) &&
        Objects.equals(this.closedAt, offer.closedAt) &&
        Objects.equals(this.sentAt, offer.sentAt) &&
        Objects.equals(this.startDate, offer.startDate) &&
        Objects.equals(this.status, offer.status) &&
        Objects.equals(this.remoteData, offer.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, application, creator, remoteCreatedAt, closedAt, sentAt, startDate, status, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

