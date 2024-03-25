

# ReceiptsGetReceiptResponseDataReceiptLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Internal UUID of the receipt |  [optional] |
|**locationId** | **Integer** | The id of the location where this receipt was created |  |
|**externalItemId** | **String** | The item ID available to the client |  |
|**externalCategoryIds** | **List&lt;String&gt;** | The list of category IDs available to the client |  |
|**quantity** | **Integer** | Quantity of this item |  |
|**price** | **Integer** | Price in cents |  |
|**grossItemPrice** | **Integer** | The item gross price in cents |  [optional] |
|**netItemPrice** | **Integer** | The item net price pre-tax, post-discounts, pre-tips. In cents |  [optional] |
|**itemDiscount** | **Integer** | The item discount in cents |  [optional] |
|**createdDate** | **OffsetDateTime** | ISO8601 date and time in UTC when receipt was created in 7shifts system |  [optional] |



