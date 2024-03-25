

# TaskManagementGetTaskListTemplates200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**description** | **String** |  |  |
|**id** | **Integer** |  |  |
|**companyId** | **Integer** |  |  |
|**uuid** | **String** |  |  |
|**status** | **Integer** |  |  |
|**due** | **String** | A date with YYYY-MM-DD format |  [optional] |
|**created** | **OffsetDateTime** |  |  |
|**activatedAt** | **OffsetDateTime** |  |  |
|**taskTemplates** | [**List&lt;TaskManagementCreateTaskListTemplateRequestTaskTemplatesInner&gt;**](TaskManagementCreateTaskListTemplateRequestTaskTemplatesInner.md) |  |  |
|**assignments** | [**List&lt;TaskManagementCreateTaskListTemplateRequestAssignmentsInner&gt;**](TaskManagementCreateTaskListTemplateRequestAssignmentsInner.md) |  |  |
|**recurrence** | **String** | recurrence rules as defined by the RFC 5545 spec |  |
|**timeFrame** | [**TaskManagementGetTaskListTemplates200ResponseDataInnerTimeFrame**](TaskManagementGetTaskListTemplates200ResponseDataInnerTimeFrame.md) |  |  [optional] |



