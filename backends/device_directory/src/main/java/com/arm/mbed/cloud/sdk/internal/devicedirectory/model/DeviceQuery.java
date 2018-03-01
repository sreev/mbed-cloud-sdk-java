/*
 * Device Directory API
 * This is the API Documentation for the Mbed Device Directory service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.devicedirectory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceQuery
 */

public class DeviceQuery implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("etag")
  private DateTime etag = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("id")
  private String id = null;

  public DeviceQuery name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the query.
   * @return name
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000", required = true, value = "The name of the query.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceQuery createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp of when the device was created in the device directory.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The timestamp of when the device was created in the device directory.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DeviceQuery object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity.
   * @return object
  **/
  @ApiModelProperty(example = "device-query", required = true, value = "The API resource entity.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceQuery updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time the object was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "The time the object was updated.")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DeviceQuery etag(DateTime etag) {
    this.etag = etag;
    return this;
  }

   /**
   * The entity instance signature.
   * @return etag
  **/
  @ApiModelProperty(required = true, value = "The entity instance signature.")
  public DateTime getEtag() {
    return etag;
  }

  public void setEtag(DateTime etag) {
    this.etag = etag;
  }

  public DeviceQuery query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The device query.
   * @return query
  **/
  @ApiModelProperty(example = "id=00000000000000000000000000000000", required = true, value = "The device query.")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public DeviceQuery id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the query.
   * @return id
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000", required = true, value = "The ID of the query.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceQuery deviceQuery = (DeviceQuery) o;
    return Objects.equals(this.name, deviceQuery.name) &&
        Objects.equals(this.createdAt, deviceQuery.createdAt) &&
        Objects.equals(this.object, deviceQuery.object) &&
        Objects.equals(this.updatedAt, deviceQuery.updatedAt) &&
        Objects.equals(this.etag, deviceQuery.etag) &&
        Objects.equals(this.query, deviceQuery.query) &&
        Objects.equals(this.id, deviceQuery.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, object, updatedAt, etag, query, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceQuery {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

