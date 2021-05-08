

# Job

# The Job Object ### Description The `Job` object is used to represent a Job offering at a company.  ### Usage Example Fetch from the `LIST Jobs` endpoint to show all job postings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The job&#39;s name. |  [optional]
**description** | **String** | The job&#39;s description. |  [optional]
**status** | [**JobStatusEnum**](JobStatusEnum.md) | The job&#39;s status. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s job was created. |  [optional]
**remoteUpdatedAt** | **OffsetDateTime** | When the third party&#39;s job was updated. |  [optional]
**confidential** | **Boolean** | Whether the job is confidential. |  [optional]
**departments** | **List&lt;UUID&gt;** |  |  [optional]
**offices** | **List&lt;UUID&gt;** |  |  [optional]
**hiringManagers** | **List&lt;UUID&gt;** |  |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



