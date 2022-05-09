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
import merge_ats_client.model.Issue;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedIssueList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssuesApi
 */
@Ignore
public class IssuesApiTest {

    private final IssuesApi api = new IssuesApi();

    
    /**
     * 
     *
     * Gets issues.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issuesListTest() throws ApiException {
        String accountToken = null;
        String cursor = null;
        String endDate = null;
        String endUserOrganizationName = null;
        OffsetDateTime firstIncidentTimeAfter = null;
        OffsetDateTime firstIncidentTimeBefore = null;
        String includeMuted = null;
        String integrationName = null;
        OffsetDateTime lastIncidentTimeAfter = null;
        OffsetDateTime lastIncidentTimeBefore = null;
        Integer pageSize = null;
        String startDate = null;
        String status = null;
        PaginatedIssueList response = api.issuesList(accountToken, cursor, endDate, endUserOrganizationName, firstIncidentTimeAfter, firstIncidentTimeBefore, includeMuted, integrationName, lastIncidentTimeAfter, lastIncidentTimeBefore, pageSize, startDate, status);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a specific issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issuesRetrieveTest() throws ApiException {
        UUID id = null;
        Issue response = api.issuesRetrieve(id);

        // TODO: test validations
    }
    
}
