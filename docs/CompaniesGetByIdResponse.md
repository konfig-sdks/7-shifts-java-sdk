

# CompaniesGetByIdResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Double** |  |  |
|**name** | **String** |  |  |
|**country** | **String** |  |  |
|**photo** | **String** |  |  |
|**planId** | **String** |  |  |
|**created** | **OffsetDateTime** |  |  |
|**modified** | **OffsetDateTime** |  |  |
|**expires** | **OffsetDateTime** |  |  |
|**daysToExpire** | **Double** |  |  |
|**converted** | **OffsetDateTime** |  |  |
|**pos** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**startWeekOn** | **Double** |  |  |
|**meta** | [**CompaniesListResponseDataInnerMeta**](CompaniesListResponseDataInnerMeta.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRIAL | &quot;trial&quot; |
| CANCELLED | &quot;cancelled&quot; |
| DELINQUENT | &quot;delinquent&quot; |
| EXPIRED | &quot;expired&quot; |
| UNKNOWN | &quot;unknown&quot; |



