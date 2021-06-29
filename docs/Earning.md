

# Earning

# The Earning Object ### Description The `Earning` object is used to represent an earning for a given employee's payroll run. One run could include several earnings.  ### Usage Example Fetch from the `LIST Earnings` endpoint and filter by `ID` to show all earnings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**employeePayrollRun** | **UUID** | The earning&#39;s employee payroll run. |  [optional]
**amount** | **Float** | The amount earned. |  [optional]
**type** | [**TypeEnum**](TypeEnum.md) | The type of earning. |  [optional]
**remoteData** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional]



