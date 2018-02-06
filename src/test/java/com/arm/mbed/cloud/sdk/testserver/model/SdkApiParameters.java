/*
 * Mbed Cloud SDK Test Server
 * This is the specification of Mbed Cloud SDK test servers
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ISG-cloud-eng-tools@arm.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.testserver.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

/**
 * parameters to apply to an API
 */
@ApiModel(description = "parameters to apply to an API")

public class SdkApiParameters extends HashMap<String, Object> implements Serializable {
  private static final long serialVersionUID = 1L;


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkApiParameters {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

