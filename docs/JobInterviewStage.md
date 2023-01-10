

# JobInterviewStage

# The JobInterviewStage Object ### Description The `JobInterviewStage` object is used to represent the stage that a job application is in. ### Usage Example Fetch from the `LIST JobInterviewStages` endpoint and view the job interview stages used by a company.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The stage&#39;s name. |  [optional]
**job** | **UUID** | This field is populated only if the stage is specific to a particular job. If the stage is generic, this field will not be populated. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly]



