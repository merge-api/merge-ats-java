

# EEOC

# The EEOC Object ### Description The `EEOC` object is used to represent the Equal Employment Opportunity Commission information for a candidate. ### Usage Example Fetch from the `LIST EEOCs` endpoint and filter by `candidate` to show all EEOC information for a candidate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** |  |  [optional]
**submittedAt** | **OffsetDateTime** | When the information was submitted. |  [optional]
**race** | [**RaceEnum**](RaceEnum.md) | The candidate&#39;s race. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The candidate&#39;s gender. |  [optional]
**veteranStatus** | [**VeteranStatusEnum**](VeteranStatusEnum.md) | The candidate&#39;s veteran status. |  [optional]
**disabilityStatus** | [**DisabilityStatusEnum**](DisabilityStatusEnum.md) | The candidate&#39;s disability status. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted on the third-party. |  [optional] [readonly]



