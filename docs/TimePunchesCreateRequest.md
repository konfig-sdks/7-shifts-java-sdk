

# TimePunchesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationId** | **Integer** | Location ID. |  |
|**departmentId** | **Integer** | Department ID. Defaults to 0 if not defined. |  [optional] |
|**userId** | **Integer** | The 7shifts ID of the user who is clocking in. |  |
|**roleId** | **Integer** | The ID of the role that the user is clocking in to work for. Defaults to 0 if not defined. |  [optional] |
|**clockedIn** | **OffsetDateTime** | The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone. |  |
|**clockedOut** | **OffsetDateTime** | The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone. |  [optional] |
|**notes** | **String** | Additional notes for a shift. |  [optional] |
|**tips** | **Integer** | Tips declared for the shift in cents |  [optional] |
|**breaks** | [**List&lt;TimePunchesCreateRequestBreaksInner&gt;**](TimePunchesCreateRequestBreaksInner.md) |  |  [optional] |



