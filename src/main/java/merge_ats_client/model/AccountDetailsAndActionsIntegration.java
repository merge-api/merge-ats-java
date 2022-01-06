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
import merge_ats_client.model.ModelOperation;

/**
 * AccountDetailsAndActionsIntegration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-06T18:40:10.538858Z[Etc/UTC]")
public class AccountDetailsAndActionsIntegration {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = new ArrayList<String>();

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_SQUARE_IMAGE = "square_image";
  @SerializedName(SERIALIZED_NAME_SQUARE_IMAGE)
  private String squareImage;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_PASSTHROUGH_AVAILABLE = "passthrough_available";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH_AVAILABLE)
  private Boolean passthroughAvailable;

  public static final String SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS = "available_model_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS)
  private List<ModelOperation> availableModelOperations = null;


  public AccountDetailsAndActionsIntegration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountDetailsAndActionsIntegration categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public AccountDetailsAndActionsIntegration addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public AccountDetailsAndActionsIntegration image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public AccountDetailsAndActionsIntegration squareImage(String squareImage) {
    
    this.squareImage = squareImage;
    return this;
  }

   /**
   * Get squareImage
   * @return squareImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSquareImage() {
    return squareImage;
  }


  public void setSquareImage(String squareImage) {
    this.squareImage = squareImage;
  }


  public AccountDetailsAndActionsIntegration color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(required = true, value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public AccountDetailsAndActionsIntegration slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public AccountDetailsAndActionsIntegration passthroughAvailable(Boolean passthroughAvailable) {
    
    this.passthroughAvailable = passthroughAvailable;
    return this;
  }

   /**
   * Get passthroughAvailable
   * @return passthroughAvailable
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getPassthroughAvailable() {
    return passthroughAvailable;
  }


  public void setPassthroughAvailable(Boolean passthroughAvailable) {
    this.passthroughAvailable = passthroughAvailable;
  }


  public AccountDetailsAndActionsIntegration availableModelOperations(List<ModelOperation> availableModelOperations) {
    
    this.availableModelOperations = availableModelOperations;
    return this;
  }

  public AccountDetailsAndActionsIntegration addAvailableModelOperationsItem(ModelOperation availableModelOperationsItem) {
    if (this.availableModelOperations == null) {
      this.availableModelOperations = new ArrayList<ModelOperation>();
    }
    this.availableModelOperations.add(availableModelOperationsItem);
    return this;
  }

   /**
   * Get availableModelOperations
   * @return availableModelOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelOperation> getAvailableModelOperations() {
    return availableModelOperations;
  }


  public void setAvailableModelOperations(List<ModelOperation> availableModelOperations) {
    this.availableModelOperations = availableModelOperations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsAndActionsIntegration accountDetailsAndActionsIntegration = (AccountDetailsAndActionsIntegration) o;
    return Objects.equals(this.name, accountDetailsAndActionsIntegration.name) &&
        Objects.equals(this.categories, accountDetailsAndActionsIntegration.categories) &&
        Objects.equals(this.image, accountDetailsAndActionsIntegration.image) &&
        Objects.equals(this.squareImage, accountDetailsAndActionsIntegration.squareImage) &&
        Objects.equals(this.color, accountDetailsAndActionsIntegration.color) &&
        Objects.equals(this.slug, accountDetailsAndActionsIntegration.slug) &&
        Objects.equals(this.passthroughAvailable, accountDetailsAndActionsIntegration.passthroughAvailable) &&
        Objects.equals(this.availableModelOperations, accountDetailsAndActionsIntegration.availableModelOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, image, squareImage, color, slug, passthroughAvailable, availableModelOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsAndActionsIntegration {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    squareImage: ").append(toIndentedString(squareImage)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    passthroughAvailable: ").append(toIndentedString(passthroughAvailable)).append("\n");
    sb.append("    availableModelOperations: ").append(toIndentedString(availableModelOperations)).append("\n");
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

