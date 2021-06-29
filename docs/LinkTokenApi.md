# LinkTokenApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkTokenCreate**](LinkTokenApi.md#linkTokenCreate) | **POST** /link-token | 


<a name="linkTokenCreate"></a>
# **linkTokenCreate**
> LinkToken linkTokenCreate(endUserDetailsRequest)



Creates a link token to be used when linking a new end user.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.LinkTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    LinkTokenApi apiInstance = new LinkTokenApi(defaultClient);
    EndUserDetailsRequest endUserDetailsRequest = new EndUserDetailsRequest(); // EndUserDetailsRequest | 
    try {
      LinkToken result = apiInstance.linkTokenCreate(endUserDetailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkTokenApi#linkTokenCreate");
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
 **endUserDetailsRequest** | [**EndUserDetailsRequest**](EndUserDetailsRequest.md)|  |

### Return type

[**LinkToken**](LinkToken.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

