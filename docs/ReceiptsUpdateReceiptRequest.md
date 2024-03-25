

# ReceiptsUpdateReceiptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiptDate** | **OffsetDateTime** | Receipt create date time. UTC date time in ISO8601 format |  [optional] |
|**netTotal** | **Integer** | The net total of the receipt pre tax, post-discounts, pre tips. In cents |  |
|**grossTotal** | **Integer** | The gross total of the receipt in cents |  [optional] |
|**totalReceiptDiscounts** | **Integer** | The total discounts of the receipt in cents |  [optional] |
|**tips** | **Integer** | Total tips in cents |  [optional] |
|**externalUserId** | **String** | External user ID of the sales receipt in your system (must be unique per 7shifts location). |  [optional] |
|**revenueCenter** | **String** | Label for the revenue center for the receipt |  [optional] |
|**receiptLines** | [**List&lt;ReceiptsUpdateReceiptRequestReceiptLinesInner&gt;**](ReceiptsUpdateReceiptRequestReceiptLinesInner.md) | Receipt line items |  [optional] |
|**tipDetails** | [**List&lt;ReceiptsUpdateReceiptRequestTipDetailsInner&gt;**](ReceiptsUpdateReceiptRequestTipDetailsInner.md) | Tip line items |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the receipt |  [optional] |
|**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Order type |  [optional] |
|**diningOption** | **String** | Dining option |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| VOIDED | &quot;voided&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: OrderTypeEnum

| Name | Value |
|---- | -----|
| DINE_IN | &quot;dine_in&quot; |
| DELIVERY | &quot;delivery&quot; |
| TAKE_OUT | &quot;take_out&quot; |



