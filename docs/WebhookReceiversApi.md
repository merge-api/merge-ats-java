# WebhookReceiversApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookReceiversCreate**](WebhookReceiversApi.md#webhookReceiversCreate) | **POST** /webhook-receivers | 
[**webhookReceiversList**](WebhookReceiversApi.md#webhookReceiversList) | **GET** /webhook-receivers | 


<a name="webhookReceiversCreate"></a>
# **webhookReceiversCreate**
> WebhookReceiver webhookReceiversCreate(xAccountToken, webhookReceiverRequest)



Creates a &#x60;WebhookReceiver&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.WebhookReceiversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WebhookReceiversApi apiInstance = new WebhookReceiversApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    WebhookReceiverRequest webhookReceiverRequest = new WebhookReceiverRequest(); // WebhookReceiverRequest | 
    try {
      WebhookReceiver result = apiInstance.webhookReceiversCreate(xAccountToken, webhookReceiverRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookReceiversApi#webhookReceiversCreate");
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
 **webhookReceiverRequest** | [**WebhookReceiverRequest**](WebhookReceiverRequest.md)|  |

### Return type

[**WebhookReceiver**](WebhookReceiver.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="webhookReceiversList"></a>
# **webhookReceiversList**
> List&lt;WebhookReceiver&gt; webhookReceiversList(xAccountToken)



Returns a list of &#x60;WebhookReceiver&#x60; objects.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.WebhookReceiversApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WebhookReceiversApi apiInstance = new WebhookReceiversApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    try {
      List<WebhookReceiver> result = apiInstance.webhookReceiversList(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookReceiversApi#webhookReceiversList");
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

[**List&lt;WebhookReceiver&gt;**](WebhookReceiver.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

