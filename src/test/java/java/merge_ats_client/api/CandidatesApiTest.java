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
import java.merge_ats_client.model.Candidate;
import java.merge_ats_client.model.CandidateRequest;
import org.threeten.bp.OffsetDateTime;
import java.merge_ats_client.model.PaginatedCandidateList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CandidatesApi
 */
@Ignore
public class CandidatesApiTest {

    private final CandidatesApi api = new CandidatesApi();

    
    /**
     * 
     *
     * Creates a &#x60;Candidate&#x60; object with the given values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candidatesCreateTest() throws ApiException {
        String xAccountToken = null;
        String remoteUserId = null;
        Boolean runAsync = null;
        CandidateRequest candidateRequest = null;
        Candidate response = api.candidatesCreate(xAccountToken, remoteUserId, runAsync, candidateRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of &#x60;Candidate&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candidatesListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        String emailAddress = null;
        String expand = null;
        String firstName = null;
        Boolean includeRemoteData = null;
        String lastName = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        String tag = null;
        PaginatedCandidateList response = api.candidatesList(xAccountToken, createdAfter, createdBefore, cursor, emailAddress, expand, firstName, includeRemoteData, lastName, modifiedAfter, modifiedBefore, pageSize, remoteId, tag);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a &#x60;Candidate&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candidatesRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        String expand = null;
        Boolean includeRemoteData = null;
        Candidate response = api.candidatesRetrieve(xAccountToken, id, expand, includeRemoteData);

        // TODO: test validations
    }
    
}
