

# EndUserDetailsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endUserEmailAddress** | **String** | Your end user&#39;s email address. This is purely for identification purposes - setting this value will not cause any emails to be sent. | 
**endUserOrganizationName** | **String** | Your end user&#39;s organization. | 
**endUserOriginId** | **String** | This unique identifier typically represents the ID for your end user in your product&#39;s database. This value must be distinct from other Linked Accounts&#39; unique identifiers. | 
**categories** | **List&lt;CategoriesEnum&gt;** | The integration categories to show in Merge Link. | 
**integration** | **String** | The slug of a specific pre-selected integration for this linking flow token. For examples of slugs, see https://www.merge.dev/docs/basics/integration-metadata/. |  [optional]
**linkExpiryMins** | **Integer** | An integer number of minutes between [30, 720 or 10080 if for a Magic Link URL] for how long this token is valid. Defaults to 30. |  [optional]
**shouldCreateMagicLinkUrl** | **Boolean** | Whether to generate a Magic Link URL. Defaults to false. For more information on Magic Link, see https://merge.dev/blog/product/integrations,-fast.-say-hello-to-magic-link/. |  [optional]



