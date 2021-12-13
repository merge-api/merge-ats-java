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
 * ValidationProblem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-13T23:26:10.470036Z[Etc/UTC]")
public class ValidationProblem {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_PROBLEM_TYPE = "problem_type";
  @SerializedName(SERIALIZED_NAME_PROBLEM_TYPE)
  private String problemType;


   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }




  public ValidationProblem title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ValidationProblem detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ValidationProblem problemType(String problemType) {
    
    this.problemType = problemType;
    return this;
  }

   /**
   * Get problemType
   * @return problemType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProblemType() {
    return problemType;
  }


  public void setProblemType(String problemType) {
    this.problemType = problemType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationProblem validationProblem = (ValidationProblem) o;
    return Objects.equals(this.source, validationProblem.source) &&
        Objects.equals(this.title, validationProblem.title) &&
        Objects.equals(this.detail, validationProblem.detail) &&
        Objects.equals(this.problemType, validationProblem.problemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, title, detail, problemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationProblem {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    problemType: ").append(toIndentedString(problemType)).append("\n");
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
