# IssuesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuesList**](IssuesApi.md#issuesList) | **GET** /issues | 
[**issuesRetrieve**](IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 


<a name="issuesList"></a>
# **issuesList**
> PaginatedIssueList issuesList(accountToken, cursor, endDate, endUserOrganizationName, includeMuted, integrationName, pageSize, startDate, status)



Gets issues.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import java.merge_ats_client.api.IssuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    IssuesApi apiInstance = new IssuesApi(defaultClient);
    String accountToken = "accountToken_example"; // String | account_token
    Integer cursor = 56; // Integer | The pagination cursor value.
    String endDate = "endDate_example"; // String | If included, will only include issues whose most recent action occurred before this time
    String endUserOrganizationName = "endUserOrganizationName_example"; // String | end_user_organization_name
    String includeMuted = "includeMuted_example"; // String | If True, will include muted issues
    String integrationName = "integrationName_example"; // String | integration_name
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String startDate = "startDate_example"; // String | If included, will only include issues whose most recent action occurred after this time
    String status = "status_example"; // String | status
    try {
      PaginatedIssueList result = apiInstance.issuesList(accountToken, cursor, endDate, endUserOrganizationName, includeMuted, integrationName, pageSize, startDate, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#issuesList");
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
 **accountToken** | **String**| account_token | [optional]
 **cursor** | **Integer**| The pagination cursor value. | [optional]
 **endDate** | **String**| If included, will only include issues whose most recent action occurred before this time | [optional]
 **endUserOrganizationName** | **String**| end_user_organization_name | [optional]
 **includeMuted** | **String**| If True, will include muted issues | [optional]
 **integrationName** | **String**| integration_name | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **startDate** | **String**| If included, will only include issues whose most recent action occurred after this time | [optional]
 **status** | **String**| status | [optional] [enum: ONGOING, RESOLVED]

### Return type

[**PaginatedIssueList**](PaginatedIssueList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="issuesRetrieve"></a>
# **issuesRetrieve**
> Issue issuesRetrieve(id)



Get a specific issue.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import java.merge_ats_client.api.IssuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    IssuesApi apiInstance = new IssuesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      Issue result = apiInstance.issuesRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#issuesRetrieve");
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
 **id** | [**UUID**](.md)|  |

### Return type

[**Issue**](Issue.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

