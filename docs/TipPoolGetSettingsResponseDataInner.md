

# TipPoolGetSettingsResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Tip pool settings UUID |  [optional] |
|**companyId** | **Long** | Company ID |  |
|**locationId** | **Long** | Location ID |  |
|**dayPartUuids** | **List&lt;UUID&gt;** | Day parts associated with this tip pool |  [optional] |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Tip pool contribution type |  |
|**distributionType** | [**DistributionTypeEnum**](#DistributionTypeEnum) | Tip pool distribution type |  |
|**salesTipPercentage** | **Float** | The proportion of sales tips or tips for unassigned roles (in percentage) you wish to contribute to the tip pool |  |
|**unmappedContributionMethod** | **String** | A field representing whether we source our unmapped contribution amounts from tips, sales receipts or remaining tips |  [optional] |
|**unmappedContributionFilters** | [**List&lt;TipPoolGetSettingsResponseDataInnerUnmappedContributionFiltersInner&gt;**](TipPoolGetSettingsResponseDataInnerUnmappedContributionFiltersInner.md) |  |  [optional] |
|**name** | **String** | Tip pool name |  |
|**enabled** | **Boolean** | Whether the tip pool is enabled |  |
|**tipPoolStakeholders** | [**List&lt;TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInner&gt;**](TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInner.md) |  |  |
|**tipPoolContributions** | [**List&lt;TipPoolGetSettingsResponseDataInnerTipPoolContributionsInner&gt;**](TipPoolGetSettingsResponseDataInnerTipPoolContributionsInner.md) |  |  |
|**tipPoolCadenceSettings** | [**TipPoolGetSettingsResponseDataInnerTipPoolCadenceSettings**](TipPoolGetSettingsResponseDataInnerTipPoolCadenceSettings.md) |  |  [optional] |
|**created** | **OffsetDateTime** | When this tip pool was created in UTC timezone and Zulu format |  [optional] |
|**modified** | **OffsetDateTime** | When this tip pool was last modified in UTC timezone and Zulu format |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| POS_PERCENT_TIPS_AND_SALES | &quot;POS_PERCENT_TIPS_AND_SALES&quot; |
| MANUAL_ENTRY | &quot;MANUAL_ENTRY&quot; |



## Enum: DistributionTypeEnum

| Name | Value |
|---- | -----|
| HOURS_WORKED | &quot;HOURS_WORKED&quot; |
| ROLE_PERCENT_HOURS_WORKED | &quot;ROLE_PERCENT_HOURS_WORKED&quot; |
| POINTS | &quot;POINTS&quot; |



