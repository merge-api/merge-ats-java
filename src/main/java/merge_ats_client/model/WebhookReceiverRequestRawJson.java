
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
 * WebhookReceiverRequestRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:59:08.199624Z[Etc/UTC]")
public class WebhookReceiverRequestRawJson {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private JsonElement event;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private JsonElement isActive;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private JsonElement key;

  private transient JSON serializer;

  public WebhookReceiverRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public WebhookReceiverRequestRawJson event(String event) {
    this.event = this.serializer.getGson().toJsonTree(event);
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getEvent() {
    return event;
  }
  public void setEvent(JsonElement event) {
    this.event = event;
  }

  public WebhookReceiverRequestRawJson isActive(Boolean isActive) {
    this.isActive = this.serializer.getGson().toJsonTree(isActive);
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getIsActive() {
    return isActive;
  }
  public void setIsActive(JsonElement isActive) {
    this.isActive = isActive;
  }

  public WebhookReceiverRequestRawJson key(String key) {
    this.key = this.serializer.getGson().toJsonTree(key);
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getKey() {
    return key;
  }
  public void setKey(JsonElement key) {
    this.key = key;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookReceiverRequestRawJson webhookReceiverRequest = (WebhookReceiverRequestRawJson) o;
    return Objects.equals(this.event.getAsString(), webhookReceiverRequest.event.getAsString()) &&
        Objects.equals(this.isActive.getAsString(), webhookReceiverRequest.isActive.getAsString()) &&
        Objects.equals(this.key.getAsString(), webhookReceiverRequest.key.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(event, isActive, key);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookReceiverRequestRawJson {\n");
    sb.append("    event: ").append(toIndentedString(event.getAsString())).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive.getAsString())).append("\n");
    sb.append("    key: ").append(toIndentedString(key.getAsString())).append("\n");
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


