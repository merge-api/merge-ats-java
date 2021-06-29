

# Deduction

# The Deduction Object ### Description The `Deduction` object is used to represent a deduction for a given employee's payroll run. One run could include several deductions.  ### Usage Example Fetch from the `LIST Deductions` endpoint and filter by `ID` to show all deductions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**employeePayrollRun** | **UUID** | The deduction&#39;s employee payroll run. |  [optional]
**name** | **String** | The deduction&#39;s name. |  [optional]
**employeeDeduction** | **Float** | The amount the employee is deducting. |  [optional]
**companyDeduction** | **Float** | The amount the company is deducting. |  [optional]
**remoteData** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional]



