

# Location

# The Location Object ### Description The `Location` object is used to represent a Location for a Company or Employee address. This is shared across many models and is referenced whenever a location is stored.  ### Usage Example Fetch from the `LIST Locations` endpoint and filter by `ID` to show all office locations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**phoneNumber** | **String** | The location&#39;s phone number. |  [optional]
**street1** | **String** | Line 1 of the location&#39;s street address. |  [optional]
**street2** | **String** | Line 2 of the location&#39;s street address. |  [optional]
**city** | **String** | The location&#39;s city. |  [optional]
**state** | **String** | The location&#39;s state. Represents a region if outside of the US. |  [optional]
**zipCode** | **String** | The location&#39;s zip code. |  [optional]
**country** | [**CountryEnum**](CountryEnum.md) | The location&#39;s country. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



