
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.model.PaginatedOfferList;
import merge_ats_client.api.OffersApi;
import merge_ats_client.model.OfferStatusEnum;
import merge_ats_client.model.Offer;


public class EnumDeprecationExample {
    public static void main(String[] args) {
        // Configure API client
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        tokenAuth.setApiKeyPrefix("Bearer");

        // Make a request to the TimeOff endpoint
        OffersApi apiInstance = new OffersApi(defaultClient);
        String xAccountToken = "xAccountToken_example";
        String employeeId = "employeeId_example";
        Integer pageSize = 20;
        try {
            PaginatedOfferList result = apiInstance.offersList(xAccountToken, null, null, null, null, employeeId, true, null, null, pageSize, null);
            if (result.getResults() != null) {
                for (Offer offer: result.getResults()) {

                    // Deprecated Usage of Enum
                    if (offer.getStatus() == OfferStatusEnum.APPROVED) {
                        System.out.format("Offer with ID %s was approved!", offer.getId());
                    }

                    // New approach
                    if (offer.getStatus().equals("APPROVED")) {
                        System.out.format("Offer with ID %s was approved!", offer.getId());
                    }
                }
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling PaginatedOfferList");
            e.printStackTrace();
        }
    }
}