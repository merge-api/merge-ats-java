/*
 * Merge ATS API
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_ats_client.api;

import merge_ats_client.ApiCallback;
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.ApiResponse;
import merge_ats_client.Configuration;
import merge_ats_client.Pair;
import merge_ats_client.ProgressRequestBody;
import merge_ats_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import merge_ats_client.model.Issue;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedIssueList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuesApi {
    private ApiClient localVarApiClient;

    public IssuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssuesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for issuesList
     * @param accountToken  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endDate If included, will only include issues whose most recent action occurred before this time (optional)
     * @param endUserOrganizationName  (optional)
     * @param firstIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param firstIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param includeMuted If True, will include muted issues (optional)
     * @param integrationName  (optional)
     * @param lastIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param lastIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param startDate If included, will only include issues whose most recent action occurred after this time (optional)
     * @param status  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issuesListCall(String accountToken, String cursor, String endDate, String endUserOrganizationName, OffsetDateTime firstIncidentTimeAfter, OffsetDateTime firstIncidentTimeBefore, String includeMuted, String integrationName, OffsetDateTime lastIncidentTimeAfter, OffsetDateTime lastIncidentTimeBefore, Integer pageSize, String startDate, String status, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/issues";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_token", accountToken));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (endUserOrganizationName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_user_organization_name", endUserOrganizationName));
        }

        if (firstIncidentTimeAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_incident_time_after", firstIncidentTimeAfter));
        }

        if (firstIncidentTimeBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_incident_time_before", firstIncidentTimeBefore));
        }

        if (includeMuted != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_muted", includeMuted));
        }

        if (integrationName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("integration_name", integrationName));
        }

        if (lastIncidentTimeAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_incident_time_after", lastIncidentTimeAfter));
        }

        if (lastIncidentTimeBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_incident_time_before", lastIncidentTimeBefore));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issuesListValidateBeforeCall(String accountToken, String cursor, String endDate, String endUserOrganizationName, OffsetDateTime firstIncidentTimeAfter, OffsetDateTime firstIncidentTimeBefore, String includeMuted, String integrationName, OffsetDateTime lastIncidentTimeAfter, OffsetDateTime lastIncidentTimeBefore, Integer pageSize, String startDate, String status, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = issuesListCall(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status, _callback);
        return localVarCall;

    }

    /**
     * 
     * Gets issues.
     * @param accountToken  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endDate If included, will only include issues whose most recent action occurred before this time (optional)
     * @param endUserOrganizationName  (optional)
     * @param firstIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param firstIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param includeMuted If True, will include muted issues (optional)
     * @param integrationName  (optional)
     * @param lastIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param lastIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param startDate If included, will only include issues whose most recent action occurred after this time (optional)
     * @param status  (optional)
     * @return PaginatedIssueList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedIssueList issuesList(String accountToken, String cursor, String endDate, String endUserOrganizationName, OffsetDateTime firstIncidentTimeAfter, OffsetDateTime firstIncidentTimeBefore, String includeMuted, String integrationName, OffsetDateTime lastIncidentTimeAfter, OffsetDateTime lastIncidentTimeBefore, Integer pageSize, String startDate, String status) throws ApiException {
        ApiResponse<PaginatedIssueList> localVarResp = issuesListWithHttpInfo(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status);
        return localVarResp.getData();
    }

    /**
     * 
     * Gets issues.
     * @param accountToken  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endDate If included, will only include issues whose most recent action occurred before this time (optional)
     * @param endUserOrganizationName  (optional)
     * @param firstIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param firstIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param includeMuted If True, will include muted issues (optional)
     * @param integrationName  (optional)
     * @param lastIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param lastIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param startDate If included, will only include issues whose most recent action occurred after this time (optional)
     * @param status  (optional)
     * @return ApiResponse&lt;PaginatedIssueList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedIssueList> issuesListWithHttpInfo(String accountToken, String cursor, String endDate, String endUserOrganizationName, OffsetDateTime firstIncidentTimeAfter, OffsetDateTime firstIncidentTimeBefore, String includeMuted, String integrationName, OffsetDateTime lastIncidentTimeAfter, OffsetDateTime lastIncidentTimeBefore, Integer pageSize, String startDate, String status) throws ApiException {
        okhttp3.Call localVarCall = issuesListValidateBeforeCall(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status, null);
        Type localVarReturnType = new TypeToken<PaginatedIssueList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets issues.
     * @param accountToken  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endDate If included, will only include issues whose most recent action occurred before this time (optional)
     * @param endUserOrganizationName  (optional)
     * @param firstIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param firstIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param includeMuted If True, will include muted issues (optional)
     * @param integrationName  (optional)
     * @param lastIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param lastIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param startDate If included, will only include issues whose most recent action occurred after this time (optional)
     * @param status  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issuesListAsync(String accountToken, String cursor, String endDate, String endUserOrganizationName, OffsetDateTime firstIncidentTimeAfter, OffsetDateTime firstIncidentTimeBefore, String includeMuted, String integrationName, OffsetDateTime lastIncidentTimeAfter, OffsetDateTime lastIncidentTimeBefore, Integer pageSize, String startDate, String status, final ApiCallback<PaginatedIssueList> _callback) throws ApiException {

        okhttp3.Call localVarCall = issuesListValidateBeforeCall(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status, _callback);
        Type localVarReturnType = new TypeToken<PaginatedIssueList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for issuesRetrieve
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issuesRetrieveCall(UUID id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/issues/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issuesRetrieveValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling issuesRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = issuesRetrieveCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a specific issue.
     * @param id  (required)
     * @return Issue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Issue issuesRetrieve(UUID id) throws ApiException {
        ApiResponse<Issue> localVarResp = issuesRetrieveWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a specific issue.
     * @param id  (required)
     * @return ApiResponse&lt;Issue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Issue> issuesRetrieveWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = issuesRetrieveValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a specific issue.
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issuesRetrieveAsync(UUID id, final ApiCallback<Issue> _callback) throws ApiException {

        okhttp3.Call localVarCall = issuesRetrieveValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
