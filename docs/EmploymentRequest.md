

# EmploymentRequest

# The Employment Object ### Description The `Employment` object is used to represent an employment position at a company. These are associated with the employee filling the role.  ### Usage Example Fetch from the `LIST Employments` endpoint and filter by `ID` to show all employees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**jobTitle** | **String** | The position&#39;s title. |  [optional]
**payRate** | **Float** | The position&#39;s pay rate in dollars. |  [optional]
**payPeriod** | [**PayPeriodEnum**](PayPeriodEnum.md) | The time period this pay rate encompasses. |  [optional]
**payFrequency** | [**PayFrequencyEnum**](PayFrequencyEnum.md) | The position&#39;s pay frequency. |  [optional]
**payCurrency** | [**PayCurrencyEnum**](PayCurrencyEnum.md) | The position&#39;s currency code. |  [optional]
**flsaStatus** | [**FlsaStatusEnum**](FlsaStatusEnum.md) | The position&#39;s FLSA status. |  [optional]
**effectiveDate** | **OffsetDateTime** | The position&#39;s effective date. |  [optional]
**employmentType** | [**EmploymentTypeEnum**](EmploymentTypeEnum.md) | The position&#39;s type of employment. |  [optional]



