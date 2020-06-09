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
 * last_week object
 */
@ApiModel(description = "last_week object")
@JsonPropertyOrder({
  GetFwLeaderboardsLastWeekLastWeek1.JSON_PROPERTY_AMOUNT,
  GetFwLeaderboardsLastWeekLastWeek1.JSON_PROPERTY_FACTION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetFwLeaderboardsLastWeekLastWeek1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_FACTION_ID = "faction_id";
  private Integer factionId;


  public GetFwLeaderboardsLastWeekLastWeek1 amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of victory points
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of victory points")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public GetFwLeaderboardsLastWeekLastWeek1 factionId(Integer factionId) {
    
    this.factionId = factionId;
    return this;
  }

   /**
   * faction_id integer
   * @return factionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "faction_id integer")
  @JsonProperty(JSON_PROPERTY_FACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFactionId() {
    return factionId;
  }


  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsLastWeekLastWeek1 getFwLeaderboardsLastWeekLastWeek1 = (GetFwLeaderboardsLastWeekLastWeek1) o;
    return Objects.equals(this.amount, getFwLeaderboardsLastWeekLastWeek1.amount) &&
        Objects.equals(this.factionId, getFwLeaderboardsLastWeekLastWeek1.factionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, factionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsLastWeekLastWeek1 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

