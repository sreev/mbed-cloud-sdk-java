/*
 * Billing API
 * Billing API allows commercial users to retrieve billing reports and service package details.  ## Billing Reports: Billing reports for the previous month are generated automatically during the third business day of the current month. The reports will be available usually by 02:00 AM UTC.  ## Service package: A service package can be created for the commercial accounts with a specific number of firmware updates referred to as the service package quota. A customer can only perform device updates equal to the number of firmware updates linked to an active service package. A customer needs to purchase a create new service package or renew an active service package if they have consumed all the quota linked to an active service package.  Aggregator customers share their service package quota with their own subtenant accounts. A subtenant can create campaigns utilizing their parent's service package quota. A subtenant cannot create or manage service packages on their own. The quota usage history is recorded separately between the aggregator and its subtenants.  ## Service package events: The following service package events are included in the API responses:  ### reservation: A reservation event refers to the creation of a new update campaign with an estimated number of firmware updates.  ### reservation_release: A reservation_release event refers to closing an update campaign. The unused quota reserved through the update campaign will be added to the active service package quota at this point.  ### reservation_termination: A reservation_termination event refers to the termination of an update campaign due to the expiration of an active service package. The unused quota reserved through the update campaign cannot be used anymore as the active service package is expired.  ### package_creation: A package_creation event refers to the creation of a new service package.  ### package_renewal: A package_renewal event refers to the renewal of an active service package before it expires.  ### package_termination: A package_termination event refers to the expiration of an active service package. The unused quota linked to the expired service package cannot be used anymore. 
 *
 * OpenAPI spec version: 1.4.9
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Account&#39;s service package metadata.
 */
@ApiModel(description = "Account's service package metadata.")

public class ServicePackageMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("end_time")
  private DateTime endTime = null;

  @SerializedName("remaining_quota")
  private Long remainingQuota = null;

  @SerializedName("reserved_quota")
  private Long reservedQuota = null;

  @SerializedName("start_time")
  private DateTime startTime = null;

  public ServicePackageMetadata endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Service package end time in RFC3339 date-time with millisecond accuracy and UTC time zone.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "Service package end time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ServicePackageMetadata remainingQuota(Long remainingQuota) {
    this.remainingQuota = remainingQuota;
    return this;
  }

   /**
   * Current available service package quota.
   * minimum: 0
   * @return remainingQuota
  **/
  @ApiModelProperty(required = true, value = "Current available service package quota.")
  public Long getRemainingQuota() {
    return remainingQuota;
  }

  public void setRemainingQuota(Long remainingQuota) {
    this.remainingQuota = remainingQuota;
  }

  public ServicePackageMetadata reservedQuota(Long reservedQuota) {
    this.reservedQuota = reservedQuota;
    return this;
  }

   /**
   * Sum of all open reservations for this account.
   * minimum: 0
   * @return reservedQuota
  **/
  @ApiModelProperty(required = true, value = "Sum of all open reservations for this account.")
  public Long getReservedQuota() {
    return reservedQuota;
  }

  public void setReservedQuota(Long reservedQuota) {
    this.reservedQuota = reservedQuota;
  }

  public ServicePackageMetadata startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Service package start time in RFC3339 date-time with millisecond accuracy and UTC time zone.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Service package start time in RFC3339 date-time with millisecond accuracy and UTC time zone.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePackageMetadata servicePackageMetadata = (ServicePackageMetadata) o;
    return Objects.equals(this.endTime, servicePackageMetadata.endTime) &&
        Objects.equals(this.remainingQuota, servicePackageMetadata.remainingQuota) &&
        Objects.equals(this.reservedQuota, servicePackageMetadata.reservedQuota) &&
        Objects.equals(this.startTime, servicePackageMetadata.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, remainingQuota, reservedQuota, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackageMetadata {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    remainingQuota: ").append(toIndentedString(remainingQuota)).append("\n");
    sb.append("    reservedQuota: ").append(toIndentedString(reservedQuota)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

