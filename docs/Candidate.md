

# Candidate

# The Candidate Object ### Description The `Candidate` object is used to represent a Candidate for various positions.  ### Usage Example Fetch from the `LIST Candidates` endpoint and filter by `ID` to show all candidates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
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
**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional]
**emailAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional]
**urls** | [**List&lt;Url&gt;**](Url.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | Array of &#x60;Tag&#x60; names as strings. |  [optional]
**applications** | **List&lt;UUID&gt;** | Array of &#x60;Application&#x60; object IDs. |  [optional]
**attachments** | **List&lt;UUID&gt;** | Array of &#x60;Attachment&#x60; object IDs. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



