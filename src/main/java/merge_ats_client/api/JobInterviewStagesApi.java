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


import merge_ats_client.model.JobInterviewStage;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedJobInterviewStageList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobInterviewStagesApi {
    private ApiClient localVarApiClient;

    public JobInterviewStagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobInterviewStagesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for jobInterviewStagesList
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobId If provided, will only return interview stages for this job. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
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
    public okhttp3.Call jobInterviewStagesListCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/job-interview-stages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (jobId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("job_id", jobId));
        }

        if (modifiedAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_after", modifiedAfter));
        }

        if (modifiedBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_before", modifiedBefore));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call jobInterviewStagesListValidateBeforeCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling jobInterviewStagesList(Async)");
        }
        

        okhttp3.Call localVarCall = jobInterviewStagesListCall(xAccountToken, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;JobInterviewStage&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobId If provided, will only return interview stages for this job. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedJobInterviewStageList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedJobInterviewStageList jobInterviewStagesList(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        ApiResponse<PaginatedJobInterviewStageList> localVarResp = jobInterviewStagesListWithHttpInfo(xAccountToken, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;JobInterviewStage&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobId If provided, will only return interview stages for this job. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedJobInterviewStageList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedJobInterviewStageList> jobInterviewStagesListWithHttpInfo(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = jobInterviewStagesListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedJobInterviewStageList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;JobInterviewStage&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param jobId If provided, will only return interview stages for this job. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
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
    public okhttp3.Call jobInterviewStagesListAsync(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeDeletedData, Boolean includeRemoteData, String jobId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback<PaginatedJobInterviewStageList> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobInterviewStagesListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedJobInterviewStageList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobInterviewStagesRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobInterviewStagesRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/job-interview-stages/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
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
    private okhttp3.Call jobInterviewStagesRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling jobInterviewStagesRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling jobInterviewStagesRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = jobInterviewStagesRetrieveCall(xAccountToken, id, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;JobInterviewStage&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return JobInterviewStage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public JobInterviewStage jobInterviewStagesRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        ApiResponse<JobInterviewStage> localVarResp = jobInterviewStagesRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;JobInterviewStage&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;JobInterviewStage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JobInterviewStage> jobInterviewStagesRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = jobInterviewStagesRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<JobInterviewStage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;JobInterviewStage&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobInterviewStagesRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback<JobInterviewStage> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobInterviewStagesRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<JobInterviewStage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
