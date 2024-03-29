
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_ats_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Offer Object ### Description The &#x60;Offer&#x60; object is used to represent an offer for an application. ### Usage Example Fetch from the &#x60;LIST Offers&#x60; endpoint and filter by &#x60;ID&#x60; to show all offers.
 */
@ApiModel(description = "# The Offer Object ### Description The `Offer` object is used to represent an offer for an application. ### Usage Example Fetch from the `LIST Offers` endpoint and filter by `ID` to show all offers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class OfferRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private JsonElement application;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private JsonElement creator;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_CLOSED_AT = "closed_at";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private JsonElement closedAt;

  public static final String SERIALIZED_NAME_SENT_AT = "sent_at";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private JsonElement sentAt;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private JsonElement startDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private JsonElement remoteWasDeleted;

  public static final String SERIALIZED_NAME_FIELD_MAPPINGS = "field_mappings";
  @SerializedName(SERIALIZED_NAME_FIELD_MAPPINGS)
  private JsonElement fieldMappings;

  private transient JSON serializer;

  public OfferRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd85625c-6a59-446f-a317-6de64d83bae7", value = "")

  public JsonElement getId() {
    return id;
  }

  public OfferRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9876", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public OfferRawJson application(UUID application) {
    this.application = this.serializer.getGson().toJsonTree(application);
    return this;
  }

   /**
   * The application who is receiving the offer.
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2872ba14-4084-492b-be96-e5eee6fc33ef", value = "The application who is receiving the offer.")

  public JsonElement getApplication() {
    return application;
  }
  public void setApplication(JsonElement application) {
    this.application = application;
  }

  public OfferRawJson creator(UUID creator) {
    this.creator = this.serializer.getGson().toJsonTree(creator);
    return this;
  }

   /**
   * The user who created the offer.
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52bf9b5e-0beb-4f6f-8a72-cd4dca7ca633", value = "The user who created the offer.")

  public JsonElement getCreator() {
    return creator;
  }
  public void setCreator(JsonElement creator) {
    this.creator = creator;
  }

  public OfferRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the third party&#39;s offer was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's offer was created.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

  public OfferRawJson closedAt(OffsetDateTime closedAt) {
    this.closedAt = this.serializer.getGson().toJsonTree(closedAt);
    return this;
  }

   /**
   * When the offer was closed.
   * @return closedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16T00:00Z", value = "When the offer was closed.")

  public JsonElement getClosedAt() {
    return closedAt;
  }
  public void setClosedAt(JsonElement closedAt) {
    this.closedAt = closedAt;
  }

  public OfferRawJson sentAt(OffsetDateTime sentAt) {
    this.sentAt = this.serializer.getGson().toJsonTree(sentAt);
    return this;
  }

   /**
   * When the offer was sent.
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the offer was sent.")

  public JsonElement getSentAt() {
    return sentAt;
  }
  public void setSentAt(JsonElement sentAt) {
    this.sentAt = sentAt;
  }

  public OfferRawJson startDate(OffsetDateTime startDate) {
    this.startDate = this.serializer.getGson().toJsonTree(startDate);
    return this;
  }

   /**
   * The employment start date on the offer.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-15T00:00Z", value = "The employment start date on the offer.")

  public JsonElement getStartDate() {
    return startDate;
  }
  public void setStartDate(JsonElement startDate) {
    this.startDate = startDate;
  }

  public OfferRawJson status(OfferStatusEnum status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * The offer&#39;s status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SENT", value = "The offer's status.")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/offers\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }

   /**
   * Indicates whether or not this object has been deleted by third party webhooks.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted by third party webhooks.")

  public JsonElement getRemoteWasDeleted() {
    return remoteWasDeleted;
  }

   /**
   * Get fieldMappings
   * @return fieldMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"organization_defined_targets\":{\"custom_key\":\"custom_value\"},\"linked_account_defined_targets\":{\"custom_key\":\"custom_value\"}}", value = "")

  public JsonElement getFieldMappings() {
    return fieldMappings;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRawJson offer = (OfferRawJson) o;
    return Objects.equals(this.id.getAsString(), offer.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), offer.remoteId.getAsString()) &&
        Objects.equals(this.application.getAsString(), offer.application.getAsString()) &&
        Objects.equals(this.creator.getAsString(), offer.creator.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), offer.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.closedAt.getAsString(), offer.closedAt.getAsString()) &&
        Objects.equals(this.sentAt.getAsString(), offer.sentAt.getAsString()) &&
        Objects.equals(this.startDate.getAsString(), offer.startDate.getAsString()) &&
        Objects.equals(this.status.getAsString(), offer.status.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), offer.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), offer.remoteWasDeleted.getAsString()) &&
        Objects.equals(this.fieldMappings.getAsString(), offer.fieldMappings.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, application, creator, remoteCreatedAt, closedAt, sentAt, startDate, status, remoteData, remoteWasDeleted, fieldMappings);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    application: ").append(toIndentedString(application.getAsString())).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt.getAsString())).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt.getAsString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted.getAsString())).append("\n");
    sb.append("    fieldMappings: ").append(toIndentedString(fieldMappings.getAsString())).append("\n");
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


