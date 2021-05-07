# ApplicationsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationsCreate**](ApplicationsApi.md#applicationsCreate) | **POST** /applications | 
[**applicationsList**](ApplicationsApi.md#applicationsList) | **GET** /applications | 
[**applicationsPartialUpdate**](ApplicationsApi.md#applicationsPartialUpdate) | **PATCH** /applications/{id} | 
[**applicationsRetrieve**](ApplicationsApi.md#applicationsRetrieve) | **GET** /applications/{id} | 


<a name="applicationsCreate"></a>
# **applicationsCreate**
> Application applicationsCreate(xAccountToken, remoteUserId, runAsync, applicationRequest)



Creates an &#x60;Application&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String remoteUserId = "remoteUserId_example"; // String | The ID of the RemoteUser deleting the resource. This can be found in the ID field (not remote_id) in the RemoteUser table.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | 
    try {
      Application result = apiInstance.applicationsCreate(xAccountToken, remoteUserId, runAsync, applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#applicationsCreate");
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
 **remoteUserId** | **String**| The ID of the RemoteUser deleting the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. |
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  | [optional]

### Return type

[**Application**](Application.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="applicationsList"></a>
# **applicationsList**
> PaginatedApplicationList applicationsList(xAccountToken, candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, expand, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId)



Returns a list of &#x60;Application&#x60; objects.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String candidateId = "candidateId_example"; // String | If provided, will only return applications for this candidate.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String creditedToId = "creditedToId_example"; // String | If provided, will only return applications credited to this user.
    String currentStageId = "currentStageId_example"; // String | If provided, will only return applications at this interview stage.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String expand = "candidate,job,credited_to,current_stage,reject_reason"; // String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    String jobId = "jobId_example"; // String | If provided, will only return applications for this job.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String rejectReasonId = "rejectReasonId_example"; // String | If provided, will only return applications with this reject reason.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    try {
      PaginatedApplicationList result = apiInstance.applicationsList(xAccountToken, candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, expand, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#applicationsList");
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
 **candidateId** | **String**| If provided, will only return applications for this candidate. | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **creditedToId** | **String**| If provided, will only return applications credited to this user. | [optional]
 **currentStageId** | **String**| If provided, will only return applications at this interview stage. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **expand** | **String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate, candidate,credited_to, candidate,credited_to,current_stage, candidate,credited_to,current_stage,reject_reason, candidate,credited_to,reject_reason, candidate,current_stage, candidate,current_stage,reject_reason, candidate,job, candidate,job,credited_to, candidate,job,credited_to,current_stage, candidate,job,credited_to,current_stage,reject_reason, candidate,job,credited_to,reject_reason, candidate,job,current_stage, candidate,job,current_stage,reject_reason, candidate,job,reject_reason, candidate,reject_reason, credited_to, credited_to,current_stage, credited_to,current_stage,reject_reason, credited_to,reject_reason, current_stage, current_stage,reject_reason, job, job,credited_to, job,credited_to,current_stage, job,credited_to,current_stage,reject_reason, job,credited_to,reject_reason, job,current_stage, job,current_stage,reject_reason, job,reject_reason, reject_reason]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **jobId** | **String**| If provided, will only return applications for this job. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **rejectReasonId** | **String**| If provided, will only return applications with this reject reason. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedApplicationList**](PaginatedApplicationList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="applicationsPartialUpdate"></a>
# **applicationsPartialUpdate**
> Application applicationsPartialUpdate(xAccountToken, id, remoteUserId, runAsync, patchedApplicationRequest)



Updates an &#x60;Application&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    String remoteUserId = "remoteUserId_example"; // String | The ID of the RemoteUser deleting the resource. This can be found in the ID field (not remote_id) in the RemoteUser table.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    PatchedApplicationRequest patchedApplicationRequest = new PatchedApplicationRequest(); // PatchedApplicationRequest | 
    try {
      Application result = apiInstance.applicationsPartialUpdate(xAccountToken, id, remoteUserId, runAsync, patchedApplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#applicationsPartialUpdate");
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
 **remoteUserId** | **String**| The ID of the RemoteUser deleting the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. |
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **patchedApplicationRequest** | [**PatchedApplicationRequest**](PatchedApplicationRequest.md)|  | [optional]

### Return type

[**Application**](Application.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="applicationsRetrieve"></a>
# **applicationsRetrieve**
> Application applicationsRetrieve(xAccountToken, id, expand, includeRemoteData)



Returns an &#x60;Application&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.ApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ApplicationsApi apiInstance = new ApplicationsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    String expand = "candidate,job,credited_to,current_stage,reject_reason"; // String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      Application result = apiInstance.applicationsRetrieve(xAccountToken, id, expand, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#applicationsRetrieve");
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
 **expand** | **String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: candidate, candidate,credited_to, candidate,credited_to,current_stage, candidate,credited_to,current_stage,reject_reason, candidate,credited_to,reject_reason, candidate,current_stage, candidate,current_stage,reject_reason, candidate,job, candidate,job,credited_to, candidate,job,credited_to,current_stage, candidate,job,credited_to,current_stage,reject_reason, candidate,job,credited_to,reject_reason, candidate,job,current_stage, candidate,job,current_stage,reject_reason, candidate,job,reject_reason, candidate,reject_reason, credited_to, credited_to,current_stage, credited_to,current_stage,reject_reason, credited_to,reject_reason, current_stage, current_stage,reject_reason, job, job,credited_to, job,credited_to,current_stage, job,credited_to,current_stage,reject_reason, job,credited_to,reject_reason, job,current_stage, job,current_stage,reject_reason, job,reject_reason, reject_reason]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**Application**](Application.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

