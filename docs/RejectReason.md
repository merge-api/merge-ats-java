

# RejectReason

# The RejectReason Object ### Description The `RejectReason` object is used to represent a reason for rejecting an application.  ### Usage Example Fetch from the `LIST RejectReasons` endpoint and filter by `ID` to show all reasons.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The rejection reason’s name. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



