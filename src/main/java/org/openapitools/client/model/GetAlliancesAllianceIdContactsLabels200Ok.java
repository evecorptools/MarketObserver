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
  GetAlliancesAllianceIdContactsLabels200Ok.JSON_PROPERTY_LABEL_ID,
  GetAlliancesAllianceIdContactsLabels200Ok.JSON_PROPERTY_LABEL_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetAlliancesAllianceIdContactsLabels200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LABEL_ID = "label_id";
  private Long labelId;

  public static final String JSON_PROPERTY_LABEL_NAME = "label_name";
  private String labelName;


  public GetAlliancesAllianceIdContactsLabels200Ok labelId(Long labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * label_id integer
   * @return labelId
  **/
  @ApiModelProperty(required = true, value = "label_id integer")
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLabelId() {
    return labelId;
  }


  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  public GetAlliancesAllianceIdContactsLabels200Ok labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * label_name string
   * @return labelName
  **/
  @ApiModelProperty(required = true, value = "label_name string")
  @JsonProperty(JSON_PROPERTY_LABEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdContactsLabels200Ok getAlliancesAllianceIdContactsLabels200Ok = (GetAlliancesAllianceIdContactsLabels200Ok) o;
    return Objects.equals(this.labelId, getAlliancesAllianceIdContactsLabels200Ok.labelId) &&
        Objects.equals(this.labelName, getAlliancesAllianceIdContactsLabels200Ok.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, labelName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdContactsLabels200Ok {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

