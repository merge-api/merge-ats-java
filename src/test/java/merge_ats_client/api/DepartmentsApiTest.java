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
import merge_ats_client.model.Department;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedDepartmentList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepartmentsApi
 */
@Ignore
public class DepartmentsApiTest {

    private final DepartmentsApi api = new DepartmentsApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;Department&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentsListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        Boolean includeDeletedData = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        PaginatedDepartmentList response = api.departmentsList(xAccountToken, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a &#x60;Department&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean includeRemoteData = null;
        Department response = api.departmentsRetrieve(xAccountToken, id, includeRemoteData);

        // TODO: test validations
    }
    
}
