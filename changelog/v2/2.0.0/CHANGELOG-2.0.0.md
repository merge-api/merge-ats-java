# merge-ats-client - CHANGELOG

API version: 2.0.0

Build date: 2023-01-10T21:03:29.505759-05:00[America/New_York]

1. Changed RemoteData to expect JsonElement Data:
    - Fixes bug causing RemoteData parsing error when RemoteData.data was not an Object

2. Various Model updates and new Models
    - src/main/java/merge_ats_client/model/CommonModelScopes.java
	- src/main/java/merge_ats_client/model/CommonModelScopesDisabledModels.java
	- src/main/java/merge_ats_client/model/CommonModelScopesDisabledModelsEnabledActionsEnum.java
	- src/main/java/merge_ats_client/model/CommonModelScopesDisabledModelsEnabledActionsEnumRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesDisabledModelsRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerEnabledActionsEnum.java
	- src/main/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerEnabledActionsEnumRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerRequest.java
	- src/main/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerRequestRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesScope.java
	- src/main/java/merge_ats_client/model/CommonModelScopesScopeRawJson.java
	- src/main/java/merge_ats_client/model/CommonModelScopesUpdateSerializer.java
	- src/main/java/merge_ats_client/model/CommonModelScopesUpdateSerializerRawJson.java
	- src/main/java/merge_ats_client/model/ConditionSchema.java
	- src/main/java/merge_ats_client/model/ConditionSchemaRawJson.java
	- src/main/java/merge_ats_client/model/ConditionTypeEnum.java
	- src/main/java/merge_ats_client/model/ConditionTypeEnumRawJson.java
	- src/main/java/merge_ats_client/model/LinkedAccountCondition.java
	- src/main/java/merge_ats_client/model/LinkedAccountConditionRawJson.java
	- src/main/java/merge_ats_client/model/LinkedAccountConditionRequest.java
	- src/main/java/merge_ats_client/model/LinkedAccountConditionRequestRawJson.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfiguration.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationListRequest.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationListRequestRawJson.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationRawJson.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationRequest.java
	- src/main/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationRequestRawJson.java
	- src/main/java/merge_ats_client/model/OperatorSchema.java
	- src/main/java/merge_ats_client/model/OperatorSchemaRawJson.java
	- src/main/java/merge_ats_client/model/PaginatedConditionSchemaList.java
	- src/main/java/merge_ats_client/model/PaginatedConditionSchemaListRawJson.java
	- src/main/java/merge_ats_client/model/ResponseTypeEnum.java
	- src/main/java/merge_ats_client/model/ResponseTypeEnumRawJson.java
	- src/main/java/merge_ats_client/model/SelectiveSyncConfigurationsUsageEnum.java
	- src/main/java/merge_ats_client/model/SelectiveSyncConfigurationsUsageEnumRawJson.java
	- src/main/java/merge_ats_client/model/TypeEnum.java
	- src/main/java/merge_ats_client/model/TypeEnumRawJson.java
	- src/main/java/merge_ats_client/model/UpdateApplicationStageRequest.java
	- src/main/java/merge_ats_client/model/UpdateApplicationStageRequestRawJson.java
	- src/test/java/merge_ats_client/api/CommonModelScopesApiTest.java
	- src/test/java/merge_ats_client/api/SelectiveSyncApiTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesDisabledModelsEnabledActionsEnumTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesDisabledModelsTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerEnabledActionsEnumTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesPutInnerDeserializerRequestTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesScopeTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesTest.java
	- src/test/java/merge_ats_client/model/CommonModelScopesUpdateSerializerTest.java
	- src/test/java/merge_ats_client/model/ConditionSchemaTest.java
	- src/test/java/merge_ats_client/model/ConditionTypeEnumTest.java
	- src/test/java/merge_ats_client/model/LinkedAccountConditionRequestTest.java
	- src/test/java/merge_ats_client/model/LinkedAccountConditionTest.java
	- src/test/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationListRequestTest.java
	- src/test/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationRequestTest.java
	- src/test/java/merge_ats_client/model/LinkedAccountSelectiveSyncConfigurationTest.java
	- src/test/java/merge_ats_client/model/OperatorSchemaTest.java
	- src/test/java/merge_ats_client/model/PaginatedConditionSchemaListTest.java
	- src/test/java/merge_ats_client/model/ResponseTypeEnumTest.java
	- src/test/java/merge_ats_client/model/SelectiveSyncConfigurationsUsageEnumTest.java
	- src/test/java/merge_ats_client/model/TypeEnumTest.java
	- src/test/java/merge_ats_client/model/UpdateApplicationStageRequestTest.java
