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
 * orbital object
 */
@ApiModel(description = "orbital object")
@JsonPropertyOrder({
  GetCharactersCharacterIdStatsOrbital.JSON_PROPERTY_STRIKE_CHARACTERS_KILLED,
  GetCharactersCharacterIdStatsOrbital.JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_ARMOR_AMOUNT,
  GetCharactersCharacterIdStatsOrbital.JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_SHIELD_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCharactersCharacterIdStatsOrbital implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STRIKE_CHARACTERS_KILLED = "strike_characters_killed";
  private Long strikeCharactersKilled;

  public static final String JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_ARMOR_AMOUNT = "strike_damage_to_players_armor_amount";
  private Long strikeDamageToPlayersArmorAmount;

  public static final String JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_SHIELD_AMOUNT = "strike_damage_to_players_shield_amount";
  private Long strikeDamageToPlayersShieldAmount;


  public GetCharactersCharacterIdStatsOrbital strikeCharactersKilled(Long strikeCharactersKilled) {
    
    this.strikeCharactersKilled = strikeCharactersKilled;
    return this;
  }

   /**
   * strike_characters_killed integer
   * @return strikeCharactersKilled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "strike_characters_killed integer")
  @JsonProperty(JSON_PROPERTY_STRIKE_CHARACTERS_KILLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrikeCharactersKilled() {
    return strikeCharactersKilled;
  }


  public void setStrikeCharactersKilled(Long strikeCharactersKilled) {
    this.strikeCharactersKilled = strikeCharactersKilled;
  }


  public GetCharactersCharacterIdStatsOrbital strikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
    
    this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
    return this;
  }

   /**
   * strike_damage_to_players_armor_amount integer
   * @return strikeDamageToPlayersArmorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "strike_damage_to_players_armor_amount integer")
  @JsonProperty(JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_ARMOR_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrikeDamageToPlayersArmorAmount() {
    return strikeDamageToPlayersArmorAmount;
  }


  public void setStrikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
    this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
  }


  public GetCharactersCharacterIdStatsOrbital strikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
    
    this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
    return this;
  }

   /**
   * strike_damage_to_players_shield_amount integer
   * @return strikeDamageToPlayersShieldAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "strike_damage_to_players_shield_amount integer")
  @JsonProperty(JSON_PROPERTY_STRIKE_DAMAGE_TO_PLAYERS_SHIELD_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrikeDamageToPlayersShieldAmount() {
    return strikeDamageToPlayersShieldAmount;
  }


  public void setStrikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
    this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsOrbital getCharactersCharacterIdStatsOrbital = (GetCharactersCharacterIdStatsOrbital) o;
    return Objects.equals(this.strikeCharactersKilled, getCharactersCharacterIdStatsOrbital.strikeCharactersKilled) &&
        Objects.equals(this.strikeDamageToPlayersArmorAmount, getCharactersCharacterIdStatsOrbital.strikeDamageToPlayersArmorAmount) &&
        Objects.equals(this.strikeDamageToPlayersShieldAmount, getCharactersCharacterIdStatsOrbital.strikeDamageToPlayersShieldAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strikeCharactersKilled, strikeDamageToPlayersArmorAmount, strikeDamageToPlayersShieldAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsOrbital {\n");
    sb.append("    strikeCharactersKilled: ").append(toIndentedString(strikeCharactersKilled)).append("\n");
    sb.append("    strikeDamageToPlayersArmorAmount: ").append(toIndentedString(strikeDamageToPlayersArmorAmount)).append("\n");
    sb.append("    strikeDamageToPlayersShieldAmount: ").append(toIndentedString(strikeDamageToPlayersShieldAmount)).append("\n");
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

