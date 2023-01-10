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
import merge_ats_client.model.CommonModelScopesDisabledModels;
import merge_ats_client.model.CommonModelScopesScope;

/**
 * CommonModelScopes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:13:14.599893Z[Etc/UTC]")
public class CommonModelScopes {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private CommonModelScopesScope scope;

  public static final String SERIALIZED_NAME_COMMON_MODELS = "common_models";
  @SerializedName(SERIALIZED_NAME_COMMON_MODELS)
  private List<CommonModelScopesDisabledModels> commonModels = new ArrayList<CommonModelScopesDisabledModels>();


  public CommonModelScopes scope(CommonModelScopesScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "")

  public CommonModelScopesScope getScope() {
    return scope;
  }


  public void setScope(CommonModelScopesScope scope) {
    this.scope = scope;
  }


  public CommonModelScopes commonModels(List<CommonModelScopesDisabledModels> commonModels) {
    
    this.commonModels = commonModels;
    return this;
  }

  public CommonModelScopes addCommonModelsItem(CommonModelScopesDisabledModels commonModelsItem) {
    this.commonModels.add(commonModelsItem);
    return this;
  }

   /**
   * Get commonModels
   * @return commonModels
  **/
  @ApiModelProperty(example = "[{\"model_name\":\"Employee\",\"model_id\":\"hris.Employee\",\"enabled_actions\":[\"READ\",\"WRITE\"],\"is_disabled\":false,\"disabled_fields\":[\"employment\"]},{\"model_name\":\"Employment\",\"model_id\":\"hris.Employment\",\"enabled_actions\":[],\"is_disabled\":true,\"disabled_fields\":[]}]", required = true, value = "")

  public List<CommonModelScopesDisabledModels> getCommonModels() {
    return commonModels;
  }


  public void setCommonModels(List<CommonModelScopesDisabledModels> commonModels) {
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
    CommonModelScopes commonModelScopes = (CommonModelScopes) o;
    return Objects.equals(this.scope, commonModelScopes.scope) &&
        Objects.equals(this.commonModels, commonModelScopes.commonModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, commonModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonModelScopes {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    commonModels: ").append(toIndentedString(commonModels)).append("\n");
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

