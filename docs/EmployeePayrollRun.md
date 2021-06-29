

# EmployeePayrollRun

# The EmployeePayrollRun Object ### Description The `EmployeePayrollRun` object is used to represent a payroll run for a specific employee.  ### Usage Example Fetch from the `LIST EmployeePayrollRun` endpoint and filter by `ID` to show all employee payroll runs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** | The employee whose payroll is being run. |  [optional]
**payrollRun** | **UUID** | The payroll being run. |  [optional]
**grossPay** | **Float** | The gross pay from the run. |  [optional]
**netPay** | **Float** | The net pay from the run. |  [optional]
**startDate** | **OffsetDateTime** | The day and time the payroll run started. |  [optional]
**endDate** | **OffsetDateTime** | The day and time the payroll run ended. |  [optional]
**checkDate** | **OffsetDateTime** | The day and time the payroll run was checked. |  [optional]
**earnings** | [**List&lt;Earning&gt;**](Earning.md) |  |  [optional] [readonly]
**deductions** | [**List&lt;Deduction&gt;**](Deduction.md) |  |  [optional] [readonly]
**taxes** | [**List&lt;Tax&gt;**](Tax.md) |  |  [optional] [readonly]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



