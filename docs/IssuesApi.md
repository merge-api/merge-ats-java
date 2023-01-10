# IssuesApi

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuesList**](IssuesApi.md#issuesList) | **GET** /issues | 
[**issuesRetrieve**](IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 


<a name="issuesList"></a>
# **issuesList**
> PaginatedIssueList issuesList(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status)



Gets issues.

### Example
```java
// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.IssuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    IssuesApi apiInstance = new IssuesApi(defaultClient);
    String accountToken = "accountToken_example"; // String | 
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String endDate = "endDate_example"; // String | If included, will only include issues whose most recent action occurred before this time
    String endUserOrganizationName = "endUserOrganizationName_example"; // String | 
    OffsetDateTime firstIncidentTimeAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return issues whose first incident time was after this datetime.
    OffsetDateTime firstIncidentTimeBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return issues whose first incident time was before this datetime.
    String includeMuted = "includeMuted_example"; // String | If True, will include muted issues
    String integrationName = "integrationName_example"; // String | 
    OffsetDateTime lastIncidentTimeAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return issues whose first incident time was after this datetime.
    OffsetDateTime lastIncidentTimeBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return issues whose first incident time was before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String startDate = "startDate_example"; // String | If included, will only include issues whose most recent action occurred after this time
    String status = "status_example"; // String | 
    try {
      PaginatedIssueList result = apiInstance.issuesList(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status);
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
 **accountToken** | **String**|  | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **endDate** | **String**| If included, will only include issues whose most recent action occurred before this time | [optional]
 **endUserOrganizationName** | **String**|  | [optional]
 **firstIncidentTimeAfter** | **OffsetDateTime**| If provided, will only return issues whose first incident time was after this datetime. | [optional]
 **firstIncidentTimeBefore** | **OffsetDateTime**| If provided, will only return issues whose first incident time was before this datetime. | [optional]
 **includeMuted** | **String**| If True, will include muted issues | [optional]
 **integrationName** | **String**|  | [optional]
 **lastIncidentTimeAfter** | **OffsetDateTime**| If provided, will only return issues whose first incident time was after this datetime. | [optional]
 **lastIncidentTimeBefore** | **OffsetDateTime**| If provided, will only return issues whose first incident time was before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **startDate** | **String**| If included, will only include issues whose most recent action occurred after this time | [optional]
 **status** | **String**|  | [optional] [enum: ONGOING, RESOLVED]

### Return type

[**PaginatedIssueList**](PaginatedIssueList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
import merge_ats_client.api.IssuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

