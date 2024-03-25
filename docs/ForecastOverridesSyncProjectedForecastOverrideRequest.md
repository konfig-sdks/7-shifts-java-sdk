

# ForecastOverridesSyncProjectedForecastOverrideRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **LocalDate** | The start date of the date range of override data to remove. Override data will be removed from only this date if no end date is provided. Format YYYY-MM-DD |  |
|**endDate** | **LocalDate** | The ending date of a date range of override data to remove. Optional. Format YYYY-MM-DD |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of override data to remove |  |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SALES | &quot;sales&quot; |



