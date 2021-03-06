/*
 * Billing API
 * Billing API allows commercial users to retrieve billing reports and service package details.  **Billing Reports:**  Billing reports for the previous month are generated automatically during the third business day of the current month. The reports will be available usually by 02:00 AM UTC.  **Service package:**  A service package can be created for the commercial accounts with a specific number of firmware updates referred to as the service package quota. A customer can only perform device updates equal to the number of firmware updates linked to an active service package. A customer needs to purchase a new service package or renew an active service package if they have consumed all the quota linked to an active service package.  Aggregator customers share their service package quota with their own subtenant accounts. A subtenant can create campaigns utilizing their parent's service package quota. A subtenant cannot create or manage service packages on their own. The quota usage history is recorded separately between the aggregator and its subtenants.  **Service package events:**  The following service package events are included in the API responses:  **reservation:**  A reservation event refers to the creation of a new update campaign with an estimated number of firmware updates.  **reservation_release:**  A reservation_release event refers to closing an update campaign. The unused quota reserved through the update campaign will be added to the active service package quota at this point.  **reservation_termination:**  A reservation_termination event refers to the termination of an update campaign due to the expiration of an active service package. The unused quota reserved through the update campaign cannot be used anymore as the active service package is expired.  **package_creation:**  A package_creation event refers to the creation of a new service package.  **package_renewal:**  A package_renewal event refers to the renewal of an active service package before it expires.  **package_termination:**  A package_termination event refers to the expiration of an active service package. The unused quota linked to the expired service package cannot be used anymore. 
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
import com.arm.mbed.cloud.sdk.internal.billing.model.ActiveServicePackage;
import com.arm.mbed.cloud.sdk.internal.billing.model.PendingServicePackage;
import com.arm.mbed.cloud.sdk.internal.billing.model.PreviousServicePackage;
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
 * Contains service package information for currently active service package, currently pending service package and all previous service packages this account has had.
 */
@ApiModel(description = "Contains service package information for currently active service package, currently pending service package and all previous service packages this account has had.")

public class ServicePackagesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("active")
  private ActiveServicePackage active = null;

  /**
   * Always set to &#39;service-packages&#39;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PACKAGES("service-packages");

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

  @SerializedName("pending")
  private PendingServicePackage pending = null;

  @SerializedName("previous")
  private List<PreviousServicePackage> previous = new ArrayList<PreviousServicePackage>();

  public ServicePackagesResponse active(ActiveServicePackage active) {
    this.active = active;
    return this;
  }

   /**
   * Currently active service package. Can be null.
   * @return active
  **/
  @ApiModelProperty(value = "Currently active service package. Can be null.")
  public ActiveServicePackage getActive() {
    return active;
  }

  public void setActive(ActiveServicePackage active) {
    this.active = active;
  }

  public ServicePackagesResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Always set to &#39;service-packages&#39;.
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Always set to 'service-packages'.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ServicePackagesResponse pending(PendingServicePackage pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Current pending service package. Can be null.
   * @return pending
  **/
  @ApiModelProperty(value = "Current pending service package. Can be null.")
  public PendingServicePackage getPending() {
    return pending;
  }

  public void setPending(PendingServicePackage pending) {
    this.pending = pending;
  }

  public ServicePackagesResponse previous(List<PreviousServicePackage> previous) {
    this.previous = previous;
    return this;
  }

  public ServicePackagesResponse addPreviousItem(PreviousServicePackage previousItem) {
    this.previous.add(previousItem);
    return this;
  }

   /**
   * List of previous service packages.
   * @return previous
  **/
  @ApiModelProperty(required = true, value = "List of previous service packages.")
  public List<PreviousServicePackage> getPrevious() {
    return previous;
  }

  public void setPrevious(List<PreviousServicePackage> previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePackagesResponse servicePackagesResponse = (ServicePackagesResponse) o;
    return Objects.equals(this.active, servicePackagesResponse.active) &&
        Objects.equals(this.object, servicePackagesResponse.object) &&
        Objects.equals(this.pending, servicePackagesResponse.pending) &&
        Objects.equals(this.previous, servicePackagesResponse.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, object, pending, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePackagesResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

