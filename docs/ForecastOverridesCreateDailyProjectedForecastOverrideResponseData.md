

# ForecastOverridesCreateDailyProjectedForecastOverrideResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationId** | **Integer** | Location ID |  |
|**departmentId** | **Integer** | Department ID |  [optional] |
|**date** | **LocalDate** | The date of the override data. Format YYYY-MM-DD |  |
|**value** | **Long** | Override value. Currency values are in cents |  |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of override |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| SALES | &quot;sales&quot; |



