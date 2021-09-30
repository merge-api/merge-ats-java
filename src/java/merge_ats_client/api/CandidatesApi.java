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


package java.merge_ats_client.api;

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


import merge_ats_client.model.Candidate;
import merge_ats_client.model.CandidateRequest;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedCandidateList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidatesApi {
    private ApiClient localVarApiClient;

    public CandidatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CandidatesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for candidatesCreate
     * @param xAccountToken Token identifying the end user. (required)
     * @param remoteUserId The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param candidateRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call candidatesCreateCall(String xAccountToken, String remoteUserId, Boolean runAsync, CandidateRequest candidateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = candidateRequest;

        // create path and map variables
        String localVarPath = "/candidates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (remoteUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_user_id", remoteUserId));
        }

        if (runAsync != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("run_async", runAsync));
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
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call candidatesCreateValidateBeforeCall(String xAccountToken, String remoteUserId, Boolean runAsync, CandidateRequest candidateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling candidatesCreate(Async)");
        }
        

        okhttp3.Call localVarCall = candidatesCreateCall(xAccountToken, remoteUserId, runAsync, candidateRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a &#x60;Candidate&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param remoteUserId The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param candidateRequest  (optional)
     * @return Candidate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Candidate candidatesCreate(String xAccountToken, String remoteUserId, Boolean runAsync, CandidateRequest candidateRequest) throws ApiException {
        ApiResponse<Candidate> localVarResp = candidatesCreateWithHttpInfo(xAccountToken, remoteUserId, runAsync, candidateRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a &#x60;Candidate&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param remoteUserId The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param candidateRequest  (optional)
     * @return ApiResponse&lt;Candidate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Candidate> candidatesCreateWithHttpInfo(String xAccountToken, String remoteUserId, Boolean runAsync, CandidateRequest candidateRequest) throws ApiException {
        okhttp3.Call localVarCall = candidatesCreateValidateBeforeCall(xAccountToken, remoteUserId, runAsync, candidateRequest, null);
        Type localVarReturnType = new TypeToken<Candidate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a &#x60;Candidate&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param remoteUserId The ID of the RemoteUser modifying the resource. This can be found in the ID field (not remote_id) in the RemoteUser table. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param candidateRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call candidatesCreateAsync(String xAccountToken, String remoteUserId, Boolean runAsync, CandidateRequest candidateRequest, final ApiCallback<Candidate> _callback) throws ApiException {

        okhttp3.Call localVarCall = candidatesCreateValidateBeforeCall(xAccountToken, remoteUserId, runAsync, candidateRequest, _callback);
        Type localVarReturnType = new TypeToken<Candidate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for candidatesList
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param emailAddress If provided, will only return candidates with this email_address. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param firstName If provided, will only return candidates with this first name. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param lastName If provided, will only return candidates with this last name. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param tag If provided, will only return candidates with this tag. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call candidatesListCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String emailAddress, String expand, String firstName, Boolean includeRemoteData, String lastName, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, String tag, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/candidates";

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

        if (emailAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email_address", emailAddress));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (firstName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_name", firstName));
        }

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_name", lastName));
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

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
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
    private okhttp3.Call candidatesListValidateBeforeCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String emailAddress, String expand, String firstName, Boolean includeRemoteData, String lastName, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, String tag, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling candidatesList(Async)");
        }
        

        okhttp3.Call localVarCall = candidatesListCall(xAccountToken, createdAfter, createdBefore, cursor, emailAddress, expand, firstName, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tag, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;Candidate&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param emailAddress If provided, will only return candidates with this email_address. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param firstName If provided, will only return candidates with this first name. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param lastName If provided, will only return candidates with this last name. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param tag If provided, will only return candidates with this tag. (optional)
     * @return PaginatedCandidateList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedCandidateList candidatesList(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String emailAddress, String expand, String firstName, Boolean includeRemoteData, String lastName, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, String tag) throws ApiException {
        ApiResponse<PaginatedCandidateList> localVarResp = candidatesListWithHttpInfo(xAccountToken, createdAfter, createdBefore, cursor, emailAddress, expand, firstName, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tag);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;Candidate&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param emailAddress If provided, will only return candidates with this email_address. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param firstName If provided, will only return candidates with this first name. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param lastName If provided, will only return candidates with this last name. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param tag If provided, will only return candidates with this tag. (optional)
     * @return ApiResponse&lt;PaginatedCandidateList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedCandidateList> candidatesListWithHttpInfo(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String emailAddress, String expand, String firstName, Boolean includeRemoteData, String lastName, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, String tag) throws ApiException {
        okhttp3.Call localVarCall = candidatesListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, emailAddress, expand, firstName, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tag, null);
        Type localVarReturnType = new TypeToken<PaginatedCandidateList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;Candidate&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param emailAddress If provided, will only return candidates with this email_address. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param firstName If provided, will only return candidates with this first name. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param lastName If provided, will only return candidates with this last name. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param tag If provided, will only return candidates with this tag. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call candidatesListAsync(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String emailAddress, String expand, String firstName, Boolean includeRemoteData, String lastName, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, String tag, final ApiCallback<PaginatedCandidateList> _callback) throws ApiException {

        okhttp3.Call localVarCall = candidatesListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, emailAddress, expand, firstName, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tag, _callback);
        Type localVarReturnType = new TypeToken<PaginatedCandidateList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for candidatesRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
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
    public okhttp3.Call candidatesRetrieveCall(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/candidates/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

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
    private okhttp3.Call candidatesRetrieveValidateBeforeCall(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling candidatesRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling candidatesRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = candidatesRetrieveCall(xAccountToken, id, expand, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Candidate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Candidate candidatesRetrieve(String xAccountToken, UUID id, String expand, Boolean includeRemoteData) throws ApiException {
        ApiResponse<Candidate> localVarResp = candidatesRetrieveWithHttpInfo(xAccountToken, id, expand, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;Candidate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Candidate> candidatesRetrieveWithHttpInfo(String xAccountToken, UUID id, String expand, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = candidatesRetrieveValidateBeforeCall(xAccountToken, id, expand, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<Candidate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
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
    public okhttp3.Call candidatesRetrieveAsync(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback<Candidate> _callback) throws ApiException {

        okhttp3.Call localVarCall = candidatesRetrieveValidateBeforeCall(xAccountToken, id, expand, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<Candidate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
