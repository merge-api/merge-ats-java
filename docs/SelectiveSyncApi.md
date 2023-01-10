# SelectiveSyncApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**selectiveSyncConfigurationsList**](SelectiveSyncApi.md#selectiveSyncConfigurationsList) | **GET** /selective-sync/configurations | 
[**selectiveSyncConfigurationsUpdate**](SelectiveSyncApi.md#selectiveSyncConfigurationsUpdate) | **PUT** /selective-sync/configurations | 
[**selectiveSyncMetaList**](SelectiveSyncApi.md#selectiveSyncMetaList) | **GET** /selective-sync/meta | 


<a name="selectiveSyncConfigurationsList"></a>
# **selectiveSyncConfigurationsList**
> List&lt;LinkedAccountSelectiveSyncConfiguration&gt; selectiveSyncConfigurationsList()



Get a linked account&#39;s selective syncs.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.SelectiveSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: accountTokenAuth
    ApiKeyAuth accountTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("accountTokenAuth");
    accountTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //accountTokenAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
    try {
      List<LinkedAccountSelectiveSyncConfiguration> result = apiInstance.selectiveSyncConfigurationsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectiveSyncApi#selectiveSyncConfigurationsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LinkedAccountSelectiveSyncConfiguration&gt;**](LinkedAccountSelectiveSyncConfiguration.md)

### Authorization

[accountTokenAuth](../README.md#accountTokenAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="selectiveSyncConfigurationsUpdate"></a>
# **selectiveSyncConfigurationsUpdate**
> List&lt;LinkedAccountSelectiveSyncConfiguration&gt; selectiveSyncConfigurationsUpdate(linkedAccountSelectiveSyncConfigurationListRequest)



Replace a linked account&#39;s selective syncs.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.SelectiveSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: accountTokenAuth
    ApiKeyAuth accountTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("accountTokenAuth");
    accountTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //accountTokenAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
    LinkedAccountSelectiveSyncConfigurationListRequest linkedAccountSelectiveSyncConfigurationListRequest = new LinkedAccountSelectiveSyncConfigurationListRequest(); // LinkedAccountSelectiveSyncConfigurationListRequest | 
    try {
      List<LinkedAccountSelectiveSyncConfiguration> result = apiInstance.selectiveSyncConfigurationsUpdate(linkedAccountSelectiveSyncConfigurationListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectiveSyncApi#selectiveSyncConfigurationsUpdate");
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
 **linkedAccountSelectiveSyncConfigurationListRequest** | [**LinkedAccountSelectiveSyncConfigurationListRequest**](LinkedAccountSelectiveSyncConfigurationListRequest.md)|  |

### Return type

[**List&lt;LinkedAccountSelectiveSyncConfiguration&gt;**](LinkedAccountSelectiveSyncConfiguration.md)

### Authorization

[accountTokenAuth](../README.md#accountTokenAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="selectiveSyncMetaList"></a>
# **selectiveSyncMetaList**
> PaginatedConditionSchemaList selectiveSyncMetaList(commonModel, cursor, pageSize)



Get metadata for the conditions available to a linked account.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.SelectiveSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: accountTokenAuth
    ApiKeyAuth accountTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("accountTokenAuth");
    accountTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //accountTokenAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
    String commonModel = "commonModel_example"; // String | 
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    try {
      PaginatedConditionSchemaList result = apiInstance.selectiveSyncMetaList(commonModel, cursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectiveSyncApi#selectiveSyncMetaList");
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
 **commonModel** | **String**|  | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**PaginatedConditionSchemaList**](PaginatedConditionSchemaList.md)

### Authorization

[accountTokenAuth](../README.md#accountTokenAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

