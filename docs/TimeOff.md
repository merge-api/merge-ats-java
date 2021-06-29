

# TimeOff

# The TimeOff Object ### Description The `TimeOff` object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the `LIST TimeOffs` endpoint and filter by `ID` to show all time off requests.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** | The employee requesting time off. |  [optional]
**approver** | **UUID** | The employee approving the time off request. |  [optional]
**status** | [**TimeOffStatusEnum**](TimeOffStatusEnum.md) | The status of this time off request. |  [optional]
**employeeNote** | **String** | The employee note for this time off request. |  [optional]
**units** | [**UnitsEnum**](UnitsEnum.md) | The unit of time requested. |  [optional]
**amount** | **Float** | The number of time off units requested. |  [optional]
**requestType** | [**RequestTypeEnum**](RequestTypeEnum.md) | The type of time off request. |  [optional]
**startTime** | **OffsetDateTime** | The day and time of the start of the time requested off. |  [optional]
**endTime** | **OffsetDateTime** | The day and time of the end of the time requested off. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



