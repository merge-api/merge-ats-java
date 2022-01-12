
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
 * # The Candidate Object ### Description The &#x60;Candidate&#x60; object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the &#x60;LIST Candidates&#x60; endpoint and filter by &#x60;ID&#x60; to show all candidates.
 */
@ApiModel(description = "# The Candidate Object ### Description The `Candidate` object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the `LIST Candidates` endpoint and filter by `ID` to show all candidates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-12T18:46:24.846598Z[Etc/UTC]")
public class CandidateRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private JsonElement firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private JsonElement lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private JsonElement company;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private JsonElement title;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_UPDATED_AT = "remote_updated_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_UPDATED_AT)
  private JsonElement remoteUpdatedAt;

  public static final String SERIALIZED_NAME_LAST_INTERACTION_AT = "last_interaction_at";
  @SerializedName(SERIALIZED_NAME_LAST_INTERACTION_AT)
  private JsonElement lastInteractionAt;

  public static final String SERIALIZED_NAME_IS_PRIVATE = "is_private";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private JsonElement isPrivate;

  public static final String SERIALIZED_NAME_CAN_EMAIL = "can_email";
  @SerializedName(SERIALIZED_NAME_CAN_EMAIL)
  private JsonElement canEmail;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private JsonElement locations;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private JsonElement phoneNumbers;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private JsonElement emailAddresses;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private JsonElement urls;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private JsonElement tags;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private JsonElement applications;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private JsonElement attachments;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private JsonElement customFields;

  private transient JSON serializer;

  public CandidateRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "521b18c2-4d01-4297-b451-19858d07c133", value = "")

  public JsonElement getId() {
    return id;
  }

  public CandidateRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21198", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public CandidateRawJson firstName(String firstName) {
    this.firstName = this.serializer.getGson().toJsonTree(firstName);
    return this;
  }

   /**
   * The candidate&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gil", value = "The candidate's first name.")

  public JsonElement getFirstName() {
    return firstName;
  }
  public void setFirstName(JsonElement firstName) {
    this.firstName = firstName;
  }

  public CandidateRawJson lastName(String lastName) {
    this.lastName = this.serializer.getGson().toJsonTree(lastName);
    return this;
  }

   /**
   * The candidate&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Feig", value = "The candidate's last name.")

  public JsonElement getLastName() {
    return lastName;
  }
  public void setLastName(JsonElement lastName) {
    this.lastName = lastName;
  }

  public CandidateRawJson company(String company) {
    this.company = this.serializer.getGson().toJsonTree(company);
    return this;
  }

   /**
   * The candidate&#39;s current company.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Columbia Dining App.", value = "The candidate's current company.")

  public JsonElement getCompany() {
    return company;
  }
  public void setCompany(JsonElement company) {
    this.company = company;
  }

  public CandidateRawJson title(String title) {
    this.title = this.serializer.getGson().toJsonTree(title);
    return this;
  }

   /**
   * The candidate&#39;s current title.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer", value = "The candidate's current title.")

  public JsonElement getTitle() {
    return title;
  }
  public void setTitle(JsonElement title) {
    this.title = title;
  }

  public CandidateRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the third party&#39;s candidate was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T00:00Z", value = "When the third party's candidate was created.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

  public CandidateRawJson remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    this.remoteUpdatedAt = this.serializer.getGson().toJsonTree(remoteUpdatedAt);
    return this;
  }

   /**
   * When the third party&#39;s candidate was updated.
   * @return remoteUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-16T00:00Z", value = "When the third party's candidate was updated.")

  public JsonElement getRemoteUpdatedAt() {
    return remoteUpdatedAt;
  }
  public void setRemoteUpdatedAt(JsonElement remoteUpdatedAt) {
    this.remoteUpdatedAt = remoteUpdatedAt;
  }

  public CandidateRawJson lastInteractionAt(OffsetDateTime lastInteractionAt) {
    this.lastInteractionAt = this.serializer.getGson().toJsonTree(lastInteractionAt);
    return this;
  }

   /**
   * When the most recent candidate interaction occurred.
   * @return lastInteractionAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-17T00:00Z", value = "When the most recent candidate interaction occurred.")

  public JsonElement getLastInteractionAt() {
    return lastInteractionAt;
  }
  public void setLastInteractionAt(JsonElement lastInteractionAt) {
    this.lastInteractionAt = lastInteractionAt;
  }

  public CandidateRawJson isPrivate(Boolean isPrivate) {
    this.isPrivate = this.serializer.getGson().toJsonTree(isPrivate);
    return this;
  }

   /**
   * Whether or not the candidate is private.
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the candidate is private.")

  public JsonElement getIsPrivate() {
    return isPrivate;
  }
  public void setIsPrivate(JsonElement isPrivate) {
    this.isPrivate = isPrivate;
  }

  public CandidateRawJson canEmail(Boolean canEmail) {
    this.canEmail = this.serializer.getGson().toJsonTree(canEmail);
    return this;
  }

   /**
   * Whether or not the candidate can be emailed.
   * @return canEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the candidate can be emailed.")

  public JsonElement getCanEmail() {
    return canEmail;
  }
  public void setCanEmail(JsonElement canEmail) {
    this.canEmail = canEmail;
  }

  public CandidateRawJson locations(List<String> locations) {
    this.locations = this.serializer.getGson().toJsonTree(locations);
    return this;
  }

   /**
   * The candidate&#39;s locations.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"San Francisco\",\"New York\",\"Miami\"]", value = "The candidate's locations.")

  public JsonElement getLocations() {
    return locations;
  }
  public void setLocations(JsonElement locations) {
    this.locations = locations;
  }

  public CandidateRawJson phoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = this.serializer.getGson().toJsonTree(phoneNumbers);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"+1234567890\",\"phone_number_type\":\"MOBILE\"}]", value = "")

  public JsonElement getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(JsonElement phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public CandidateRawJson emailAddresses(List<EmailAddress> emailAddresses) {
    this.emailAddresses = this.serializer.getGson().toJsonTree(emailAddresses);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"hello@merge.dev\",\"email_address_type\":\"PERSONAL\"}]", value = "")

  public JsonElement getEmailAddresses() {
    return emailAddresses;
  }
  public void setEmailAddresses(JsonElement emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public CandidateRawJson urls(List<Url> urls) {
    this.urls = this.serializer.getGson().toJsonTree(urls);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"http://alturl.com/p749b\",\"url_type\":\"BLOG\"}]", value = "")

  public JsonElement getUrls() {
    return urls;
  }
  public void setUrls(JsonElement urls) {
    this.urls = urls;
  }

  public CandidateRawJson tags(List<String> tags) {
    this.tags = this.serializer.getGson().toJsonTree(tags);
    return this;
  }

   /**
   * Array of &#x60;Tag&#x60; names as strings.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"High-Priority\"]", value = "Array of `Tag` names as strings.")

  public JsonElement getTags() {
    return tags;
  }
  public void setTags(JsonElement tags) {
    this.tags = tags;
  }

  public CandidateRawJson applications(List<UUID> applications) {
    this.applications = this.serializer.getGson().toJsonTree(applications);
    return this;
  }

   /**
   * Array of &#x60;Application&#x60; object IDs.
   * @return applications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"29eb9867-ce2a-403f-b8ce-f2844b89f078\",\"b4d08e5c-de00-4d64-a29f-66addac9af99\",\"4ff877d2-fb3e-4a5b-a7a5-168ddf2ffa56\"]", value = "Array of `Application` object IDs.")

  public JsonElement getApplications() {
    return applications;
  }
  public void setApplications(JsonElement applications) {
    this.applications = applications;
  }

  public CandidateRawJson attachments(List<UUID> attachments) {
    this.attachments = this.serializer.getGson().toJsonTree(attachments);
    return this;
  }

   /**
   * Array of &#x60;Attachment&#x60; object IDs.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"bea08964-32b4-4a20-8bb4-2612ba09de1d\"]", value = "Array of `Attachment` object IDs.")

  public JsonElement getAttachments() {
    return attachments;
  }
  public void setAttachments(JsonElement attachments) {
    this.attachments = attachments;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/candidates\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }

  public CandidateRawJson customFields(Map<String, Object> customFields) {
    this.customFields = this.serializer.getGson().toJsonTree(customFields);
    return this;
  }

   /**
   * Custom fields configured for a given model.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom fields configured for a given model.")

  public JsonElement getCustomFields() {
    return customFields;
  }
  public void setCustomFields(JsonElement customFields) {
    this.customFields = customFields;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRawJson candidate = (CandidateRawJson) o;
    return Objects.equals(this.id.getAsString(), candidate.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), candidate.remoteId.getAsString()) &&
        Objects.equals(this.firstName.getAsString(), candidate.firstName.getAsString()) &&
        Objects.equals(this.lastName.getAsString(), candidate.lastName.getAsString()) &&
        Objects.equals(this.company.getAsString(), candidate.company.getAsString()) &&
        Objects.equals(this.title.getAsString(), candidate.title.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), candidate.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.remoteUpdatedAt.getAsString(), candidate.remoteUpdatedAt.getAsString()) &&
        Objects.equals(this.lastInteractionAt.getAsString(), candidate.lastInteractionAt.getAsString()) &&
        Objects.equals(this.isPrivate.getAsString(), candidate.isPrivate.getAsString()) &&
        Objects.equals(this.canEmail.getAsString(), candidate.canEmail.getAsString()) &&
        Objects.equals(this.locations.getAsString(), candidate.locations.getAsString()) &&
        Objects.equals(this.phoneNumbers.getAsString(), candidate.phoneNumbers.getAsString()) &&
        Objects.equals(this.emailAddresses.getAsString(), candidate.emailAddresses.getAsString()) &&
        Objects.equals(this.urls.getAsString(), candidate.urls.getAsString()) &&
        Objects.equals(this.tags.getAsString(), candidate.tags.getAsString()) &&
        Objects.equals(this.applications.getAsString(), candidate.applications.getAsString()) &&
        Objects.equals(this.attachments.getAsString(), candidate.attachments.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), candidate.remoteData.getAsString()) &&
        Objects.equals(this.customFields.getAsString(), candidate.customFields.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, firstName, lastName, company, title, remoteCreatedAt, remoteUpdatedAt, lastInteractionAt, isPrivate, canEmail, locations, phoneNumbers, emailAddresses, urls, tags, applications, attachments, remoteData, customFields);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName.getAsString())).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName.getAsString())).append("\n");
    sb.append("    company: ").append(toIndentedString(company.getAsString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
    sb.append("    remoteUpdatedAt: ").append(toIndentedString(remoteUpdatedAt.getAsString())).append("\n");
    sb.append("    lastInteractionAt: ").append(toIndentedString(lastInteractionAt.getAsString())).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate.getAsString())).append("\n");
    sb.append("    canEmail: ").append(toIndentedString(canEmail.getAsString())).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations.getAsString())).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers.getAsString())).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses.getAsString())).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls.getAsString())).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags.getAsString())).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications.getAsString())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields.getAsString())).append("\n");
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


