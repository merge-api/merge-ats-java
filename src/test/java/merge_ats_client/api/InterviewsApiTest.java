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
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedScheduledInterviewList;
import merge_ats_client.model.ScheduledInterview;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterviewsApi
 */
@Ignore
public class InterviewsApiTest {

    private final InterviewsApi api = new InterviewsApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;ScheduledInterview&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void interviewsListTest() throws ApiException {
        String xAccountToken = null;
        String applicationId = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        Boolean includeDeletedData = null;
        Boolean includeRemoteData = null;
        String jobInterviewStageId = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        String organizerId = null;
        Integer pageSize = null;
        String remoteFields = null;
        String remoteId = null;
        PaginatedScheduledInterviewList response = api.interviewsList(xAccountToken, applicationId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, jobInterviewStageId, modifiedAfter, modifiedBefore, organizerId, pageSize, remoteFields, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a &#x60;ScheduledInterview&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void interviewsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean includeRemoteData = null;
        String remoteFields = null;
        ScheduledInterview response = api.interviewsRetrieve(xAccountToken, id, includeRemoteData, remoteFields);

        // TODO: test validations
    }
    
}
