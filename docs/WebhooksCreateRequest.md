

# WebhooksCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | Webhook URL |  |
|**method** | [**MethodEnum**](#MethodEnum) | Webhook Method |  |
|**event** | [**EventEnum**](#EventEnum) | Event |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;post&quot; |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| SCHEDULE_PUBLISHED | &quot;schedule.published&quot; |
| TIME_PUNCH_CREATED | &quot;time_punch.created&quot; |
| TIME_PUNCH_EDITED | &quot;time_punch.edited&quot; |
| TIME_PUNCH_DELETED | &quot;time_punch.deleted&quot; |
| PAYROLL_PERIOD_CLOSED | &quot;payroll_period.closed&quot; |
| USER_CREATED | &quot;user.created&quot; |
| USER_MODIFIED | &quot;user.modified&quot; |
| USER_REACTIVATED | &quot;user.reactivated&quot; |
| USER_DEACTIVATED | &quot;user.deactivated&quot; |
| DEPARTMENT_CREATED | &quot;department.created&quot; |
| DEPARTMENT_MODIFIED | &quot;department.modified&quot; |
| DEPARTMENT_DELETED | &quot;department.deleted&quot; |
| LOCATION_CREATED | &quot;location.created&quot; |
| LOCATION_MODIFIED | &quot;location.modified&quot; |
| LOCATION_DELETED | &quot;location.deleted&quot; |
| ROLE_CREATED | &quot;role.created&quot; |
| ROLE_MODIFIED | &quot;role.modified&quot; |
| ROLE_DELETED | &quot;role.deleted&quot; |



