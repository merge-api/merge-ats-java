

# Job

# The Job Object ### Description The `Job` object is used to represent a Job offering at a company. ### Usage Example Fetch from the `LIST Jobs` endpoint to show all job postings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The job&#39;s name. |  [optional]
**description** | **String** | The job&#39;s description. |  [optional]
**code** | **String** | The job&#39;s code. Typically an additional identifier used to reference the particular job that is displayed on the ATS. |  [optional]
**status** | [**JobStatusEnum**](JobStatusEnum.md) | The job&#39;s status. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s job was created. |  [optional]
**remoteUpdatedAt** | **OffsetDateTime** | When the third party&#39;s job was updated. |  [optional]
**confidential** | **Boolean** | Whether the job is confidential. |  [optional]
**departments** | **List&lt;UUID&gt;** | IDs of &#x60;Department&#x60; objects for this &#x60;Job&#x60;. |  [optional]
**offices** | **List&lt;UUID&gt;** | IDs of &#x60;Office&#x60; objects for this &#x60;Job&#x60;. |  [optional]
**hiringManagers** | **List&lt;UUID&gt;** | IDs of &#x60;RemoteUser&#x60; objects that serve as hiring managers for this &#x60;Job&#x60;. |  [optional]
**recruiters** | **List&lt;UUID&gt;** | IDs of RemoteUser objects that serve as recruiters for this Job. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted on the third-party. |  [optional] [readonly]



