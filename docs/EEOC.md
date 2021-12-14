

# EEOC

# The EEOC Object ### Description The `EEOC` object is used to represent the Equal Employment Opportunity Commission information for a candidate.  ### Usage Example Fetch from the `LIST EEOCs` endpoint and filter by `candidate` to show all EEOC information for a candidate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** | The candidate being represented. |  [optional]
**submittedAt** | **OffsetDateTime** | When the information was submitted. |  [optional]
**race** | **String** |  | 
**gender** | **String** |  | 
**veteranStatus** | **String** |  | 
**disabilityStatus** | **String** |  | 
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



