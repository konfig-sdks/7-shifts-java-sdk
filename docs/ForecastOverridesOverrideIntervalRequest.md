

# ForecastOverridesOverrideIntervalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**departmentId** | **Integer** | Department ID |  [optional] |
|**start** | **OffsetDateTime** | Starting date/time (UTC) of the interval for which you wish to update the sales projection. |  |
|**end** | **OffsetDateTime** | Ending date/time (UTC) of the interval for which you wish to update the sales projection. |  |
|**value** | **Long** | Override value. Currency value in cents. Only whole dollars are accepted. |  |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of value to override. Default is sales |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SALES | &quot;sales&quot; |



