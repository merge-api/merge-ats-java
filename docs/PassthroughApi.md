# PassthroughApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passthroughCreate**](PassthroughApi.md#passthroughCreate) | **POST** /passthrough | 


<a name="passthroughCreate"></a>
# **passthroughCreate**
> RemoteResponse passthroughCreate(xAccountToken, dataPassthroughRequest)



Pull data from an endpoint not currently supported by Merge.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.PassthroughApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PassthroughApi apiInstance = new PassthroughApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    DataPassthroughRequest dataPassthroughRequest = new DataPassthroughRequest(); // DataPassthroughRequest | 
    try {
      RemoteResponse result = apiInstance.passthroughCreate(xAccountToken, dataPassthroughRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassthroughApi#passthroughCreate");
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
 **dataPassthroughRequest** | [**DataPassthroughRequest**](DataPassthroughRequest.md)|  |

### Return type

[**RemoteResponse**](RemoteResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

