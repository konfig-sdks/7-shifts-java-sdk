

# WebhooksCreateResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Webhook ID |  |
|**companyId** | **Integer** | Company ID |  |
|**url** | **String** | Webhook URL |  |
|**method** | [**MethodEnum**](#MethodEnum) | Webhook method |  |
|**event** | **String** | Webhook event |  |
|**created** | **String** | Webhook create date time. UTC date time in ISO8601 format |  |
|**modified** | **String** | Webhook modified date time. UTC date time in ISO8601 format |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;post&quot; |
| GET | &quot;get&quot; |
| PUT | &quot;put&quot; |
| PATCH | &quot;patch&quot; |
| DELETE | &quot;delete&quot; |



