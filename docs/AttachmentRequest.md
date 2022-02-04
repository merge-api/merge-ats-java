

# AttachmentRequest

# The Attachment Object ### Description The `Attachment` object is used to represent a attachment for a candidate. ### Usage Example Fetch from the `LIST Attachments` endpoint and view attachments accessible by a company.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**fileName** | **String** | The attachment&#39;s name. |  [optional]
**fileUrl** | **URI** | The attachment&#39;s url. |  [optional]
**candidate** | **UUID** |  |  [optional]
**attachmentType** | [**AttachmentTypeEnum**](AttachmentTypeEnum.md) | The attachment&#39;s type. |  [optional]
**integrationParams** | **Map&lt;String, Object&gt;** |  |  [optional]
**linkedAccountParams** | **Map&lt;String, Object&gt;** |  |  [optional]



