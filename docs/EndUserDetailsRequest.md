

# EndUserDetailsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endUserEmailAddress** | **String** |  | 
**endUserOrganizationName** | **String** |  | 
**endUserOriginId** | **String** |  | 
**categories** | **List&lt;CategoriesEnum&gt;** |  | 
**integration** | **String** | The slug of a specific pre-selected integration for this linking flow token, for examples of slugs see https://www.merge.dev/docs/basics/integration-metadata |  [optional]
**linkExpiryMins** | **Integer** | An integer number of minutes between [30, 720] for how long this token is valid. Defaults to 30 |  [optional]



