

# ScheduleEventsDeleteEventResponseDataInnerAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The name of the event |  |
|**description** | **String** | Description for event |  [optional] |
|**locationIds** | **List&lt;Integer&gt;** | The list of locations where this event occurs |  |
|**start** | [**List&lt;ScheduleEventsListEventsResponseDataInnerAllOf1StartInner&gt;**](ScheduleEventsListEventsResponseDataInnerAllOf1StartInner.md) | The events start date-time for each locations timezone |  [optional] |
|**startDate** | **String** | Start date |  |
|**startTime** | **String** | Start time |  |
|**end** | [**List&lt;ScheduleEventsListEventsResponseDataInnerAllOf1EndInner&gt;**](ScheduleEventsListEventsResponseDataInnerAllOf1EndInner.md) | The events end date-time for each locations timezone |  [optional] |
|**endDate** | **String** | End date for multi-day events |  |
|**endTime** | **String** | End time |  |
|**color** | **String** | A hex number representing the color |  [optional] |
|**isMultiDay** | **Boolean** | If true, the event is a multi-day event |  |
|**recurrence** | **String** | Recurrence rules as defined by the RFC 5545 spec |  [optional] |



