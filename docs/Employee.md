

# Employee

# The Employee Object ### Description The `Employee` object is used to represent an Employee for a company.  ### Usage Example Fetch from the `LIST Employee` endpoint and filter by `ID` to show all employees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employeeNumber** | **String** | The employee&#39;s number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. |  [optional]
**company** | **UUID** | The ID of the employee&#39;s company. |  [optional]
**firstName** | **String** | The employee&#39;s first name. |  [optional]
**lastName** | **String** | The employee&#39;s last name. |  [optional]
**displayFullName** | **String** | The employee&#39;s full name, to use for display purposes. |  [optional]
**workEmail** | **String** | The employee&#39;s work email. |  [optional]
**personalEmail** | **String** | The employee&#39;s personal email. |  [optional]
**mobilePhoneNumber** | **String** | The employee&#39;s mobile phone number. |  [optional]
**employments** | **List&lt;UUID&gt;** |  |  [optional] [readonly]
**homeLocation** | **UUID** | The employee&#39;s home address. |  [optional]
**workLocation** | **UUID** | The employee&#39;s work address. |  [optional]
**manager** | **UUID** | The employee ID of the employee&#39;s manager. |  [optional]
**team** | **UUID** | The employee&#39;s team. |  [optional]
**ssn** | **String** | The employee&#39;s social security number. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The employee&#39;s gender. |  [optional]
**ethnicity** | [**EthnicityEnum**](EthnicityEnum.md) | The employee&#39;s ethnicity. |  [optional]
**maritalStatus** | [**MaritalStatusEnum**](MaritalStatusEnum.md) | The employee&#39;s marital status. |  [optional]
**dateOfBirth** | **OffsetDateTime** | The employee&#39;s date of birth. |  [optional]
**hireDate** | **OffsetDateTime** | The employee&#39;s hire date. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. |  [optional]
**employmentStatus** | [**EmploymentStatusEnum**](EmploymentStatusEnum.md) | The employment status of the employee. |  [optional]
**terminationDate** | **OffsetDateTime** | The employee&#39;s termination date. |  [optional]
**avatar** | **URI** | The URL of the employee&#39;s avatar image. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



