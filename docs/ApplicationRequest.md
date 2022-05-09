

# ApplicationRequest

# The Application Object ### Description The `Application` object is used to represent an Application for a job position. This is separate from the Candidate object, although some systems may only allow a Candidate to have one Application.  Please note: Application objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** |  |  [optional]
**job** | **UUID** |  |  [optional]
**appliedAt** | **OffsetDateTime** | When the application was submitted. |  [optional]
**rejectedAt** | **OffsetDateTime** | When the application was rejected. |  [optional]
**source** | **String** | The application&#39;s source. |  [optional]
**creditedTo** | **UUID** |  |  [optional]
**currentStage** | **UUID** |  |  [optional]
**rejectReason** | **UUID** |  |  [optional]
**customFields** | **Map&lt;String, Object&gt;** | Custom fields configured for a given model. |  [optional]
**remoteTemplateId** | **String** |  |  [optional]
**integrationParams** | **Map&lt;String, Object&gt;** |  |  [optional]
**linkedAccountParams** | **Map&lt;String, Object&gt;** |  |  [optional]



