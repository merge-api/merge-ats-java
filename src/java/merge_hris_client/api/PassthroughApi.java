/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package java.merge_hris_client.api;

import merge_hris_client.ApiCallback;
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.ApiResponse;
import merge_hris_client.Configuration;
import merge_hris_client.Pair;
import merge_hris_client.ProgressRequestBody;
import merge_hris_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.merge_hris_client.model.DataPassthroughRequest;
import java.merge_hris_client.model.RemoteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassthroughApi {
    private ApiClient localVarApiClient;

    public PassthroughApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PassthroughApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for passthroughCreate
     * @param xAccountToken Token identifying the end user. (required)
     * @param dataPassthroughRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call passthroughCreateCall(String xAccountToken, DataPassthroughRequest dataPassthroughRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = dataPassthroughRequest;

        // create path and map variables
        String localVarPath = "/passthrough";

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
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call passthroughCreateValidateBeforeCall(String xAccountToken, DataPassthroughRequest dataPassthroughRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling passthroughCreate(Async)");
        }
        
        // verify the required parameter 'dataPassthroughRequest' is set
        if (dataPassthroughRequest == null) {
            throw new ApiException("Missing the required parameter 'dataPassthroughRequest' when calling passthroughCreate(Async)");
        }
        

        okhttp3.Call localVarCall = passthroughCreateCall(xAccountToken, dataPassthroughRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Pull data from an endpoint not currently supported by Merge.
     * @param xAccountToken Token identifying the end user. (required)
     * @param dataPassthroughRequest  (required)
     * @return RemoteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RemoteResponse passthroughCreate(String xAccountToken, DataPassthroughRequest dataPassthroughRequest) throws ApiException {
        ApiResponse<RemoteResponse> localVarResp = passthroughCreateWithHttpInfo(xAccountToken, dataPassthroughRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Pull data from an endpoint not currently supported by Merge.
     * @param xAccountToken Token identifying the end user. (required)
     * @param dataPassthroughRequest  (required)
     * @return ApiResponse&lt;RemoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RemoteResponse> passthroughCreateWithHttpInfo(String xAccountToken, DataPassthroughRequest dataPassthroughRequest) throws ApiException {
        okhttp3.Call localVarCall = passthroughCreateValidateBeforeCall(xAccountToken, dataPassthroughRequest, null);
        Type localVarReturnType = new TypeToken<RemoteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Pull data from an endpoint not currently supported by Merge.
     * @param xAccountToken Token identifying the end user. (required)
     * @param dataPassthroughRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call passthroughCreateAsync(String xAccountToken, DataPassthroughRequest dataPassthroughRequest, final ApiCallback<RemoteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = passthroughCreateValidateBeforeCall(xAccountToken, dataPassthroughRequest, _callback);
        Type localVarReturnType = new TypeToken<RemoteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
