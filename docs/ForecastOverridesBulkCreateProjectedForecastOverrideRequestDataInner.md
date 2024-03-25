

# ForecastOverridesBulkCreateProjectedForecastOverrideRequestDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**departmentId** | **Integer** | Department ID. Optional |  [optional] |
|**date** | **LocalDate** | The date of the daily report data to override. Format YYYY-MM-DD |  |
|**value** | **Long** | Override value. Currency values in cents |  |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of value to override. Default is sales |  |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SALES | &quot;sales&quot; |



