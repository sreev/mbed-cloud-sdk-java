/*
 * Update Service API
 * This is the API documentation for the Mbed deployment service, which is part of the update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.updateservice.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.updateservice.model.ManifestContentsEncryptionMode;
import com.arm.mbed.cloud.sdk.internal.updateservice.model.ManifestContentsPayload;
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
 * ManifestContents
 */

public class ManifestContents implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("classId")
  private String classId = null;

  @SerializedName("vendorId")
  private String vendorId = null;

  @SerializedName("manifestVersion")
  private Integer manifestVersion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nonce")
  private String nonce = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("encryptionMode")
  private ManifestContentsEncryptionMode encryptionMode = null;

  @SerializedName("applyImmediately")
  private Boolean applyImmediately = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("payload")
  private ManifestContentsPayload payload = null;

  public ManifestContents classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * The device class&#39;s 128-bit RFC4122 GUID as a hexidecimal digit string
   * @return classId
  **/
  @ApiModelProperty(value = "The device class's 128-bit RFC4122 GUID as a hexidecimal digit string")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public ManifestContents vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor&#39;s 128-bit RFC4122 GUID as a hexidecimal digit string
   * @return vendorId
  **/
  @ApiModelProperty(value = "The vendor's 128-bit RFC4122 GUID as a hexidecimal digit string")
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public ManifestContents manifestVersion(Integer manifestVersion) {
    this.manifestVersion = manifestVersion;
    return this;
  }

   /**
   * The manifest format version
   * @return manifestVersion
  **/
  @ApiModelProperty(value = "The manifest format version")
  public Integer getManifestVersion() {
    return manifestVersion;
  }

  public void setManifestVersion(Integer manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  public ManifestContents description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the update
   * @return description
  **/
  @ApiModelProperty(value = "A short description of the update")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ManifestContents nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * A 128-bit random field. This is provided by the manifest tool to ensure that the signing algorithm is safe from timing side-channel attacks.
   * @return nonce
  **/
  @ApiModelProperty(value = "A 128-bit random field. This is provided by the manifest tool to ensure that the signing algorithm is safe from timing side-channel attacks.")
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public ManifestContents timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time the manifest was created. The timestamp is stored as Unix time.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The time the manifest was created. The timestamp is stored as Unix time.")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public ManifestContents encryptionMode(ManifestContentsEncryptionMode encryptionMode) {
    this.encryptionMode = encryptionMode;
    return this;
  }

   /**
   * Get encryptionMode
   * @return encryptionMode
  **/
  @ApiModelProperty(value = "")
  public ManifestContentsEncryptionMode getEncryptionMode() {
    return encryptionMode;
  }

  public void setEncryptionMode(ManifestContentsEncryptionMode encryptionMode) {
    this.encryptionMode = encryptionMode;
  }

  public ManifestContents applyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
    return this;
  }

   /**
   * A flag that indicates whether the update described by the manifest should be applied as soon as possible
   * @return applyImmediately
  **/
  @ApiModelProperty(value = "A flag that indicates whether the update described by the manifest should be applied as soon as possible")
  public Boolean getApplyImmediately() {
    return applyImmediately;
  }

  public void setApplyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
  }

  public ManifestContents deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device&#39;s 128-bit RFC4122 GUID as a hexidecimal digit string. Each device has a single, unique device ID.
   * @return deviceId
  **/
  @ApiModelProperty(value = "The device's 128-bit RFC4122 GUID as a hexidecimal digit string. Each device has a single, unique device ID.")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ManifestContents payload(ManifestContentsPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public ManifestContentsPayload getPayload() {
    return payload;
  }

  public void setPayload(ManifestContentsPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestContents manifestContents = (ManifestContents) o;
    return Objects.equals(this.classId, manifestContents.classId) &&
        Objects.equals(this.vendorId, manifestContents.vendorId) &&
        Objects.equals(this.manifestVersion, manifestContents.manifestVersion) &&
        Objects.equals(this.description, manifestContents.description) &&
        Objects.equals(this.nonce, manifestContents.nonce) &&
        Objects.equals(this.timestamp, manifestContents.timestamp) &&
        Objects.equals(this.encryptionMode, manifestContents.encryptionMode) &&
        Objects.equals(this.applyImmediately, manifestContents.applyImmediately) &&
        Objects.equals(this.deviceId, manifestContents.deviceId) &&
        Objects.equals(this.payload, manifestContents.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, vendorId, manifestVersion, description, nonce, timestamp, encryptionMode, applyImmediately, deviceId, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestContents {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    encryptionMode: ").append(toIndentedString(encryptionMode)).append("\n");
    sb.append("    applyImmediately: ").append(toIndentedString(applyImmediately)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
