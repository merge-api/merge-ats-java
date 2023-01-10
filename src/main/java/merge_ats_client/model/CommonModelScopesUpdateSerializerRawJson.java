
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
 * CommonModelScopesUpdateSerializerRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class CommonModelScopesUpdateSerializerRawJson {
  public static final String SERIALIZED_NAME_COMMON_MODELS = "common_models";
  @SerializedName(SERIALIZED_NAME_COMMON_MODELS)
  private JsonElement commonModels;

  private transient JSON serializer;

  public CommonModelScopesUpdateSerializerRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public CommonModelScopesUpdateSerializerRawJson commonModels(List<CommonModelScopesPutInnerDeserializerRequest> commonModels) {
    this.commonModels = this.serializer.getGson().toJsonTree(commonModels);
    return this;
  }

   /**
   * The common model scopes to update.
   * @return commonModels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The common model scopes to update.")

  public JsonElement getCommonModels() {
    return commonModels;
  }
  public void setCommonModels(JsonElement commonModels) {
    this.commonModels = commonModels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonModelScopesUpdateSerializerRawJson commonModelScopesUpdateSerializer = (CommonModelScopesUpdateSerializerRawJson) o;
    return Objects.equals(this.commonModels.getAsString(), commonModelScopesUpdateSerializer.commonModels.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(commonModels);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonModelScopesUpdateSerializerRawJson {\n");
    sb.append("    commonModels: ").append(toIndentedString(commonModels.getAsString())).append("\n");
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


