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


import merge_ats_client.model.Offer;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedOfferList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OffersApi {
    private ApiClient localVarApiClient;

    public OffersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OffersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for offersList
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return offers for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param creatorId If provided, will only return offers created by this user. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
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
    public okhttp3.Call offersListCall(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String creatorId, String cursor, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/offers";

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

        if (creatorId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("creator_id", creatorId));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
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
    private okhttp3.Call offersListValidateBeforeCall(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String creatorId, String cursor, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling offersList(Async)");
        }
        

        okhttp3.Call localVarCall = offersListCall(xAccountToken, applicationId, createdAfter, createdBefore, creatorId, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;Offer&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return offers for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param creatorId If provided, will only return offers created by this user. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedOfferList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedOfferList offersList(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String creatorId, String cursor, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        ApiResponse<PaginatedOfferList> localVarResp = offersListWithHttpInfo(xAccountToken, applicationId, createdAfter, createdBefore, creatorId, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;Offer&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return offers for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param creatorId If provided, will only return offers created by this user. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedOfferList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedOfferList> offersListWithHttpInfo(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String creatorId, String cursor, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = offersListValidateBeforeCall(xAccountToken, applicationId, createdAfter, createdBefore, creatorId, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedOfferList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;Offer&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param applicationId If provided, will only return offers for this application. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param creatorId If provided, will only return offers created by this user. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
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
    public okhttp3.Call offersListAsync(String xAccountToken, String applicationId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String creatorId, String cursor, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback<PaginatedOfferList> _callback) throws ApiException {

        okhttp3.Call localVarCall = offersListValidateBeforeCall(xAccountToken, applicationId, createdAfter, createdBefore, creatorId, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedOfferList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for offersRetrieve
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
    public okhttp3.Call offersRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/offers/{id}"
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
    private okhttp3.Call offersRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling offersRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling offersRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = offersRetrieveCall(xAccountToken, id, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns an &#x60;Offer&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Offer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Offer offersRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        ApiResponse<Offer> localVarResp = offersRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an &#x60;Offer&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;Offer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Offer> offersRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = offersRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<Offer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an &#x60;Offer&#x60; object with the given &#x60;id&#x60;.
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
    public okhttp3.Call offersRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback<Offer> _callback) throws ApiException {

        okhttp3.Call localVarCall = offersRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<Offer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
