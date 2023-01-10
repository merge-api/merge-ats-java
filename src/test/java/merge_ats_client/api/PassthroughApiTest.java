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
import merge_ats_client.model.DataPassthroughRequest;
import merge_ats_client.model.RemoteResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PassthroughApi
 */
@Ignore
public class PassthroughApiTest {

    private final PassthroughApi api = new PassthroughApi();

    
    /**
     * 
     *
     * Pull data from an endpoint not currently supported by Merge.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void passthroughCreateTest() throws ApiException {
        DataPassthroughRequest dataPassthroughRequest = null;
        RemoteResponse response = api.passthroughCreate(dataPassthroughRequest);

        // TODO: test validations
    }
    
}
