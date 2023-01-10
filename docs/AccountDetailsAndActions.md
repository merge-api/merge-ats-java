

# AccountDetailsAndActions

# The LinkedAccount Object ### Description The `LinkedAccount` object is used to represent an end user's link with a specific integration.  ### Usage Example View a list of your organization's `LinkedAccount` objects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**category** | [**CategoryEnum**](CategoryEnum.md) |  |  [optional]
**status** | [**AccountDetailsAndActionsStatusEnum**](AccountDetailsAndActionsStatusEnum.md) |  | 
**statusDetail** | **String** |  |  [optional]
**endUserOriginId** | **String** |  |  [optional]
**endUserOrganizationName** | **String** |  | 
**endUserEmailAddress** | **String** |  | 
**webhookListenerUrl** | **String** |  | 
**isDuplicate** | **Boolean** | Whether a Production Linked Account&#39;s credentials match another existing Production Linked Account. This field is &#x60;null&#x60; for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. |  [optional]
**integration** | [**AccountDetailsAndActionsIntegration**](AccountDetailsAndActionsIntegration.md) |  |  [optional]



