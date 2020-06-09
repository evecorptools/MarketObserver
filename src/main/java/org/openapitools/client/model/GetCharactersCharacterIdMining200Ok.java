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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetCharactersCharacterIdMining200Ok.JSON_PROPERTY_DATE,
  GetCharactersCharacterIdMining200Ok.JSON_PROPERTY_QUANTITY,
  GetCharactersCharacterIdMining200Ok.JSON_PROPERTY_SOLAR_SYSTEM_ID,
  GetCharactersCharacterIdMining200Ok.JSON_PROPERTY_TYPE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCharactersCharacterIdMining200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_SOLAR_SYSTEM_ID = "solar_system_id";
  private Integer solarSystemId;

  public static final String JSON_PROPERTY_TYPE_ID = "type_id";
  private Integer typeId;


  public GetCharactersCharacterIdMining200Ok date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * date string
   * @return date
  **/
  @ApiModelProperty(required = true, value = "date string")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public GetCharactersCharacterIdMining200Ok quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "quantity integer")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public GetCharactersCharacterIdMining200Ok solarSystemId(Integer solarSystemId) {
    
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


  public GetCharactersCharacterIdMining200Ok typeId(Integer typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "type_id integer")
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    GetCharactersCharacterIdMining200Ok getCharactersCharacterIdMining200Ok = (GetCharactersCharacterIdMining200Ok) o;
    return Objects.equals(this.date, getCharactersCharacterIdMining200Ok.date) &&
        Objects.equals(this.quantity, getCharactersCharacterIdMining200Ok.quantity) &&
        Objects.equals(this.solarSystemId, getCharactersCharacterIdMining200Ok.solarSystemId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdMining200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, quantity, solarSystemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMining200Ok {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

