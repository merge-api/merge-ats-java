

# Application

# The Application Object ### Description The `Application` object is used to represent an Application for a job position. ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** |  |  [optional]
**job** | **UUID** |  |  [optional]
**appliedAt** | **OffsetDateTime** | When the application was submitted. |  [optional]
**rejectedAt** | **OffsetDateTime** | When the application was rejected. |  [optional]
**source** | **String** | The application&#39;s source. |  [optional]
**creditedTo** | **UUID** | The user credited for this application. |  [optional]
**currentStage** | **UUID** |  |  [optional]
**rejectReason** | **UUID** |  |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**customFields** | **Map&lt;String, Object&gt;** | Custom fields configured for a given model. |  [optional]



