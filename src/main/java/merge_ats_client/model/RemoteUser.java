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
import merge_ats_client.model.AccessRoleEnum;
import merge_ats_client.model.RemoteData;
import org.threeten.bp.OffsetDateTime;

/**
 * # The RemoteUser Object ### Description The &#x60;RemoteUser&#x60; object is used to represent a third party user.  ### Usage Example Fetch from the &#x60;LIST RemoteUsers&#x60; endpoint to show all users for a third party.
 */
@ApiModel(description = "# The RemoteUser Object ### Description The `RemoteUser` object is used to represent a third party user.  ### Usage Example Fetch from the `LIST RemoteUsers` endpoint to show all users for a third party.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-13T23:13:49.108123Z[Etc/UTC]")
public class RemoteUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private OffsetDateTime remoteCreatedAt;

  public static final String SERIALIZED_NAME_ACCESS_ROLE = "access_role";
  @SerializedName(SERIALIZED_NAME_ACCESS_ROLE)
  private AccessRoleEnum accessRole;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b82302de-852e-4e60-b050-edf9da3b7c02", value = "")

  public UUID getId() {
    return id;
  }




  public RemoteUser remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "344321", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public RemoteUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Shensi", value = "The user's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public RemoteUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ding", value = "The user's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public RemoteUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hello@merge.dev", value = "The user's email.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public RemoteUser disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the user&#39;s account had been disabled.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user's account had been disabled.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public RemoteUser remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * When the third party&#39;s user was created.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T00:00Z", value = "When the third party's user was created.")

  public OffsetDateTime getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public RemoteUser accessRole(AccessRoleEnum accessRole) {
    
    this.accessRole = accessRole;
    return this;
  }

   /**
   * The user&#39;s role.
   * @return accessRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUPER_ADMIN", value = "The user's role.")

  public AccessRoleEnum getAccessRole() {
    return accessRole;
  }


  public void setAccessRole(AccessRoleEnum accessRole) {
    this.accessRole = accessRole;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/users\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    RemoteUser remoteUser = (RemoteUser) o;
    return Objects.equals(this.id, remoteUser.id) &&
        Objects.equals(this.remoteId, remoteUser.remoteId) &&
        Objects.equals(this.firstName, remoteUser.firstName) &&
        Objects.equals(this.lastName, remoteUser.lastName) &&
        Objects.equals(this.email, remoteUser.email) &&
        Objects.equals(this.disabled, remoteUser.disabled) &&
        Objects.equals(this.remoteCreatedAt, remoteUser.remoteCreatedAt) &&
        Objects.equals(this.accessRole, remoteUser.accessRole) &&
        Objects.equals(this.remoteData, remoteUser.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, firstName, lastName, email, disabled, remoteCreatedAt, accessRole, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    accessRole: ").append(toIndentedString(accessRole)).append("\n");
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

