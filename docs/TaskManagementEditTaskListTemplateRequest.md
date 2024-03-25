

# TaskManagementEditTaskListTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**status** | **Integer** |  |  [optional] |
|**taskTemplates** | [**List&lt;TaskManagementEditTaskListTemplateRequestTaskTemplatesInner&gt;**](TaskManagementEditTaskListTemplateRequestTaskTemplatesInner.md) |  |  [optional] |
|**recurrence** | **String** | recurrence rules as defined by the RFC 5545 spec |  [optional] |
|**assignments** | [**List&lt;TaskManagementCreateTaskListTemplateRequestAssignmentsInner&gt;**](TaskManagementCreateTaskListTemplateRequestAssignmentsInner.md) |  |  [optional] |
|**due** | **String** | A date with YYYY-MM-DD format |  [optional] |
|**timeFrame** | [**TaskManagementEditTaskListTemplateRequestTimeFrame**](TaskManagementEditTaskListTemplateRequestTimeFrame.md) |  |  [optional] |



