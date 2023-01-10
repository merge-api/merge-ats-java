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
import merge_ats_client.model.CommonModelScopesPutInnerDeserializerRequest;

/**
 * CommonModelScopesUpdateSerializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T20:48:58.736658Z[Etc/UTC]")
public class CommonModelScopesUpdateSerializer {
  public static final String SERIALIZED_NAME_COMMON_MODELS = "common_models";
  @SerializedName(SERIALIZED_NAME_COMMON_MODELS)
  private List<CommonModelScopesPutInnerDeserializerRequest> commonModels = new ArrayList<CommonModelScopesPutInnerDeserializerRequest>();


  public CommonModelScopesUpdateSerializer commonModels(List<CommonModelScopesPutInnerDeserializerRequest> commonModels) {
    
    this.commonModels = commonModels;
    return this;
  }

  public CommonModelScopesUpdateSerializer addCommonModelsItem(CommonModelScopesPutInnerDeserializerRequest commonModelsItem) {
    this.commonModels.add(commonModelsItem);
    return this;
  }

   /**
   * The common model scopes to update.
   * @return commonModels
  **/
  @ApiModelProperty(required = true, value = "The common model scopes to update.")

  public List<CommonModelScopesPutInnerDeserializerRequest> getCommonModels() {
    return commonModels;
  }


  public void setCommonModels(List<CommonModelScopesPutInnerDeserializerRequest> commonModels) {
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
    CommonModelScopesUpdateSerializer commonModelScopesUpdateSerializer = (CommonModelScopesUpdateSerializer) o;
    return Objects.equals(this.commonModels, commonModelScopesUpdateSerializer.commonModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonModelScopesUpdateSerializer {\n");
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
