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
import merge_ats_client.model.RemoteKey;
import merge_ats_client.model.RemoteKeyForRegenerationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegenerateKeyApi
 */
@Ignore
public class RegenerateKeyApiTest {

    private final RegenerateKeyApi api = new RegenerateKeyApi();

    
    /**
     * 
     *
     * Exchange remote keys.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regenerateKeyCreateTest() throws ApiException {
        RemoteKeyForRegenerationRequest remoteKeyForRegenerationRequest = null;
        RemoteKey response = api.regenerateKeyCreate(remoteKeyForRegenerationRequest);

        // TODO: test validations
    }
    
}
