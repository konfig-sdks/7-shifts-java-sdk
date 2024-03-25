

# ScheduleEnforcementListScheduledShiftsResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**locationId** | **Integer** |  |  |
|**userId** | **Integer** |  |  [optional] |
|**departmentId** | **Integer** |  |  [optional] |
|**roleId** | **Integer** |  |  [optional] |
|**stationId** | **Integer** |  |  [optional] |
|**stationName** | **String** |  |  |
|**start** | **OffsetDateTime** |  |  |
|**end** | **OffsetDateTime** |  |  |
|**close** | **Boolean** |  |  |
|**businessDecline** | **Boolean** |  |  |
|**notes** | **String** |  |  |
|**publishStatus** | [**PublishStatusEnum**](#PublishStatusEnum) |  |  |
|**open** | **Boolean** |  |  |
|**attendanceStatus** | [**AttendanceStatusEnum**](#AttendanceStatusEnum) |  |  |
|**companyId** | **Integer** |  |  [optional] |



## Enum: PublishStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| PUBLISHED | &quot;published&quot; |
| DRAFT_DELETED | &quot;draft_deleted&quot; |
| PUBLISHED_DELETED | &quot;published_deleted&quot; |



## Enum: AttendanceStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| SICK | &quot;sick&quot; |
| NO_SHOW | &quot;no_show&quot; |
| LATE | &quot;late&quot; |



