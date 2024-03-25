

# RolesCreateRoleResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Role ID |  [optional] |
|**companyId** | **Integer** | Company ID |  [optional] |
|**locationId** | **Integer** | Location ID |  [optional] |
|**departmentId** | **Integer** | Department ID |  [optional] |
|**color** | **String** | A hex number representing the color |  [optional] |
|**numStations** | **Integer** | The number of stations this role contains |  [optional] |
|**name** | **String** | Role name |  [optional] |
|**jobCode** | **String** | Job code |  [optional] |
|**sort** | **Integer** | The order in which the roles will be listed in the web app |  [optional] |
|**stations** | [**List&lt;RolesListResponseDataInnerStationsInner&gt;**](RolesListResponseDataInnerStationsInner.md) |  |  [optional] |
|**created** | **OffsetDateTime** | The ISO8601 date and time in UTC when the role was created |  [optional] |
|**modified** | **OffsetDateTime** | The ISO8601 date and time in UTC when the role was modified |  [optional] |



