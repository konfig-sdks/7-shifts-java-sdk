

# TimePunchesUpdateByIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**departmentId** | **Integer** | Department ID |  [optional] |
|**roleId** | **Integer** | The ID of the role that the user is clocking in to work for. |  [optional] |
|**clockedIn** | **OffsetDateTime** | The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone. |  [optional] |
|**clockedOut** | **OffsetDateTime** | The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone. |  [optional] |
|**notes** | **String** | Additional notes for a shift. |  [optional] |
|**tips** | **Integer** | Tips declared for the shift in cents |  [optional] |
|**breaks** | [**List&lt;TimePunchesUpdateByIdRequestBreaksInner&gt;**](TimePunchesUpdateByIdRequestBreaksInner.md) | List of breaks during a shift. Breaks must always be included in a correct state in update requests. The absence of an existing break in the payload implies that it should be deleted. |  [optional] |



