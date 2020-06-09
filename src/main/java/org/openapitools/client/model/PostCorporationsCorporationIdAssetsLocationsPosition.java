/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.3.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * position object
 */
@ApiModel(description = "position object")
@JsonPropertyOrder({
  PostCorporationsCorporationIdAssetsLocationsPosition.JSON_PROPERTY_X,
  PostCorporationsCorporationIdAssetsLocationsPosition.JSON_PROPERTY_Y,
  PostCorporationsCorporationIdAssetsLocationsPosition.JSON_PROPERTY_Z
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class PostCorporationsCorporationIdAssetsLocationsPosition implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public static final String JSON_PROPERTY_Z = "z";
  private Double z;


  public PostCorporationsCorporationIdAssetsLocationsPosition x(Double x) {
    
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(required = true, value = "x number")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getX() {
    return x;
  }


  public void setX(Double x) {
    this.x = x;
  }


  public PostCorporationsCorporationIdAssetsLocationsPosition y(Double y) {
    
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(required = true, value = "y number")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getY() {
    return y;
  }


  public void setY(Double y) {
    this.y = y;
  }


  public PostCorporationsCorporationIdAssetsLocationsPosition z(Double z) {
    
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(required = true, value = "z number")
  @JsonProperty(JSON_PROPERTY_Z)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getZ() {
    return z;
  }


  public void setZ(Double z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCorporationsCorporationIdAssetsLocationsPosition postCorporationsCorporationIdAssetsLocationsPosition = (PostCorporationsCorporationIdAssetsLocationsPosition) o;
    return Objects.equals(this.x, postCorporationsCorporationIdAssetsLocationsPosition.x) &&
        Objects.equals(this.y, postCorporationsCorporationIdAssetsLocationsPosition.y) &&
        Objects.equals(this.z, postCorporationsCorporationIdAssetsLocationsPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCorporationsCorporationIdAssetsLocationsPosition {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

