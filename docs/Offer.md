

# Offer

# The Offer Object ### Description The `Offer` object is used to represent an offer for an application. ### Usage Example Fetch from the `LIST Offers` endpoint and filter by `ID` to show all offers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**application** | **UUID** | The application who is receiving the offer. |  [optional]
**creator** | **UUID** | The user who created the offer. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s offer was created. |  [optional]
**closedAt** | **OffsetDateTime** | When the offer was closed. |  [optional]
**sentAt** | **OffsetDateTime** | When the offer was sent. |  [optional]
**startDate** | **OffsetDateTime** | The employment start date on the offer. |  [optional]
**status** | [**OfferStatusEnum**](OfferStatusEnum.md) | The offer&#39;s status. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]
**fieldMappings** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly]



