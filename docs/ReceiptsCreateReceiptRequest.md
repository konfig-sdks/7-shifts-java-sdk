

# ReceiptsCreateReceiptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiptId** | **String** | ID available to the client in the POS UI. Be it a GUID, a receipt number, a composite of date and ID and terminal, etc |  |
|**locationId** | **Integer** | The 7shifts location_id this receipt belongs to |  |
|**receiptDate** | **OffsetDateTime** | Receipt create date time. UTC date time in ISO8601 format |  |
|**netTotal** | **Integer** | The net total of the receipt pre tax, post-discounts, pre tips. In cents |  |
|**grossTotal** | **Integer** | The gross total of the receipt in cents |  [optional] |
|**totalReceiptDiscounts** | **Integer** | The total discounts of the receipt in cents |  [optional] |
|**tips** | **Integer** | Total tips in cents |  [optional] |
|**externalUserId** | **String** | External user ID of the sales receipt in your system (must be unique per 7shifts location). |  [optional] |
|**revenueCenter** | **String** | Label for the revenue centre for the receipt |  [optional] |
|**receiptLines** | [**List&lt;ReceiptsCreateReceiptRequestAllOfReceiptLines&gt;**](ReceiptsCreateReceiptRequestAllOfReceiptLines.md) | Receipt line items |  |
|**tipDetails** | [**List&lt;ReceiptsCreateReceiptRequestAllOfTipDetails&gt;**](ReceiptsCreateReceiptRequestAllOfTipDetails.md) | Tip line items |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the receipt |  |
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



