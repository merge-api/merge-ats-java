# CommonModelScopesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonModelScopesRetrieve**](CommonModelScopesApi.md#commonModelScopesRetrieve) | **GET** /common-model-scopes | 
[**commonModelScopesUpdate**](CommonModelScopesApi.md#commonModelScopesUpdate) | **PUT** /common-model-scopes | 


<a name="commonModelScopesRetrieve"></a>
# **commonModelScopesRetrieve**
> CommonModelScopes commonModelScopesRetrieve(integrationSlug, linkedAccountId)



Fetch the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per integration or account.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CommonModelScopesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CommonModelScopesApi apiInstance = new CommonModelScopesApi(defaultClient);
    String integrationSlug = "integrationSlug_example"; // String | Slug of the integration to fetch
    String linkedAccountId = "linkedAccountId_example"; // String | ID of specific linked account to fetch
    try {
      CommonModelScopes result = apiInstance.commonModelScopesRetrieve(integrationSlug, linkedAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonModelScopesApi#commonModelScopesRetrieve");
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
 **integrationSlug** | **String**| Slug of the integration to fetch | [optional]
 **linkedAccountId** | **String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="commonModelScopesUpdate"></a>
# **commonModelScopesUpdate**
> CommonModelScopes commonModelScopesUpdate(commonModelScopesUpdateSerializer, integrationSlug, linkedAccountId)



Update the configuration of what data is saved by Merge when syncing. Common model scopes are set as a default across all linked accounts, but can be updated to have greater granularity per integration or account.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.CommonModelScopesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CommonModelScopesApi apiInstance = new CommonModelScopesApi(defaultClient);
    CommonModelScopesUpdateSerializer commonModelScopesUpdateSerializer = new CommonModelScopesUpdateSerializer(); // CommonModelScopesUpdateSerializer | 
    String integrationSlug = "integrationSlug_example"; // String | Slug of the integration to fetch
    String linkedAccountId = "linkedAccountId_example"; // String | ID of specific linked account to fetch
    try {
      CommonModelScopes result = apiInstance.commonModelScopesUpdate(commonModelScopesUpdateSerializer, integrationSlug, linkedAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonModelScopesApi#commonModelScopesUpdate");
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
 **commonModelScopesUpdateSerializer** | [**CommonModelScopesUpdateSerializer**](CommonModelScopesUpdateSerializer.md)|  |
 **integrationSlug** | **String**| Slug of the integration to fetch | [optional]
 **linkedAccountId** | **String**| ID of specific linked account to fetch | [optional]

### Return type

[**CommonModelScopes**](CommonModelScopes.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

