

# Tax

# The Tax Object ### Description The `Tax` object is used to represent a tax for a given employee's payroll run. One run could include several taxes.  ### Usage Example Fetch from the `LIST Taxes` endpoint and filter by `ID` to show all taxes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**employeePayrollRun** | **UUID** | The tax&#39;s employee payroll run. |  [optional]
**name** | **String** | The tax&#39;s name. |  [optional]
**amount** | **Float** | The tax amount. |  [optional]
**employerTax** | **Boolean** | Whether or not the employer is responsible for paying the tax. |  [optional]
**remoteData** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional]



