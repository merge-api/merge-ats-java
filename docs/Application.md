

# Application

# The Application Object ### Description The `Application` object is used to represent an Application for a job position.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** | The candidate applying. |  [optional]
**job** | **UUID** | The job being applied for. |  [optional]
**appliedAt** | **OffsetDateTime** | When the application was submitted. |  [optional]
**rejectedAt** | **OffsetDateTime** | When the application was rejected. |  [optional]
**source** | **String** | The application&#39;s source. |  [optional]
**creditedTo** | **UUID** | The user credited for this application. |  [optional]
**currentStage** | **UUID** | The application&#39;s current stage. |  [optional]
**rejectReason** | **UUID** | The application&#39;s reason for rejection. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



