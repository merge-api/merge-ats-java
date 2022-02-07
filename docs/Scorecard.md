

# Scorecard

# The Scorecard Object ### Description The `Scorecard` object is used to represent a Scorecard for an interview ### Usage Example Fetch from the `LIST Scorecards` endpoint and filter by `application` to show all scorecard for an applicant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**application** | **UUID** |  |  [optional]
**interview** | **UUID** |  |  [optional]
**interviewer** | **UUID** |  |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s scorecard was created. |  [optional]
**submittedAt** | **OffsetDateTime** | When the scorecard was submitted. |  [optional]
**overallRecommendation** | [**OverallRecommendationEnum**](OverallRecommendationEnum.md) | The inteviewer&#39;s recommendation. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



