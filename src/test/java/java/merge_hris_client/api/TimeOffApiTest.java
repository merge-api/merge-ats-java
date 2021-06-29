/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package java.merge_hris_client.api;

import merge_hris_client.ApiException;
import org.threeten.bp.OffsetDateTime;
import java.merge_hris_client.model.PaginatedTimeOffList;
import java.merge_hris_client.model.TimeOff;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeOffApi
 */
@Ignore
public class TimeOffApiTest {

    private final TimeOffApi api = new TimeOffApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;TimeOff&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeOffListTest() throws ApiException {
        String xAccountToken = null;
        String approverId = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        String employeeId = null;
        String expand = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        PaginatedTimeOffList response = api.timeOffList(xAccountToken, approverId, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an &#x60;TimeOff&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeOffRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        String expand = null;
        Boolean includeRemoteData = null;
        TimeOff response = api.timeOffRetrieve(xAccountToken, id, expand, includeRemoteData);

        // TODO: test validations
    }
    
}
