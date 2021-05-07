

# CandidateRequest

# The Candidate Object ### Description The `Candidate` object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the `LIST Candidates` endpoint and filter by `ID` to show all candidates.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**firstName** | **String** | The candidate&#39;s first name. |  [optional]
**lastName** | **String** | The candidate&#39;s last name. |  [optional]
**company** | **String** | The candidate&#39;s current company. |  [optional]
**title** | **String** | The candidate&#39;s current title. |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the third party&#39;s candidate was created. |  [optional]
**remoteUpdatedAt** | **OffsetDateTime** | When the third party&#39;s candidate was updated. |  [optional]
**lastInteractionAt** | **OffsetDateTime** | When the most recent candidate interaction occurred. |  [optional]
**isPrivate** | **Boolean** | Whether or not the candidate is private. |  [optional]
**canEmail** | **Boolean** | Whether or not the candidate can be emailed. |  [optional]
**locations** | **List&lt;String&gt;** | The candidate&#39;s locations. |  [optional]
**phoneNumbers** | [**List&lt;PhoneNumberRequest&gt;**](PhoneNumberRequest.md) |  |  [optional]
**emailAddresses** | [**List&lt;EmailAddressRequest&gt;**](EmailAddressRequest.md) |  |  [optional]
**urls** | [**List&lt;UrlRequest&gt;**](UrlRequest.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**applications** | **List&lt;UUID&gt;** |  |  [optional]
**attachments** | **List&lt;UUID&gt;** |  |  [optional]



