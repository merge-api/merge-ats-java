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


package main.java.merge_ats_client.api;

import merge_ats_client.ApiException;
import main.java.merge_ats_client.model.Application;
import main.java.merge_ats_client.model.ApplicationRequest;
import org.threeten.bp.OffsetDateTime;
import main.java.merge_ats_client.model.PaginatedApplicationList;
import java.util.UUID;
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
     * Creates an &#x60;Application&#x60; object with the given values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsCreateTest() throws ApiException {
        String xAccountToken = null;
        String remoteUserId = null;
        Boolean runAsync = null;
        ApplicationRequest applicationRequest = null;
        Application response = api.applicationsCreate(xAccountToken, remoteUserId, runAsync, applicationRequest);

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
        String expand = null;
        Boolean includeRemoteData = null;
        String jobId = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String rejectReasonId = null;
        String remoteId = null;
        PaginatedApplicationList response = api.applicationsList(xAccountToken, candidateId, createdAfter, createdBefore, creditedToId, currentStageId, cursor, expand, includeRemoteData, jobId, modifiedAfter, modifiedBefore, pageSize, rejectReasonId, remoteId);

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
        String expand = null;
        Boolean includeRemoteData = null;
        Application response = api.applicationsRetrieve(xAccountToken, id, expand, includeRemoteData);

        // TODO: test validations
    }
    
}
