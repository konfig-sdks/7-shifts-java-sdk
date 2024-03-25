

# RolesCreateRoleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Role name |  |
|**color** | **String** | A hex number representing the color |  |
|**locationId** | **Integer** | Location ID |  |
|**departmentId** | **Integer** | Department ID. If this role is not assigned to a department, this value will be zero |  |
|**sort** | **Integer** | The order in which the roles will be listed in the web app |  [optional] |
|**jobCode** | **String** | Job code |  [optional] |
|**stations** | [**List&lt;RolesCreateRoleRequestStationsInner&gt;**](RolesCreateRoleRequestStationsInner.md) | Stations this role contains |  [optional] |



