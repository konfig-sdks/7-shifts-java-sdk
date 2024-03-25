

# TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInner

Tip pool stakeholders (contributors and receivers)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Tip pool stakeholder UUID |  [optional] |
|**tipPoolSettingsUuid** | **UUID** | Tip pool settings UUID |  [optional] |
|**stakeholderType** | [**StakeholderTypeEnum**](#StakeholderTypeEnum) | Whether this is a contributor or a receiver |  |
|**stakeholderSubtype** | [**StakeholderSubtypeEnum**](#StakeholderSubtypeEnum) | Whether this stakeholder represents a role or a department |  |
|**roleId** | **Long** | Role ID (null if stakeholder subtype is not &#39;ROLE&#39;) |  |
|**departmentId** | **Long** | Department ID (null if stakeholder subtype is not &#39;DEPARTMENT&#39;) |  |
|**stakeAmount** | **Float** | Amount of tips they contribute or receive (may be a percentage, number of points, or null, depending on stakeholder type and tip pool distribution type) |  |
|**contributionMethod** | **String** | If the stakeholder is a contribution stakeholder, this field represents whether they contribute based on percent tips, percent sales or percent remaining tips |  |
|**filters** | [**List&lt;TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInnerFiltersInner&gt;**](TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInnerFiltersInner.md) |  |  [optional] |



## Enum: StakeholderTypeEnum

| Name | Value |
|---- | -----|
| CONTRIBUTION | &quot;CONTRIBUTION&quot; |
| DISTRIBUTION | &quot;DISTRIBUTION&quot; |



## Enum: StakeholderSubtypeEnum

| Name | Value |
|---- | -----|
| ROLE | &quot;ROLE&quot; |
| DEPARTMENT | &quot;DEPARTMENT&quot; |



