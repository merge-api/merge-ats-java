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


import merge_ats_client.model.RemoteKey;
import merge_ats_client.model.RemoteKeyForRegenerationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegenerateKeyApi {
    private ApiClient localVarApiClient;

    public RegenerateKeyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RegenerateKeyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for regenerateKeyCreate
     * @param remoteKeyForRegenerationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call regenerateKeyCreateCall(RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = remoteKeyForRegenerationRequest;

        // create path and map variables
        String localVarPath = "/regenerate-key";

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
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call regenerateKeyCreateValidateBeforeCall(RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'remoteKeyForRegenerationRequest' is set
        if (remoteKeyForRegenerationRequest == null) {
            throw new ApiException("Missing the required parameter 'remoteKeyForRegenerationRequest' when calling regenerateKeyCreate(Async)");
        }
        

        okhttp3.Call localVarCall = regenerateKeyCreateCall(remoteKeyForRegenerationRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Exchange remote keys.
     * @param remoteKeyForRegenerationRequest  (required)
     * @return RemoteKey
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RemoteKey regenerateKeyCreate(RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest) throws ApiException {
        ApiResponse<RemoteKey> localVarResp = regenerateKeyCreateWithHttpInfo(remoteKeyForRegenerationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Exchange remote keys.
     * @param remoteKeyForRegenerationRequest  (required)
     * @return ApiResponse&lt;RemoteKey&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RemoteKey> regenerateKeyCreateWithHttpInfo(RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest) throws ApiException {
        okhttp3.Call localVarCall = regenerateKeyCreateValidateBeforeCall(remoteKeyForRegenerationRequest, null);
        Type localVarReturnType = new TypeToken<RemoteKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Exchange remote keys.
     * @param remoteKeyForRegenerationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call regenerateKeyCreateAsync(RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest, final ApiCallback<RemoteKey> _callback) throws ApiException {

        okhttp3.Call localVarCall = regenerateKeyCreateValidateBeforeCall(remoteKeyForRegenerationRequest, _callback);
        Type localVarReturnType = new TypeToken<RemoteKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
