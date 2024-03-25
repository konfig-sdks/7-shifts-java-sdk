

# UserWagesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveDate** | **String** | The wage effective date. Format YYYY-MM-DD |  |
|**roleId** | **Integer** | Role ID |  [optional] |
|**wageType** | [**WageTypeEnum**](#WageTypeEnum) | The wage type |  |
|**wageCents** | **Integer** | The wage value. In cents |  |



## Enum: WageTypeEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;hourly&quot; |
| WEEKLY_SALARY | &quot;weekly_salary&quot; |



