

# AccountDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**integration** | **String** |  |  [optional] [readonly]
**integrationSlug** | **String** |  |  [optional] [readonly]
**category** | [**CategoryEnum**](CategoryEnum.md) |  |  [optional]
**endUserOriginId** | **String** |  |  [optional] [readonly]
**endUserOrganizationName** | **String** |  |  [optional] [readonly]
**endUserEmailAddress** | **String** |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]
**webhookListenerUrl** | **URI** |  |  [optional] [readonly]
**isDuplicate** | **Boolean** | Whether a Production Linked Account&#39;s credentials match another existing Production Linked Account. This field is &#x60;null&#x60; for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. |  [optional] [readonly]



