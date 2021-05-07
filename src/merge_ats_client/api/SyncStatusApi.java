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


import merge_ats_client.model.SyncStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SyncStatusApi {
    private ApiClient localVarApiClient;

    public SyncStatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SyncStatusApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for syncStatusResyncCreate
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncStatusResyncCreateCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sync-status/resync";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call syncStatusResyncCreateValidateBeforeCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling syncStatusResyncCreate(Async)");
        }
        

        okhttp3.Call localVarCall = syncStatusResyncCreateCall(xAccountToken, _callback);
        return localVarCall;

    }

    /**
     * 
     * Force resync of all models.
     * @param xAccountToken Token identifying the end user. (required)
     * @return SyncStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SyncStatus syncStatusResyncCreate(String xAccountToken) throws ApiException {
        ApiResponse<SyncStatus> localVarResp = syncStatusResyncCreateWithHttpInfo(xAccountToken);
        return localVarResp.getData();
    }

    /**
     * 
     * Force resync of all models.
     * @param xAccountToken Token identifying the end user. (required)
     * @return ApiResponse&lt;SyncStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SyncStatus> syncStatusResyncCreateWithHttpInfo(String xAccountToken) throws ApiException {
        okhttp3.Call localVarCall = syncStatusResyncCreateValidateBeforeCall(xAccountToken, null);
        Type localVarReturnType = new TypeToken<SyncStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Force resync of all models.
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncStatusResyncCreateAsync(String xAccountToken, final ApiCallback<SyncStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncStatusResyncCreateValidateBeforeCall(xAccountToken, _callback);
        Type localVarReturnType = new TypeToken<SyncStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for syncStatusRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncStatusRetrieveCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sync-status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call syncStatusRetrieveValidateBeforeCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling syncStatusRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = syncStatusRetrieveCall(xAccountToken, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get syncing status.
     * @param xAccountToken Token identifying the end user. (required)
     * @return SyncStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SyncStatus syncStatusRetrieve(String xAccountToken) throws ApiException {
        ApiResponse<SyncStatus> localVarResp = syncStatusRetrieveWithHttpInfo(xAccountToken);
        return localVarResp.getData();
    }

    /**
     * 
     * Get syncing status.
     * @param xAccountToken Token identifying the end user. (required)
     * @return ApiResponse&lt;SyncStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SyncStatus> syncStatusRetrieveWithHttpInfo(String xAccountToken) throws ApiException {
        okhttp3.Call localVarCall = syncStatusRetrieveValidateBeforeCall(xAccountToken, null);
        Type localVarReturnType = new TypeToken<SyncStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get syncing status.
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncStatusRetrieveAsync(String xAccountToken, final ApiCallback<SyncStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncStatusRetrieveValidateBeforeCall(xAccountToken, _callback);
        Type localVarReturnType = new TypeToken<SyncStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
