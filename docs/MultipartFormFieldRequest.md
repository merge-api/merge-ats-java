

# MultipartFormFieldRequest

# The MultipartFormField Object ### Description The `MultipartFormField` object is used to represent fields in an HTTP request using `multipart/form-data`.  ### Usage Example Create a `MultipartFormField` to define a multipart form entry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the form field | 
**data** | **String** | The data for the form field. | 
**encoding** | [**EncodingEnum**](EncodingEnum.md) | The encoding of the value of &#x60;data&#x60;. Defaults to &#x60;RAW&#x60; if not defined. |  [optional]
**fileName** | **String** | The file name of the form field, if the field is for a file. |  [optional]
**contentType** | **String** | The MIME type of the file, if the field is for a file. |  [optional]



