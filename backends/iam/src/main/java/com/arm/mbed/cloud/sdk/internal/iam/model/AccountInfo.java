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
import com.arm.mbed.cloud.sdk.internal.iam.model.AccountInfo;
import com.arm.mbed.cloud.sdk.internal.iam.model.FeaturePolicy;
import com.arm.mbed.cloud.sdk.internal.iam.model.PasswordPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents an account in requests and responses.
 */
@ApiModel(description = "This object represents an account in requests and responses.")

public class AccountInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("end_market")
  private String endMarket = null;

  /**
   * The status of the account.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENROLLING("ENROLLING"),
    
    ACTIVE("ACTIVE"),
    
    RESTRICTED("RESTRICTED"),
    
    SUSPENDED("SUSPENDED");

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

  @SerializedName("password_policy")
  private PasswordPolicy passwordPolicy = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("aliases")
  private List<String> aliases = new ArrayList<String>();

  @SerializedName("address_line2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("address_line1")
  private String addressLine1 = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("is_provisioning_allowed")
  private Boolean isProvisioningAllowed = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("company")
  private String company = null;

  /**
   * Entity name: always &#39;account&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    USER("user"),
    
    API_KEY("api-key"),
    
    GROUP("group"),
    
    ACCOUNT("account"),
    
    ACCOUNT_TEMPLATE("account-template"),
    
    TRUSTED_CERT("trusted-cert"),
    
    LIST("list"),
    
    ERROR("error");

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

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("upgraded_at")
  private DateTime upgradedAt = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("sub_accounts")
  private List<AccountInfo> subAccounts = null;

  @SerializedName("limits")
  private Map<String, String> limits = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("idle_timeout")
  private String idleTimeout = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("policies")
  private List<FeaturePolicy> policies = null;

  @SerializedName("template_id")
  private String templateId = null;

  public AccountInfo endMarket(String endMarket) {
    this.endMarket = endMarket;
    return this;
  }

   /**
   * Account end market.
   * @return endMarket
  **/
  @ApiModelProperty(required = true, value = "Account end market.")
  public String getEndMarket() {
    return endMarket;
  }

  public void setEndMarket(String endMarket) {
    this.endMarket = endMarket;
  }

  public AccountInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the account.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the account.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountInfo passwordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * The password policy for this account.
   * @return passwordPolicy
  **/
  @ApiModelProperty(value = "The password policy for this account.")
  public PasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public AccountInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code part of the postal address.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code part of the postal address.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AccountInfo id(String id) {
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

  public AccountInfo aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public AccountInfo addAliasesItem(String aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * An array of aliases.
   * @return aliases
  **/
  @ApiModelProperty(required = true, value = "An array of aliases.")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public AccountInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Postal address line 2.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Postal address line 2.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AccountInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city part of the postal address.
   * @return city
  **/
  @ApiModelProperty(value = "The city part of the postal address.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Postal address line 1.
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Postal address line 1.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AccountInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for the account.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name for the account.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountInfo parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The ID of the parent account, if it has any.
   * @return parentId
  **/
  @ApiModelProperty(value = "The ID of the parent account, if it has any.")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public AccountInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state part of the postal address.
   * @return state
  **/
  @ApiModelProperty(value = "The state part of the postal address.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AccountInfo etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AccountInfo isProvisioningAllowed(Boolean isProvisioningAllowed) {
    this.isProvisioningAllowed = isProvisioningAllowed;
    return this;
  }

   /**
   * Flag (true/false) indicating whether Factory Tool is allowed to download or not.
   * @return isProvisioningAllowed
  **/
  @ApiModelProperty(required = true, value = "Flag (true/false) indicating whether Factory Tool is allowed to download or not.")
  public Boolean getIsProvisioningAllowed() {
    return isProvisioningAllowed;
  }

  public void setIsProvisioningAllowed(Boolean isProvisioningAllowed) {
    this.isProvisioningAllowed = isProvisioningAllowed;
  }

  public AccountInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The company email address for this account.
   * @return email
  **/
  @ApiModelProperty(value = "The company email address for this account.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the company.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the company.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The name of the company.
   * @return company
  **/
  @ApiModelProperty(value = "The name of the company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountInfo object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;account&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'account'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public AccountInfo reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A reason note for updating the status of the account
   * @return reason
  **/
  @ApiModelProperty(value = "A reason note for updating the status of the account")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AccountInfo upgradedAt(DateTime upgradedAt) {
    this.upgradedAt = upgradedAt;
    return this;
  }

   /**
   * Time when upgraded to commercial account in UTC format RFC3339.
   * @return upgradedAt
  **/
  @ApiModelProperty(value = "Time when upgraded to commercial account in UTC format RFC3339.")
  public DateTime getUpgradedAt() {
    return upgradedAt;
  }

  public void setUpgradedAt(DateTime upgradedAt) {
    this.upgradedAt = upgradedAt;
  }

  public AccountInfo tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * The tier level of the account; &#39;0&#39;: free tier, &#39;1&#39;: commercial account. Other values are reserved for the future.
   * @return tier
  **/
  @ApiModelProperty(required = true, value = "The tier level of the account; '0': free tier, '1': commercial account. Other values are reserved for the future.")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public AccountInfo subAccounts(List<AccountInfo> subAccounts) {
    this.subAccounts = subAccounts;
    return this;
  }

  public AccountInfo addSubAccountsItem(AccountInfo subAccountsItem) {
    if (this.subAccounts == null) {
      this.subAccounts = new ArrayList<AccountInfo>();
    }
    this.subAccounts.add(subAccountsItem);
    return this;
  }

   /**
   * List of sub accounts.
   * @return subAccounts
  **/
  @ApiModelProperty(value = "List of sub accounts.")
  public List<AccountInfo> getSubAccounts() {
    return subAccounts;
  }

  public void setSubAccounts(List<AccountInfo> subAccounts) {
    this.subAccounts = subAccounts;
  }

  public AccountInfo limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  public AccountInfo putLimitsItem(String key, String limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<String, String>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * List of limits as key-value pairs if requested.
   * @return limits
  **/
  @ApiModelProperty(value = "List of limits as key-value pairs if requested.")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public AccountInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country part of the postal address.
   * @return country
  **/
  @ApiModelProperty(value = "The country part of the postal address.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountInfo createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AccountInfo idleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
    return this;
  }

   /**
   * The reference token expiration time in minutes for this account.
   * @return idleTimeout
  **/
  @ApiModelProperty(value = "The reference token expiration time in minutes for this account.")
  public String getIdleTimeout() {
    return idleTimeout;
  }

  public void setIdleTimeout(String idleTimeout) {
    this.idleTimeout = idleTimeout;
  }

  public AccountInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The name of the contact person for this account.
   * @return contact
  **/
  @ApiModelProperty(value = "The name of the contact person for this account.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public AccountInfo policies(List<FeaturePolicy> policies) {
    this.policies = policies;
    return this;
  }

  public AccountInfo addPoliciesItem(FeaturePolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<FeaturePolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * List of policies if requested.
   * @return policies
  **/
  @ApiModelProperty(value = "List of policies if requested.")
  public List<FeaturePolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<FeaturePolicy> policies) {
    this.policies = policies;
  }

  public AccountInfo templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Account template ID.
   * @return templateId
  **/
  @ApiModelProperty(value = "Account template ID.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.endMarket, accountInfo.endMarket) &&
        Objects.equals(this.status, accountInfo.status) &&
        Objects.equals(this.passwordPolicy, accountInfo.passwordPolicy) &&
        Objects.equals(this.postalCode, accountInfo.postalCode) &&
        Objects.equals(this.id, accountInfo.id) &&
        Objects.equals(this.aliases, accountInfo.aliases) &&
        Objects.equals(this.addressLine2, accountInfo.addressLine2) &&
        Objects.equals(this.city, accountInfo.city) &&
        Objects.equals(this.addressLine1, accountInfo.addressLine1) &&
        Objects.equals(this.displayName, accountInfo.displayName) &&
        Objects.equals(this.parentId, accountInfo.parentId) &&
        Objects.equals(this.state, accountInfo.state) &&
        Objects.equals(this.etag, accountInfo.etag) &&
        Objects.equals(this.isProvisioningAllowed, accountInfo.isProvisioningAllowed) &&
        Objects.equals(this.email, accountInfo.email) &&
        Objects.equals(this.phoneNumber, accountInfo.phoneNumber) &&
        Objects.equals(this.company, accountInfo.company) &&
        Objects.equals(this.object, accountInfo.object) &&
        Objects.equals(this.reason, accountInfo.reason) &&
        Objects.equals(this.upgradedAt, accountInfo.upgradedAt) &&
        Objects.equals(this.tier, accountInfo.tier) &&
        Objects.equals(this.subAccounts, accountInfo.subAccounts) &&
        Objects.equals(this.limits, accountInfo.limits) &&
        Objects.equals(this.country, accountInfo.country) &&
        Objects.equals(this.createdAt, accountInfo.createdAt) &&
        Objects.equals(this.idleTimeout, accountInfo.idleTimeout) &&
        Objects.equals(this.contact, accountInfo.contact) &&
        Objects.equals(this.policies, accountInfo.policies) &&
        Objects.equals(this.templateId, accountInfo.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMarket, status, passwordPolicy, postalCode, id, aliases, addressLine2, city, addressLine1, displayName, parentId, state, etag, isProvisioningAllowed, email, phoneNumber, company, object, reason, upgradedAt, tier, subAccounts, limits, country, createdAt, idleTimeout, contact, policies, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    endMarket: ").append(toIndentedString(endMarket)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    isProvisioningAllowed: ").append(toIndentedString(isProvisioningAllowed)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    upgradedAt: ").append(toIndentedString(upgradedAt)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

