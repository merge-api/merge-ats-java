

# TimeOffBalance

# The TimeOffBalance Object ### Description The `TimeOffBalance` object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the `LIST TimeOffBalances` endpoint and filter by `ID` to show all time off balances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** | The employee the balance belongs to. |  [optional]
**balance** | **Float** | The current PTO balance. |  [optional]
**used** | **Float** | The amount of PTO used. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



