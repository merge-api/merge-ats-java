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
import java.merge_ats_client.model.AccountToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountTokenApi
 */
@Ignore
public class AccountTokenApiTest {

    private final AccountTokenApi api = new AccountTokenApi();

    
    /**
     * 
     *
     * Returns the account token for the end user with the provided public token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountTokenRetrieveTest() throws ApiException {
        String publicToken = null;
        AccountToken response = api.accountTokenRetrieve(publicToken);

        // TODO: test validations
    }
    
}
