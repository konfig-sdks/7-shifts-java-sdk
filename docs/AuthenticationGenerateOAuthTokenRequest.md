

# AuthenticationGenerateOAuthTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | Token grant type. For Partner OAuth tokens specifying client_credentials |  |
|**clientId** | **String** |  |  |
|**clientSecret** | **String** |  |  [optional] |
|**scope** | **String** | A space-delimited list of scopes. |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |
| PASSWORD | &quot;password&quot; |
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |



