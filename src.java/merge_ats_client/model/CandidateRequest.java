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
import merge_ats_client.model.EmailAddressRequest;
import merge_ats_client.model.PhoneNumberRequest;
import merge_ats_client.model.UrlRequest;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Candidate Object ### Description The &#x60;Candidate&#x60; object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the &#x60;LIST Candidates&#x60; endpoint and filter by &#x60;ID&#x60; to show all candidates.
 */
@ApiModel(description = "# The Candidate Object ### Description The `Candidate` object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the `LIST Candidates` endpoint and filter by `ID` to show all candidates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-29T17:42:28.190483-07:00[America/Los_Angeles]")
public class CandidateRequest {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_UPDATED_AT = "remote_updated_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_UPDATED_AT)
  private OffsetDateTime remoteUpdatedAt;

  public static final String SERIALIZED_NAME_LAST_INTERACTION_AT = "last_interaction_at";
  @SerializedName(SERIALIZED_NAME_LAST_INTERACTION_AT)
  private OffsetDateTime lastInteractionAt;

  public static final String SERIALIZED_NAME_IS_PRIVATE = "is_private";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private Boolean isPrivate;

  public static final String SERIALIZED_NAME_CAN_EMAIL = "can_email";
  @SerializedName(SERIALIZED_NAME_CAN_EMAIL)
  private Boolean canEmail;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<String> locations = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PhoneNumberRequest> phoneNumbers = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<EmailAddressRequest> emailAddresses = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<UrlRequest> urls = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<UUID> applications = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<UUID> attachments = null;


  public CandidateRequest remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21198", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public CandidateRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The candidate&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gil", value = "The candidate's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CandidateRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The candidate&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Feig", value = "The candidate's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CandidateRequest company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The candidate&#39;s current company.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Columbia Dining App.", value = "The candidate's current company.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public CandidateRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The candidate&#39;s current title.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer", value = "The candidate's current title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CandidateRequest remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s candidate was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the third party's candidate was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public CandidateRequest remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    
    this.remoteUpdatedAt = remoteUpdatedAt;
    return this;
  }

   /**
   * When the third party&#39;s candidate was updated.
   * @return remoteUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the third party's candidate was updated.")

  public OffsetDateTime getRemoteUpdatedAt() {
    return remoteUpdatedAt;
  }


  public void setRemoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
    this.remoteUpdatedAt = remoteUpdatedAt;
  }


  public CandidateRequest lastInteractionAt(OffsetDateTime lastInteractionAt) {
    
    this.lastInteractionAt = lastInteractionAt;
    return this;
  }

   /**
   * When the most recent candidate interaction occurred.
   * @return lastInteractionAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the most recent candidate interaction occurred.")

  public OffsetDateTime getLastInteractionAt() {
    return lastInteractionAt;
  }


  public void setLastInteractionAt(OffsetDateTime lastInteractionAt) {
    this.lastInteractionAt = lastInteractionAt;
  }


  public CandidateRequest isPrivate(Boolean isPrivate) {
    
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Whether or not the candidate is private.
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the candidate is private.")

  public Boolean getIsPrivate() {
    return isPrivate;
  }


  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


  public CandidateRequest canEmail(Boolean canEmail) {
    
    this.canEmail = canEmail;
    return this;
  }

   /**
   * Whether or not the candidate can be emailed.
   * @return canEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the candidate can be emailed.")

  public Boolean getCanEmail() {
    return canEmail;
  }


  public void setCanEmail(Boolean canEmail) {
    this.canEmail = canEmail;
  }


  public CandidateRequest locations(List<String> locations) {
    
    this.locations = locations;
    return this;
  }

  public CandidateRequest addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The candidate&#39;s locations.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"San Francisco\",\"New York\",\"Miami\"]", value = "The candidate's locations.")

  public List<String> getLocations() {
    return locations;
  }


  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  public CandidateRequest phoneNumbers(List<PhoneNumberRequest> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public CandidateRequest addPhoneNumbersItem(PhoneNumberRequest phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<PhoneNumberRequest>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"+1234567890\",\"phone_number_type\":\"MOBILE\"}]", value = "")

  public List<PhoneNumberRequest> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<PhoneNumberRequest> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public CandidateRequest emailAddresses(List<EmailAddressRequest> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public CandidateRequest addEmailAddressesItem(EmailAddressRequest emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<EmailAddressRequest>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"hello@merge.dev\",\"email_address_type\":\"PERSONAL\"}]", value = "")

  public List<EmailAddressRequest> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<EmailAddressRequest> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public CandidateRequest urls(List<UrlRequest> urls) {
    
    this.urls = urls;
    return this;
  }

  public CandidateRequest addUrlsItem(UrlRequest urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<UrlRequest>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"value\":\"http://alturl.com/p749b\",\"url_type\":\"BLOG\"}]", value = "")

  public List<UrlRequest> getUrls() {
    return urls;
  }


  public void setUrls(List<UrlRequest> urls) {
    this.urls = urls;
  }


  public CandidateRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CandidateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Array of &#x60;Tag&#x60; names as strings.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"High-Priority\"]", value = "Array of `Tag` names as strings.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CandidateRequest applications(List<UUID> applications) {
    
    this.applications = applications;
    return this;
  }

  public CandidateRequest addApplicationsItem(UUID applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<UUID>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Array of &#x60;Application&#x60; object IDs.
   * @return applications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"29eb9867-ce2a-403f-b8ce-f2844b89f078\",\"b4d08e5c-de00-4d64-a29f-66addac9af99\",\"4ff877d2-fb3e-4a5b-a7a5-168ddf2ffa56\"]", value = "Array of `Application` object IDs.")

  public List<UUID> getApplications() {
    return applications;
  }


  public void setApplications(List<UUID> applications) {
    this.applications = applications;
  }


  public CandidateRequest attachments(List<UUID> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public CandidateRequest addAttachmentsItem(UUID attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<UUID>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Array of &#x60;Attachment&#x60; object IDs.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"bea08964-32b4-4a20-8bb4-2612ba09de1d\"]", value = "Array of `Attachment` object IDs.")

  public List<UUID> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<UUID> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRequest candidateRequest = (CandidateRequest) o;
    return Objects.equals(this.remoteId, candidateRequest.remoteId) &&
        Objects.equals(this.firstName, candidateRequest.firstName) &&
        Objects.equals(this.lastName, candidateRequest.lastName) &&
        Objects.equals(this.company, candidateRequest.company) &&
        Objects.equals(this.title, candidateRequest.title) &&
        Objects.equals(this.remoteCreatedAt, candidateRequest.remoteCreatedAt) &&
        Objects.equals(this.remoteUpdatedAt, candidateRequest.remoteUpdatedAt) &&
        Objects.equals(this.lastInteractionAt, candidateRequest.lastInteractionAt) &&
        Objects.equals(this.isPrivate, candidateRequest.isPrivate) &&
        Objects.equals(this.canEmail, candidateRequest.canEmail) &&
        Objects.equals(this.locations, candidateRequest.locations) &&
        Objects.equals(this.phoneNumbers, candidateRequest.phoneNumbers) &&
        Objects.equals(this.emailAddresses, candidateRequest.emailAddresses) &&
        Objects.equals(this.urls, candidateRequest.urls) &&
        Objects.equals(this.tags, candidateRequest.tags) &&
        Objects.equals(this.applications, candidateRequest.applications) &&
        Objects.equals(this.attachments, candidateRequest.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, firstName, lastName, company, title, remoteCreatedAt, remoteUpdatedAt, lastInteractionAt, isPrivate, canEmail, locations, phoneNumbers, emailAddresses, urls, tags, applications, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRequest {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    remoteUpdatedAt: ").append(toIndentedString(remoteUpdatedAt)).append("\n");
    sb.append("    lastInteractionAt: ").append(toIndentedString(lastInteractionAt)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    canEmail: ").append(toIndentedString(canEmail)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
