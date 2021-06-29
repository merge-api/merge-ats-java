# AvailableActionsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availableActionsRetrieve**](AvailableActionsApi.md#availableActionsRetrieve) | **GET** /available-actions | 


<a name="availableActionsRetrieve"></a>
# **availableActionsRetrieve**
> AvailableActions availableActionsRetrieve(xAccountToken)



Returns a list of models and actions available for an account.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.AvailableActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AvailableActionsApi apiInstance = new AvailableActionsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    try {
      AvailableActions result = apiInstance.availableActionsRetrieve(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailableActionsApi#availableActionsRetrieve");
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

[**AvailableActions**](AvailableActions.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

