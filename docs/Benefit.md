

# Benefit

# The Benefit Object ### Description The `Benefit` object is used to represent a Benefit for an employee.  ### Usage Example Fetch from the `LIST Benefits` endpoint and filter by `ID` to show all benefits.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** | The employee on the plan. |  [optional]
**providerName** | **String** | The name of the benefit provider. |  [optional]
**benefitPlanType** | [**BenefitPlanTypeEnum**](BenefitPlanTypeEnum.md) | The type of benefit plan |  [optional]
**employeeContribution** | **Float** | The employee&#39;s contribution. |  [optional]
**companyContribution** | **Float** | The company&#39;s contribution. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



