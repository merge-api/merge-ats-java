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


import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedScheduledInterviewList;
import merge_ats_client.model.ScheduledInterview;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewsApi {
    private ApiClient localVarApiClient;

    public InterviewsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InterviewsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for interviewsList
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return interviews for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobInterviewStageId If provided, will only return interviews at this stage. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param organizerId If provided, will only return interviews organized by this user. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call interviewsListCall(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobInterviewStageId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String organizerId, Integer pageSize, String remoteFields, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/interviews";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (applicationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("application_id", applicationId));
        }

        if (createdAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_after", createdAfter));
        }

        if (createdBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_before", createdBefore));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (includeDeletedData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_deleted_data", includeDeletedData));
        }

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (jobInterviewStageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("job_interview_stage_id", jobInterviewStageId));
        }

        if (modifiedAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_after", modifiedAfter));
        }

        if (modifiedBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_before", modifiedBefore));
        }

        if (organizerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organizer_id", organizerId));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (remoteFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_fields", remoteFields));
        }

        if (remoteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_id", remoteId));
        }

        if (xAccountToken != null) {
            localVarHeaderParams.put("X-Account-Token", localVarApiClient.parameterToString(xAccountToken));
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

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call interviewsListValidateBeforeCall(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobInterviewStageId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String organizerId, Integer pageSize, String remoteFields, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling interviewsList(Async)");
        }
        

        okhttp3.Call localVarCall = interviewsListCall(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;ScheduledInterview&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return interviews for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobInterviewStageId If provided, will only return interviews at this stage. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param organizerId If provided, will only return interviews organized by this user. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedScheduledInterviewList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedScheduledInterviewList interviewsList(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobInterviewStageId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String organizerId, Integer pageSize, String remoteFields, String remoteId) throws ApiException {
        ApiResponse<PaginatedScheduledInterviewList> localVarResp = interviewsListWithHttpInfo(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;ScheduledInterview&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return interviews for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobInterviewStageId If provided, will only return interviews at this stage. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param organizerId If provided, will only return interviews organized by this user. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedScheduledInterviewList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedScheduledInterviewList> interviewsListWithHttpInfo(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobInterviewStageId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String organizerId, Integer pageSize, String remoteFields, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = interviewsListValidateBeforeCall(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedScheduledInterviewList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;ScheduledInterview&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return interviews for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobInterviewStageId If provided, will only return interviews at this stage. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param organizerId If provided, will only return interviews organized by this user. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call interviewsListAsync(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobInterviewStageId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String organizerId, Integer pageSize, String remoteFields, String remoteId, final ApiCallback<PaginatedScheduledInterviewList> _callback) throws ApiException {

        okhttp3.Call localVarCall = interviewsListValidateBeforeCall(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedScheduledInterviewList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for interviewsRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call interviewsRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, String remoteFields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/interviews/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (remoteFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_fields", remoteFields));
        }

        if (xAccountToken != null) {
            localVarHeaderParams.put("X-Account-Token", localVarApiClient.parameterToString(xAccountToken));
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

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call interviewsRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, String remoteFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling interviewsRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling interviewsRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = interviewsRetrieveCall(xAccountToken, id, includeRemoteData, remoteFields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return ScheduledInterview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ScheduledInterview interviewsRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData, String remoteFields) throws ApiException {
        ApiResponse<ScheduledInterview> localVarResp = interviewsRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData, remoteFields);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return ApiResponse&lt;ScheduledInterview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ScheduledInterview> interviewsRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData, String remoteFields) throws ApiException {
        okhttp3.Call localVarCall = interviewsRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, remoteFields, null);
        Type localVarReturnType = new TypeToken<ScheduledInterview>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call interviewsRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, String remoteFields, final ApiCallback<ScheduledInterview> _callback) throws ApiException {

        okhttp3.Call localVarCall = interviewsRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, remoteFields, _callback);
        Type localVarReturnType = new TypeToken<ScheduledInterview>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
