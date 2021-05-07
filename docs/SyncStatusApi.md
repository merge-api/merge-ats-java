# SyncStatusApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncStatusResyncCreate**](SyncStatusApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 
[**syncStatusRetrieve**](SyncStatusApi.md#syncStatusRetrieve) | **GET** /sync-status | 


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

<a name="syncStatusRetrieve"></a>
# **syncStatusRetrieve**
> SyncStatus syncStatusRetrieve(xAccountToken)



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
    try {
      SyncStatus result = apiInstance.syncStatusRetrieve(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncStatusApi#syncStatusRetrieve");
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

