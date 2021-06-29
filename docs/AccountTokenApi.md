# AccountTokenApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountTokenRetrieve**](AccountTokenApi.md#accountTokenRetrieve) | **GET** /account-token/{public_token} | 


<a name="accountTokenRetrieve"></a>
# **accountTokenRetrieve**
> AccountToken accountTokenRetrieve(publicToken)



Returns the account token for the end user with the provided public token.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.AccountTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AccountTokenApi apiInstance = new AccountTokenApi(defaultClient);
    String publicToken = "publicToken_example"; // String | 
    try {
      AccountToken result = apiInstance.accountTokenRetrieve(publicToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountTokenApi#accountTokenRetrieve");
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
 **publicToken** | **String**|  |

### Return type

[**AccountToken**](AccountToken.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

