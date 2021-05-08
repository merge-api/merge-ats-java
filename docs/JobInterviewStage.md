

# JobInterviewStage

# The JobInterviewStage Object ### Description The `JobInterviewStage` object is used to represent the stage of an interview  ### Usage Example Fetch from the `LIST JobInterviewStages` endpoint and view the job interview stages used by a company.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**name** | **String** | The stage&#39;s name. |  [optional]
**job** | **UUID** | If stages are specific to a job, this is the job that this stage belongs to. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



