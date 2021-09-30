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

import merge_ats_client.ApiException;
import java.merge_ats_client.model.Activity;
import org.threeten.bp.OffsetDateTime;
import java.merge_ats_client.model.PaginatedActivityList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
@Ignore
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;Activity&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activitiesListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        String expand = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        String userId = null;
        PaginatedActivityList response = api.activitiesList(xAccountToken, createdAfter, createdBefore, cursor, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, userId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an &#x60;Activity&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activitiesRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        String expand = null;
        Boolean includeRemoteData = null;
        Activity response = api.activitiesRetrieve(xAccountToken, id, expand, includeRemoteData);

        // TODO: test validations
    }
    
}