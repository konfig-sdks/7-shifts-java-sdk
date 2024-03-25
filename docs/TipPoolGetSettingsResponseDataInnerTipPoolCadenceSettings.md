

# TipPoolGetSettingsResponseDataInnerTipPoolCadenceSettings

Tip pool cadence settings - denotes the frequency of tip pool period calculations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | Tip pool cadence settings UUID |  [optional] |
|**tipPoolSettingsUuid** | **UUID** | Tip pool settings UUID |  [optional] |
|**cadenceType** | [**CadenceTypeEnum**](#CadenceTypeEnum) | The frequency/cadence of each tip pool settings period |  |
|**periodStartDate** | **String** | What effective date does the cadence period start (only for WEEKLY, BIWEEKLY) |  |



## Enum: CadenceTypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| BIWEEKLY | &quot;BIWEEKLY&quot; |
| SEMI_MONTHLY | &quot;SEMI_MONTHLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



