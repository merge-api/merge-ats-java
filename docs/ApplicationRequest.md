

# ApplicationRequest

# The Application Object ### Description The `Application` object is used to represent an Application for a job position. This is separate from the Candidate object, although some systems may only allow a Candidate to have one Application.  Please note: Application objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Applications` endpoint and filter by `ID` to show all applications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**candidate** | **UUID** | The candidate applying. |  [optional]
**job** | **UUID** | The job being applied for. |  [optional]
**appliedAt** | **OffsetDateTime** | When the application was submitted. |  [optional]
**rejectedAt** | **OffsetDateTime** | When the application was rejected. |  [optional]
**source** | **String** | The application&#39;s source. |  [optional]
**creditedTo** | **UUID** | The user credited for this application. |  [optional]
**currentStage** | **UUID** | The application&#39;s current stage. |  [optional]
**rejectReason** | **UUID** | The application&#39;s reason for rejection. |  [optional]
**remoteTemplateId** | **String** |  |  [optional]
**integrationParams** | **Map&lt;String, Object&gt;** |  |  [optional]
**linkedAccountParams** | **Map&lt;String, Object&gt;** |  |  [optional]



