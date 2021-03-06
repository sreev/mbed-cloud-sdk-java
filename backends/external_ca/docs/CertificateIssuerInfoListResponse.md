
# CertificateIssuerInfoListResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **String** | An offset token for current page. |  [optional]
**data** | [**List&lt;CertificateIssuerInfo&gt;**](CertificateIssuerInfo.md) | List of certificate issuers. |  [optional]
**hasMore** | **Boolean** | Are there more results available. |  [optional]
**limit** | **Integer** | How many objects to retrieve in the page. The minimum limit is 2 and the maximum is 1000. Limit values outside of this range are set to the closest limit. |  [optional]
**object** | **String** | The type of this API object is a &#x60;list&#x60;. |  [optional]
**order** | **String** | The creation time based order of the entries. |  [optional]
**totalCount** | **Integer** |  |  [optional]



