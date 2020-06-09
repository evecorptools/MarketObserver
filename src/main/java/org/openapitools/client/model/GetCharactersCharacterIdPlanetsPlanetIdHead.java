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
 * head object
 */
@ApiModel(description = "head object")
@JsonPropertyOrder({
  GetCharactersCharacterIdPlanetsPlanetIdHead.JSON_PROPERTY_HEAD_ID,
  GetCharactersCharacterIdPlanetsPlanetIdHead.JSON_PROPERTY_LATITUDE,
  GetCharactersCharacterIdPlanetsPlanetIdHead.JSON_PROPERTY_LONGITUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCharactersCharacterIdPlanetsPlanetIdHead implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEAD_ID = "head_id";
  private Integer headId;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Float latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Float longitude;


  public GetCharactersCharacterIdPlanetsPlanetIdHead headId(Integer headId) {
    
    this.headId = headId;
    return this;
  }

   /**
   * head_id integer
   * minimum: 0
   * maximum: 9
   * @return headId
  **/
  @ApiModelProperty(required = true, value = "head_id integer")
  @JsonProperty(JSON_PROPERTY_HEAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHeadId() {
    return headId;
  }


  public void setHeadId(Integer headId) {
    this.headId = headId;
  }


  public GetCharactersCharacterIdPlanetsPlanetIdHead latitude(Float latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * latitude number
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "latitude number")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getLatitude() {
    return latitude;
  }


  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }


  public GetCharactersCharacterIdPlanetsPlanetIdHead longitude(Float longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * longitude number
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "longitude number")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getLongitude() {
    return longitude;
  }


  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdHead getCharactersCharacterIdPlanetsPlanetIdHead = (GetCharactersCharacterIdPlanetsPlanetIdHead) o;
    return Objects.equals(this.headId, getCharactersCharacterIdPlanetsPlanetIdHead.headId) &&
        Objects.equals(this.latitude, getCharactersCharacterIdPlanetsPlanetIdHead.latitude) &&
        Objects.equals(this.longitude, getCharactersCharacterIdPlanetsPlanetIdHead.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headId, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdHead {\n");
    sb.append("    headId: ").append(toIndentedString(headId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

