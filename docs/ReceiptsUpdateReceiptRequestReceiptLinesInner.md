

# ReceiptsUpdateReceiptRequestReceiptLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalItemId** | **String** | The item ID available to the client |  |
|**externalCategoryIds** | **List&lt;String&gt;** | The list of category IDs available to the client |  |
|**quantity** | **Integer** | The quantity of this item |  |
|**price** | **Integer** | The item price in cents |  |
|**grossItemPrice** | **Integer** | The item gross price in cents |  |
|**netItemPrice** | **Integer** | The item net price pre tax, post-discounts, pre tips. In cents |  |
|**itemDiscount** | **Integer** | The item discount. In cents |  |
|**status** | [**StatusEnum**](#StatusEnum) | The item status |  |
|**created** | **OffsetDateTime** | Line item create date time. UTC date time in ISO8601 format |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| VOIDED | &quot;voided&quot; |
| DELETED | &quot;deleted&quot; |



