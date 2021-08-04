

# SyncStatus

# The SyncStatus Object ### Description The `SyncStatus` object is used to represent the syncing state of an account  ### Usage Example View the `SyncStatus` for an account to see how recently its models were synced.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelName** | **String** |  | 
**modelId** | **String** |  | 
**lastSyncStart** | **OffsetDateTime** |  | 
**nextSyncStart** | **OffsetDateTime** |  | 
**status** | [**SyncStatusStatusEnum**](SyncStatusStatusEnum.md) |  | 
**isInitialSync** | **Boolean** |  | 



