

# UsersUpdateUserByIdentifierRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The user&#39;s first name |  [optional] |
|**lastName** | **String** | The user&#39;s last name |  [optional] |
|**preferredFirstName** | **String** | An optional alternate first name |  [optional] |
|**preferredLastName** | **String** | An optional alternate last name |  [optional] |
|**email** | **String** | the user&#39;s email |  [optional] |
|**mobileNumber** | **String** | The user&#39;s mobile phone number. Format with no spaces and include area code |  [optional] |
|**homeNumber** | **String** | The user&#39;s home phone number. Format with no spaces and include area code |  [optional] |
|**address** | **String** | The user&#39;s address |  [optional] |
|**postalZip** | **String** | The user&#39;s postal code or zip code |  [optional] |
|**city** | **String** | The user&#39;s city |  [optional] |
|**provState** | **String** | The user&#39;s province or state |  [optional] |
|**notes** | **String** | Notes associated with this user |  [optional] |
|**hireDate** | **LocalDate** | The hire date of this user. Format YYYY-MM-DD |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of this user |  [optional] |
|**employeeId** | **String** | Either an employee ID or an ID assigned by your payroll provider that is used in your payroll export |  [optional] |
|**punchId** | **String** | The punch ID they punch in/out with. If no value is provided a new one will be created |  [optional] |
|**birthDate** | **LocalDate** | The user&#39;s birthdate. Format YYYY-MM-DD |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | The user&#39;s preferred language. Default value is en |  [optional] |
|**appearAsEmployee** | **Boolean** | User should appear in the system as an employee. Applies to admin users only |  [optional] |
|**subscribeToUpdates** | **Boolean** | Subscribe this user to updates from 7shifts. This includes announcing new features for 7shifts |  [optional] |
|**maxWeeklyHours** | **Integer** | The maximum weekly hours this user is set to work |  [optional] |
|**active** | **Boolean** | User status. If false the user is unable to login |  [optional] |
|**pronouns** | **String** | The user&#39;s pronouns |  [optional] |
|**permissionsTemplateId** | **Integer** | Permission Template ID the user is assigned to |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| ASST_MANAGER | &quot;asst_manager&quot; |
| MANAGER | &quot;manager&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| EN | &quot;en&quot; |
| ES | &quot;es&quot; |
| FR | &quot;fr&quot; |



