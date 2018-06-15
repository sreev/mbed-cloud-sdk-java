/*
 * Account Management API
 * API for managing accounts, users, creating API keys, uploading trusted certificates
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.iam.model;

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
 * This object represents a trusted certificate in upload requests.
 */
@ApiModel(description = "This object represents a trusted certificate in upload requests.")

public class TrustedCertificateReq implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enrollment_mode")
  private Boolean enrollmentMode = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Service name where the certificate must be used.
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    LWM2M("lwm2m"),
    
    BOOTSTRAP("bootstrap");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  @SerializedName("signature")
  private String signature = null;

  /**
   * Status of the certificate.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public TrustedCertificateReq certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * A chain of X509.v3 trusted certificates in PEM format. The chain must contain all certificates from root to leaf. Otherwise, the signature parameter is required.
   * @return certificate
  **/
  @ApiModelProperty(required = true, value = "A chain of X509.v3 trusted certificates in PEM format. The chain must contain all certificates from root to leaf. Otherwise, the signature parameter is required.")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public TrustedCertificateReq description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Human readable description of this certificate, not longer than 500 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Human readable description of this certificate, not longer than 500 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrustedCertificateReq enrollmentMode(Boolean enrollmentMode) {
    this.enrollmentMode = enrollmentMode;
    return this;
  }

   /**
   * Certificate is used in enrollment mode. Default value is false.
   * @return enrollmentMode
  **/
  @ApiModelProperty(value = "Certificate is used in enrollment mode. Default value is false.")
  public Boolean isEnrollmentMode() {
    return enrollmentMode;
  }

  public void setEnrollmentMode(Boolean enrollmentMode) {
    this.enrollmentMode = enrollmentMode;
  }

  public TrustedCertificateReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Certificate name, not longer than 100 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Certificate name, not longer than 100 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrustedCertificateReq service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Service name where the certificate must be used.
   * @return service
  **/
  @ApiModelProperty(required = true, value = "Service name where the certificate must be used.")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

  public TrustedCertificateReq signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * DEPRECATED: Base64 encoded signature of the account ID signed by the certificate to be uploaded. The signature must be hashed with SHA256.
   * @return signature
  **/
  @ApiModelProperty(value = "DEPRECATED: Base64 encoded signature of the account ID signed by the certificate to be uploaded. The signature must be hashed with SHA256.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public TrustedCertificateReq status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the certificate.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the certificate.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedCertificateReq trustedCertificateReq = (TrustedCertificateReq) o;
    return Objects.equals(this.certificate, trustedCertificateReq.certificate) &&
        Objects.equals(this.description, trustedCertificateReq.description) &&
        Objects.equals(this.enrollmentMode, trustedCertificateReq.enrollmentMode) &&
        Objects.equals(this.name, trustedCertificateReq.name) &&
        Objects.equals(this.service, trustedCertificateReq.service) &&
        Objects.equals(this.signature, trustedCertificateReq.signature) &&
        Objects.equals(this.status, trustedCertificateReq.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, description, enrollmentMode, name, service, signature, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedCertificateReq {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enrollmentMode: ").append(toIndentedString(enrollmentMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

