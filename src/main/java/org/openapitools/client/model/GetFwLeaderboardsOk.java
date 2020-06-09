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
import org.openapitools.client.model.GetFwLeaderboardsKills;
import org.openapitools.client.model.GetFwLeaderboardsVictoryPoints;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetFwLeaderboardsOk.JSON_PROPERTY_KILLS,
  GetFwLeaderboardsOk.JSON_PROPERTY_VICTORY_POINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetFwLeaderboardsOk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_KILLS = "kills";
  private GetFwLeaderboardsKills kills;

  public static final String JSON_PROPERTY_VICTORY_POINTS = "victory_points";
  private GetFwLeaderboardsVictoryPoints victoryPoints;


  public GetFwLeaderboardsOk kills(GetFwLeaderboardsKills kills) {
    
    this.kills = kills;
    return this;
  }

   /**
   * Get kills
   * @return kills
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KILLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetFwLeaderboardsKills getKills() {
    return kills;
  }


  public void setKills(GetFwLeaderboardsKills kills) {
    this.kills = kills;
  }


  public GetFwLeaderboardsOk victoryPoints(GetFwLeaderboardsVictoryPoints victoryPoints) {
    
    this.victoryPoints = victoryPoints;
    return this;
  }

   /**
   * Get victoryPoints
   * @return victoryPoints
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VICTORY_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetFwLeaderboardsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }


  public void setVictoryPoints(GetFwLeaderboardsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsOk getFwLeaderboardsOk = (GetFwLeaderboardsOk) o;
    return Objects.equals(this.kills, getFwLeaderboardsOk.kills) &&
        Objects.equals(this.victoryPoints, getFwLeaderboardsOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kills, victoryPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsOk {\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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

