/*
 * Connect Statistics API
 * Connect Statistics API provides statistics about other cloud services through defined counters.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.statistics.model;

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
 * Metric
 */

public class Metric implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("bootstraps_failed")
  private Long bootstrapsFailed = null;

  @SerializedName("bootstraps_pending")
  private Long bootstrapsPending = null;

  @SerializedName("bootstraps_successful")
  private Long bootstrapsSuccessful = null;

  @SerializedName("connect_rest_api_error")
  private Long connectRestApiError = null;

  @SerializedName("connect_rest_api_success")
  private Long connectRestApiSuccess = null;

  @SerializedName("deleted_registrations")
  private Long deletedRegistrations = null;

  @SerializedName("device_observations")
  private Long deviceObservations = null;

  @SerializedName("device_proxy_request_error")
  private Long deviceProxyRequestError = null;

  @SerializedName("device_proxy_request_success")
  private Long deviceProxyRequestSuccess = null;

  @SerializedName("device_subscription_request_error")
  private Long deviceSubscriptionRequestError = null;

  @SerializedName("device_subscription_request_success")
  private Long deviceSubscriptionRequestSuccess = null;

  @SerializedName("expired_registrations")
  private Long expiredRegistrations = null;

  @SerializedName("full_registrations")
  private Long fullRegistrations = null;

  @SerializedName("handshakes_successful")
  private Long handshakesSuccessful = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("registration_updates")
  private Long registrationUpdates = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("transactions")
  private Long transactions = null;

  public Metric bootstrapsFailed(Long bootstrapsFailed) {
    this.bootstrapsFailed = bootstrapsFailed;
    return this;
  }

   /**
   * The number of failed bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.
   * @return bootstrapsFailed
  **/
  @ApiModelProperty(value = "The number of failed bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.")
  public Long getBootstrapsFailed() {
    return bootstrapsFailed;
  }

  public void setBootstrapsFailed(Long bootstrapsFailed) {
    this.bootstrapsFailed = bootstrapsFailed;
  }

  public Metric bootstrapsPending(Long bootstrapsPending) {
    this.bootstrapsPending = bootstrapsPending;
    return this;
  }

   /**
   * The number of pending bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.
   * @return bootstrapsPending
  **/
  @ApiModelProperty(value = "The number of pending bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.")
  public Long getBootstrapsPending() {
    return bootstrapsPending;
  }

  public void setBootstrapsPending(Long bootstrapsPending) {
    this.bootstrapsPending = bootstrapsPending;
  }

  public Metric bootstrapsSuccessful(Long bootstrapsSuccessful) {
    this.bootstrapsSuccessful = bootstrapsSuccessful;
    return this;
  }

   /**
   * The number of successful bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.
   * @return bootstrapsSuccessful
  **/
  @ApiModelProperty(value = "The number of successful bootstraps the account has performed. Bootstrap is the process of provisioning a Lightweight Machine to Machine Client to a state where it can initiate a management session to a new Lightweight Machine to Machine Server.")
  public Long getBootstrapsSuccessful() {
    return bootstrapsSuccessful;
  }

  public void setBootstrapsSuccessful(Long bootstrapsSuccessful) {
    this.bootstrapsSuccessful = bootstrapsSuccessful;
  }

  public Metric connectRestApiError(Long connectRestApiError) {
    this.connectRestApiError = connectRestApiError;
    return this;
  }

   /**
   * The number of failed [Connect API](/docs/current/service-api-references/device-management-connect.html) requests that have been performed using the account. This metric does not consider the response from the device, it includes only the responses to the HTTP requests used to manage the device. This metric includes only messages handled by the Connect service, it does not include any HTTP errors returned by firewall as result of malformed messages.
   * @return connectRestApiError
  **/
  @ApiModelProperty(value = "The number of failed [Connect API](/docs/current/service-api-references/device-management-connect.html) requests that have been performed using the account. This metric does not consider the response from the device, it includes only the responses to the HTTP requests used to manage the device. This metric includes only messages handled by the Connect service, it does not include any HTTP errors returned by firewall as result of malformed messages.")
  public Long getConnectRestApiError() {
    return connectRestApiError;
  }

  public void setConnectRestApiError(Long connectRestApiError) {
    this.connectRestApiError = connectRestApiError;
  }

  public Metric connectRestApiSuccess(Long connectRestApiSuccess) {
    this.connectRestApiSuccess = connectRestApiSuccess;
    return this;
  }

   /**
   * The number of successful [Connect API](/docs/current/service-api-references/device-management-connect.html) requests that have been performed using the account. This metric does not consider the response from the device, it includes only the responses to the HTTP requests used to manage the device.
   * @return connectRestApiSuccess
  **/
  @ApiModelProperty(value = "The number of successful [Connect API](/docs/current/service-api-references/device-management-connect.html) requests that have been performed using the account. This metric does not consider the response from the device, it includes only the responses to the HTTP requests used to manage the device.")
  public Long getConnectRestApiSuccess() {
    return connectRestApiSuccess;
  }

  public void setConnectRestApiSuccess(Long connectRestApiSuccess) {
    this.connectRestApiSuccess = connectRestApiSuccess;
  }

  public Metric deletedRegistrations(Long deletedRegistrations) {
    this.deletedRegistrations = deletedRegistrations;
    return this;
  }

   /**
   * The number of deleted registrations (deregistrations) linked to the account. Deregistration is the process of removing the device registration from the Device Management Connect registry. The deregistration is usually initiated by the device. Device Management Connect no longer handles requests for a deregistered device.
   * @return deletedRegistrations
  **/
  @ApiModelProperty(value = "The number of deleted registrations (deregistrations) linked to the account. Deregistration is the process of removing the device registration from the Device Management Connect registry. The deregistration is usually initiated by the device. Device Management Connect no longer handles requests for a deregistered device.")
  public Long getDeletedRegistrations() {
    return deletedRegistrations;
  }

  public void setDeletedRegistrations(Long deletedRegistrations) {
    this.deletedRegistrations = deletedRegistrations;
  }

  public Metric deviceObservations(Long deviceObservations) {
    this.deviceObservations = deviceObservations;
    return this;
  }

   /**
   * **(Beta)** The number of notifications received by the Device Management Connect service from the devices linked to the account. The device pushes notifications to Device Management Connect when you have successfully subscribed to the device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. 
   * @return deviceObservations
  **/
  @ApiModelProperty(value = "**(Beta)** The number of notifications received by the Device Management Connect service from the devices linked to the account. The device pushes notifications to Device Management Connect when you have successfully subscribed to the device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. ")
  public Long getDeviceObservations() {
    return deviceObservations;
  }

  public void setDeviceObservations(Long deviceObservations) {
    this.deviceObservations = deviceObservations;
  }

  public Metric deviceProxyRequestError(Long deviceProxyRequestError) {
    this.deviceProxyRequestError = deviceProxyRequestError;
    return this;
  }

   /**
   * **(Beta)** The number of failed proxy requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes proxy requests to devices when you try to read or write values to device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. 
   * @return deviceProxyRequestError
  **/
  @ApiModelProperty(value = "**(Beta)** The number of failed proxy requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes proxy requests to devices when you try to read or write values to device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. ")
  public Long getDeviceProxyRequestError() {
    return deviceProxyRequestError;
  }

  public void setDeviceProxyRequestError(Long deviceProxyRequestError) {
    this.deviceProxyRequestError = deviceProxyRequestError;
  }

  public Metric deviceProxyRequestSuccess(Long deviceProxyRequestSuccess) {
    this.deviceProxyRequestSuccess = deviceProxyRequestSuccess;
    return this;
  }

   /**
   * **(Beta)** The number of successful proxy requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes proxy requests to devices when you try to read or write values to device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. 
   * @return deviceProxyRequestSuccess
  **/
  @ApiModelProperty(value = "**(Beta)** The number of successful proxy requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes proxy requests to devices when you try to read or write values to device resources using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. ")
  public Long getDeviceProxyRequestSuccess() {
    return deviceProxyRequestSuccess;
  }

  public void setDeviceProxyRequestSuccess(Long deviceProxyRequestSuccess) {
    this.deviceProxyRequestSuccess = deviceProxyRequestSuccess;
  }

  public Metric deviceSubscriptionRequestError(Long deviceSubscriptionRequestError) {
    this.deviceSubscriptionRequestError = deviceSubscriptionRequestError;
    return this;
  }

   /**
   * **(Beta)** The number of failed subscription requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes subscription requests to devices when you try to subscribe to a resource path using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. 
   * @return deviceSubscriptionRequestError
  **/
  @ApiModelProperty(value = "**(Beta)** The number of failed subscription requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes subscription requests to devices when you try to subscribe to a resource path using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. ")
  public Long getDeviceSubscriptionRequestError() {
    return deviceSubscriptionRequestError;
  }

  public void setDeviceSubscriptionRequestError(Long deviceSubscriptionRequestError) {
    this.deviceSubscriptionRequestError = deviceSubscriptionRequestError;
  }

  public Metric deviceSubscriptionRequestSuccess(Long deviceSubscriptionRequestSuccess) {
    this.deviceSubscriptionRequestSuccess = deviceSubscriptionRequestSuccess;
    return this;
  }

   /**
   * **(Beta)** The number of successful subscription requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes subscription requests to devices when you try to subscribe to a resource path using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. 
   * @return deviceSubscriptionRequestSuccess
  **/
  @ApiModelProperty(value = "**(Beta)** The number of successful subscription requests from the Device Management Connect service to devices linked to the account. Device Management Connect makes subscription requests to devices when you try to subscribe to a resource path using [Connect API](/docs/current/service-api-references/device-management-connect.html) endpoints. ")
  public Long getDeviceSubscriptionRequestSuccess() {
    return deviceSubscriptionRequestSuccess;
  }

  public void setDeviceSubscriptionRequestSuccess(Long deviceSubscriptionRequestSuccess) {
    this.deviceSubscriptionRequestSuccess = deviceSubscriptionRequestSuccess;
  }

  public Metric expiredRegistrations(Long expiredRegistrations) {
    this.expiredRegistrations = expiredRegistrations;
    return this;
  }

   /**
   * The number of expired registrations linked to the account. Device Management Connect removes the device registrations when the devices cannot update their registration before the expiry of the lifetime. Device Management Connect no longer handles requests for a device whose registration has expired already.
   * @return expiredRegistrations
  **/
  @ApiModelProperty(value = "The number of expired registrations linked to the account. Device Management Connect removes the device registrations when the devices cannot update their registration before the expiry of the lifetime. Device Management Connect no longer handles requests for a device whose registration has expired already.")
  public Long getExpiredRegistrations() {
    return expiredRegistrations;
  }

  public void setExpiredRegistrations(Long expiredRegistrations) {
    this.expiredRegistrations = expiredRegistrations;
  }

  public Metric fullRegistrations(Long fullRegistrations) {
    this.fullRegistrations = fullRegistrations;
    return this;
  }

   /**
   * The number of full registrations linked to the account. Full registration is the process of registering a device with Device Management Connect by providing its lifetime and capabilities such as the resource structure.The registered status of the device does not guarantee that the device is active and accessible from Device Management Connect at any point of time.
   * @return fullRegistrations
  **/
  @ApiModelProperty(value = "The number of full registrations linked to the account. Full registration is the process of registering a device with Device Management Connect by providing its lifetime and capabilities such as the resource structure.The registered status of the device does not guarantee that the device is active and accessible from Device Management Connect at any point of time.")
  public Long getFullRegistrations() {
    return fullRegistrations;
  }

  public void setFullRegistrations(Long fullRegistrations) {
    this.fullRegistrations = fullRegistrations;
  }

  public Metric handshakesSuccessful(Long handshakesSuccessful) {
    this.handshakesSuccessful = handshakesSuccessful;
    return this;
  }

   /**
   * The number of successful TLS handshakes the account has performed. The SSL or TLS handshake enables the SSL or TLS client and server to establish the secret keys with which they communicate. A successful TLS handshake is required for establishing a connection with Device Management Connect for any operaton such as registration, registration update and deregistration.
   * @return handshakesSuccessful
  **/
  @ApiModelProperty(value = "The number of successful TLS handshakes the account has performed. The SSL or TLS handshake enables the SSL or TLS client and server to establish the secret keys with which they communicate. A successful TLS handshake is required for establishing a connection with Device Management Connect for any operaton such as registration, registration update and deregistration.")
  public Long getHandshakesSuccessful() {
    return handshakesSuccessful;
  }

  public void setHandshakesSuccessful(Long handshakesSuccessful) {
    this.handshakesSuccessful = handshakesSuccessful;
  }

  public Metric id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique metric ID.
   * @return id
  **/
  @ApiModelProperty(value = "A unique metric ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Metric registrationUpdates(Long registrationUpdates) {
    this.registrationUpdates = registrationUpdates;
    return this;
  }

   /**
   * The number of registration updates linked to the account. Registration update is the process of updating the registration status with Device Management Connect to update or extend the lifetime of the device.
   * @return registrationUpdates
  **/
  @ApiModelProperty(value = "The number of registration updates linked to the account. Registration update is the process of updating the registration status with Device Management Connect to update or extend the lifetime of the device.")
  public Long getRegistrationUpdates() {
    return registrationUpdates;
  }

  public void setRegistrationUpdates(Long registrationUpdates) {
    this.registrationUpdates = registrationUpdates;
  }

  public Metric timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * UTC time in RFC3339 format. The timestamp is the starting point of the interval for which the data is aggregated. Each interval includes data for the time greater than or equal to the timestamp and less than the next interval&#39;s starting point.
   * @return timestamp
  **/
  @ApiModelProperty(value = "UTC time in RFC3339 format. The timestamp is the starting point of the interval for which the data is aggregated. Each interval includes data for the time greater than or equal to the timestamp and less than the next interval's starting point.")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Metric transactions(Long transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * The number of transaction events from or to devices linked to the account. A transaction is a 512-byte block of data processed by Device Management. It can be either sent by the device (device --&gt; Device Management) or received by the device (Device Management --&gt; device). A transaction does not include IP, TCP or UDP, TLS or DTLS packet overhead. It only contains the packet payload (full CoAP packet including CoAP headers).
   * @return transactions
  **/
  @ApiModelProperty(value = "The number of transaction events from or to devices linked to the account. A transaction is a 512-byte block of data processed by Device Management. It can be either sent by the device (device --> Device Management) or received by the device (Device Management --> device). A transaction does not include IP, TCP or UDP, TLS or DTLS packet overhead. It only contains the packet payload (full CoAP packet including CoAP headers).")
  public Long getTransactions() {
    return transactions;
  }

  public void setTransactions(Long transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.bootstrapsFailed, metric.bootstrapsFailed) &&
        Objects.equals(this.bootstrapsPending, metric.bootstrapsPending) &&
        Objects.equals(this.bootstrapsSuccessful, metric.bootstrapsSuccessful) &&
        Objects.equals(this.connectRestApiError, metric.connectRestApiError) &&
        Objects.equals(this.connectRestApiSuccess, metric.connectRestApiSuccess) &&
        Objects.equals(this.deletedRegistrations, metric.deletedRegistrations) &&
        Objects.equals(this.deviceObservations, metric.deviceObservations) &&
        Objects.equals(this.deviceProxyRequestError, metric.deviceProxyRequestError) &&
        Objects.equals(this.deviceProxyRequestSuccess, metric.deviceProxyRequestSuccess) &&
        Objects.equals(this.deviceSubscriptionRequestError, metric.deviceSubscriptionRequestError) &&
        Objects.equals(this.deviceSubscriptionRequestSuccess, metric.deviceSubscriptionRequestSuccess) &&
        Objects.equals(this.expiredRegistrations, metric.expiredRegistrations) &&
        Objects.equals(this.fullRegistrations, metric.fullRegistrations) &&
        Objects.equals(this.handshakesSuccessful, metric.handshakesSuccessful) &&
        Objects.equals(this.id, metric.id) &&
        Objects.equals(this.registrationUpdates, metric.registrationUpdates) &&
        Objects.equals(this.timestamp, metric.timestamp) &&
        Objects.equals(this.transactions, metric.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapsFailed, bootstrapsPending, bootstrapsSuccessful, connectRestApiError, connectRestApiSuccess, deletedRegistrations, deviceObservations, deviceProxyRequestError, deviceProxyRequestSuccess, deviceSubscriptionRequestError, deviceSubscriptionRequestSuccess, expiredRegistrations, fullRegistrations, handshakesSuccessful, id, registrationUpdates, timestamp, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    
    sb.append("    bootstrapsFailed: ").append(toIndentedString(bootstrapsFailed)).append("\n");
    sb.append("    bootstrapsPending: ").append(toIndentedString(bootstrapsPending)).append("\n");
    sb.append("    bootstrapsSuccessful: ").append(toIndentedString(bootstrapsSuccessful)).append("\n");
    sb.append("    connectRestApiError: ").append(toIndentedString(connectRestApiError)).append("\n");
    sb.append("    connectRestApiSuccess: ").append(toIndentedString(connectRestApiSuccess)).append("\n");
    sb.append("    deletedRegistrations: ").append(toIndentedString(deletedRegistrations)).append("\n");
    sb.append("    deviceObservations: ").append(toIndentedString(deviceObservations)).append("\n");
    sb.append("    deviceProxyRequestError: ").append(toIndentedString(deviceProxyRequestError)).append("\n");
    sb.append("    deviceProxyRequestSuccess: ").append(toIndentedString(deviceProxyRequestSuccess)).append("\n");
    sb.append("    deviceSubscriptionRequestError: ").append(toIndentedString(deviceSubscriptionRequestError)).append("\n");
    sb.append("    deviceSubscriptionRequestSuccess: ").append(toIndentedString(deviceSubscriptionRequestSuccess)).append("\n");
    sb.append("    expiredRegistrations: ").append(toIndentedString(expiredRegistrations)).append("\n");
    sb.append("    fullRegistrations: ").append(toIndentedString(fullRegistrations)).append("\n");
    sb.append("    handshakesSuccessful: ").append(toIndentedString(handshakesSuccessful)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registrationUpdates: ").append(toIndentedString(registrationUpdates)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

