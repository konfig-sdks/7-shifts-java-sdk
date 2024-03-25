

# ReceiptsListResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** |  |  [optional] |
|**companyId** | **Integer** | The id of the company |  [optional] |
|**locationId** | **Integer** | The id of the location where this receipt was created |  |
|**posId** | **Integer** | The ID of the POS system that generated the receipt |  [optional] |
|**receiptId** | **String** | ID available to the client in the POS UI. Be it a GUID, a receipt number, a composite of date and ID and terminal, etc |  |
|**receiptDate** | **OffsetDateTime** | ISO8601 date and time in UTC when receipt was created |  [optional] |
|**receiptCloseDate** | **OffsetDateTime** | ISO8601 date and time in UTC when receipt was closed |  [optional] |
|**netTotal** | **Integer** | Net total of the receipt in cents, pre tax, post-discounts, pre tips |  |
|**grossTotal** | **Integer** | Gross total of the receipt in cents |  [optional] |
|**tips** | **Integer** | Total tips in cents |  [optional] |
|**totalReceiptDiscounts** | **Integer** | Total receipt discounts in cents |  [optional] |
|**totalItemDiscounts** | **Integer** | Item discounts in cents |  [optional] |
|**externalUserId** | **String** | ID available to the client in the POS UI. Representing the user responsible for creation of receipt. |  [optional] |
|**revenueCenter** | **String** | ID of the revenue center |  [optional] |
|**receiptLines** | [**List&lt;ReceiptsListResponseDataInnerReceiptLinesInner&gt;**](ReceiptsListResponseDataInnerReceiptLinesInner.md) | Receipt line items |  [optional] |
|**tipDetails** | [**List&lt;ReceiptsListResponseDataInnerTipDetailsInner&gt;**](ReceiptsListResponseDataInnerTipDetailsInner.md) | Tip line items |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the receipt |  [optional] |
|**createdDate** | **OffsetDateTime** | ISO8601 date and time in UTC when receipt was created in 7shifts system |  [optional] |
|**modifiedDate** | **OffsetDateTime** | ISO8601 date and time in UTC when receipt was last updated in 7shifts system |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| VOIDED | &quot;voided&quot; |
| DELETED | &quot;deleted&quot; |



