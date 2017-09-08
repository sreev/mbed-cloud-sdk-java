/*
 * Device Directory API
 * This is the API Documentation for the Mbed device directory update service.
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
import java.io.Serializable;

/**
 * DeviceQueryPostPutRequest
 */

public class DeviceQueryPostPutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("query")
  private String query = null;

  @SerializedName("name")
  private String name = null;

  public DeviceQueryPostPutRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The device query.
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The device query.")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public DeviceQueryPostPutRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the query.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the query.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceQueryPostPutRequest deviceQueryPostPutRequest = (DeviceQueryPostPutRequest) o;
    return Objects.equals(this.query, deviceQueryPostPutRequest.query) &&
        Objects.equals(this.name, deviceQueryPostPutRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceQueryPostPutRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

