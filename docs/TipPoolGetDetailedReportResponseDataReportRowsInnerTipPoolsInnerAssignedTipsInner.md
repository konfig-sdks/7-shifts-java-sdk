

# TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerAssignedTipsInner

Tips assigned to employees

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | Employee ID |  |
|**userId** | **Integer** | User ID |  |
|**firstName** | **String** | Employee first name |  |
|**lastName** | **String** | Employee last name |  |
|**roleName** | **String** | Role name |  [optional] |
|**departmentName** | **String** | Department name |  [optional] |
|**timePunchId** | **Integer** | Time punch ID |  [optional] |
|**clockedIn** | **OffsetDateTime** | Start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone. |  [optional] |
|**clockedOut** | **OffsetDateTime** | End date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone. |  [optional] |
|**approved** | **Boolean** | If true the time punch is approved |  [optional] |
|**netSales** | **Integer** | The net sales (in cents) |  [optional] |
|**ccTips** | **Integer** | Tips from credit card (in cents) |  [optional] |
|**ccTipsWithheld** | **Integer** | Tips from credit card withheld (in cents) |  [optional] |
|**autoGratTips** | **Integer** | Auto gratuity tips (in cents) |  [optional] |
|**cashTips** | **Integer** | Tips in cash (in cents) |  [optional] |
|**declaredTips** | **Integer** | Declared tips (in cents) |  [optional] |



