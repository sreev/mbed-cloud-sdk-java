/*
 * Third party CA management API
 * API for managing third party CA for creating certificates on Pelion Device Management
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.externalca.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.externalca.model.CertificateIssuerConfigResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CertificateIssuerConfigListResponse
 */

public class CertificateIssuerConfigListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("after")
  private String after = null;

  @SerializedName("data")
  private List<CertificateIssuerConfigResponse> data = null;

  @SerializedName("limit")
  private Integer limit = null;

  /**
   * Describes the type of objects in the list.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LIST("list");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  /**
   * The order of results.
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public CertificateIssuerConfigListResponse after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The entity ID to fetch after current result set.
   * @return after
  **/
  @ApiModelProperty(example = "01648415a2a30242ac18000500000000", value = "The entity ID to fetch after current result set.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public CertificateIssuerConfigListResponse data(List<CertificateIssuerConfigResponse> data) {
    this.data = data;
    return this;
  }

  public CertificateIssuerConfigListResponse addDataItem(CertificateIssuerConfigResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CertificateIssuerConfigResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of certificate issuers.
   * @return data
  **/
  @ApiModelProperty(value = "List of certificate issuers.")
  public List<CertificateIssuerConfigResponse> getData() {
    return data;
  }

  public void setData(List<CertificateIssuerConfigResponse> data) {
    this.data = data;
  }

  public CertificateIssuerConfigListResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The number of results returned.
   * @return limit
  **/
  @ApiModelProperty(value = "The number of results returned.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CertificateIssuerConfigListResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Describes the type of objects in the list.
   * @return object
  **/
  @ApiModelProperty(value = "Describes the type of objects in the list.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public CertificateIssuerConfigListResponse order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * The order of results.
   * @return order
  **/
  @ApiModelProperty(value = "The order of results.")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public CertificateIssuerConfigListResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number or records.
   * @return totalCount
  **/
  @ApiModelProperty(value = "The total number or records.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateIssuerConfigListResponse certificateIssuerConfigListResponse = (CertificateIssuerConfigListResponse) o;
    return Objects.equals(this.after, certificateIssuerConfigListResponse.after) &&
        Objects.equals(this.data, certificateIssuerConfigListResponse.data) &&
        Objects.equals(this.limit, certificateIssuerConfigListResponse.limit) &&
        Objects.equals(this.object, certificateIssuerConfigListResponse.object) &&
        Objects.equals(this.order, certificateIssuerConfigListResponse.order) &&
        Objects.equals(this.totalCount, certificateIssuerConfigListResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, data, limit, object, order, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateIssuerConfigListResponse {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
