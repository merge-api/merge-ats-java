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

/**
 * ValidationProblemSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:32:36.773068Z[Etc/UTC]")
public class ValidationProblemSource {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  private String pointer;


  public ValidationProblemSource pointer(String pointer) {
    
    this.pointer = pointer;
    return this;
  }

   /**
   * Get pointer
   * @return pointer
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPointer() {
    return pointer;
  }


  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationProblemSource validationProblemSource = (ValidationProblemSource) o;
    return Objects.equals(this.pointer, validationProblemSource.pointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationProblemSource {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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

