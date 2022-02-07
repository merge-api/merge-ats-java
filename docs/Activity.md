

# Activity

# The Activity Object ### Description The `Activity` object is used to represent an activity performed by a user. ### Usage Example Fetch from the `LIST Activities` endpoint and filter by `ID` to show all activities.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**user** | **UUID** |  |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s activity was created. |  [optional]
**activityType** | [**ActivityTypeEnum**](ActivityTypeEnum.md) | The activity&#39;s type. |  [optional]
**subject** | **String** | The activity&#39;s subject. |  [optional]
**body** | **String** | The activity&#39;s body. |  [optional]
**visibility** | [**VisibilityEnum**](VisibilityEnum.md) | The activity&#39;s visibility. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



