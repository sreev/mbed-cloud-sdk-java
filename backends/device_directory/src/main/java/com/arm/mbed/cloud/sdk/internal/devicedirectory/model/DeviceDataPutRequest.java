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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * DeviceDataPutRequest
 */

public class DeviceDataPutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("description")
  private String description = null;

  @SerializedName("endpoint_name")
  private String endpointName = null;

  @SerializedName("auto_update")
  private Boolean autoUpdate = null;

  @SerializedName("host_gateway")
  private String hostGateway = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("custom_attributes")
  private Map<String, String> customAttributes = null;

  @SerializedName("device_key")
  private String deviceKey = null;

  @SerializedName("endpoint_type")
  private String endpointType = null;

  @SerializedName("ca_id")
  private String caId = null;

  @SerializedName("name")
  private String name = null;

  public DeviceDataPutRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the device.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the device.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceDataPutRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * The endpoint name given to the device.
   * @return endpointName
  **/
  @ApiModelProperty(value = "The endpoint name given to the device.")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public DeviceDataPutRequest autoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * DEPRECATED: Mark this device for automatic firmware update.
   * @return autoUpdate
  **/
  @ApiModelProperty(value = "DEPRECATED: Mark this device for automatic firmware update.")
  public Boolean getAutoUpdate() {
    return autoUpdate;
  }

  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }

  public DeviceDataPutRequest hostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
    return this;
  }

   /**
   * The &#x60;endpoint_name&#x60; of the host gateway, if appropriate.
   * @return hostGateway
  **/
  @ApiModelProperty(value = "The `endpoint_name` of the host gateway, if appropriate.")
  public String getHostGateway() {
    return hostGateway;
  }

  public void setHostGateway(String hostGateway) {
    this.hostGateway = hostGateway;
  }

  public DeviceDataPutRequest object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity.
   * @return object
  **/
  @ApiModelProperty(value = "The API resource entity.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceDataPutRequest customAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public DeviceDataPutRequest putCustomAttributesItem(String key, String customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<String, String>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

   /**
   * Up to five custom key-value attributes.
   * @return customAttributes
  **/
  @ApiModelProperty(value = "Up to five custom key-value attributes.")
  public Map<String, String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public DeviceDataPutRequest deviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * The fingerprint of the device certificate.
   * @return deviceKey
  **/
  @ApiModelProperty(required = true, value = "The fingerprint of the device certificate.")
  public String getDeviceKey() {
    return deviceKey;
  }

  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }

  public DeviceDataPutRequest endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * The endpoint type of the device. For example, the device is a gateway.
   * @return endpointType
  **/
  @ApiModelProperty(value = "The endpoint type of the device. For example, the device is a gateway.")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public DeviceDataPutRequest caId(String caId) {
    this.caId = caId;
    return this;
  }

   /**
   * The certificate issuer&#39;s ID.
   * @return caId
  **/
  @ApiModelProperty(required = true, value = "The certificate issuer's ID.")
  public String getCaId() {
    return caId;
  }

  public void setCaId(String caId) {
    this.caId = caId;
  }

  public DeviceDataPutRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the device.")
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
    DeviceDataPutRequest deviceDataPutRequest = (DeviceDataPutRequest) o;
    return Objects.equals(this.description, deviceDataPutRequest.description) &&
        Objects.equals(this.endpointName, deviceDataPutRequest.endpointName) &&
        Objects.equals(this.autoUpdate, deviceDataPutRequest.autoUpdate) &&
        Objects.equals(this.hostGateway, deviceDataPutRequest.hostGateway) &&
        Objects.equals(this.object, deviceDataPutRequest.object) &&
        Objects.equals(this.customAttributes, deviceDataPutRequest.customAttributes) &&
        Objects.equals(this.deviceKey, deviceDataPutRequest.deviceKey) &&
        Objects.equals(this.endpointType, deviceDataPutRequest.endpointType) &&
        Objects.equals(this.caId, deviceDataPutRequest.caId) &&
        Objects.equals(this.name, deviceDataPutRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endpointName, autoUpdate, hostGateway, object, customAttributes, deviceKey, endpointType, caId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDataPutRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    hostGateway: ").append(toIndentedString(hostGateway)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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

