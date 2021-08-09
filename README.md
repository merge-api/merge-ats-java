# merge-ats-client

Merge ATS API
- API version: 1.0
  - Build date: 2021-05-07T19:39:42.511025-07:00[America/Los_Angeles]

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
  <groupId>merge</groupId>
  <artifactId>merge-ats-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "merge:merge-ats-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/merge-ats-client-1.0.0.jar`
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
import merge_ats_client.api.AccountTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/ats/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AccountTokenApi apiInstance = new AccountTokenApi(defaultClient);
    String publicToken = "publicToken_example"; // String | 
    try {
      AccountToken result = apiInstance.accountTokenRetrieve(publicToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountTokenApi#accountTokenRetrieve");
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
*AccountTokenApi* | [**accountTokenRetrieve**](docs/AccountTokenApi.md#accountTokenRetrieve) | **GET** /account-token/{public_token} | 
*ActivitiesApi* | [**activitiesList**](docs/ActivitiesApi.md#activitiesList) | **GET** /activities | 
*ActivitiesApi* | [**activitiesRetrieve**](docs/ActivitiesApi.md#activitiesRetrieve) | **GET** /activities/{id} | 
*ApplicationsApi* | [**applicationsCreate**](docs/ApplicationsApi.md#applicationsCreate) | **POST** /applications | 
*ApplicationsApi* | [**applicationsList**](docs/ApplicationsApi.md#applicationsList) | **GET** /applications | 
*ApplicationsApi* | [**applicationsRetrieve**](docs/ApplicationsApi.md#applicationsRetrieve) | **GET** /applications/{id} | 
*AttachmentsApi* | [**attachmentsCreate**](docs/AttachmentsApi.md#attachmentsCreate) | **POST** /attachments | 
*AttachmentsApi* | [**attachmentsList**](docs/AttachmentsApi.md#attachmentsList) | **GET** /attachments | 
*AttachmentsApi* | [**attachmentsRetrieve**](docs/AttachmentsApi.md#attachmentsRetrieve) | **GET** /attachments/{id} | 
*AvailableActionsApi* | [**availableActionsRetrieve**](docs/AvailableActionsApi.md#availableActionsRetrieve) | **GET** /available-actions | 
*CandidatesApi* | [**candidatesCreate**](docs/CandidatesApi.md#candidatesCreate) | **POST** /candidates | 
*CandidatesApi* | [**candidatesList**](docs/CandidatesApi.md#candidatesList) | **GET** /candidates | 
*CandidatesApi* | [**candidatesRetrieve**](docs/CandidatesApi.md#candidatesRetrieve) | **GET** /candidates/{id} | 
*DeleteAccountApi* | [**deleteAccountCreate**](docs/DeleteAccountApi.md#deleteAccountCreate) | **POST** /delete-account | 
*DepartmentsApi* | [**departmentsList**](docs/DepartmentsApi.md#departmentsList) | **GET** /departments | 
*DepartmentsApi* | [**departmentsRetrieve**](docs/DepartmentsApi.md#departmentsRetrieve) | **GET** /departments/{id} | 
*EeocsApi* | [**eeocsList**](docs/EeocsApi.md#eeocsList) | **GET** /eeocs | 
*EeocsApi* | [**eeocsRetrieve**](docs/EeocsApi.md#eeocsRetrieve) | **GET** /eeocs/{id} | 
*GenerateKeyApi* | [**generateKeyCreate**](docs/GenerateKeyApi.md#generateKeyCreate) | **POST** /generate-key | 
*InterviewsApi* | [**interviewsCreate**](docs/InterviewsApi.md#interviewsCreate) | **POST** /interviews | 
*InterviewsApi* | [**interviewsList**](docs/InterviewsApi.md#interviewsList) | **GET** /interviews | 
*InterviewsApi* | [**interviewsRetrieve**](docs/InterviewsApi.md#interviewsRetrieve) | **GET** /interviews/{id} | 
*IssuesApi* | [**issuesList**](docs/IssuesApi.md#issuesList) | **GET** /issues | 
*IssuesApi* | [**issuesRetrieve**](docs/IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 
*JobInterviewStagesApi* | [**jobInterviewStagesList**](docs/JobInterviewStagesApi.md#jobInterviewStagesList) | **GET** /job-interview-stages | 
*JobInterviewStagesApi* | [**jobInterviewStagesRetrieve**](docs/JobInterviewStagesApi.md#jobInterviewStagesRetrieve) | **GET** /job-interview-stages/{id} | 
*JobsApi* | [**jobsList**](docs/JobsApi.md#jobsList) | **GET** /jobs | 
*JobsApi* | [**jobsRetrieve**](docs/JobsApi.md#jobsRetrieve) | **GET** /jobs/{id} | 
*LinkTokenApi* | [**linkTokenCreate**](docs/LinkTokenApi.md#linkTokenCreate) | **POST** /link-token | 
*OffersApi* | [**offersList**](docs/OffersApi.md#offersList) | **GET** /offers | 
*OffersApi* | [**offersRetrieve**](docs/OffersApi.md#offersRetrieve) | **GET** /offers/{id} | 
*OfficesApi* | [**officesList**](docs/OfficesApi.md#officesList) | **GET** /offices | 
*OfficesApi* | [**officesRetrieve**](docs/OfficesApi.md#officesRetrieve) | **GET** /offices/{id} | 
*PassthroughApi* | [**passthroughCreate**](docs/PassthroughApi.md#passthroughCreate) | **POST** /passthrough | 
*RegenerateKeyApi* | [**regenerateKeyCreate**](docs/RegenerateKeyApi.md#regenerateKeyCreate) | **POST** /regenerate-key | 
*RejectReasonsApi* | [**rejectReasonsList**](docs/RejectReasonsApi.md#rejectReasonsList) | **GET** /reject-reasons | 
*RejectReasonsApi* | [**rejectReasonsRetrieve**](docs/RejectReasonsApi.md#rejectReasonsRetrieve) | **GET** /reject-reasons/{id} | 
*ScorecardsApi* | [**scorecardsCreate**](docs/ScorecardsApi.md#scorecardsCreate) | **POST** /scorecards | 
*ScorecardsApi* | [**scorecardsList**](docs/ScorecardsApi.md#scorecardsList) | **GET** /scorecards | 
*ScorecardsApi* | [**scorecardsRetrieve**](docs/ScorecardsApi.md#scorecardsRetrieve) | **GET** /scorecards/{id} | 
*SyncStatusApi* | [**syncStatusList**](docs/SyncStatusApi.md#syncStatusList) | **GET** /sync-status | 
*SyncStatusApi* | [**syncStatusResyncCreate**](docs/SyncStatusApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 
*TagsApi* | [**tagsList**](docs/TagsApi.md#tagsList) | **GET** /tags | 
*UsersApi* | [**usersCreate**](docs/UsersApi.md#usersCreate) | **POST** /users | 
*UsersApi* | [**usersList**](docs/UsersApi.md#usersList) | **GET** /users | 
*UsersApi* | [**usersRetrieve**](docs/UsersApi.md#usersRetrieve) | **GET** /users/{id} | 


## Documentation for Models

 - [AccessRoleEnum](docs/AccessRoleEnum.md)
 - [AccountIntegration](docs/AccountIntegration.md)
 - [AccountToken](docs/AccountToken.md)
 - [Activity](docs/Activity.md)
 - [ActivityTypeEnum](docs/ActivityTypeEnum.md)
 - [Application](docs/Application.md)
 - [ApplicationRequest](docs/ApplicationRequest.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentRequest](docs/AttachmentRequest.md)
 - [AttachmentTypeEnum](docs/AttachmentTypeEnum.md)
 - [AvailableActions](docs/AvailableActions.md)
 - [Candidate](docs/Candidate.md)
 - [CandidateRequest](docs/CandidateRequest.md)
 - [DataPassthroughRequest](docs/DataPassthroughRequest.md)
 - [Department](docs/Department.md)
 - [DisabilityStatusEnum](docs/DisabilityStatusEnum.md)
 - [EEOC](docs/EEOC.md)
 - [EmailAddress](docs/EmailAddress.md)
 - [EmailAddressRequest](docs/EmailAddressRequest.md)
 - [EmailAddressTypeEnum](docs/EmailAddressTypeEnum.md)
 - [EndUserDetailsRequest](docs/EndUserDetailsRequest.md)
 - [GenderEnum](docs/GenderEnum.md)
 - [GenerateRemoteKeyRequest](docs/GenerateRemoteKeyRequest.md)
 - [Job](docs/Job.md)
 - [Issue](docs/Issue.md)
 - [IssueStatusEnum](docs/IssueStatusEnum.md)
 - [JobInterviewStage](docs/JobInterviewStage.md)
 - [JobStatusEnum](docs/JobStatusEnum.md)
 - [LinkToken](docs/LinkToken.md)
 - [MethodEnum](docs/MethodEnum.md)
 - [ModelOperation](docs/ModelOperation.md)
 - [Offer](docs/Offer.md)
 - [OfferStatusEnum](docs/OfferStatusEnum.md)
 - [Office](docs/Office.md)
 - [OverallRecommendationEnum](docs/OverallRecommendationEnum.md)
 - [PaginatedActivityList](docs/PaginatedActivityList.md)
 - [PaginatedApplicationList](docs/PaginatedApplicationList.md)
 - [PaginatedAttachmentList](docs/PaginatedAttachmentList.md)
 - [PaginatedCandidateList](docs/PaginatedCandidateList.md)
 - [PaginatedDepartmentList](docs/PaginatedDepartmentList.md)
 - [PaginatedEEOCList](docs/PaginatedEEOCList.md)
 - [PaginatedIssueList](docs/PaginatedIssueList.md)
 - [PaginatedJobInterviewStageList](docs/PaginatedJobInterviewStageList.md)
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
 - [RejectReason](docs/RejectReason.md)
 - [RemoteData](docs/RemoteData.md)
 - [RemoteDataRequest](docs/RemoteDataRequest.md)
 - [RemoteKey](docs/RemoteKey.md)
 - [RemoteKeyForRegenerationRequest](docs/RemoteKeyForRegenerationRequest.md)
 - [RemoteResponse](docs/RemoteResponse.md)
 - [RemoteUser](docs/RemoteUser.md)
 - [RemoteUserRequest](docs/RemoteUserRequest.md)
 - [ScheduledInterview](docs/ScheduledInterview.md)
 - [ScheduledInterviewRequest](docs/ScheduledInterviewRequest.md)
 - [ScheduledInterviewStatusEnum](docs/ScheduledInterviewStatusEnum.md)
 - [Scorecard](docs/Scorecard.md)
 - [ScorecardRequest](docs/ScorecardRequest.md)
 - [SyncStatus](docs/SyncStatus.md)
 - [SyncStatusStatusEnum](docs/SyncStatusStatusEnum.md)
 - [Tag](docs/Tag.md)
 - [Url](docs/Url.md)
 - [UrlRequest](docs/UrlRequest.md)
 - [UrlTypeEnum](docs/UrlTypeEnum.md)
 - [VeteranStatusEnum](docs/VeteranStatusEnum.md)
 - [VisibilityEnum](docs/VisibilityEnum.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### tokenAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@merge.dev

