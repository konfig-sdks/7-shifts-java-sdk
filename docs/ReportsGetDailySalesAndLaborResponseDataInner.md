

# ReportsGetDailySalesAndLaborResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **String** | The date of the actual and projected data (y-m-d) |  |
|**actualSales** | **Long** | Actual Sales (in cents) |  |
|**projectedSales** | **Long** | Projected Sales (in cents) |  |
|**projectedSalesOverride** | **Double** | User specified override for projected sales |  [optional] |
|**actualLaborCost** | **Long** | Actual Labor Cost (in cents) |  |
|**projectedLaborCost** | **Long** | Projected Labor Cost (in cents) |  |
|**salesPerLaborHour** | **Float** | Sales Per Labor Hour (in cents, not rounded) |  |
|**projectedSalesPerLaborHour** | **Float** | Projected Sales Per Labor Hour (in cents, not rounded) |  |
|**itemsPerLaborHour** | **Float** | Items Per Labor Hour |  |
|**projectedItemsPerLaborHour** | **Float** | Projected Items Per Labor Hour |  |
|**laborPercent** | **Float** | Labor Percent |  |
|**id** | **Long** | ID of the Daily Report |  [optional] |
|**locationId** | **Long** | Location ID for the Daily Report |  [optional] |
|**departmentId** | **Long** | Department ID for the Daily Report |  [optional] |
|**actualItems** | **Long** | Number of items sold |  [optional] |
|**projectedItems** | **Long** | Projected number of items sold |  [optional] |
|**projectedItemsOverride** | **Long** | User specified override for projected number of items sold |  [optional] |
|**laborTarget** | **Float** | the labor target |  [optional] |
|**actualLaborMinutes** | **Long** | Actual number of minutes worked |  [optional] |
|**projectedLaborMinutes** | **Long** | Projected number of minutes worked |  [optional] |
|**actualOtMinutes** | **Long** | Actual number of overtime minutes worked |  [optional] |



