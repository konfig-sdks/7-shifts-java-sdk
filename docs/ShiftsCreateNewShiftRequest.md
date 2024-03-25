

# ShiftsCreateNewShiftRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationId** | **Integer** | Shift ID |  |
|**userId** | **Integer** | User ID |  [optional] |
|**departmentId** | **Integer** | Department ID. Required if the location uses departments. |  [optional] |
|**roleId** | **Integer** | Role ID. Required if the location uses roles. |  [optional] |
|**stationId** | **Integer** | Station ID |  [optional] |
|**start** | **OffsetDateTime** | Start date time of the shift. UTC in ISO8601 format. |  |
|**end** | **OffsetDateTime** | End date time of the shift. UTC in ISO8601 format. |  |
|**close** | **Boolean** | Set to true if the shift ends at closing time. If set, end is not used. |  [optional] |
|**businessDecline** | **Boolean** | Set to true if the shift ends at business decline. |  [optional] |
|**notes** | **String** | Notes displayed on a shift. |  [optional] |
|**draft** | **Boolean** | If true the shift is not published. |  [optional] |
|**notified** | **Boolean** | If true the user has been notified of the published shift. |  [optional] |
|**open** | **Boolean** | Set to true if the shift is not assigned to any user. Open shifts can be requested by users. |  [optional] |
|**openOfferType** | **Integer** | Set when open is true. Set to 1 for everyone can request an open shift; set to 1 if only offered to specified role. |  [optional] |
|**unassigned** | **Boolean** | Internal use only |  [optional] |
|**unassignedSkillLevel** | [**UnassignedSkillLevelEnum**](#UnassignedSkillLevelEnum) | The skill level required for this shift. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Shift status type. 0 - none, 1 - sick, 2 - no show, 3 - late, 4 - call out, 5 - left late. |  [optional] |
|**lateMinutes** | **Integer** | Number of minutes a user can clock in late after the shift starts. |  [optional] |
|**breaks** | [**List&lt;ShiftsCreateNewShiftRequestBreaksInner&gt;**](ShiftsCreateNewShiftRequestBreaksInner.md) | Breaks to be created with the shift |  [optional] |



## Enum: UnassignedSkillLevelEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |



