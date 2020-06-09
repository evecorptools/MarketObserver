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
import org.openapitools.client.model.GetUniverseStructuresStructureIdPosition;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetUniverseStructuresStructureIdOk.JSON_PROPERTY_NAME,
  GetUniverseStructuresStructureIdOk.JSON_PROPERTY_OWNER_ID,
  GetUniverseStructuresStructureIdOk.JSON_PROPERTY_POSITION,
  GetUniverseStructuresStructureIdOk.JSON_PROPERTY_SOLAR_SYSTEM_ID,
  GetUniverseStructuresStructureIdOk.JSON_PROPERTY_TYPE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetUniverseStructuresStructureIdOk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_POSITION = "position";
  private GetUniverseStructuresStructureIdPosition position;

  public static final String JSON_PROPERTY_SOLAR_SYSTEM_ID = "solar_system_id";
  private Integer solarSystemId;

  public static final String JSON_PROPERTY_TYPE_ID = "type_id";
  private Integer typeId;


  public GetUniverseStructuresStructureIdOk name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of the structure
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The full name of the structure")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetUniverseStructuresStructureIdOk ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the corporation who owns this particular structure
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the corporation who owns this particular structure")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  public GetUniverseStructuresStructureIdOk position(GetUniverseStructuresStructureIdPosition position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetUniverseStructuresStructureIdPosition getPosition() {
    return position;
  }


  public void setPosition(GetUniverseStructuresStructureIdPosition position) {
    this.position = position;
  }


  public GetUniverseStructuresStructureIdOk solarSystemId(Integer solarSystemId) {
    
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  @JsonProperty(JSON_PROPERTY_SOLAR_SYSTEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSolarSystemId() {
    return solarSystemId;
  }


  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }


  public GetUniverseStructuresStructureIdOk typeId(Integer typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type_id integer")
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTypeId() {
    return typeId;
  }


  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStructuresStructureIdOk getUniverseStructuresStructureIdOk = (GetUniverseStructuresStructureIdOk) o;
    return Objects.equals(this.name, getUniverseStructuresStructureIdOk.name) &&
        Objects.equals(this.ownerId, getUniverseStructuresStructureIdOk.ownerId) &&
        Objects.equals(this.position, getUniverseStructuresStructureIdOk.position) &&
        Objects.equals(this.solarSystemId, getUniverseStructuresStructureIdOk.solarSystemId) &&
        Objects.equals(this.typeId, getUniverseStructuresStructureIdOk.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ownerId, position, solarSystemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStructuresStructureIdOk {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

