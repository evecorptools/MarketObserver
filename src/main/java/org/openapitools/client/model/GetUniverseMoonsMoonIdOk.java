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
import org.openapitools.client.model.GetUniverseMoonsMoonIdPosition;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetUniverseMoonsMoonIdOk.JSON_PROPERTY_MOON_ID,
  GetUniverseMoonsMoonIdOk.JSON_PROPERTY_NAME,
  GetUniverseMoonsMoonIdOk.JSON_PROPERTY_POSITION,
  GetUniverseMoonsMoonIdOk.JSON_PROPERTY_SYSTEM_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetUniverseMoonsMoonIdOk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MOON_ID = "moon_id";
  private Integer moonId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSITION = "position";
  private GetUniverseMoonsMoonIdPosition position;

  public static final String JSON_PROPERTY_SYSTEM_ID = "system_id";
  private Integer systemId;


  public GetUniverseMoonsMoonIdOk moonId(Integer moonId) {
    
    this.moonId = moonId;
    return this;
  }

   /**
   * moon_id integer
   * @return moonId
  **/
  @ApiModelProperty(required = true, value = "moon_id integer")
  @JsonProperty(JSON_PROPERTY_MOON_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMoonId() {
    return moonId;
  }


  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }


  public GetUniverseMoonsMoonIdOk name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name string")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetUniverseMoonsMoonIdOk position(GetUniverseMoonsMoonIdPosition position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetUniverseMoonsMoonIdPosition getPosition() {
    return position;
  }


  public void setPosition(GetUniverseMoonsMoonIdPosition position) {
    this.position = position;
  }


  public GetUniverseMoonsMoonIdOk systemId(Integer systemId) {
    
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this moon is in
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The solar system this moon is in")
  @JsonProperty(JSON_PROPERTY_SYSTEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSystemId() {
    return systemId;
  }


  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseMoonsMoonIdOk getUniverseMoonsMoonIdOk = (GetUniverseMoonsMoonIdOk) o;
    return Objects.equals(this.moonId, getUniverseMoonsMoonIdOk.moonId) &&
        Objects.equals(this.name, getUniverseMoonsMoonIdOk.name) &&
        Objects.equals(this.position, getUniverseMoonsMoonIdOk.position) &&
        Objects.equals(this.systemId, getUniverseMoonsMoonIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moonId, name, position, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseMoonsMoonIdOk {\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

