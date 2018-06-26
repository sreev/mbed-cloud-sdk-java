/*
 * billing REST API documentation
 * This document contains the public REST API definitions of the mbed-billing service.
 *
 * OpenAPI spec version: 1.4.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

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
 * Single field that failed validation
 */
@ApiModel(description = "Single field that failed validation")

public class BadRequestErrorResponseField implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  public BadRequestErrorResponseField message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message with detailed validation error.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A human readable message with detailed validation error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BadRequestErrorResponseField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field that failed the validation. If name is set to \&quot;body\&quot; then the validation failed on request body.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the field that failed the validation. If name is set to \"body\" then the validation failed on request body.")
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
    BadRequestErrorResponseField badRequestErrorResponseField = (BadRequestErrorResponseField) o;
    return Objects.equals(this.message, badRequestErrorResponseField.message) &&
        Objects.equals(this.name, badRequestErrorResponseField.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestErrorResponseField {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

