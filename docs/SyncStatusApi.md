# SyncStatusApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncStatusList**](SyncStatusApi.md#syncStatusList) | **GET** /sync-status | 
[**syncStatusResyncCreate**](SyncStatusApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 


<a name="syncStatusList"></a>
# **syncStatusList**
> PaginatedSyncStatusList syncStatusList(xAccountToken, cursor, pageSize)



Get syncing status.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.SyncStatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    SyncStatusApi apiInstance = new SyncStatusApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    Integer cursor = 56; // Integer | The pagination cursor value.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    try {
      PaginatedSyncStatusList result = apiInstance.syncStatusList(xAccountToken, cursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncStatusApi#syncStatusList");
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
 **cursor** | **Integer**| The pagination cursor value. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**PaginatedSyncStatusList**](PaginatedSyncStatusList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="syncStatusResyncCreate"></a>
# **syncStatusResyncCreate**
> SyncStatus syncStatusResyncCreate(xAccountToken)



Force resync of all models.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.SyncStatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    SyncStatusApi apiInstance = new SyncStatusApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    try {
      SyncStatus result = apiInstance.syncStatusResyncCreate(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncStatusApi#syncStatusResyncCreate");
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

[**SyncStatus**](SyncStatus.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

