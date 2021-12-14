

# Scorecard

# The Scorecard Object ### Description The `Scorecard` object is used to represent a Scorecard for an interview  ### Usage Example Fetch from the `LIST Scorecards` endpoint and filter by `application` to show all scorecard for an applicant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**application** | **UUID** | The application being scored. |  [optional]
**interview** | **UUID** | The interview being scored. |  [optional]
**interviewer** | **UUID** | The interviewer doing the scoring. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s scorecard was created. |  [optional]
**submittedAt** | **OffsetDateTime** | When the scorecard was submitted. |  [optional]
**overallRecommendation** | **String** |  | 
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



