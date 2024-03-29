
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
 * # The LinkedAccount Object ### Description The &#x60;LinkedAccount&#x60; object is used to represent an end user&#39;s link with a specific integration.  ### Usage Example View a list of your organization&#39;s &#x60;LinkedAccount&#x60; objects.
 */
@ApiModel(description = "# The LinkedAccount Object ### Description The `LinkedAccount` object is used to represent an end user's link with a specific integration.  ### Usage Example View a list of your organization's `LinkedAccount` objects.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class AccountDetailsAndActionsRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private JsonElement category;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "status_detail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private JsonElement statusDetail;

  public static final String SERIALIZED_NAME_END_USER_ORIGIN_ID = "end_user_origin_id";
  @SerializedName(SERIALIZED_NAME_END_USER_ORIGIN_ID)
  private JsonElement endUserOriginId;

  public static final String SERIALIZED_NAME_END_USER_ORGANIZATION_NAME = "end_user_organization_name";
  @SerializedName(SERIALIZED_NAME_END_USER_ORGANIZATION_NAME)
  private JsonElement endUserOrganizationName;

  public static final String SERIALIZED_NAME_END_USER_EMAIL_ADDRESS = "end_user_email_address";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL_ADDRESS)
  private JsonElement endUserEmailAddress;

  public static final String SERIALIZED_NAME_WEBHOOK_LISTENER_URL = "webhook_listener_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_LISTENER_URL)
  private JsonElement webhookListenerUrl;

  public static final String SERIALIZED_NAME_IS_DUPLICATE = "is_duplicate";
  @SerializedName(SERIALIZED_NAME_IS_DUPLICATE)
  private JsonElement isDuplicate;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private JsonElement integration;

  private transient JSON serializer;

  public AccountDetailsAndActionsRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public AccountDetailsAndActionsRawJson id(String id) {
    this.id = this.serializer.getGson().toJsonTree(id);
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e59b1821-f85c-4e28-a6b3-1804156f3563", required = true, value = "")

  public JsonElement getId() {
    return id;
  }
  public void setId(JsonElement id) {
    this.id = id;
  }

  public AccountDetailsAndActionsRawJson category(CategoryEnum category) {
    this.category = this.serializer.getGson().toJsonTree(category);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hris", value = "")

  public JsonElement getCategory() {
    return category;
  }
  public void setCategory(JsonElement category) {
    this.category = category;
  }

  public AccountDetailsAndActionsRawJson status(AccountDetailsAndActionsStatusEnum status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMPLETE", required = true, value = "")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public AccountDetailsAndActionsRawJson statusDetail(String statusDetail) {
    this.statusDetail = this.serializer.getGson().toJsonTree(statusDetail);
    return this;
  }

   /**
   * Get statusDetail
   * @return statusDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getStatusDetail() {
    return statusDetail;
  }
  public void setStatusDetail(JsonElement statusDetail) {
    this.statusDetail = statusDetail;
  }

  public AccountDetailsAndActionsRawJson endUserOriginId(String endUserOriginId) {
    this.endUserOriginId = this.serializer.getGson().toJsonTree(endUserOriginId);
    return this;
  }

   /**
   * Get endUserOriginId
   * @return endUserOriginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3ac95cde-6c7f-4eef-afec-be710b42308d", value = "")

  public JsonElement getEndUserOriginId() {
    return endUserOriginId;
  }
  public void setEndUserOriginId(JsonElement endUserOriginId) {
    this.endUserOriginId = endUserOriginId;
  }

  public AccountDetailsAndActionsRawJson endUserOrganizationName(String endUserOrganizationName) {
    this.endUserOrganizationName = this.serializer.getGson().toJsonTree(endUserOrganizationName);
    return this;
  }

   /**
   * Get endUserOrganizationName
   * @return endUserOrganizationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Foo Bar, LLC", required = true, value = "")

  public JsonElement getEndUserOrganizationName() {
    return endUserOrganizationName;
  }
  public void setEndUserOrganizationName(JsonElement endUserOrganizationName) {
    this.endUserOrganizationName = endUserOrganizationName;
  }

  public AccountDetailsAndActionsRawJson endUserEmailAddress(String endUserEmailAddress) {
    this.endUserEmailAddress = this.serializer.getGson().toJsonTree(endUserEmailAddress);
    return this;
  }

   /**
   * Get endUserEmailAddress
   * @return endUserEmailAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "hradmin@foobar.dev", required = true, value = "")

  public JsonElement getEndUserEmailAddress() {
    return endUserEmailAddress;
  }
  public void setEndUserEmailAddress(JsonElement endUserEmailAddress) {
    this.endUserEmailAddress = endUserEmailAddress;
  }

  public AccountDetailsAndActionsRawJson webhookListenerUrl(String webhookListenerUrl) {
    this.webhookListenerUrl = this.serializer.getGson().toJsonTree(webhookListenerUrl);
    return this;
  }

   /**
   * Get webhookListenerUrl
   * @return webhookListenerUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.merge.dev/api/integrations/webhook-listener/7fc3mee0UW8ecV4", required = true, value = "")

  public JsonElement getWebhookListenerUrl() {
    return webhookListenerUrl;
  }
  public void setWebhookListenerUrl(JsonElement webhookListenerUrl) {
    this.webhookListenerUrl = webhookListenerUrl;
  }

  public AccountDetailsAndActionsRawJson isDuplicate(Boolean isDuplicate) {
    this.isDuplicate = this.serializer.getGson().toJsonTree(isDuplicate);
    return this;
  }

   /**
   * Whether a Production Linked Account&#39;s credentials match another existing Production Linked Account. This field is &#x60;null&#x60; for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
   * @return isDuplicate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.")

  public JsonElement getIsDuplicate() {
    return isDuplicate;
  }
  public void setIsDuplicate(JsonElement isDuplicate) {
    this.isDuplicate = isDuplicate;
  }

  public AccountDetailsAndActionsRawJson integration(AccountDetailsAndActionsIntegration integration) {
    this.integration = this.serializer.getGson().toJsonTree(integration);
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getIntegration() {
    return integration;
  }
  public void setIntegration(JsonElement integration) {
    this.integration = integration;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsAndActionsRawJson accountDetailsAndActions = (AccountDetailsAndActionsRawJson) o;
    return Objects.equals(this.id.getAsString(), accountDetailsAndActions.id.getAsString()) &&
        Objects.equals(this.category.getAsString(), accountDetailsAndActions.category.getAsString()) &&
        Objects.equals(this.status.getAsString(), accountDetailsAndActions.status.getAsString()) &&
        Objects.equals(this.statusDetail.getAsString(), accountDetailsAndActions.statusDetail.getAsString()) &&
        Objects.equals(this.endUserOriginId.getAsString(), accountDetailsAndActions.endUserOriginId.getAsString()) &&
        Objects.equals(this.endUserOrganizationName.getAsString(), accountDetailsAndActions.endUserOrganizationName.getAsString()) &&
        Objects.equals(this.endUserEmailAddress.getAsString(), accountDetailsAndActions.endUserEmailAddress.getAsString()) &&
        Objects.equals(this.webhookListenerUrl.getAsString(), accountDetailsAndActions.webhookListenerUrl.getAsString()) &&
        Objects.equals(this.isDuplicate.getAsString(), accountDetailsAndActions.isDuplicate.getAsString()) &&
        Objects.equals(this.integration.getAsString(), accountDetailsAndActions.integration.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, category, status, statusDetail, endUserOriginId, endUserOrganizationName, endUserEmailAddress, webhookListenerUrl, isDuplicate, integration);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsAndActionsRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    category: ").append(toIndentedString(category.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail.getAsString())).append("\n");
    sb.append("    endUserOriginId: ").append(toIndentedString(endUserOriginId.getAsString())).append("\n");
    sb.append("    endUserOrganizationName: ").append(toIndentedString(endUserOrganizationName.getAsString())).append("\n");
    sb.append("    endUserEmailAddress: ").append(toIndentedString(endUserEmailAddress.getAsString())).append("\n");
    sb.append("    webhookListenerUrl: ").append(toIndentedString(webhookListenerUrl.getAsString())).append("\n");
    sb.append("    isDuplicate: ").append(toIndentedString(isDuplicate.getAsString())).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration.getAsString())).append("\n");
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


