# DefaultApi

All URIs are relative to *https://api.us-east-1.mbedcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**firmwareImageCreate**](DefaultApi.md#firmwareImageCreate) | **POST** v3/firmware-images/ | Create an image
[**firmwareImageDestroy**](DefaultApi.md#firmwareImageDestroy) | **DELETE** v3/firmware-images/{image_id}/ | Delete an image
[**firmwareImageList**](DefaultApi.md#firmwareImageList) | **GET** v3/firmware-images/ | List all images
[**firmwareImageRetrieve**](DefaultApi.md#firmwareImageRetrieve) | **GET** v3/firmware-images/{image_id}/ | Get an image
[**firmwareManifestCreate**](DefaultApi.md#firmwareManifestCreate) | **POST** v3/firmware-manifests/ | Create a manifest
[**firmwareManifestDestroy**](DefaultApi.md#firmwareManifestDestroy) | **DELETE** v3/firmware-manifests/{manifest_id}/ | Delete a manifest
[**firmwareManifestList**](DefaultApi.md#firmwareManifestList) | **GET** v3/firmware-manifests/ | List manifests
[**firmwareManifestRetrieve**](DefaultApi.md#firmwareManifestRetrieve) | **GET** v3/firmware-manifests/{manifest_id}/ | Get a manifest
[**updateCampaignCreate**](DefaultApi.md#updateCampaignCreate) | **POST** v3/update-campaigns/ | Create a campaign
[**updateCampaignDestroy**](DefaultApi.md#updateCampaignDestroy) | **DELETE** v3/update-campaigns/{campaign_id}/ | Delete a campaign
[**updateCampaignList**](DefaultApi.md#updateCampaignList) | **GET** v3/update-campaigns/ | List all campaigns
[**updateCampaignMetadataList**](DefaultApi.md#updateCampaignMetadataList) | **GET** v3/update-campaigns/{campaign_id}/campaign-device-metadata/ | List all campaign device metadata
[**updateCampaignMetadataRetrieve**](DefaultApi.md#updateCampaignMetadataRetrieve) | **GET** v3/update-campaigns/{campaign_id}/campaign-device-metadata/{campaign_device_metadata_id}/ | Get a campaign device metadata
[**updateCampaignMetadataStop**](DefaultApi.md#updateCampaignMetadataStop) | **POST** v3/update-campaigns/{campaign_id}/stop | Stop a running campaign
[**updateCampaignRetrieve**](DefaultApi.md#updateCampaignRetrieve) | **GET** v3/update-campaigns/{campaign_id}/ | Get a campaign.
[**updateCampaignUpdate**](DefaultApi.md#updateCampaignUpdate) | **PUT** v3/update-campaigns/{campaign_id}/ | Modify a campaign


<a name="firmwareImageCreate"></a>
# **firmwareImageCreate**
> FirmwareImage firmwareImageCreate(datafile, name, description)

Create an image

Create firmware image.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
File datafile = new File("/path/to/file.txt"); // File | The firmware image file to upload
String name = "name_example"; // String | The name of the firmware image
String description = "description_example"; // String | The description of the firmware image
try {
    FirmwareImage result = apiInstance.firmwareImageCreate(datafile, name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareImageCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datafile** | **File**| The firmware image file to upload |
 **name** | **String**| The name of the firmware image |
 **description** | **String**| The description of the firmware image | [optional]

### Return type

[**FirmwareImage**](FirmwareImage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="firmwareImageDestroy"></a>
# **firmwareImageDestroy**
> Void firmwareImageDestroy(imageId)

Delete an image

Delete firmware image.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String imageId = "imageId_example"; // String | The firmware image ID
try {
    Void result = apiInstance.firmwareImageDestroy(imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareImageDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageId** | **String**| The firmware image ID |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firmwareImageList"></a>
# **firmwareImageList**
> FirmwareImagePage firmwareImageList(limit, order, after, filter, include)

List all images

List all firmware images.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | How many firmware images to retrieve
String order = "order_example"; // String | ASC or DESC
String after = "after_example"; // String | The ID of the the item after which to retrieve the next page
String filter = "filter_example"; // String | URL-encoded query string parameter to filter returned data  `?filter={URL-encoded query string}`  ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  <table>   <thead>     <tr>       <th>Field</th>       <th>= / __eq / __neq</th>       <th>__in /  __nin</th>       <th>__lte / __gte</th>     <tr>   <thead>   <tbody>     <tr>       <td>created_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>datafile</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>datafile_checksum</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>datafile_size</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>description</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>etag</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>id</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>name</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>timestamp</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>updated_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>   </tbody> </table> &nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: `key1=value1&key2=value2&key3=value3`  would be URL-encoded as: `?filter=key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3`   **Filtering by properties** `name__eq=myimage`  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, `YYYY-MM-DDThh:mm:ss.msZ`. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: `2016-11-30T16:25:12.1234Z` * UTC RFC3339 without milliseconds. Example: `2016-11-30T16:25:12Z` * UTC RFC3339 shortened without milliseconds and punctuation. Example: `20161130T162512Z`  Date-time filtering supports three operators:  * equality by appending `__eq` to the field name * greater than or equal to by appending `__gte` to the field name * less than or equal to by appending `__lte` to the field name  `{field name}[|__eq|__lte|__gte]={UTC RFC3339 date-time}`  Time ranges may be specified by including both the `__gte` and `__lte` forms in the filter. For example:  `created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering on multiple fields**  `name__eq=myimage&created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: `__eq` * non-equality: `__neq` * in : `__in` * not in: `__nin`  For `__in` and `__nin` filters list of parameters must be comma-separated:  `name__in=fw-image1,fw-image2`
String include = "include_example"; // String | Comma-separated list of data fields to return. Currently supported: total_count
try {
    FirmwareImagePage result = apiInstance.firmwareImageList(limit, order, after, filter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareImageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many firmware images to retrieve | [optional]
 **order** | **String**| ASC or DESC | [optional]
 **after** | **String**| The ID of the the item after which to retrieve the next page | [optional]
 **filter** | **String**| URL-encoded query string parameter to filter returned data  &#x60;?filter&#x3D;{URL-encoded query string}&#x60;  ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Field&lt;/th&gt;       &lt;th&gt;&#x3D; / __eq / __neq&lt;/th&gt;       &lt;th&gt;__in /  __nin&lt;/th&gt;       &lt;th&gt;__lte / __gte&lt;/th&gt;     &lt;tr&gt;   &lt;thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;created_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;datafile&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;datafile_checksum&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;datafile_size&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;description&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;etag&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;id&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;name&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;timestamp&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;updated_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &amp;nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: &#x60;key1&#x3D;value1&amp;key2&#x3D;value2&amp;key3&#x3D;value3&#x60;  would be URL-encoded as: &#x60;?filter&#x3D;key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3&#x60;   **Filtering by properties** &#x60;name__eq&#x3D;myimage&#x60;  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, &#x60;YYYY-MM-DDThh:mm:ss.msZ&#x60;. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: &#x60;2016-11-30T16:25:12.1234Z&#x60; * UTC RFC3339 without milliseconds. Example: &#x60;2016-11-30T16:25:12Z&#x60; * UTC RFC3339 shortened without milliseconds and punctuation. Example: &#x60;20161130T162512Z&#x60;  Date-time filtering supports three operators:  * equality by appending &#x60;__eq&#x60; to the field name * greater than or equal to by appending &#x60;__gte&#x60; to the field name * less than or equal to by appending &#x60;__lte&#x60; to the field name  &#x60;{field name}[|__eq|__lte|__gte]&#x3D;{UTC RFC3339 date-time}&#x60;  Time ranges may be specified by including both the &#x60;__gte&#x60; and &#x60;__lte&#x60; forms in the filter. For example:  &#x60;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering on multiple fields**  &#x60;name__eq&#x3D;myimage&amp;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: &#x60;__eq&#x60; * non-equality: &#x60;__neq&#x60; * in : &#x60;__in&#x60; * not in: &#x60;__nin&#x60;  For &#x60;__in&#x60; and &#x60;__nin&#x60; filters list of parameters must be comma-separated:  &#x60;name__in&#x3D;fw-image1,fw-image2&#x60; | [optional]
 **include** | **String**| Comma-separated list of data fields to return. Currently supported: total_count | [optional]

### Return type

[**FirmwareImagePage**](FirmwareImagePage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firmwareImageRetrieve"></a>
# **firmwareImageRetrieve**
> FirmwareImage firmwareImageRetrieve(imageId)

Get an image

Retrieve firmware image.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String imageId = "imageId_example"; // String | The firmware image ID
try {
    FirmwareImage result = apiInstance.firmwareImageRetrieve(imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareImageRetrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageId** | **String**| The firmware image ID |

### Return type

[**FirmwareImage**](FirmwareImage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firmwareManifestCreate"></a>
# **firmwareManifestCreate**
> FirmwareManifest firmwareManifestCreate(datafile, name, description, keyTable)

Create a manifest

Create firmware manifest.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
File datafile = new File("/path/to/file.txt"); // File | The manifest file to create. The API gateway enforces the account-specific file size.
String name = "name_example"; // String | The name of the firmware manifest
String description = "description_example"; // String | The description of the firmware manifest
File keyTable = new File("/path/to/file.txt"); // File | The key table of pre-shared keys for devices
try {
    FirmwareManifest result = apiInstance.firmwareManifestCreate(datafile, name, description, keyTable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareManifestCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datafile** | **File**| The manifest file to create. The API gateway enforces the account-specific file size. |
 **name** | **String**| The name of the firmware manifest |
 **description** | **String**| The description of the firmware manifest | [optional]
 **keyTable** | **File**| The key table of pre-shared keys for devices | [optional]

### Return type

[**FirmwareManifest**](FirmwareManifest.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="firmwareManifestDestroy"></a>
# **firmwareManifestDestroy**
> Void firmwareManifestDestroy(manifestId)

Delete a manifest

Delete firmware manifest.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String manifestId = "manifestId_example"; // String | The firmware manifest ID
try {
    Void result = apiInstance.firmwareManifestDestroy(manifestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareManifestDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manifestId** | **String**| The firmware manifest ID |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firmwareManifestList"></a>
# **firmwareManifestList**
> FirmwareManifestPage firmwareManifestList(limit, order, after, filter, include)

List manifests

List firmware manifests.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | How many firmware manifests to retrieve
String order = "order_example"; // String | ASC or DESC
String after = "after_example"; // String | The ID of the the item after which to retrieve the next page.
String filter = "filter_example"; // String | URL-encoded query string parameter to filter returned data  `?filter={URL-encoded query string}`  ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  <table>   <thead>     <tr>       <th>Field</th>       <th>= / __eq / __neq</th>       <th>__in /  __nin</th>       <th>__lte / __gte</th>     <tr>   <thead>   <tbody>     <tr>       <td>created_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>datafile</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>datafile_size</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>description</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>device_class</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>etag</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>id</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>name</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>timestamp</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>updated_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>   </tbody> </table> &nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: `key1__eq=value1&key2__eq=value2&key3__eq=value3`  would be URL-encoded as: `?filter=key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3`   **Filtering by properties** `name__eq=mymanifest`  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, `YYYY-MM-DDThh:mm:ss.msZ`. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: `2016-11-30T16:25:12.1234Z` * UTC RFC3339 without milliseconds. Example: `2016-11-30T16:25:12Z` * UTC RFC3339 shortened without milliseconds and punctuation. Example: `20161130T162512Z`  Date-time filtering supports three operators:  * equality by appending `__eq` to the field name * greater than or equal to by appending `__gte` to the field name * less than or equal to by appending `__lte` to the field name  `{field name}[|__eq|__lte|__gte]={UTC RFC3339 date-time}`  Time ranges may be specified by including both the `__gte` and `__lte` forms in the filter. For example:  `created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering on multiple fields**  `name__eq=mymanifest&created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: `__eq` * non-equality: `__neq` * in : `__in` * not in: `__nin`  For `__in` and `__nin` filters list of parameters must be comma-separated:  `name__in=fw-manifest1,fw-manifest2`
String include = "include_example"; // String | Comma-separated list of data fields to return. Currently supported: total_count
try {
    FirmwareManifestPage result = apiInstance.firmwareManifestList(limit, order, after, filter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareManifestList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many firmware manifests to retrieve | [optional]
 **order** | **String**| ASC or DESC | [optional]
 **after** | **String**| The ID of the the item after which to retrieve the next page. | [optional]
 **filter** | **String**| URL-encoded query string parameter to filter returned data  &#x60;?filter&#x3D;{URL-encoded query string}&#x60;  ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Field&lt;/th&gt;       &lt;th&gt;&#x3D; / __eq / __neq&lt;/th&gt;       &lt;th&gt;__in /  __nin&lt;/th&gt;       &lt;th&gt;__lte / __gte&lt;/th&gt;     &lt;tr&gt;   &lt;thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;created_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;datafile&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;datafile_size&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;description&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;device_class&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;etag&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;id&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;name&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;timestamp&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;updated_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &amp;nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: &#x60;key1__eq&#x3D;value1&amp;key2__eq&#x3D;value2&amp;key3__eq&#x3D;value3&#x60;  would be URL-encoded as: &#x60;?filter&#x3D;key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3&#x60;   **Filtering by properties** &#x60;name__eq&#x3D;mymanifest&#x60;  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, &#x60;YYYY-MM-DDThh:mm:ss.msZ&#x60;. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: &#x60;2016-11-30T16:25:12.1234Z&#x60; * UTC RFC3339 without milliseconds. Example: &#x60;2016-11-30T16:25:12Z&#x60; * UTC RFC3339 shortened without milliseconds and punctuation. Example: &#x60;20161130T162512Z&#x60;  Date-time filtering supports three operators:  * equality by appending &#x60;__eq&#x60; to the field name * greater than or equal to by appending &#x60;__gte&#x60; to the field name * less than or equal to by appending &#x60;__lte&#x60; to the field name  &#x60;{field name}[|__eq|__lte|__gte]&#x3D;{UTC RFC3339 date-time}&#x60;  Time ranges may be specified by including both the &#x60;__gte&#x60; and &#x60;__lte&#x60; forms in the filter. For example:  &#x60;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering on multiple fields**  &#x60;name__eq&#x3D;mymanifest&amp;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: &#x60;__eq&#x60; * non-equality: &#x60;__neq&#x60; * in : &#x60;__in&#x60; * not in: &#x60;__nin&#x60;  For &#x60;__in&#x60; and &#x60;__nin&#x60; filters list of parameters must be comma-separated:  &#x60;name__in&#x3D;fw-manifest1,fw-manifest2&#x60; | [optional]
 **include** | **String**| Comma-separated list of data fields to return. Currently supported: total_count | [optional]

### Return type

[**FirmwareManifestPage**](FirmwareManifestPage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firmwareManifestRetrieve"></a>
# **firmwareManifestRetrieve**
> FirmwareManifest firmwareManifestRetrieve(manifestId)

Get a manifest

Retrieve firmware manifest.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String manifestId = "manifestId_example"; // String | The firmware manifest ID
try {
    FirmwareManifest result = apiInstance.firmwareManifestRetrieve(manifestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#firmwareManifestRetrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manifestId** | **String**| The firmware manifest ID |

### Return type

[**FirmwareManifest**](FirmwareManifest.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignCreate"></a>
# **updateCampaignCreate**
> UpdateCampaign updateCampaignCreate(campaign)

Create a campaign

Create an update campaign.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
UpdateCampaignPostRequest campaign = new UpdateCampaignPostRequest(); // UpdateCampaignPostRequest | Update campaign
try {
    UpdateCampaign result = apiInstance.updateCampaignCreate(campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**UpdateCampaignPostRequest**](UpdateCampaignPostRequest.md)| Update campaign |

### Return type

[**UpdateCampaign**](UpdateCampaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignDestroy"></a>
# **updateCampaignDestroy**
> Void updateCampaignDestroy(campaignId)

Delete a campaign

Delete an update campaign.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | The ID of the update campaign
try {
    Void result = apiInstance.updateCampaignDestroy(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignDestroy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| The ID of the update campaign |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignList"></a>
# **updateCampaignList**
> UpdateCampaignPage updateCampaignList(limit, order, after, filter, include)

List all campaigns

Get update campaigns for devices specified by a filter.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | How many update campaigns to retrieve
String order = "order_example"; // String | The order of the records. Acceptable values: ASC, DESC. Default: ASC
String after = "after_example"; // String | The ID of the the item after which to retrieve the next page
String filter = "filter_example"; // String | URL-encoded query string parameter to filter returned data  `?filter={URL-encoded query string}`   ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  <table>   <thead>     <tr>       <th>Field</th>       <th>= / __eq / __neq</th>       <th>__in /  __nin</th>       <th>__lte / __gte</th>     <tr>   <thead>   <tbody>     <tr>       <td>created_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>description</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>device_filter</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>etag</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>finished</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>id</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>name</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>root_manifest_id</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>started_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>state</td>       <td>✓</td>       <td>✓</td>       <td>&nbsp;</td>     </tr>     <tr>       <td>updated_at</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>     <tr>       <td>when</td>       <td>✓</td>       <td>✓</td>       <td>✓</td>     </tr>   </tbody> </table> &nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: `key1__eq=value1&key2__eq=value2&key3__eq=value3`  would be URL-encoded as: `?filter=key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3`   **Filtering by campaign properties** `state__eq=[draft|scheduled|devicefectch|devicecopy|publishing|deploying|deployed|manifestremoved|expired]`  `root_manifest_id__eq=43217771234242e594ddb433816c498a`  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, `YYYY-MM-DDThh:mm:ss.msZ`. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: `2016-11-30T16:25:12.1234Z` * UTC RFC3339 without milliseconds. Example: `2016-11-30T16:25:12Z` * UTC RFC3339 shortened without milliseconds and punctuation. Example: `20161130T162512Z`  Date-time filtering supports three operators:  * equality by appending `__eq` to the field name * greater than or equal to by appending `__gte` to the field name * less than or equal to by appending `__lte` to the field name  `{field name}[|__eq|__lte|__gte]={UTC RFC3339 date-time}`  Time ranges may be specified by including both the `__gte` and `__lte` forms in the filter. For example:  `created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering on multiple fields**  `state__eq=deployed&created_at__gte=2016-11-30T16:25:12.1234Z&created_at__lte=2016-12-30T00:00:00Z`  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: `__eq` * non-equality: `__neq` * in : `__in` * not in: `__nin`  For `__in` and `__nin` filters list of parameters must be comma-separated:  `name__in=fw-image1,fw-image2`
String include = "include_example"; // String | Comma-separated list of data fields to return. Currently supported: total_count
try {
    UpdateCampaignPage result = apiInstance.updateCampaignList(limit, order, after, filter, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many update campaigns to retrieve | [optional]
 **order** | **String**| The order of the records. Acceptable values: ASC, DESC. Default: ASC | [optional]
 **after** | **String**| The ID of the the item after which to retrieve the next page | [optional]
 **filter** | **String**| URL-encoded query string parameter to filter returned data  &#x60;?filter&#x3D;{URL-encoded query string}&#x60;   ###### Filterable fields:  The below table lists all the fields that can be filtered on with certain filters:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Field&lt;/th&gt;       &lt;th&gt;&#x3D; / __eq / __neq&lt;/th&gt;       &lt;th&gt;__in /  __nin&lt;/th&gt;       &lt;th&gt;__lte / __gte&lt;/th&gt;     &lt;tr&gt;   &lt;thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;created_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;description&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;device_filter&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;etag&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;finished&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;id&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;name&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;root_manifest_id&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;started_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;state&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;&amp;nbsp;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;updated_at&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;when&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;       &lt;td&gt;✓&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &amp;nbsp;  The query string is made up of key-value pairs separated by ampersands. For example, this query: &#x60;key1__eq&#x3D;value1&amp;key2__eq&#x3D;value2&amp;key3__eq&#x3D;value3&#x60;  would be URL-encoded as: &#x60;?filter&#x3D;key1__eq%3Dvalue1%26key2__eq%3Dvalue2%26key3__eq%3Dvalue3&#x60;   **Filtering by campaign properties** &#x60;state__eq&#x3D;[draft|scheduled|devicefectch|devicecopy|publishing|deploying|deployed|manifestremoved|expired]&#x60;  &#x60;root_manifest_id__eq&#x3D;43217771234242e594ddb433816c498a&#x60;  **Filtering on date-time fields**  Date-time fields should be specified in UTC RFC3339 format, &#x60;YYYY-MM-DDThh:mm:ss.msZ&#x60;. There are three permitted variations:  * UTC RFC3339 with milliseconds. Example: &#x60;2016-11-30T16:25:12.1234Z&#x60; * UTC RFC3339 without milliseconds. Example: &#x60;2016-11-30T16:25:12Z&#x60; * UTC RFC3339 shortened without milliseconds and punctuation. Example: &#x60;20161130T162512Z&#x60;  Date-time filtering supports three operators:  * equality by appending &#x60;__eq&#x60; to the field name * greater than or equal to by appending &#x60;__gte&#x60; to the field name * less than or equal to by appending &#x60;__lte&#x60; to the field name  &#x60;{field name}[|__eq|__lte|__gte]&#x3D;{UTC RFC3339 date-time}&#x60;  Time ranges may be specified by including both the &#x60;__gte&#x60; and &#x60;__lte&#x60; forms in the filter. For example:  &#x60;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering on multiple fields**  &#x60;state__eq&#x3D;deployed&amp;created_at__gte&#x3D;2016-11-30T16:25:12.1234Z&amp;created_at__lte&#x3D;2016-12-30T00:00:00Z&#x60;  **Filtering with filter operators**  String field filtering supports the following operators:  * equality: &#x60;__eq&#x60; * non-equality: &#x60;__neq&#x60; * in : &#x60;__in&#x60; * not in: &#x60;__nin&#x60;  For &#x60;__in&#x60; and &#x60;__nin&#x60; filters list of parameters must be comma-separated:  &#x60;name__in&#x3D;fw-image1,fw-image2&#x60; | [optional]
 **include** | **String**| Comma-separated list of data fields to return. Currently supported: total_count | [optional]

### Return type

[**UpdateCampaignPage**](UpdateCampaignPage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignMetadataList"></a>
# **updateCampaignMetadataList**
> CampaignDeviceMetadataPage updateCampaignMetadataList(campaignId, limit, order, after, include)

List all campaign device metadata

Get campaign device metadata.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | The update campaign ID
Integer limit = 56; // Integer | How many objects to retrieve in the page
String order = "order_example"; // String | ASC or DESC
String after = "after_example"; // String | The ID of the the item after which to retrieve the next page
String include = "include_example"; // String | Comma-separated list of data fields to return. Currently supported: total_count
try {
    CampaignDeviceMetadataPage result = apiInstance.updateCampaignMetadataList(campaignId, limit, order, after, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignMetadataList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| The update campaign ID |
 **limit** | **Integer**| How many objects to retrieve in the page | [optional]
 **order** | **String**| ASC or DESC | [optional]
 **after** | **String**| The ID of the the item after which to retrieve the next page | [optional]
 **include** | **String**| Comma-separated list of data fields to return. Currently supported: total_count | [optional]

### Return type

[**CampaignDeviceMetadataPage**](CampaignDeviceMetadataPage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignMetadataRetrieve"></a>
# **updateCampaignMetadataRetrieve**
> CampaignDeviceMetadata updateCampaignMetadataRetrieve(campaignId, campaignDeviceMetadataId)

Get a campaign device metadata

Get update campaign metadata.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | The update campaign ID
String campaignDeviceMetadataId = "campaignDeviceMetadataId_example"; // String | The campaign device metadata ID
try {
    CampaignDeviceMetadata result = apiInstance.updateCampaignMetadataRetrieve(campaignId, campaignDeviceMetadataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignMetadataRetrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| The update campaign ID |
 **campaignDeviceMetadataId** | **String**| The campaign device metadata ID |

### Return type

[**CampaignDeviceMetadata**](CampaignDeviceMetadata.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignMetadataStop"></a>
# **updateCampaignMetadataStop**
> Void updateCampaignMetadataStop(campaignId)

Stop a running campaign

Stop a running update campaign.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | The campaign ID
try {
    Void result = apiInstance.updateCampaignMetadataStop(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignMetadataStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| The campaign ID |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignRetrieve"></a>
# **updateCampaignRetrieve**
> UpdateCampaign updateCampaignRetrieve(campaignId)

Get a campaign.

Get an update campaign.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | The campaign ID
try {
    UpdateCampaign result = apiInstance.updateCampaignRetrieve(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignRetrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| The campaign ID |

### Return type

[**UpdateCampaign**](UpdateCampaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaignUpdate"></a>
# **updateCampaignUpdate**
> UpdateCampaign updateCampaignUpdate(campaignId, campaign)

Modify a campaign

Modify an update campaign.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.updateservice.ApiException;
//import com.arm.mbed.cloud.sdk.internal.updateservice.Configuration;
//import com.arm.mbed.cloud.sdk.internal.updateservice.auth.*;
//import com.arm.mbed.cloud.sdk.internal.updateservice.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String campaignId = "campaignId_example"; // String | 
UpdateCampaignPutRequest campaign = new UpdateCampaignPutRequest(); // UpdateCampaignPutRequest | Update campaign
try {
    UpdateCampaign result = apiInstance.updateCampaignUpdate(campaignId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCampaignUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**|  |
 **campaign** | [**UpdateCampaignPutRequest**](UpdateCampaignPutRequest.md)| Update campaign |

### Return type

[**UpdateCampaign**](UpdateCampaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

