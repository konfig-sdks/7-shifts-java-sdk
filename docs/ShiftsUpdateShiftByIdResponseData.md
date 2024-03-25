

# ShiftsUpdateShiftByIdResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Shift ID |  |
|**userId** | **Integer** | User ID |  |
|**start** | **OffsetDateTime** | Start date time of the shift. UTC in ISO8601 format |  |
|**end** | **OffsetDateTime** | End date time of the shift. UTC in ISO8601 format |  |
|**close** | **Boolean** | If true the shift ends at closing time. If set end is not used. |  |
|**businessDecline** | **Boolean** | If true the shift ends at business decline. |  |
|**hourlyWage** | **Double** | Read Only. The hourly wage for this shift. In cents. |  [optional] [readonly] |
|**departmentId** | **Integer** | Department ID. Required if the location uses departments. |  |
|**locationId** | **Integer** | The ID of the location that the shift is assigned to. |  |
|**roleId** | **Integer** | Role ID. Required if the location uses roles. |  |
|**notes** | **String** | Notes displayed on a shift |  |
|**draft** | **Boolean** | Whether or not the shift is a draft shift. Draft shifts are shifts that have not yet been published. |  |
|**notified** | **Boolean** | Whether or not the individual assigned to the shift has been notified of the shifts existence. |  |
|**open** | **Boolean** | If true the shift is not assigned to any user. Open shifts can be requested by users. |  |
|**unassigned** | **Boolean** | Shifts in a template that could not be assigned to any eligible employees. |  |
|**unassignedSkillLevel** | **Integer** | Specify the minimum user skill level required for the shift. Levels 1 - beginner, 2 - intermediate, 3 - Experienced. |  |
|**openOfferType** | [**OpenOfferTypeEnum**](#OpenOfferTypeEnum) | Specifies the scope of who can pick up the shift. |  |
|**attendanceStatus** | [**AttendanceStatusEnum**](#AttendanceStatusEnum) | Specified shift flags to track employee attendance |  |
|**publishStatus** | [**PublishStatusEnum**](#PublishStatusEnum) | Current publication status of the shift |  |
|**lateMinuets** | **Integer** | Specify the grace minutes they can clock-in late. |  [optional] |
|**created** | **OffsetDateTime** | The created date of the shift in UTC |  |
|**modified** | **OffsetDateTime** | The last modified date of the shift in UTC |  |
|**deleted** | **Boolean** | Whether or not this shift is deleted. |  |
|**softDeleted** | **String** | Whether or not this shift is soft-deleted. |  |
|**station** | **Integer** | Station Number |  |
|**stationName** | **String** | Station name |  |
|**stationId** | **Integer** | Station id |  |
|**breaks** | [**List&lt;ShiftsListResponseDataInnerBreaksInner&gt;**](ShiftsListResponseDataInnerBreaksInner.md) | Breaks on the shift |  [optional] |



## Enum: OpenOfferTypeEnum

| Name | Value |
|---- | -----|
| ALL_LOCATION_MEMBERS | &quot;all_location_members&quot; |
| ALL_ROLE_MEMBERS | &quot;all_role_members&quot; |
| SET_OF_LOCATION_MEMBERS | &quot;set_of_location_members&quot; |
| ALL_COMPANY_EMPLOYEES | &quot;all_company_employees&quot; |



## Enum: AttendanceStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| SICK | &quot;sick&quot; |
| NO_SHOW | &quot;no_show&quot; |
| LATE | &quot;late&quot; |



## Enum: PublishStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| PUBLISHED | &quot;published&quot; |
| DRAFT_DELETED | &quot;draft_deleted&quot; |
| PUBLISHED_DELETED | &quot;published_deleted&quot; |



