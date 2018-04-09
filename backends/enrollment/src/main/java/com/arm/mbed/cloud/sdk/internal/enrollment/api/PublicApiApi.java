package com.arm.mbed.cloud.sdk.internal.enrollment.api;

import com.arm.mbed.cloud.sdk.internal.enrollment.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.arm.mbed.cloud.sdk.internal.enrollment.model.EnrollmentId;
import com.arm.mbed.cloud.sdk.internal.enrollment.model.EnrollmentIdentities;
import com.arm.mbed.cloud.sdk.internal.enrollment.model.EnrollmentIdentity;
import com.arm.mbed.cloud.sdk.internal.enrollment.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PublicApiApi {
  /**
   * Place an enrollment claim for one or several devices.
   * When the device connects to the bootstrap server and provides the enrollment ID, it will be assigned to your account. 
   * @param enrollmentIdentity  (required)
   * @return Call&lt;EnrollmentIdentity&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v3/device-enrollments")
  Call<EnrollmentIdentity> createDeviceEnrollment(
    @retrofit2.http.Body EnrollmentId enrollmentIdentity
  );

  /**
   * Delete an enrollment by ID.
   * To free a device from your account you can delete the enrollment claim. To bypass the device ownership, you need to delete the enrollment and do a factory reset for the device. For more information on the ownership trasfer, see [https://github.com/ARMmbed/mbed_Cloud_Docs/blob/restructure/Docs/provisioning/generic_instructions/device-ownership.md#transferring-ownership-using-first-to-claim](TODO put the right link).
   * @param id Enrollment identity internal id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("v3/device-enrollments/{id}")
  Call<Void> deleteDeviceEnrollment(
    @retrofit2.http.Path(value = "id", encoded = true) String id
  );

  /**
   * Get details of an enrollment by ID.
   * To check the enrollment info in detail, for example claming date and expiration date.
   * @param id Enrollment identity internal id (required)
   * @return Call&lt;EnrollmentIdentity&gt;
   */
  @GET("v3/device-enrollments/{id}")
  Call<EnrollmentIdentity> getDeviceEnrollment(
    @retrofit2.http.Path(value = "id", encoded = true) String id
  );

  /**
   * Get enrollment list.
   * Provides a list of pending and claimed enrollments. Example usage: 
   * @param limit Number of results to be returned. Between 2 and 1000, inclusive. (optional)
   * @param after Entity ID to fetch after. (optional)
   * @param order ASC or DESC (optional, default to ASC)
   * @param include Comma separate additional data to return. Currently supported: total_count (optional)
   * @return Call&lt;EnrollmentIdentities&gt;
   */
  @GET("v3/device-enrollments")
  Call<EnrollmentIdentities> getDeviceEnrollments(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("include") String include
  );

}