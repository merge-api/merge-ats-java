

# Office

# The Office Object ### Description The `Office` object is used to represent an office within a company.  ### Usage Example Fetch from the `LIST Offices` endpoint and view the offices within a company.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The office&#39;s name. |  [optional]
**location** | **String** | The office&#39;s location. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



