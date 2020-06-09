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
import org.openapitools.client.model.GetCorporationsCorporationIdBookmarksCoordinates;
import org.openapitools.client.model.GetCorporationsCorporationIdBookmarksItem;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@JsonPropertyOrder({
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_BOOKMARK_ID,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_COORDINATES,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_CREATED,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_CREATOR_ID,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_FOLDER_ID,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_ITEM,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_LABEL,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_LOCATION_ID,
  GetCorporationsCorporationIdBookmarks200Ok.JSON_PROPERTY_NOTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCorporationsCorporationIdBookmarks200Ok implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BOOKMARK_ID = "bookmark_id";
  private Integer bookmarkId;

  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private GetCorporationsCorporationIdBookmarksCoordinates coordinates;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private Integer creatorId;

  public static final String JSON_PROPERTY_FOLDER_ID = "folder_id";
  private Integer folderId;

  public static final String JSON_PROPERTY_ITEM = "item";
  private GetCorporationsCorporationIdBookmarksItem item;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
  private Integer locationId;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;


  public GetCorporationsCorporationIdBookmarks200Ok bookmarkId(Integer bookmarkId) {
    
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * bookmark_id integer
   * @return bookmarkId
  **/
  @ApiModelProperty(required = true, value = "bookmark_id integer")
  @JsonProperty(JSON_PROPERTY_BOOKMARK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBookmarkId() {
    return bookmarkId;
  }


  public void setBookmarkId(Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
  }


  public GetCorporationsCorporationIdBookmarks200Ok coordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetCorporationsCorporationIdBookmarksCoordinates getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
  }


  public GetCorporationsCorporationIdBookmarks200Ok created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * created string
   * @return created
  **/
  @ApiModelProperty(required = true, value = "created string")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public GetCorporationsCorporationIdBookmarks200Ok creatorId(Integer creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * creator_id integer
   * @return creatorId
  **/
  @ApiModelProperty(required = true, value = "creator_id integer")
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }


  public GetCorporationsCorporationIdBookmarks200Ok folderId(Integer folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * folder_id integer
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "folder_id integer")
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFolderId() {
    return folderId;
  }


  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }


  public GetCorporationsCorporationIdBookmarks200Ok item(GetCorporationsCorporationIdBookmarksItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetCorporationsCorporationIdBookmarksItem getItem() {
    return item;
  }


  public void setItem(GetCorporationsCorporationIdBookmarksItem item) {
    this.item = item;
  }


  public GetCorporationsCorporationIdBookmarks200Ok label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * label string
   * @return label
  **/
  @ApiModelProperty(required = true, value = "label string")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public GetCorporationsCorporationIdBookmarks200Ok locationId(Integer locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "location_id integer")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLocationId() {
    return locationId;
  }


  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }


  public GetCorporationsCorporationIdBookmarks200Ok notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * notes string
   * @return notes
  **/
  @ApiModelProperty(required = true, value = "notes string")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdBookmarks200Ok getCorporationsCorporationIdBookmarks200Ok = (GetCorporationsCorporationIdBookmarks200Ok) o;
    return Objects.equals(this.bookmarkId, getCorporationsCorporationIdBookmarks200Ok.bookmarkId) &&
        Objects.equals(this.coordinates, getCorporationsCorporationIdBookmarks200Ok.coordinates) &&
        Objects.equals(this.created, getCorporationsCorporationIdBookmarks200Ok.created) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdBookmarks200Ok.creatorId) &&
        Objects.equals(this.folderId, getCorporationsCorporationIdBookmarks200Ok.folderId) &&
        Objects.equals(this.item, getCorporationsCorporationIdBookmarks200Ok.item) &&
        Objects.equals(this.label, getCorporationsCorporationIdBookmarks200Ok.label) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdBookmarks200Ok.locationId) &&
        Objects.equals(this.notes, getCorporationsCorporationIdBookmarks200Ok.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, coordinates, created, creatorId, folderId, item, label, locationId, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarks200Ok {\n");
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

