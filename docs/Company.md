

# Company

# The Company Object ### Description The `Company` object is used to represent a Company.  ### Usage Example Fetch from the `LIST Companies` endpoint and filter by `ID` to show all companies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**legalName** | **String** | The company&#39;s legal name. |  [optional]
**displayName** | **String** | The company&#39;s display name. |  [optional]
**eins** | **List&lt;String&gt;** | The company&#39;s Employer Identification Numbers. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



