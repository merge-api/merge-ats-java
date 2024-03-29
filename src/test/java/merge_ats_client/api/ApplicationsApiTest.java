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

import merge_ats_client.ApiException;
import merge_ats_client.model.Application;
import merge_ats_client.model.ApplicationEndpointRequest;
import merge_ats_client.model.ApplicationResponse;
import merge_ats_client.model.MetaResponse;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedApplicationList;
import java.util.UUID;
import merge_ats_client.model.UpdateApplicationStageRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
@Ignore
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    
    /**
     * 
     *
     * Updates the &#x60;current_stage&#x60; field of an &#x60;Application&#x60; object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsChangeStageCreateTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean isDebugMode = null;
        Boolean runAsync = null;
        UpdateApplicationStageRequest updateApplicationStageRequest = null;
        ApplicationResponse response = api.applicationsChangeStageCreate(xAccountToken, id, isDebugMode, runAsync, updateApplicationStageRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates an &#x60;Application&#x60; object with the given values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsCreateTest() throws ApiException {
        String xAccountToken = null;
        ApplicationEndpointRequest applicationEndpointRequest = null;
        Boolean isDebugMode = null;
        Boolean runAsync = null;
        ApplicationResponse response = api.applicationsCreate(xAccountToken, applicationEndpointRequest, isDebugMode, runAsync);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of &#x60;Application&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsListTest() throws ApiException {
        String xAccountToken = null;
        String candidateId = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String creditedToId = null;
        String currentStageId = null;
        String cursor = null;
        Boolean includeDeletedData = null;
        Boolean includeRemoteData = null;
        String jobId = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String rejectReasonId = null;
        String remoteId = null;
        String source = null;
        PaginatedApplicationList response = api.applicationsList(xAccountToken, candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, includeDeletedData, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId, source);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns metadata for &#x60;Application&#x60; POSTs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsMetaPostRetrieveTest() throws ApiException {
        String xAccountToken = null;
        String applicationRemoteTemplateId = null;
        MetaResponse response = api.applicationsMetaPostRetrieve(xAccountToken, applicationRemoteTemplateId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an &#x60;Application&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean includeRemoteData = null;
        Application response = api.applicationsRetrieve(xAccountToken, id, includeRemoteData);

        // TODO: test validations
    }
    
}
