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
import merge_ats_client.model.Candidate;
import merge_ats_client.model.ValidationProblem;

/**
 * CandidateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T21:09:25.697907Z[Etc/UTC]")
public class CandidateResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ValidationProblem> errors = new ArrayList<ValidationProblem>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ValidationProblem> warnings = new ArrayList<ValidationProblem>();

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private Candidate model;


  public CandidateResponse errors(List<ValidationProblem> errors) {
    
    this.errors = errors;
    return this;
  }

  public CandidateResponse addErrorsItem(ValidationProblem errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationProblem> getErrors() {
    return errors;
  }


  public void setErrors(List<ValidationProblem> errors) {
    this.errors = errors;
  }


  public CandidateResponse warnings(List<ValidationProblem> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public CandidateResponse addWarningsItem(ValidationProblem warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationProblem> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<ValidationProblem> warnings) {
    this.warnings = warnings;
  }


  public CandidateResponse model(Candidate model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")

  public Candidate getModel() {
    return model;
  }


  public void setModel(Candidate model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateResponse candidateResponse = (CandidateResponse) o;
    return Objects.equals(this.errors, candidateResponse.errors) &&
        Objects.equals(this.warnings, candidateResponse.warnings) &&
        Objects.equals(this.model, candidateResponse.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

