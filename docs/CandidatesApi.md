# CandidatesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**candidatesCreate**](CandidatesApi.md#candidatesCreate) | **POST** /candidates | 
[**candidatesIgnoreCreate**](CandidatesApi.md#candidatesIgnoreCreate) | **POST** /candidates/ignore/{model_id} | 
[**candidatesList**](CandidatesApi.md#candidatesList) | **GET** /candidates | 
[**candidatesRetrieve**](CandidatesApi.md#candidatesRetrieve) | **GET** /candidates/{id} | 


<a name="candidatesCreate"></a>
# **candidatesCreate**
> CandidateResponse candidatesCreate(xAccountToken, candidateEndpointRequest, isDebugMode, runAsync)



Creates a &#x60;Candidate&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CandidatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CandidatesApi apiInstance = new CandidatesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    CandidateEndpointRequest candidateEndpointRequest = new CandidateEndpointRequest(); // CandidateEndpointRequest | 
    Boolean isDebugMode = true; // Boolean | Whether to include debug fields (such as log file links) in the response.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    try {
      CandidateResponse result = apiInstance.candidatesCreate(xAccountToken, candidateEndpointRequest, isDebugMode, runAsync);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#candidatesCreate");
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
 **candidateEndpointRequest** | [**CandidateEndpointRequest**](CandidateEndpointRequest.md)|  |
 **isDebugMode** | **Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="candidatesIgnoreCreate"></a>
# **candidatesIgnoreCreate**
> candidatesIgnoreCreate(modelId, ignoreCommonModelRequest)



Ignores a specific row based on the &#x60;model_id&#x60; in the url. These records will have their properties set to null, and will not be updated in future syncs. The \&quot;reason\&quot; and \&quot;message\&quot; fields in the request body will be stored for audit purposes.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CandidatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CandidatesApi apiInstance = new CandidatesApi(defaultClient);
    UUID modelId = new UUID(); // UUID | 
    IgnoreCommonModelRequest ignoreCommonModelRequest = new IgnoreCommonModelRequest(); // IgnoreCommonModelRequest | 
    try {
      apiInstance.candidatesIgnoreCreate(modelId, ignoreCommonModelRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#candidatesIgnoreCreate");
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
 **modelId** | [**UUID**](.md)|  |
 **ignoreCommonModelRequest** | [**IgnoreCommonModelRequest**](IgnoreCommonModelRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response body |  -  |

<a name="candidatesList"></a>
# **candidatesList**
> PaginatedCandidateList candidatesList(xAccountToken, createdAfter, createdBefore, cursor, firstName, includeDeletedData, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;Candidate&#x60; objects.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CandidatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CandidatesApi apiInstance = new CandidatesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String firstName = "firstName_example"; // String | If provided, will only return candidates with this first name.
    Boolean includeDeletedData = true; // Boolean | Whether to include data that was deleted in the third-party service.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    String lastName = "lastName_example"; // String | If provided, will only return candidates with this last name.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    try {
      PaginatedCandidateList result = apiInstance.candidatesList(xAccountToken, createdAfter, createdBefore, cursor, firstName, includeDeletedData, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#candidatesList");
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
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **firstName** | **String**| If provided, will only return candidates with this first name. | [optional]
 **includeDeletedData** | **Boolean**| Whether to include data that was deleted in the third-party service. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **lastName** | **String**| If provided, will only return candidates with this last name. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedCandidateList**](PaginatedCandidateList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="candidatesRetrieve"></a>
# **candidatesRetrieve**
> Candidate candidatesRetrieve(xAccountToken, id, includeRemoteData)



Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CandidatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CandidatesApi apiInstance = new CandidatesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      Candidate result = apiInstance.candidatesRetrieve(xAccountToken, id, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#candidatesRetrieve");
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

### Return type

[**Candidate**](Candidate.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

