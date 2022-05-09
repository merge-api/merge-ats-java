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
import merge_ats_client.model.AccountDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountDetailsApi
 */
@Ignore
public class AccountDetailsApiTest {

    private final AccountDetailsApi api = new AccountDetailsApi();

    
    /**
     * 
     *
     * Get details for a linked account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountDetailsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        AccountDetails response = api.accountDetailsRetrieve(xAccountToken);

        // TODO: test validations
    }
    
}
