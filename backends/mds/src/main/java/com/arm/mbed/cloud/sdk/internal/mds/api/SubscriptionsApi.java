package com.arm.mbed.cloud.sdk.internal.mds.api;

import com.arm.mbed.cloud.sdk.internal.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.arm.mbed.cloud.sdk.internal.mds.model.AsyncID;
import com.arm.mbed.cloud.sdk.internal.mds.model.PresubscriptionArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SubscriptionsApi {
  /**
   * Remove all subscriptions
   * Removes subscriptions from every endpoint and resource. Note that this does not remove pre-subscriptions.  **Example usage:**      curl -X DELETE https://api.us-east-1.mbedcloud.com/v2/subscriptions -H &#39;authorization: Bearer {api-key}&#39; 
   * @return Call&lt;Void&gt;
   */
  @DELETE("v2/subscriptions")
  Call<Void> v2SubscriptionsDelete();
    

  /**
   * Delete subscriptions from an endpoint
   * Deletes all resource subscriptions in a single endpoint.  **Example usage:**      curl -X DELETE \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id} \\       -H &#39;authorization: Bearer {api-key}&#39; 
   * @param deviceId A unique mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("v2/subscriptions/{device-id}")
  Call<Void> v2SubscriptionsDeviceIdDelete(
    @retrofit2.http.Path(value = "device-id", encoded = true) String deviceId
  );

  /**
   * Read endpoints subscriptions
   * Lists all subscribed resources from a single endpoint.  **Example usage:**      curl -X GET \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id} \\       -H &#39;authorization: Bearer {api-key}&#39; 
   * @param deviceId A unique mbed Cloud device ID for the endpoint. Note that ID must be an exact match. You cannot use wildcards here.  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("v2/subscriptions/{device-id}")
  Call<Void> v2SubscriptionsDeviceIdGet(
    @retrofit2.http.Path(value = "device-id", encoded = true) String deviceId
  );

  /**
   * Remove a subscription
   * To remove an existing subscription from a resource path.  **Example usage:**      curl -X DELETE \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id}/{resourcePath} \\       -H &#39;authorization: Bearer {api-key}&#39; 
   * @param deviceId A unique mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  (required)
   * @param resourcePath The URL of the resource.  (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("v2/subscriptions/{device-id}/{resourcePath}")
  Call<Void> v2SubscriptionsDeviceIdResourcePathDelete(
    @retrofit2.http.Path(value = "device-id", encoded = true) String deviceId, @retrofit2.http.Path(value = "resourcePath", encoded = true) String resourcePath
  );

  /**
   * Read subscription status
   * 
   * @param deviceId A unique mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  (required)
   * @param resourcePath The URL of the resource.  (required)
   * @return Call&lt;Void&gt;
   */
  @GET("v2/subscriptions/{device-id}/{resourcePath}")
  Call<Void> v2SubscriptionsDeviceIdResourcePathGet(
    @retrofit2.http.Path(value = "device-id", encoded = true) String deviceId, @retrofit2.http.Path(value = "resourcePath", encoded = true) String resourcePath
  );

  /**
   * Subscribe to a resource path
   * The mbed Cloud Connect eventing model consists of observable resources.  This means that endpoints can deliver updated resource content, periodically or with a more sophisticated  solution-dependent logic. The OMA LWM2M resource model including objects, object instances,  resources and resource instances is also supported.  Applications can subscribe to objects, object instances or individual resources to make the device  to provide value change notifications to mbed Cloud Connect service. An application needs to call a &#x60;/notification/callback&#x60; method to get mbed Cloud Connect to push notifications of the resource changes.  The manual subscriptions are removed during a full device registration and applications need to  re-subscribe at that point. To avoid this, you can use &#x60;/subscriptions&#x60; to set a pre-subscription.  **Example usage:**      curl -X PUT \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id}/{resourcePath} \\       -H &#39;authorization: Bearer {api-key}&#39; 
   * @param deviceId A unique mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  (required)
   * @param resourcePath The URL of the resource.  (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("v2/subscriptions/{device-id}/{resourcePath}")
  Call<Void> v2SubscriptionsDeviceIdResourcePathPut(
    @retrofit2.http.Path(value = "device-id", encoded = true) String deviceId, @retrofit2.http.Path(value = "resourcePath", encoded = true) String resourcePath
  );

  /**
   * Get pre-subscriptions
   * You can retrieve the pre-subscription data by using a GET operation. The server returns with the same JSON structure  as described above. If there are no pre-subscribed resources, it returns with an empty array.  **Example usage:**      curl -X GET https://api.us-east-1.mbedcloud.com/v2/subscriptions -H &#39;authorization: Bearer {api-key}&#39; 
   * @return Call&lt;PresubscriptionArray&gt;
   */
  @GET("v2/subscriptions")
  Call<PresubscriptionArray> v2SubscriptionsGet();
    

  /**
   * Set pre-subscriptions
   * Pre-subscription is a set of rules and patterns put by the application. When an endpoint registers  and its ID, type and registered resources match the pre-subscription data, mbed Cloud Connect sends  subscription requests to the device automatically. The pattern may include the endpoint ID  (optionally having an &#x60;*&#x60; character at the end), endpoint type, a list of resources or expressions with an &#x60;*&#x60; character at the end. Subscriptions based on pre-subscriptions are done when device registers or does register update. To remove the pre-subscription data, put an empty array as a rule.  **Example request:**  &#x60;&#x60;&#x60; curl -X PUT \\   https://api.us-east-1.mbedcloud.com/v2/subscriptions \\   -H &#39;authorization: Bearer {api-key}&#39; \\   -H &#39;content-type: application/json&#39; \\   -d &#39;[          {            \&quot;endpoint-name\&quot;: \&quot;node-001\&quot;,            \&quot;resource-path\&quot;: [\&quot;/dev\&quot;]          },          {            \&quot;endpoint-type\&quot;: \&quot;Light\&quot;,            \&quot;resource-path\&quot;: [\&quot;/sen/_*\&quot;]          },          {            \&quot;endpoint-name\&quot;: \&quot;node*\&quot;          },          {            \&quot;endpoint-type\&quot;: \&quot;Sensor\&quot;          },          {            \&quot;resource-path\&quot;: [\&quot;/dev/temp\&quot;,\&quot;/dev/hum\&quot;]          }       ]&#39; &#x60;&#x60;&#x60; 
   * @param presubsription Array of pre-subscriptions. (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("v2/subscriptions")
  Call<Void> v2SubscriptionsPut(
    @retrofit2.http.Body PresubscriptionArray presubsription
  );

}