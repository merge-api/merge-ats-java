# EmployeesApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesCreate**](EmployeesApi.md#employeesCreate) | **POST** /employees | 
[**employeesList**](EmployeesApi.md#employeesList) | **GET** /employees | 
[**employeesRetrieve**](EmployeesApi.md#employeesRetrieve) | **GET** /employees/{id} | 


<a name="employeesCreate"></a>
# **employeesCreate**
> Employee employeesCreate(xAccountToken, runAsync, employeeRequest)



Creates an &#x60;Employee&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    EmployeeRequest employeeRequest = new EmployeeRequest(); // EmployeeRequest | 
    try {
      Employee result = apiInstance.employeesCreate(xAccountToken, runAsync, employeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesCreate");
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
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **employeeRequest** | [**EmployeeRequest**](EmployeeRequest.md)|  | [optional]

### Return type

[**Employee**](Employee.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="employeesList"></a>
# **employeesList**
> PaginatedEmployeeList employeesList(xAccountToken, companyId, createdAfter, createdBefore, cursor, expand, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, remoteId, teamId, workLocationId)



Returns a list of &#x60;Employee&#x60; objects.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String companyId = "companyId_example"; // String | If provided, will only return employees for this company.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String expand = "employments,home_location,work_location,manager,team,company"; // String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    Boolean includeSensitiveFields = true; // Boolean | Whether to include sensetive fields (such as social security numbers) in the response.
    String managerId = "managerId_example"; // String | If provided, will only return employees for this manager.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    String teamId = "teamId_example"; // String | If provided, will only return employees for this team.
    String workLocationId = "workLocationId_example"; // String | If provided, will only return employees for this location.
    try {
      PaginatedEmployeeList result = apiInstance.employeesList(xAccountToken, companyId, createdAfter, createdBefore, cursor, expand, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, remoteId, teamId, workLocationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesList");
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
 **companyId** | **String**| If provided, will only return employees for this company. | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **expand** | **String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, employments, employments,company, employments,home_location, employments,home_location,company, employments,home_location,manager, employments,home_location,manager,company, employments,home_location,manager,team, employments,home_location,manager,team,company, employments,home_location,team, employments,home_location,team,company, employments,home_location,work_location, employments,home_location,work_location,company, employments,home_location,work_location,manager, employments,home_location,work_location,manager,company, employments,home_location,work_location,manager,team, employments,home_location,work_location,manager,team,company, employments,home_location,work_location,team, employments,home_location,work_location,team,company, employments,manager, employments,manager,company, employments,manager,team, employments,manager,team,company, employments,team, employments,team,company, employments,work_location, employments,work_location,company, employments,work_location,manager, employments,work_location,manager,company, employments,work_location,manager,team, employments,work_location,manager,team,company, employments,work_location,team, employments,work_location,team,company, home_location, home_location,company, home_location,manager, home_location,manager,company, home_location,manager,team, home_location,manager,team,company, home_location,team, home_location,team,company, home_location,work_location, home_location,work_location,company, home_location,work_location,manager, home_location,work_location,manager,company, home_location,work_location,manager,team, home_location,work_location,manager,team,company, home_location,work_location,team, home_location,work_location,team,company, manager, manager,company, manager,team, manager,team,company, team, team,company, work_location, work_location,company, work_location,manager, work_location,manager,company, work_location,manager,team, work_location,manager,team,company, work_location,team, work_location,team,company]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **Boolean**| Whether to include sensetive fields (such as social security numbers) in the response. | [optional]
 **managerId** | **String**| If provided, will only return employees for this manager. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]
 **teamId** | **String**| If provided, will only return employees for this team. | [optional]
 **workLocationId** | **String**| If provided, will only return employees for this location. | [optional]

### Return type

[**PaginatedEmployeeList**](PaginatedEmployeeList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="employeesRetrieve"></a>
# **employeesRetrieve**
> Employee employeesRetrieve(xAccountToken, id, expand, includeRemoteData, includeSensitiveFields)



Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import java.merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    String expand = "employments,home_location,work_location,manager,team,company"; // String | Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    Boolean includeSensitiveFields = true; // Boolean | Whether to include sensetive fields (such as social security numbers) in the response.
    try {
      Employee result = apiInstance.employeesRetrieve(xAccountToken, id, expand, includeRemoteData, includeSensitiveFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesRetrieve");
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
 **id** | [**UUID**](.md)|  |
 **expand** | **String**| Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. | [optional] [enum: company, employments, employments,company, employments,home_location, employments,home_location,company, employments,home_location,manager, employments,home_location,manager,company, employments,home_location,manager,team, employments,home_location,manager,team,company, employments,home_location,team, employments,home_location,team,company, employments,home_location,work_location, employments,home_location,work_location,company, employments,home_location,work_location,manager, employments,home_location,work_location,manager,company, employments,home_location,work_location,manager,team, employments,home_location,work_location,manager,team,company, employments,home_location,work_location,team, employments,home_location,work_location,team,company, employments,manager, employments,manager,company, employments,manager,team, employments,manager,team,company, employments,team, employments,team,company, employments,work_location, employments,work_location,company, employments,work_location,manager, employments,work_location,manager,company, employments,work_location,manager,team, employments,work_location,manager,team,company, employments,work_location,team, employments,work_location,team,company, home_location, home_location,company, home_location,manager, home_location,manager,company, home_location,manager,team, home_location,manager,team,company, home_location,team, home_location,team,company, home_location,work_location, home_location,work_location,company, home_location,work_location,manager, home_location,work_location,manager,company, home_location,work_location,manager,team, home_location,work_location,manager,team,company, home_location,work_location,team, home_location,work_location,team,company, manager, manager,company, manager,team, manager,team,company, team, team,company, work_location, work_location,company, work_location,manager, work_location,manager,company, work_location,manager,team, work_location,manager,team,company, work_location,team, work_location,team,company]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **Boolean**| Whether to include sensetive fields (such as social security numbers) in the response. | [optional]

### Return type

[**Employee**](Employee.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

