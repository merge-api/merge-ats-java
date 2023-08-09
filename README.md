## Deprecation Notice

Merge has released a new version of our [Java SDK](https://github.com/merge-api/merge-java-client/). As part of that release, we are providing a deprecation notice of our legacy SDKs.

To help give you time to plan your migration to our latest SDK:

- August 2023: SDK deprecation notice on our legacy Java SDKs.
- Until February 2024: we’ll support updates as needed and address bugs in priority order
- After February 2024: we’ll no longer make updates or bug fixes to the deprecated SDKs

For information about the deprecation notice see our [help center](https://help.merge.dev/en/collections/4258952-sdks) and for information about migrating to the Java SDK, see the [Java Migration Guide](https://help.merge.dev/en/articles/8229535-advanced-java-sdk-migration-guide).

# merge-ats-client

Merge ATS API
- API version: 2.0.0
  - Build date: 2023-01-10T20:13:14.599893Z[Etc/UTC]

The unified API for building rich integrations with multiple Applicant Tracking System platforms.

  For more information, please visit [https://www.merge.dev/](https://www.merge.dev/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>dev.merge.ats</groupId>
  <artifactId>merge-ats-client</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "dev.merge.ats:merge-ats-client:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/merge-ats-client-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import merge_ats_client.ApiClient;
import merge_ats_client.ApiException;
import merge_ats_client.Configuration;
import merge_ats_client.auth.*;
import merge_ats_client.models.*;
import merge_ats_client.api.AccountDetailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: accountTokenAuth
    ApiKeyAuth accountTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("accountTokenAuth");
    accountTokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //accountTokenAuth.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
    try {
      AccountDetails result = apiInstance.accountDetailsRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDetailsApi#accountDetailsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.merge.dev/api/ats/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountDetailsApi* | [**accountDetailsRetrieve**](docs/AccountDetailsApi.md#accountDetailsRetrieve) | **GET** /account-details | 
*AccountTokenApi* | [**accountTokenRetrieve**](docs/AccountTokenApi.md#accountTokenRetrieve) | **GET** /account-token/{public_token} | 
*ActivitiesApi* | [**activitiesList**](docs/ActivitiesApi.md#activitiesList) | **GET** /activities | 
*ActivitiesApi* | [**activitiesRetrieve**](docs/ActivitiesApi.md#activitiesRetrieve) | **GET** /activities/{id} | 
*ApplicationsApi* | [**applicationsChangeStageCreate**](docs/ApplicationsApi.md#applicationsChangeStageCreate) | **POST** /applications/{id}/change-stage | 
*ApplicationsApi* | [**applicationsCreate**](docs/ApplicationsApi.md#applicationsCreate) | **POST** /applications | 
*ApplicationsApi* | [**applicationsList**](docs/ApplicationsApi.md#applicationsList) | **GET** /applications | 
*ApplicationsApi* | [**applicationsMetaPostRetrieve**](docs/ApplicationsApi.md#applicationsMetaPostRetrieve) | **GET** /applications/meta/post | 
*ApplicationsApi* | [**applicationsRetrieve**](docs/ApplicationsApi.md#applicationsRetrieve) | **GET** /applications/{id} | 
*AttachmentsApi* | [**attachmentsCreate**](docs/AttachmentsApi.md#attachmentsCreate) | **POST** /attachments | 
*AttachmentsApi* | [**attachmentsList**](docs/AttachmentsApi.md#attachmentsList) | **GET** /attachments | 
*AttachmentsApi* | [**attachmentsMetaPostRetrieve**](docs/AttachmentsApi.md#attachmentsMetaPostRetrieve) | **GET** /attachments/meta/post | 
*AttachmentsApi* | [**attachmentsRetrieve**](docs/AttachmentsApi.md#attachmentsRetrieve) | **GET** /attachments/{id} | 
*AvailableActionsApi* | [**availableActionsRetrieve**](docs/AvailableActionsApi.md#availableActionsRetrieve) | **GET** /available-actions | 
*CandidatesApi* | [**candidatesCreate**](docs/CandidatesApi.md#candidatesCreate) | **POST** /candidates | 
*CandidatesApi* | [**candidatesIgnoreCreate**](docs/CandidatesApi.md#candidatesIgnoreCreate) | **POST** /candidates/ignore/{model_id} | 
*CandidatesApi* | [**candidatesList**](docs/CandidatesApi.md#candidatesList) | **GET** /candidates | 
*CandidatesApi* | [**candidatesMetaPostRetrieve**](docs/CandidatesApi.md#candidatesMetaPostRetrieve) | **GET** /candidates/meta/post | 
*CandidatesApi* | [**candidatesRetrieve**](docs/CandidatesApi.md#candidatesRetrieve) | **GET** /candidates/{id} | 
*CommonModelScopesApi* | [**commonModelScopesRetrieve**](docs/CommonModelScopesApi.md#commonModelScopesRetrieve) | **GET** /common-model-scopes | 
*CommonModelScopesApi* | [**commonModelScopesUpdate**](docs/CommonModelScopesApi.md#commonModelScopesUpdate) | **PUT** /common-model-scopes | 
*DeleteAccountApi* | [**deleteAccountCreate**](docs/DeleteAccountApi.md#deleteAccountCreate) | **POST** /delete-account | 
*DepartmentsApi* | [**departmentsList**](docs/DepartmentsApi.md#departmentsList) | **GET** /departments | 
*DepartmentsApi* | [**departmentsRetrieve**](docs/DepartmentsApi.md#departmentsRetrieve) | **GET** /departments/{id} | 
*EeocsApi* | [**eeocsList**](docs/EeocsApi.md#eeocsList) | **GET** /eeocs | 
*EeocsApi* | [**eeocsRetrieve**](docs/EeocsApi.md#eeocsRetrieve) | **GET** /eeocs/{id} | 
*ForceResyncApi* | [**syncStatusResyncCreate**](docs/ForceResyncApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 
*GenerateKeyApi* | [**generateKeyCreate**](docs/GenerateKeyApi.md#generateKeyCreate) | **POST** /generate-key | 
*InterviewsApi* | [**interviewsList**](docs/InterviewsApi.md#interviewsList) | **GET** /interviews | 
*InterviewsApi* | [**interviewsRetrieve**](docs/InterviewsApi.md#interviewsRetrieve) | **GET** /interviews/{id} | 
*IssuesApi* | [**issuesList**](docs/IssuesApi.md#issuesList) | **GET** /issues | 
*IssuesApi* | [**issuesRetrieve**](docs/IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 
*JobInterviewStagesApi* | [**jobInterviewStagesList**](docs/JobInterviewStagesApi.md#jobInterviewStagesList) | **GET** /job-interview-stages | 
*JobInterviewStagesApi* | [**jobInterviewStagesRetrieve**](docs/JobInterviewStagesApi.md#jobInterviewStagesRetrieve) | **GET** /job-interview-stages/{id} | 
*JobsApi* | [**jobsList**](docs/JobsApi.md#jobsList) | **GET** /jobs | 
*JobsApi* | [**jobsRetrieve**](docs/JobsApi.md#jobsRetrieve) | **GET** /jobs/{id} | 
*LinkTokenApi* | [**linkTokenCreate**](docs/LinkTokenApi.md#linkTokenCreate) | **POST** /link-token | 
*LinkedAccountsApi* | [**linkedAccountsList**](docs/LinkedAccountsApi.md#linkedAccountsList) | **GET** /linked-accounts | 
*OffersApi* | [**offersList**](docs/OffersApi.md#offersList) | **GET** /offers | 
*OffersApi* | [**offersRetrieve**](docs/OffersApi.md#offersRetrieve) | **GET** /offers/{id} | 
*OfficesApi* | [**officesList**](docs/OfficesApi.md#officesList) | **GET** /offices | 
*OfficesApi* | [**officesRetrieve**](docs/OfficesApi.md#officesRetrieve) | **GET** /offices/{id} | 
*PassthroughApi* | [**passthroughCreate**](docs/PassthroughApi.md#passthroughCreate) | **POST** /passthrough | 
*RegenerateKeyApi* | [**regenerateKeyCreate**](docs/RegenerateKeyApi.md#regenerateKeyCreate) | **POST** /regenerate-key | 
*RejectReasonsApi* | [**rejectReasonsList**](docs/RejectReasonsApi.md#rejectReasonsList) | **GET** /reject-reasons | 
*RejectReasonsApi* | [**rejectReasonsRetrieve**](docs/RejectReasonsApi.md#rejectReasonsRetrieve) | **GET** /reject-reasons/{id} | 
*ScorecardsApi* | [**scorecardsList**](docs/ScorecardsApi.md#scorecardsList) | **GET** /scorecards | 
*ScorecardsApi* | [**scorecardsRetrieve**](docs/ScorecardsApi.md#scorecardsRetrieve) | **GET** /scorecards/{id} | 
*SelectiveSyncApi* | [**selectiveSyncConfigurationsList**](docs/SelectiveSyncApi.md#selectiveSyncConfigurationsList) | **GET** /selective-sync/configurations | 
*SelectiveSyncApi* | [**selectiveSyncConfigurationsUpdate**](docs/SelectiveSyncApi.md#selectiveSyncConfigurationsUpdate) | **PUT** /selective-sync/configurations | 
*SelectiveSyncApi* | [**selectiveSyncMetaList**](docs/SelectiveSyncApi.md#selectiveSyncMetaList) | **GET** /selective-sync/meta | 
*SyncStatusApi* | [**syncStatusList**](docs/SyncStatusApi.md#syncStatusList) | **GET** /sync-status | 
*TagsApi* | [**tagsList**](docs/TagsApi.md#tagsList) | **GET** /tags | 
*UsersApi* | [**usersList**](docs/UsersApi.md#usersList) | **GET** /users | 
*UsersApi* | [**usersRetrieve**](docs/UsersApi.md#usersRetrieve) | **GET** /users/{id} | 
*WebhookReceiversApi* | [**webhookReceiversCreate**](docs/WebhookReceiversApi.md#webhookReceiversCreate) | **POST** /webhook-receivers | 
*WebhookReceiversApi* | [**webhookReceiversList**](docs/WebhookReceiversApi.md#webhookReceiversList) | **GET** /webhook-receivers | 


## Documentation for Models

 - [AccessRoleEnum](docs/AccessRoleEnum.md)
 - [AccountDetails](docs/AccountDetails.md)
 - [AccountDetailsAndActions](docs/AccountDetailsAndActions.md)
 - [AccountDetailsAndActionsIntegration](docs/AccountDetailsAndActionsIntegration.md)
 - [AccountDetailsAndActionsStatusEnum](docs/AccountDetailsAndActionsStatusEnum.md)
 - [AccountIntegration](docs/AccountIntegration.md)
 - [AccountToken](docs/AccountToken.md)
 - [Activity](docs/Activity.md)
 - [ActivityTypeEnum](docs/ActivityTypeEnum.md)
 - [Application](docs/Application.md)
 - [ApplicationEndpointRequest](docs/ApplicationEndpointRequest.md)
 - [ApplicationRequest](docs/ApplicationRequest.md)
 - [ApplicationResponse](docs/ApplicationResponse.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentEndpointRequest](docs/AttachmentEndpointRequest.md)
 - [AttachmentRequest](docs/AttachmentRequest.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AttachmentTypeEnum](docs/AttachmentTypeEnum.md)
 - [AvailableActions](docs/AvailableActions.md)
 - [Candidate](docs/Candidate.md)
 - [CandidateEndpointRequest](docs/CandidateEndpointRequest.md)
 - [CandidateRequest](docs/CandidateRequest.md)
 - [CandidateResponse](docs/CandidateResponse.md)
 - [CategoriesEnum](docs/CategoriesEnum.md)
 - [CategoryEnum](docs/CategoryEnum.md)
 - [CommonModelScopes](docs/CommonModelScopes.md)
 - [CommonModelScopesDisabledModels](docs/CommonModelScopesDisabledModels.md)
 - [CommonModelScopesDisabledModelsEnabledActionsEnum](docs/CommonModelScopesDisabledModelsEnabledActionsEnum.md)
 - [CommonModelScopesPutInnerDeserializerEnabledActionsEnum](docs/CommonModelScopesPutInnerDeserializerEnabledActionsEnum.md)
 - [CommonModelScopesPutInnerDeserializerRequest](docs/CommonModelScopesPutInnerDeserializerRequest.md)
 - [CommonModelScopesScope](docs/CommonModelScopesScope.md)
 - [CommonModelScopesUpdateSerializer](docs/CommonModelScopesUpdateSerializer.md)
 - [ConditionSchema](docs/ConditionSchema.md)
 - [ConditionTypeEnum](docs/ConditionTypeEnum.md)
 - [DataPassthroughRequest](docs/DataPassthroughRequest.md)
 - [DebugModeLog](docs/DebugModeLog.md)
 - [DebugModelLogSummary](docs/DebugModelLogSummary.md)
 - [Department](docs/Department.md)
 - [DisabilityStatusEnum](docs/DisabilityStatusEnum.md)
 - [EEOC](docs/EEOC.md)
 - [EmailAddress](docs/EmailAddress.md)
 - [EmailAddressRequest](docs/EmailAddressRequest.md)
 - [EmailAddressTypeEnum](docs/EmailAddressTypeEnum.md)
 - [EncodingEnum](docs/EncodingEnum.md)
 - [EndUserDetailsRequest](docs/EndUserDetailsRequest.md)
 - [ErrorValidationProblem](docs/ErrorValidationProblem.md)
 - [GenderEnum](docs/GenderEnum.md)
 - [GenerateRemoteKeyRequest](docs/GenerateRemoteKeyRequest.md)
 - [IgnoreCommonModel](docs/IgnoreCommonModel.md)
 - [IgnoreCommonModelRequest](docs/IgnoreCommonModelRequest.md)
 - [Issue](docs/Issue.md)
 - [IssueStatusEnum](docs/IssueStatusEnum.md)
 - [Job](docs/Job.md)
 - [JobInterviewStage](docs/JobInterviewStage.md)
 - [JobStatusEnum](docs/JobStatusEnum.md)
 - [LinkToken](docs/LinkToken.md)
 - [LinkedAccountCondition](docs/LinkedAccountCondition.md)
 - [LinkedAccountConditionRequest](docs/LinkedAccountConditionRequest.md)
 - [LinkedAccountSelectiveSyncConfiguration](docs/LinkedAccountSelectiveSyncConfiguration.md)
 - [LinkedAccountSelectiveSyncConfigurationListRequest](docs/LinkedAccountSelectiveSyncConfigurationListRequest.md)
 - [LinkedAccountSelectiveSyncConfigurationRequest](docs/LinkedAccountSelectiveSyncConfigurationRequest.md)
 - [LinkedAccountStatus](docs/LinkedAccountStatus.md)
 - [MetaResponse](docs/MetaResponse.md)
 - [MethodEnum](docs/MethodEnum.md)
 - [ModelOperation](docs/ModelOperation.md)
 - [MultipartFormFieldRequest](docs/MultipartFormFieldRequest.md)
 - [Offer](docs/Offer.md)
 - [OfferStatusEnum](docs/OfferStatusEnum.md)
 - [Office](docs/Office.md)
 - [OperatorSchema](docs/OperatorSchema.md)
 - [OverallRecommendationEnum](docs/OverallRecommendationEnum.md)
 - [PaginatedAccountDetailsAndActionsList](docs/PaginatedAccountDetailsAndActionsList.md)
 - [PaginatedActivityList](docs/PaginatedActivityList.md)
 - [PaginatedApplicationList](docs/PaginatedApplicationList.md)
 - [PaginatedAttachmentList](docs/PaginatedAttachmentList.md)
 - [PaginatedCandidateList](docs/PaginatedCandidateList.md)
 - [PaginatedConditionSchemaList](docs/PaginatedConditionSchemaList.md)
 - [PaginatedDepartmentList](docs/PaginatedDepartmentList.md)
 - [PaginatedEEOCList](docs/PaginatedEEOCList.md)
 - [PaginatedIssueList](docs/PaginatedIssueList.md)
 - [PaginatedJobInterviewStageList](docs/PaginatedJobInterviewStageList.md)
 - [PaginatedJobList](docs/PaginatedJobList.md)
 - [PaginatedOfferList](docs/PaginatedOfferList.md)
 - [PaginatedOfficeList](docs/PaginatedOfficeList.md)
 - [PaginatedRejectReasonList](docs/PaginatedRejectReasonList.md)
 - [PaginatedRemoteUserList](docs/PaginatedRemoteUserList.md)
 - [PaginatedScheduledInterviewList](docs/PaginatedScheduledInterviewList.md)
 - [PaginatedScorecardList](docs/PaginatedScorecardList.md)
 - [PaginatedSyncStatusList](docs/PaginatedSyncStatusList.md)
 - [PaginatedTagList](docs/PaginatedTagList.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PhoneNumberRequest](docs/PhoneNumberRequest.md)
 - [PhoneNumberTypeEnum](docs/PhoneNumberTypeEnum.md)
 - [RaceEnum](docs/RaceEnum.md)
 - [ReasonEnum](docs/ReasonEnum.md)
 - [RejectReason](docs/RejectReason.md)
 - [RemoteData](docs/RemoteData.md)
 - [RemoteKey](docs/RemoteKey.md)
 - [RemoteKeyForRegenerationRequest](docs/RemoteKeyForRegenerationRequest.md)
 - [RemoteResponse](docs/RemoteResponse.md)
 - [RemoteUser](docs/RemoteUser.md)
 - [RequestFormatEnum](docs/RequestFormatEnum.md)
 - [ResponseTypeEnum](docs/ResponseTypeEnum.md)
 - [ScheduledInterview](docs/ScheduledInterview.md)
 - [ScheduledInterviewStatusEnum](docs/ScheduledInterviewStatusEnum.md)
 - [Scorecard](docs/Scorecard.md)
 - [SelectiveSyncConfigurationsUsageEnum](docs/SelectiveSyncConfigurationsUsageEnum.md)
 - [SyncStatus](docs/SyncStatus.md)
 - [SyncStatusStatusEnum](docs/SyncStatusStatusEnum.md)
 - [Tag](docs/Tag.md)
 - [TypeEnum](docs/TypeEnum.md)
 - [UpdateApplicationStageRequest](docs/UpdateApplicationStageRequest.md)
 - [Url](docs/Url.md)
 - [UrlRequest](docs/UrlRequest.md)
 - [UrlTypeEnum](docs/UrlTypeEnum.md)
 - [ValidationProblemSource](docs/ValidationProblemSource.md)
 - [VeteranStatusEnum](docs/VeteranStatusEnum.md)
 - [VisibilityEnum](docs/VisibilityEnum.md)
 - [WarningValidationProblem](docs/WarningValidationProblem.md)
 - [WebhookReceiver](docs/WebhookReceiver.md)
 - [WebhookReceiverRequest](docs/WebhookReceiverRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### accountTokenAuth

- **Type**: API key
- **API key parameter name**: X-Account-Token
- **Location**: HTTP header

### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@merge.dev

