

# UsersUpdateUserByIdentifierResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | User ID |  |
|**identityId** | **Integer** | Internal use |  [optional] |
|**companyId** | **Integer** | Company ID |  |
|**firstName** | **String** | First Name |  |
|**lastName** | **String** | Last Name |  |
|**preferredFirstName** | **String** | Preferred first name |  [optional] |
|**preferredLastName** | **String** | Preferred last name |  [optional] |
|**pronouns** | **String** | Pronouns |  [optional] |
|**email** | **String** | Email Address |  |
|**mobileNumber** | **String** | Mobile Number |  |
|**homeNumber** | **String** | Home Number |  |
|**birthDate** | **LocalDate** | Birthdate. Format YYYY-MM-DD |  |
|**address** | **String** | Address |  |
|**postalZip** | **String** | Zip or postal code |  |
|**city** | **String** | City |  |
|**provState** | **String** | State or province |  |
|**inviteStatus** | [**InviteStatusEnum**](#InviteStatusEnum) | Invitation status to join 7shifts |  |
|**active** | **Boolean** | If true user is active in allowed to login. If false the user has been deactivated/deleted |  |
|**photo** | **String** | Photo url |  |
|**notes** | **String** | User notes |  |
|**hireDate** | **LocalDate** | Date hired. YYYY-MM-DD format |  |
|**timezone** | **String** | Timezone.  Valid zone info name |  |
|**type** | [**TypeEnum**](#TypeEnum) | User type |  |
|**employeeId** | **String** | Employee ID |  |
|**maxWeeklyHours** | **String** | Maximum weekly hours user is set to work |  |
|**punchId** | **String** | Value used during clock in/out in 7shifts applications |  |
|**created** | **String** |  |  [optional] |
|**modified** | **String** |  |  [optional] |
|**invited** | **String** | The date that the user has been sent an invitation to join 7shifts, null if not invited. |  |
|**inviteAccepted** | **String** | The date that the user accepted their 7shifts invitation, null if not accepted. |  |
|**isNew** | **Boolean** | If true user is new |  |
|**appearAsEmployee** | **Boolean** | If true user can be assigned shifts. This applies to managers, asst_manager and employers. |  [optional] |
|**subscribeToUpdates** | **Boolean** | If true this user is subscribed to updates from 7shifts. This includes announcing new features for 7shifts |  [optional] |
|**language** | **String** | Specified language. In ISO 639-1 format |  [optional] |
|**push** | **Boolean** | Are mobile push notifications enabled for the user |  [optional] |
|**skillLevel** | **Integer** | Current assigned skill level |  [optional] |
|**hourlyWage** | **Integer** | Users current hourly wage in cents |  [optional] |
|**wageType** | **String** | The type of wage the user will receive |  [optional] |
|**smsMeSchedules** | **Boolean** | If the user should receive sms notifications for shifts |  [optional] |
|**notifyOtRisk** | **Boolean** | Should notifications be sent if the user is at risk of overtime hours |  [optional] |
|**permissionsTemplateId** | **Integer** | The ID of the permission template currently assigned to the user. |  [optional] |
|**meta** | [**AuthenticationGetIdentityResponseDataUsersInnerMeta**](AuthenticationGetIdentityResponseDataUsersInnerMeta.md) |  |  [optional] |



## Enum: InviteStatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| PENDING | &quot;pending&quot; |
| REQUIRED | &quot;required&quot; |
| MISSING_CONTACT_INFO | &quot;missing_contact_info&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| ASST_MANAGER | &quot;asst_manager&quot; |
| MANAGER | &quot;manager&quot; |
| EMPLOYER | &quot;employer&quot; |



