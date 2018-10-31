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
import com.arm.mbed.cloud.sdk.internal.iam.model.LoginProfileResp;
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents an user invitation in responses.
 */
@ApiModel(description = "This object represents an user invitation in responses.")

public class UserInvitationResp implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("expiration")
  private DateTime expiration = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("login_profiles")
  private List<LoginProfileResp> loginProfiles = null;

  /**
   * Entity name: always &#39;user-invitation&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    INVITATION("user-invitation");

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

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("user_id")
  private String userId = null;

  public UserInvitationResp accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The UUID of the account the user is invited to.
   * @return accountId
  **/
  @ApiModelProperty(example = "01619571e2e90242ac12000600000000", required = true, value = "The UUID of the account the user is invited to.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserInvitationResp createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-02-13T09:35:20Z", required = true, value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserInvitationResp email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the invited user.
   * @return email
  **/
  @ApiModelProperty(example = "friend@arm.com", required = true, value = "Email address of the invited user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInvitationResp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(example = "1", required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public UserInvitationResp expiration(DateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Invitation expiration as UTC time RFC3339.
   * @return expiration
  **/
  @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Invitation expiration as UTC time RFC3339.")
  public DateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(DateTime expiration) {
    this.expiration = expiration;
  }

  public UserInvitationResp groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserInvitationResp addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of IDs of the groups the user is invited to.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of IDs of the groups the user is invited to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserInvitationResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID of the invitation.
   * @return id
  **/
  @ApiModelProperty(example = "01619571e2e89242ac12000600000000", required = true, value = "The UUID of the invitation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserInvitationResp loginProfiles(List<LoginProfileResp> loginProfiles) {
    this.loginProfiles = loginProfiles;
    return this;
  }

  public UserInvitationResp addLoginProfilesItem(LoginProfileResp loginProfilesItem) {
    if (this.loginProfiles == null) {
      this.loginProfiles = new ArrayList<LoginProfileResp>();
    }
    this.loginProfiles.add(loginProfilesItem);
    return this;
  }

   /**
   * A list of login profiles for the user. Specified as the identity providers the user is associated with.
   * @return loginProfiles
  **/
  @ApiModelProperty(value = "A list of login profiles for the user. Specified as the identity providers the user is associated with.")
  public List<LoginProfileResp> getLoginProfiles() {
    return loginProfiles;
  }

  public void setLoginProfiles(List<LoginProfileResp> loginProfiles) {
    this.loginProfiles = loginProfiles;
  }

  public UserInvitationResp object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;user-invitation&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'user-invitation'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public UserInvitationResp updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update UTC time RFC3339.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Last update UTC time RFC3339.")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserInvitationResp userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The UUID of the invited user.
   * @return userId
  **/
  @ApiModelProperty(example = "01619571e2e90242ac12000600000000", required = true, value = "The UUID of the invited user.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitationResp userInvitationResp = (UserInvitationResp) o;
    return Objects.equals(this.accountId, userInvitationResp.accountId) &&
        Objects.equals(this.createdAt, userInvitationResp.createdAt) &&
        Objects.equals(this.email, userInvitationResp.email) &&
        Objects.equals(this.etag, userInvitationResp.etag) &&
        Objects.equals(this.expiration, userInvitationResp.expiration) &&
        Objects.equals(this.groups, userInvitationResp.groups) &&
        Objects.equals(this.id, userInvitationResp.id) &&
        Objects.equals(this.loginProfiles, userInvitationResp.loginProfiles) &&
        Objects.equals(this.object, userInvitationResp.object) &&
        Objects.equals(this.updatedAt, userInvitationResp.updatedAt) &&
        Objects.equals(this.userId, userInvitationResp.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdAt, email, etag, expiration, groups, id, loginProfiles, object, updatedAt, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationResp {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loginProfiles: ").append(toIndentedString(loginProfiles)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
