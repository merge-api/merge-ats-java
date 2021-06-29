# RegenerateKeyApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regenerateKeyCreate**](RegenerateKeyApi.md#regenerateKeyCreate) | **POST** /regenerate-key | 


<a name="regenerateKeyCreate"></a>
# **regenerateKeyCreate**
> RemoteKey regenerateKeyCreate(remoteKeyForRegenerationRequest)



Exchange remote keys.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.RegenerateKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RegenerateKeyApi apiInstance = new RegenerateKeyApi(defaultClient);
    RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest = new RemoteKeyForRegenerationRequest(); // RemoteKeyForRegenerationRequest | 
    try {
      RemoteKey result = apiInstance.regenerateKeyCreate(remoteKeyForRegenerationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegenerateKeyApi#regenerateKeyCreate");
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
 **remoteKeyForRegenerationRequest** | [**RemoteKeyForRegenerationRequest**](RemoteKeyForRegenerationRequest.md)|  |

### Return type

[**RemoteKey**](RemoteKey.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

