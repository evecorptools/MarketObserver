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
  GetUniverseAncestries200Ok.JSON_PROPERTY_BLOODLINE_ID,
  GetUniverseAncestries200Ok.JSON_PROPERTY_DESCRIPTION,
  GetUniverseAncestries200Ok.JSON_PROPERTY_ICON_ID,
  GetUniverseAncestries200Ok.JSON_PROPERTY_ID,
  GetUniverseAncestries200Ok.JSON_PROPERTY_NAME,
  GetUniverseAncestries200Ok.JSON_PROPERTY_SHORT_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetUniverseAncestries200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BLOODLINE_ID = "bloodline_id";
  private Integer bloodlineId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ICON_ID = "icon_id";
  private Integer iconId;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;


  public GetUniverseAncestries200Ok bloodlineId(Integer bloodlineId) {
    
    this.bloodlineId = bloodlineId;
    return this;
  }

   /**
   * The bloodline associated with this ancestry
   * @return bloodlineId
  **/
  @ApiModelProperty(required = true, value = "The bloodline associated with this ancestry")
  @JsonProperty(JSON_PROPERTY_BLOODLINE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBloodlineId() {
    return bloodlineId;
  }


  public void setBloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
  }


  public GetUniverseAncestries200Ok description(String description) {
    
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


  public GetUniverseAncestries200Ok iconId(Integer iconId) {
    
    this.iconId = iconId;
    return this;
  }

   /**
   * icon_id integer
   * @return iconId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "icon_id integer")
  @JsonProperty(JSON_PROPERTY_ICON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIconId() {
    return iconId;
  }


  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }


  public GetUniverseAncestries200Ok id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * id integer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id integer")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetUniverseAncestries200Ok name(String name) {
    
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


  public GetUniverseAncestries200Ok shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * short_description string
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "short_description string")
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseAncestries200Ok getUniverseAncestries200Ok = (GetUniverseAncestries200Ok) o;
    return Objects.equals(this.bloodlineId, getUniverseAncestries200Ok.bloodlineId) &&
        Objects.equals(this.description, getUniverseAncestries200Ok.description) &&
        Objects.equals(this.iconId, getUniverseAncestries200Ok.iconId) &&
        Objects.equals(this.id, getUniverseAncestries200Ok.id) &&
        Objects.equals(this.name, getUniverseAncestries200Ok.name) &&
        Objects.equals(this.shortDescription, getUniverseAncestries200Ok.shortDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloodlineId, description, iconId, id, name, shortDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseAncestries200Ok {\n");
    sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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

