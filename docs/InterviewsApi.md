# InterviewsApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interviewsCreate**](InterviewsApi.md#interviewsCreate) | **POST** /interviews | 
[**interviewsList**](InterviewsApi.md#interviewsList) | **GET** /interviews | 
[**interviewsRetrieve**](InterviewsApi.md#interviewsRetrieve) | **GET** /interviews/{id} | 


<a name="interviewsCreate"></a>
# **interviewsCreate**
> ScheduledInterview interviewsCreate(xAccountToken, remoteUserId, runAsync, scheduledInterviewRequest)



Creates a &#x60;ScheduledInterview&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.InterviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    InterviewsApi apiInstance = new InterviewsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String remoteUserId = "remoteUserId_example"; // String | The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    ScheduledInterviewRequest scheduledInterviewRequest = new ScheduledInterviewRequest(); // ScheduledInterviewRequest | 
    try {
      ScheduledInterview result = apiInstance.interviewsCreate(xAccountToken, remoteUserId, runAsync, scheduledInterviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterviewsApi#interviewsCreate");
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
 **remoteUserId** | **String**| The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. | [optional]
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **scheduledInterviewRequest** | [**ScheduledInterviewRequest**](ScheduledInterviewRequest.md)|  | [optional]

### Return type

[**ScheduledInterview**](ScheduledInterview.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="interviewsList"></a>
# **interviewsList**
> PaginatedScheduledInterviewList interviewsList(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteId)



Returns a list of &#x60;ScheduledInterview&#x60; objects.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.InterviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    InterviewsApi apiInstance = new InterviewsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String applicationId = "applicationId_example"; // String | If provided, will only return interviews for this application.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    String jobInterviewStageId = "jobInterviewStageId_example"; // String | If provided, will only return interviews at this stage.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    String organizerId = "organizerId_example"; // String | If provided, will only return interviews organized by this user.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    try {
      PaginatedScheduledInterviewList result = apiInstance.interviewsList(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterviewsApi#interviewsList");
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
 **applicationId** | **String**| If provided, will only return interviews for this application. | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **jobInterviewStageId** | **String**| If provided, will only return interviews at this stage. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **organizerId** | **String**| If provided, will only return interviews organized by this user. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedScheduledInterviewList**](PaginatedScheduledInterviewList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="interviewsRetrieve"></a>
# **interviewsRetrieve**
> ScheduledInterview interviewsRetrieve(xAccountToken, id, includeRemoteData)



Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.InterviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    InterviewsApi apiInstance = new InterviewsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      ScheduledInterview result = apiInstance.interviewsRetrieve(xAccountToken, id, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InterviewsApi#interviewsRetrieve");
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
 **id** | **UUID**|  |
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**ScheduledInterview**](ScheduledInterview.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

