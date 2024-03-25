

# ShiftsUpdateShiftByIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationId** | **Integer** | Location ID |  [optional] |
|**userId** | **Integer** | User ID |  [optional] |
|**departmentId** | **Integer** | Department ID. Required if the location uses departments |  [optional] |
|**roleId** | **Integer** | Role ID. Required if the location uses roles |  [optional] |
|**stationId** | **Integer** | The station assigned to the shift |  [optional] |
|**start** | **OffsetDateTime** | Start date time of the shift. UTC in ISO8601 format |  [optional] |
|**end** | **OffsetDateTime** | End date time of the shift. UTC in ISO8601 format |  [optional] |
|**close** | **Boolean** | Set to true if the shift ends at closing time. If set end is not used. |  [optional] |
|**businessDecline** | **Boolean** | Set to true if the shift ends at business decline. |  [optional] |
|**notes** | **String** | Notes displayed on a shift |  [optional] |
|**draft** | **Boolean** | If true the shift is not published. |  [optional] |
|**open** | **Boolean** | Set to true if the shift is not assigned to any user. Open shifts can be requested by users. |  [optional] |
|**openOfferType** | [**OpenOfferTypeEnum**](#OpenOfferTypeEnum) | Set when open is true. Set to 0 when everyone at a location can request an open shift; set to 1 if only offered to specified role. |  [optional] |
|**unassigned** | **Boolean** | When true the shift is unassigned. Internal use only. |  [optional] |
|**unassignedSkillLevel** | [**UnassignedSkillLevelEnum**](#UnassignedSkillLevelEnum) | The skill level required for this shift.  * 1: Beginner  * 2: Intermediate  * 3: Experienced  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Shift status type.  * 0: None  * 1: Sick  * 2: No Show  * 3: Late  * 4: Call Out  * 5: Left Late  |  [optional] |
|**lateMinutes** | **Integer** | Number of minutes a user can clock in late after the shift starts. |  [optional] |
|**breaks** | [**List&lt;ShiftsUpdateShiftByIdRequestBreaksInner&gt;**](ShiftsUpdateShiftByIdRequestBreaksInner.md) | Breaks to be updated with the shift |  [optional] |



## Enum: OpenOfferTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



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



