

# TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInnerFiltersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Tip pool stakeholder filter UUID |  [optional] |
|**tipPoolStakeholderUuid** | **UUID** | Tip pool stakeholder UUID |  [optional] |
|**tipPoolSettingsUuid** | **UUID** | Tip pool settings UUID |  [optional] |
|**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | The type of stakeholder filter - whether it is from a revenue center, dining option, or sales category |  |
|**filterValue** | **String** | The ID that we will represent the filter with |  |
|**filterName** | **String** | The display name that the end user will see |  |



## Enum: FilterTypeEnum

| Name | Value |
|---- | -----|
| DINING_OPTION | &quot;DINING_OPTION&quot; |
| REVENUE_CENTER | &quot;REVENUE_CENTER&quot; |
| SALES_CATEGORY | &quot;SALES_CATEGORY&quot; |



