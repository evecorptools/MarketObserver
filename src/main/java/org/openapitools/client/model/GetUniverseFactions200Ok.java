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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetUniverseFactions200Ok.JSON_PROPERTY_CORPORATION_ID,
  GetUniverseFactions200Ok.JSON_PROPERTY_DESCRIPTION,
  GetUniverseFactions200Ok.JSON_PROPERTY_FACTION_ID,
  GetUniverseFactions200Ok.JSON_PROPERTY_IS_UNIQUE,
  GetUniverseFactions200Ok.JSON_PROPERTY_MILITIA_CORPORATION_ID,
  GetUniverseFactions200Ok.JSON_PROPERTY_NAME,
  GetUniverseFactions200Ok.JSON_PROPERTY_SIZE_FACTOR,
  GetUniverseFactions200Ok.JSON_PROPERTY_SOLAR_SYSTEM_ID,
  GetUniverseFactions200Ok.JSON_PROPERTY_STATION_COUNT,
  GetUniverseFactions200Ok.JSON_PROPERTY_STATION_SYSTEM_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetUniverseFactions200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CORPORATION_ID = "corporation_id";
  private Integer corporationId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FACTION_ID = "faction_id";
  private Integer factionId;

  public static final String JSON_PROPERTY_IS_UNIQUE = "is_unique";
  private Boolean isUnique;

  public static final String JSON_PROPERTY_MILITIA_CORPORATION_ID = "militia_corporation_id";
  private Integer militiaCorporationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE_FACTOR = "size_factor";
  private Float sizeFactor;

  public static final String JSON_PROPERTY_SOLAR_SYSTEM_ID = "solar_system_id";
  private Integer solarSystemId;

  public static final String JSON_PROPERTY_STATION_COUNT = "station_count";
  private Integer stationCount;

  public static final String JSON_PROPERTY_STATION_SYSTEM_COUNT = "station_system_count";
  private Integer stationSystemCount;


  public GetUniverseFactions200Ok corporationId(Integer corporationId) {
    
    this.corporationId = corporationId;
    return this;
  }

   /**
   * corporation_id integer
   * @return corporationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "corporation_id integer")
  @JsonProperty(JSON_PROPERTY_CORPORATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCorporationId() {
    return corporationId;
  }


  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }


  public GetUniverseFactions200Ok description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description string")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetUniverseFactions200Ok factionId(Integer factionId) {
    
    this.factionId = factionId;
    return this;
  }

   /**
   * faction_id integer
   * @return factionId
  **/
  @ApiModelProperty(required = true, value = "faction_id integer")
  @JsonProperty(JSON_PROPERTY_FACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFactionId() {
    return factionId;
  }


  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  public GetUniverseFactions200Ok isUnique(Boolean isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * is_unique boolean
   * @return isUnique
  **/
  @ApiModelProperty(required = true, value = "is_unique boolean")
  @JsonProperty(JSON_PROPERTY_IS_UNIQUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }


  public GetUniverseFactions200Ok militiaCorporationId(Integer militiaCorporationId) {
    
    this.militiaCorporationId = militiaCorporationId;
    return this;
  }

   /**
   * militia_corporation_id integer
   * @return militiaCorporationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "militia_corporation_id integer")
  @JsonProperty(JSON_PROPERTY_MILITIA_CORPORATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMilitiaCorporationId() {
    return militiaCorporationId;
  }


  public void setMilitiaCorporationId(Integer militiaCorporationId) {
    this.militiaCorporationId = militiaCorporationId;
  }


  public GetUniverseFactions200Ok name(String name) {
    
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


  public GetUniverseFactions200Ok sizeFactor(Float sizeFactor) {
    
    this.sizeFactor = sizeFactor;
    return this;
  }

   /**
   * size_factor number
   * @return sizeFactor
  **/
  @ApiModelProperty(required = true, value = "size_factor number")
  @JsonProperty(JSON_PROPERTY_SIZE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSizeFactor() {
    return sizeFactor;
  }


  public void setSizeFactor(Float sizeFactor) {
    this.sizeFactor = sizeFactor;
  }


  public GetUniverseFactions200Ok solarSystemId(Integer solarSystemId) {
    
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "solar_system_id integer")
  @JsonProperty(JSON_PROPERTY_SOLAR_SYSTEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSolarSystemId() {
    return solarSystemId;
  }


  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }


  public GetUniverseFactions200Ok stationCount(Integer stationCount) {
    
    this.stationCount = stationCount;
    return this;
  }

   /**
   * station_count integer
   * @return stationCount
  **/
  @ApiModelProperty(required = true, value = "station_count integer")
  @JsonProperty(JSON_PROPERTY_STATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStationCount() {
    return stationCount;
  }


  public void setStationCount(Integer stationCount) {
    this.stationCount = stationCount;
  }


  public GetUniverseFactions200Ok stationSystemCount(Integer stationSystemCount) {
    
    this.stationSystemCount = stationSystemCount;
    return this;
  }

   /**
   * station_system_count integer
   * @return stationSystemCount
  **/
  @ApiModelProperty(required = true, value = "station_system_count integer")
  @JsonProperty(JSON_PROPERTY_STATION_SYSTEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStationSystemCount() {
    return stationSystemCount;
  }


  public void setStationSystemCount(Integer stationSystemCount) {
    this.stationSystemCount = stationSystemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseFactions200Ok getUniverseFactions200Ok = (GetUniverseFactions200Ok) o;
    return Objects.equals(this.corporationId, getUniverseFactions200Ok.corporationId) &&
        Objects.equals(this.description, getUniverseFactions200Ok.description) &&
        Objects.equals(this.factionId, getUniverseFactions200Ok.factionId) &&
        Objects.equals(this.isUnique, getUniverseFactions200Ok.isUnique) &&
        Objects.equals(this.militiaCorporationId, getUniverseFactions200Ok.militiaCorporationId) &&
        Objects.equals(this.name, getUniverseFactions200Ok.name) &&
        Objects.equals(this.sizeFactor, getUniverseFactions200Ok.sizeFactor) &&
        Objects.equals(this.solarSystemId, getUniverseFactions200Ok.solarSystemId) &&
        Objects.equals(this.stationCount, getUniverseFactions200Ok.stationCount) &&
        Objects.equals(this.stationSystemCount, getUniverseFactions200Ok.stationSystemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, description, factionId, isUnique, militiaCorporationId, name, sizeFactor, solarSystemId, stationCount, stationSystemCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseFactions200Ok {\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    militiaCorporationId: ").append(toIndentedString(militiaCorporationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeFactor: ").append(toIndentedString(sizeFactor)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    stationCount: ").append(toIndentedString(stationCount)).append("\n");
    sb.append("    stationSystemCount: ").append(toIndentedString(stationSystemCount)).append("\n");
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

