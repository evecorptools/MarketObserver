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
  GetCorporationsCorporationIdAlliancehistory200Ok.JSON_PROPERTY_ALLIANCE_ID,
  GetCorporationsCorporationIdAlliancehistory200Ok.JSON_PROPERTY_IS_DELETED,
  GetCorporationsCorporationIdAlliancehistory200Ok.JSON_PROPERTY_RECORD_ID,
  GetCorporationsCorporationIdAlliancehistory200Ok.JSON_PROPERTY_START_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCorporationsCorporationIdAlliancehistory200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ALLIANCE_ID = "alliance_id";
  private Integer allianceId;

  public static final String JSON_PROPERTY_IS_DELETED = "is_deleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private Integer recordId;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;


  public GetCorporationsCorporationIdAlliancehistory200Ok allianceId(Integer allianceId) {
    
    this.allianceId = allianceId;
    return this;
  }

   /**
   * alliance_id integer
   * @return allianceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "alliance_id integer")
  @JsonProperty(JSON_PROPERTY_ALLIANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllianceId() {
    return allianceId;
  }


  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }


  public GetCorporationsCorporationIdAlliancehistory200Ok isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * True if the alliance has been closed
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the alliance has been closed")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public GetCorporationsCorporationIdAlliancehistory200Ok recordId(Integer recordId) {
    
    this.recordId = recordId;
    return this;
  }

   /**
   * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
   * @return recordId
  **/
  @ApiModelProperty(required = true, value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRecordId() {
    return recordId;
  }


  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }


  public GetCorporationsCorporationIdAlliancehistory200Ok startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * start_date string
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "start_date string")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdAlliancehistory200Ok getCorporationsCorporationIdAlliancehistory200Ok = (GetCorporationsCorporationIdAlliancehistory200Ok) o;
    return Objects.equals(this.allianceId, getCorporationsCorporationIdAlliancehistory200Ok.allianceId) &&
        Objects.equals(this.isDeleted, getCorporationsCorporationIdAlliancehistory200Ok.isDeleted) &&
        Objects.equals(this.recordId, getCorporationsCorporationIdAlliancehistory200Ok.recordId) &&
        Objects.equals(this.startDate, getCorporationsCorporationIdAlliancehistory200Ok.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, isDeleted, recordId, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdAlliancehistory200Ok {\n");
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

