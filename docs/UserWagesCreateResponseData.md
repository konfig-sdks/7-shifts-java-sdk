

# UserWagesCreateResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Wage ID |  |
|**effectiveDate** | **String** | The wage effective date. Format YYYY-MM-DD |  |
|**roleId** | **Integer** | Role ID |  |
|**wageType** | [**WageTypeEnum**](#WageTypeEnum) | The wage type |  |
|**wageCents** | **Integer** | The wage value. In cents |  |
|**created** | **OffsetDateTime** | The created date and time of the wage. Formatted as ISO8601 datetime in UTC timezone. |  |
|**modified** | **OffsetDateTime** | The modified date and time of the wage. Formatted as ISO8601 datetime in UTC timezone. |  |



## Enum: WageTypeEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;hourly&quot; |
| WEEKLY_SALARY | &quot;weekly_salary&quot; |



