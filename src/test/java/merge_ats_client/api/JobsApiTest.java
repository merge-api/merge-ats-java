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
import merge_ats_client.model.Job;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedJobList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Ignore
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;Job&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsListTest() throws ApiException {
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
        PaginatedJobList response = api.jobsList(xAccountToken, createdAfter, createdBefore, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a &#x60;Job&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        String expand = null;
        Boolean includeRemoteData = null;
        Job response = api.jobsRetrieve(xAccountToken, id, includeRemoteData);

        // TODO: test validations
    }
    
}
