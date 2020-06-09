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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetCorporationCorporationIdMiningExtractions200Ok.JSON_PROPERTY_CHUNK_ARRIVAL_TIME,
  GetCorporationCorporationIdMiningExtractions200Ok.JSON_PROPERTY_EXTRACTION_START_TIME,
  GetCorporationCorporationIdMiningExtractions200Ok.JSON_PROPERTY_MOON_ID,
  GetCorporationCorporationIdMiningExtractions200Ok.JSON_PROPERTY_NATURAL_DECAY_TIME,
  GetCorporationCorporationIdMiningExtractions200Ok.JSON_PROPERTY_STRUCTURE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCorporationCorporationIdMiningExtractions200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CHUNK_ARRIVAL_TIME = "chunk_arrival_time";
  private OffsetDateTime chunkArrivalTime;

  public static final String JSON_PROPERTY_EXTRACTION_START_TIME = "extraction_start_time";
  private OffsetDateTime extractionStartTime;

  public static final String JSON_PROPERTY_MOON_ID = "moon_id";
  private Integer moonId;

  public static final String JSON_PROPERTY_NATURAL_DECAY_TIME = "natural_decay_time";
  private OffsetDateTime naturalDecayTime;

  public static final String JSON_PROPERTY_STRUCTURE_ID = "structure_id";
  private Long structureId;


  public GetCorporationCorporationIdMiningExtractions200Ok chunkArrivalTime(OffsetDateTime chunkArrivalTime) {
    
    this.chunkArrivalTime = chunkArrivalTime;
    return this;
  }

   /**
   * The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. 
   * @return chunkArrivalTime
  **/
  @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. ")
  @JsonProperty(JSON_PROPERTY_CHUNK_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getChunkArrivalTime() {
    return chunkArrivalTime;
  }


  public void setChunkArrivalTime(OffsetDateTime chunkArrivalTime) {
    this.chunkArrivalTime = chunkArrivalTime;
  }


  public GetCorporationCorporationIdMiningExtractions200Ok extractionStartTime(OffsetDateTime extractionStartTime) {
    
    this.extractionStartTime = extractionStartTime;
    return this;
  }

   /**
   * The time at which the current extraction was initiated. 
   * @return extractionStartTime
  **/
  @ApiModelProperty(required = true, value = "The time at which the current extraction was initiated. ")
  @JsonProperty(JSON_PROPERTY_EXTRACTION_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExtractionStartTime() {
    return extractionStartTime;
  }


  public void setExtractionStartTime(OffsetDateTime extractionStartTime) {
    this.extractionStartTime = extractionStartTime;
  }


  public GetCorporationCorporationIdMiningExtractions200Ok moonId(Integer moonId) {
    
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


  public GetCorporationCorporationIdMiningExtractions200Ok naturalDecayTime(OffsetDateTime naturalDecayTime) {
    
    this.naturalDecayTime = naturalDecayTime;
    return this;
  }

   /**
   * The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. 
   * @return naturalDecayTime
  **/
  @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. ")
  @JsonProperty(JSON_PROPERTY_NATURAL_DECAY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getNaturalDecayTime() {
    return naturalDecayTime;
  }


  public void setNaturalDecayTime(OffsetDateTime naturalDecayTime) {
    this.naturalDecayTime = naturalDecayTime;
  }


  public GetCorporationCorporationIdMiningExtractions200Ok structureId(Long structureId) {
    
    this.structureId = structureId;
    return this;
  }

   /**
   * structure_id integer
   * @return structureId
  **/
  @ApiModelProperty(required = true, value = "structure_id integer")
  @JsonProperty(JSON_PROPERTY_STRUCTURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStructureId() {
    return structureId;
  }


  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningExtractions200Ok getCorporationCorporationIdMiningExtractions200Ok = (GetCorporationCorporationIdMiningExtractions200Ok) o;
    return Objects.equals(this.chunkArrivalTime, getCorporationCorporationIdMiningExtractions200Ok.chunkArrivalTime) &&
        Objects.equals(this.extractionStartTime, getCorporationCorporationIdMiningExtractions200Ok.extractionStartTime) &&
        Objects.equals(this.moonId, getCorporationCorporationIdMiningExtractions200Ok.moonId) &&
        Objects.equals(this.naturalDecayTime, getCorporationCorporationIdMiningExtractions200Ok.naturalDecayTime) &&
        Objects.equals(this.structureId, getCorporationCorporationIdMiningExtractions200Ok.structureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkArrivalTime, extractionStartTime, moonId, naturalDecayTime, structureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningExtractions200Ok {\n");
    sb.append("    chunkArrivalTime: ").append(toIndentedString(chunkArrivalTime)).append("\n");
    sb.append("    extractionStartTime: ").append(toIndentedString(extractionStartTime)).append("\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    naturalDecayTime: ").append(toIndentedString(naturalDecayTime)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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

