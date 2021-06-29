

# PayrollRun

# The PayrollRun Object ### Description The `PayrollRun` object is used to represent a payroll run.  ### Usage Example Fetch from the `LIST PayrollRuns` endpoint and filter by `ID` to show all payroll runs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**runState** | [**RunStateEnum**](RunStateEnum.md) | The state of the payroll run |  [optional]
**runType** | [**RunTypeEnum**](RunTypeEnum.md) | The type of the payroll run |  [optional]
**startDate** | **OffsetDateTime** | The day and time the payroll run started. |  [optional]
**endDate** | **OffsetDateTime** | The day and time the payroll run ended. |  [optional]
**checkDate** | **OffsetDateTime** | The day and time the payroll run was checked. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



