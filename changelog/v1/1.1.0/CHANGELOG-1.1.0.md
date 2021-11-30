# merge-ats-client - CHANGELOG

API version: 1.1.0

Build date: 2021-11-29T21:03:29.505759-05:00[America/New_York]

1. Changed Enum fields to Strings:
    - AccessRoleEnum
   - ActivityTypeEnum
   - AttachmentTypeEnum
   - DisabilityStatusEnum
   - EmailAddressTypeEnum
   - GenderEnum
   - IssueStatusEnum
   - JobStatusEnum
   - OfferStatusEnum
   - OverallRecommendationEnum
   - PhoneNumberTypeEnum
   - RaceEnum
   - ScheduledInterviewStatusEnum
   - UrlTypeEnum
   - VeteranStatusEnum
   - VisibilityEnum

2. Added type filters
    - Jobs.code
    
3. Removed type filters
    - Candidate.email_address

3. Fixed Cursor Type from Integer to String on several models:
    - IssuesApi
    - SyncStatusApi
    - LinkedAccountsApi
