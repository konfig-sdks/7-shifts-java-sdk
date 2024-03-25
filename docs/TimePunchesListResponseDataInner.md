

# TimePunchesListResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Time punch ID |  |
|**shiftId** | **Integer** | Shift ID. Can be unassigned |  |
|**userId** | **Integer** | The 7shifts ID of the user who is clocking in. |  |
|**editablePunch** | **Boolean** | If true the time punch can be edited by a manager. Set to false via POS integrations |  |
|**roleId** | **Integer** | Role ID |  |
|**companyId** | **Integer** | Company ID |  |
|**locationId** | **Integer** | Location ID |  |
|**departmentId** | **Integer** | Department ID. Defaults to 0 if not defined. |  [optional] |
|**hourlyWage** | **Integer** | Calculated hourly wage. Use the users_wages endpoint value for accuracy |  |
|**approved** | **Boolean** | If true the time punch is approved |  |
|**clockedIn** | **OffsetDateTime** | The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone. |  |
|**clockedOut** | **OffsetDateTime** | The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone. |  |
|**notes** | **String** | Additional notes for a shift |  |
|**autoClockedOut** | **Boolean** | If true the time punch was auto clocked out |  |
|**clockedInOffline** | **Boolean** | If true the time punch was clocked in offline |  |
|**clockedOutOffline** | **Boolean** | If true the time punch was clocked out offline |  |
|**tips** | **Integer** | Tips declared for the shift in cents |  |
|**posType** | **String** | The source of the time punch. 7shift apps will be web |  [optional] |
|**breaks** | [**List&lt;TimePunchesListResponseDataInnerBreaksInner&gt;**](TimePunchesListResponseDataInnerBreaksInner.md) |  |  [optional] |
|**created** | **OffsetDateTime** | The date and time when created. Formatted as ISO8601 datetime in UTC timezone. |  |
|**modified** | **OffsetDateTime** | The date and time when last modified. Formatted as ISO8601 datetime in UTC timezone. |  |
|**deleted** | **Boolean** | If true the time punch is deleted |  [optional] |



