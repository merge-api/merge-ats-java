

# LinkedAccountCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditionSchemaId** | **UUID** | The ID indicating which condition schema to use for a specific condition. | 
**commonModel** | **String** | The common model for a specific condition. |  [optional] [readonly]
**nativeName** | **String** | User-facing *native condition* name. e.g. \&quot;Skip Manager\&quot;. | 
**operator** | **String** | The operator for a specific condition. | 
**value** | **Object** | The value for a condition. |  [optional] [readonly]
**fieldName** | **String** | The name of the field on the common model that this condition corresponds to, if they conceptually match. e.g. \&quot;location_type\&quot;. | 



