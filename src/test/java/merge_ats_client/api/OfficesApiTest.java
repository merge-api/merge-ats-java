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
import merge_ats_client.model.Office;
import org.threeten.bp.OffsetDateTime;
import merge_ats_client.model.PaginatedOfficeList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OfficesApi
 */
@Ignore
public class OfficesApiTest {

    private final OfficesApi api = new OfficesApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;Office&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void officesListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        PaginatedOfficeList response = api.officesList(xAccountToken, createdAfter, createdBefore, cursor, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an &#x60;Office&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void officesRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean includeRemoteData = null;
        Office response = api.officesRetrieve(xAccountToken, id, includeRemoteData);

        // TODO: test validations
    }
    
}
