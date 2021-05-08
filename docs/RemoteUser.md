

# RemoteUser

# The RemoteUser Object ### Description The `RemoteUser` object is used to represent a third party user.  ### Usage Example Fetch from the `LIST RemoteUsers` endpoint to show all users for a third party.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**firstName** | **String** | The user&#39;s first name. |  [optional]
**lastName** | **String** | The user&#39;s last name. |  [optional]
**email** | **String** | The user&#39;s email. |  [optional]
**disabled** | **Boolean** | Whether the user&#39;s account had been disabled. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s user was created. |  [optional]
**accessRole** | [**AccessRoleEnum**](AccessRoleEnum.md) | The user&#39;s role. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



