# AttachmentsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentsCreate**](AttachmentsApi.md#attachmentsCreate) | **POST** /attachments | 
[**attachmentsList**](AttachmentsApi.md#attachmentsList) | **GET** /attachments | 
[**attachmentsMetaPostRetrieve**](AttachmentsApi.md#attachmentsMetaPostRetrieve) | **GET** /attachments/meta/post | 
[**attachmentsRetrieve**](AttachmentsApi.md#attachmentsRetrieve) | **GET** /attachments/{id} | 


<a name="attachmentsCreate"></a>
# **attachmentsCreate**
> AttachmentResponse attachmentsCreate(xAccountToken, attachmentEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;Attachment&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    AttachmentEndpointRequest attachmentEndpointRequest = new AttachmentEndpointRequest(); // AttachmentEndpointRequest | 
    Boolean isDebugMode = true; // Boolean | Whether to include debug fields (such as log file links) in the response.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    try {
      AttachmentResponse result = apiInstance.attachmentsCreate(xAccountToken, attachmentEndpointRequest, isDebugMode, runAsync);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#attachmentsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |
 **attachmentEndpointRequest** | [**AttachmentEndpointRequest**](AttachmentEndpointRequest.md)|  |
 **isDebugMode** | **Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="attachmentsList"></a>
# **attachmentsList**
> PaginatedAttachmentList attachmentsList(xAccountToken, candidateId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId)



Returns a list of &#x60;Attachment&#x60; objects.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String candidateId = "candidateId_example"; // String | If provided, will only return attachments for this candidate.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    Boolean includeDeletedData = true; // Boolean | Whether to include data that was marked as deleted by third party webhooks.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String remoteFields = "attachment_type"; // String | Which fields should be returned in non-normalized form.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    try {
      PaginatedAttachmentList result = apiInstance.attachmentsList(xAccountToken, candidateId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteFields, remoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#attachmentsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |
 **candidateId** | **String**| If provided, will only return attachments for this candidate. | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **includeDeletedData** | **Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteFields** | **String**| Which fields should be returned in non-normalized form. | [optional] [enum: attachment_type]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedAttachmentList**](PaginatedAttachmentList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="attachmentsMetaPostRetrieve"></a>
# **attachmentsMetaPostRetrieve**
> MetaResponse attachmentsMetaPostRetrieve(xAccountToken)



Returns metadata for &#x60;Attachment&#x60; POSTs.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    try {
      MetaResponse result = apiInstance.attachmentsMetaPostRetrieve(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#attachmentsMetaPostRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |

### Return type

[**MetaResponse**](MetaResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="attachmentsRetrieve"></a>
# **attachmentsRetrieve**
> Attachment attachmentsRetrieve(xAccountToken, id, includeRemoteData, remoteFields)



Returns an &#x60;Attachment&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    String remoteFields = "attachment_type"; // String | Which fields should be returned in non-normalized form.
    try {
      Attachment result = apiInstance.attachmentsRetrieve(xAccountToken, id, includeRemoteData, remoteFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#attachmentsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |
 **id** | [**UUID**](.md)|  |
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **remoteFields** | **String**| Which fields should be returned in non-normalized form. | [optional] [enum: attachment_type]

### Return type

[**Attachment**](Attachment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

