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


import merge_ats_client.model.PaginatedAccountDetailsAndActionsList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedAccountsApi {
    private ApiClient localVarApiClient;

    public LinkedAccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LinkedAccountsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for linkedAccountsList
     * @param category  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional)
     * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional)
     * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional)
     * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional)
     * @param id  (optional)
     * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional)
     * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional)
     * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional)
     * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call linkedAccountsListCall(String category, String cursor, String endUserEmailAddress, String endUserOrganizationName, String endUserOriginId, String endUserOriginIds, UUID id, String ids, Boolean includeDuplicates, String integrationName, String isTestAccount, Integer pageSize, String status, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/linked-accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (category != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("category", category));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (endUserEmailAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_user_email_address", endUserEmailAddress));
        }

        if (endUserOrganizationName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_user_organization_name", endUserOrganizationName));
        }

        if (endUserOriginId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_user_origin_id", endUserOriginId));
        }

        if (endUserOriginIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_user_origin_ids", endUserOriginIds));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (ids != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ids", ids));
        }

        if (includeDuplicates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_duplicates", includeDuplicates));
        }

        if (integrationName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("integration_name", integrationName));
        }

        if (isTestAccount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_test_account", isTestAccount));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call linkedAccountsListValidateBeforeCall(String category, String cursor, String endUserEmailAddress, String endUserOrganizationName, String endUserOriginId, String endUserOriginIds, UUID id, String ids, Boolean includeDuplicates, String integrationName, String isTestAccount, Integer pageSize, String status, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = linkedAccountsListCall(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status, _callback);
        return localVarCall;

    }

    /**
     * 
     * List linked accounts for your organization.
     * @param category  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional)
     * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional)
     * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional)
     * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional)
     * @param id  (optional)
     * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional)
     * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional)
     * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional)
     * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
     * @return PaginatedAccountDetailsAndActionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedAccountDetailsAndActionsList linkedAccountsList(String category, String cursor, String endUserEmailAddress, String endUserOrganizationName, String endUserOriginId, String endUserOriginIds, UUID id, String ids, Boolean includeDuplicates, String integrationName, String isTestAccount, Integer pageSize, String status) throws ApiException {
        ApiResponse<PaginatedAccountDetailsAndActionsList> localVarResp = linkedAccountsListWithHttpInfo(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status);
        return localVarResp.getData();
    }

    /**
     * 
     * List linked accounts for your organization.
     * @param category  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional)
     * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional)
     * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional)
     * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional)
     * @param id  (optional)
     * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional)
     * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional)
     * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional)
     * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
     * @return ApiResponse&lt;PaginatedAccountDetailsAndActionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedAccountDetailsAndActionsList> linkedAccountsListWithHttpInfo(String category, String cursor, String endUserEmailAddress, String endUserOrganizationName, String endUserOriginId, String endUserOriginIds, UUID id, String ids, Boolean includeDuplicates, String integrationName, String isTestAccount, Integer pageSize, String status) throws ApiException {
        okhttp3.Call localVarCall = linkedAccountsListValidateBeforeCall(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status, null);
        Type localVarReturnType = new TypeToken<PaginatedAccountDetailsAndActionsList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List linked accounts for your organization.
     * @param category  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endUserEmailAddress If provided, will only return linked accounts associated with the given email address. (optional)
     * @param endUserOrganizationName If provided, will only return linked accounts associated with the given organization name. (optional)
     * @param endUserOriginId If provided, will only return linked accounts associated with the given origin ID. (optional)
     * @param endUserOriginIds Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. (optional)
     * @param id  (optional)
     * @param ids Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. (optional)
     * @param includeDuplicates If &#x60;true&#x60;, will include complete production duplicates of the account specified by the &#x60;id&#x60; query parameter in the response. &#x60;id&#x60; must be for a complete production linked account. (optional)
     * @param integrationName If provided, will only return linked accounts associated with the given integration name. (optional)
     * @param isTestAccount If included, will only include test linked accounts. If not included, will only include non-test linked accounts. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param status Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call linkedAccountsListAsync(String category, String cursor, String endUserEmailAddress, String endUserOrganizationName, String endUserOriginId, String endUserOriginIds, UUID id, String ids, Boolean includeDuplicates, String integrationName, String isTestAccount, Integer pageSize, String status, final ApiCallback<PaginatedAccountDetailsAndActionsList> _callback) throws ApiException {

        okhttp3.Call localVarCall = linkedAccountsListValidateBeforeCall(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, includeDuplicates, integrationName, isTestAccount, pageSize, status, _callback);
        Type localVarReturnType = new TypeToken<PaginatedAccountDetailsAndActionsList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
