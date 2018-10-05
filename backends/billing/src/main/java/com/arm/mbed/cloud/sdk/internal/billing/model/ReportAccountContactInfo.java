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
import java.io.Serializable;

/**
 * Account contact information.
 */
@ApiModel(description = "Account contact information.")

public class ReportAccountContactInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state")
  private String state = null;

  public ReportAccountContactInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ReportAccountContactInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ReportAccountContactInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ReportAccountContactInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ReportAccountContactInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public ReportAccountContactInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ReportAccountContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ReportAccountContactInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Account ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Account ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportAccountContactInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ReportAccountContactInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ReportAccountContactInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAccountContactInfo reportAccountContactInfo = (ReportAccountContactInfo) o;
    return Objects.equals(this.addressLine1, reportAccountContactInfo.addressLine1) &&
        Objects.equals(this.addressLine2, reportAccountContactInfo.addressLine2) &&
        Objects.equals(this.city, reportAccountContactInfo.city) &&
        Objects.equals(this.company, reportAccountContactInfo.company) &&
        Objects.equals(this.contact, reportAccountContactInfo.contact) &&
        Objects.equals(this.country, reportAccountContactInfo.country) &&
        Objects.equals(this.email, reportAccountContactInfo.email) &&
        Objects.equals(this.id, reportAccountContactInfo.id) &&
        Objects.equals(this.phoneNumber, reportAccountContactInfo.phoneNumber) &&
        Objects.equals(this.postalCode, reportAccountContactInfo.postalCode) &&
        Objects.equals(this.state, reportAccountContactInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, company, contact, country, email, id, phoneNumber, postalCode, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAccountContactInfo {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

