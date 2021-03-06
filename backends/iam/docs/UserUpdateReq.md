
# UserUpdateReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Address, not longer than 100 characters. |  [optional]
**email** | **String** | The email address, not longer than 254 characters. |  [optional]
**fullName** | **String** | The full name of the user, not longer than 100 characters. |  [optional]
**groups** | **List&lt;String&gt;** | A list of group IDs this user belongs to. |  [optional]
**isGtcAccepted** | **Boolean** | A flag indicating that the General Terms and Conditions has been accepted. |  [optional]
**isMarketingAccepted** | **Boolean** | A flag indicating that receiving marketing information has been accepted. |  [optional]
**isTotpEnabled** | **Boolean** | A flag indicating whether 2-factor authentication (TOTP) has to be enabled or disabled. |  [optional]
**loginProfiles** | **List&lt;String&gt;** | A list of login profiles for the user. Specified as IDs of the identity providers the user should be associated with. The list cannot be empty. A limit of 100 profiles. |  [optional]
**phoneNumber** | **String** | Phone number, not longer than 100 characters. |  [optional]
**status** | **String** | The status of the user. |  [optional]
**username** | **String** | A username containing alphanumerical letters and -,._@+&#x3D; characters. It must be at least 4 but not more than 30 character long. |  [optional]



