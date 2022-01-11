
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
 * AttachmentResponseRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T15:52:25.875887Z[Etc/UTC]")
public class AttachmentResponseRawJson {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private JsonElement model;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private JsonElement warnings;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private JsonElement errors;

  private transient JSON serializer;

  public AttachmentResponseRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public AttachmentResponseRawJson model(Attachment model) {
    this.model = this.serializer.getGson().toJsonTree(model);
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getModel() {
    return model;
  }
  public void setModel(JsonElement model) {
    this.model = model;
  }

  public AttachmentResponseRawJson warnings(List<WarningValidationProblem> warnings) {
    this.warnings = this.serializer.getGson().toJsonTree(warnings);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getWarnings() {
    return warnings;
  }
  public void setWarnings(JsonElement warnings) {
    this.warnings = warnings;
  }

  public AttachmentResponseRawJson errors(List<ErrorValidationProblem> errors) {
    this.errors = this.serializer.getGson().toJsonTree(errors);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getErrors() {
    return errors;
  }
  public void setErrors(JsonElement errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponseRawJson attachmentResponse = (AttachmentResponseRawJson) o;
    return Objects.equals(this.model.getAsString(), attachmentResponse.model.getAsString()) &&
        Objects.equals(this.warnings.getAsString(), attachmentResponse.warnings.getAsString()) &&
        Objects.equals(this.errors.getAsString(), attachmentResponse.errors.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(model, warnings, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentResponseRawJson {\n");
    sb.append("    model: ").append(toIndentedString(model.getAsString())).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings.getAsString())).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors.getAsString())).append("\n");
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


