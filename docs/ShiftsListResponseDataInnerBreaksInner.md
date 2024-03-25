

# ShiftsListResponseDataInnerBreaksInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Break ID |  |
|**shiftId** | **Integer** | Shift ID |  |
|**start** | **OffsetDateTime** | Start date time of the break. UTC in ISO8601 format. |  [optional] |
|**end** | **OffsetDateTime** | End date time of the break. UTC in ISO8601 format. |  [optional] |
|**name** | **String** | Break type name |  |
|**length** | **Integer** | Break type length in minutes |  |
|**breakTypeId** | **Integer** | Break type ID |  |
|**type** | [**TypeEnum**](#TypeEnum) | Break type paid or unpaid |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAID | &quot;paid&quot; |
| UNPAID | &quot;unpaid&quot; |



