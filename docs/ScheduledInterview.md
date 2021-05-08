

# ScheduledInterview

# The ScheduledInterview Object ### Description The `ScheduledInterview` object is used to represent an interview  ### Usage Example Fetch from the `LIST ScheduledInterviews` endpoint and filter by `interviewers` to show all office locations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**application** | **UUID** | The application being interviewed. |  [optional]
**jobInterviewStage** | **UUID** | The stage of the interview. |  [optional]
**organizer** | **UUID** | The user organizing the interview. |  [optional]
**interviewers** | **List&lt;UUID&gt;** |  |  [optional]
**location** | **String** | The interview&#39;s location. |  [optional]
**startAt** | **OffsetDateTime** | When the interview was started. |  [optional]
**endAt** | **OffsetDateTime** | When the interview was ended. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s interview was created. |  [optional]
**remoteUpdatedAt** | **OffsetDateTime** | When the third party&#39;s interview was updated. |  [optional]
**status** | [**ScheduledInterviewStatusEnum**](ScheduledInterviewStatusEnum.md) | The interview&#39;s status. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



