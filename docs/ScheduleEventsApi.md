# ScheduleEventsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEvent**](ScheduleEventsApi.md#createEvent) | **POST** /v2/company/{company_id}/events | Create Event |
| [**deleteEvent**](ScheduleEventsApi.md#deleteEvent) | **DELETE** /v2/company/{company_id}/events/{event_id} | Delete Event |
| [**getEventById**](ScheduleEventsApi.md#getEventById) | **GET** /v2/company/{company_id}/events/{event_id} | Retrieve Event |
| [**listEvents**](ScheduleEventsApi.md#listEvents) | **GET** /v2/company/{company_id}/events | List Events |
| [**updateEventById**](ScheduleEventsApi.md#updateEventById) | **PATCH** /v2/company/{company_id}/events/{event_id} | Update Event |


<a name="createEvent"></a>
# **createEvent**
> ScheduleEventsCreateEventResponse createEvent(companyId, scheduleEventsCreateEventRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    Client7Shifts client = new Client7Shifts(configuration);
    String title = "title_example"; // The name of the event
    List<Integer> locationIds = Arrays.asList(); // The list of locations where this event occurs
    String startDate = "startDate_example"; // Start date
    String startTime = "startTime_example"; // Start time
    String endDate = "endDate_example"; // End date for multi-day events
    String endTime = "endTime_example"; // End time
    Boolean isMultiDay = true; // If true, the event is a multi-day event
    Long companyId = 1234L; // Company ID
    String description = "description_example"; // Description for event
    String color = "color_example"; // A hex number representing the color
    String recurrence = "recurrence_example"; // Recurrence rules as defined by the RFC 5545 spec
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ScheduleEventsCreateEventResponse result = client
              .scheduleEvents
              .createEvent(title, locationIds, startDate, startTime, endDate, endTime, isMultiDay, companyId)
              .description(description)
              .color(color)
              .recurrence(recurrence)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEventType());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getLocationIds());
      System.out.println(result.getStart());
      System.out.println(result.getStartDate());
      System.out.println(result.getStartTime());
      System.out.println(result.getEnd());
      System.out.println(result.getEndDate());
      System.out.println(result.getEndTime());
      System.out.println(result.getColor());
      System.out.println(result.getIsMultiDay());
      System.out.println(result.getRecurrence());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#createEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleEventsCreateEventResponse> response = client
              .scheduleEvents
              .createEvent(title, locationIds, startDate, startTime, endDate, endTime, isMultiDay, companyId)
              .description(description)
              .color(color)
              .recurrence(recurrence)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#createEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Long**| Company ID | |
| **scheduleEventsCreateEventRequest** | [**ScheduleEventsCreateEventRequest**](ScheduleEventsCreateEventRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ScheduleEventsCreateEventResponse**](ScheduleEventsCreateEventResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteEvent"></a>
# **deleteEvent**
> ScheduleEventsDeleteEventResponse deleteEvent(companyId, eventId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).recurrenceTarget(recurrenceTarget).startDate(startDate).execute();

Delete Event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    Client7Shifts client = new Client7Shifts(configuration);
    Long companyId = 1234L; // Company ID
    Long eventId = 1234L; // Event ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    String recurrenceTarget = "[\"THIS\",\"THIS_AND_FUTURE\"]"; // Recurrence Target
    String startDate = "startDate_example"; // Start of the targeted range for recurrence. Format YYYY-MM-DD HH:MM:SS
    try {
      ScheduleEventsDeleteEventResponse result = client
              .scheduleEvents
              .deleteEvent(companyId, eventId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .recurrenceTarget(recurrenceTarget)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#deleteEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleEventsDeleteEventResponse> response = client
              .scheduleEvents
              .deleteEvent(companyId, eventId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .recurrenceTarget(recurrenceTarget)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#deleteEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Long**| Company ID | |
| **eventId** | **Long**| Event ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **recurrenceTarget** | **String**| Recurrence Target | [optional] |
| **startDate** | **String**| Start of the targeted range for recurrence. Format YYYY-MM-DD HH:MM:SS | [optional] |

### Return type

[**ScheduleEventsDeleteEventResponse**](ScheduleEventsDeleteEventResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getEventById"></a>
# **getEventById**
> ScheduleEventsGetEventByIdResponse getEventById(companyId, eventId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    Client7Shifts client = new Client7Shifts(configuration);
    Long companyId = 1234L; // Company ID
    Long eventId = 1234L; // Event ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ScheduleEventsGetEventByIdResponse result = client
              .scheduleEvents
              .getEventById(companyId, eventId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleEventsGetEventByIdResponse> response = client
              .scheduleEvents
              .getEventById(companyId, eventId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Long**| Company ID | |
| **eventId** | **Long**| Event ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ScheduleEventsGetEventByIdResponse**](ScheduleEventsGetEventByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listEvents"></a>
# **listEvents**
> ScheduleEventsListEventsResponse listEvents(companyId, startDate, endDate).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).execute();

List Events

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    Client7Shifts client = new Client7Shifts(configuration);
    Long companyId = 1234L; // Company ID
    LocalDate startDate = LocalDate.parse("2020-02-02"); // A date string to request only events within a range.  Format YYYY-MM-DD
    LocalDate endDate = LocalDate.parse("2020-02-08"); // A date string to request only events within a range.  Format YYYY-MM-DD
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 1234L; // Location ID
    try {
      ScheduleEventsListEventsResponse result = client
              .scheduleEvents
              .listEvents(companyId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#listEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleEventsListEventsResponse> response = client
              .scheduleEvents
              .listEvents(companyId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#listEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Long**| Company ID | |
| **startDate** | **LocalDate**| A date string to request only events within a range.  Format YYYY-MM-DD | |
| **endDate** | **LocalDate**| A date string to request only events within a range.  Format YYYY-MM-DD | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |

### Return type

[**ScheduleEventsListEventsResponse**](ScheduleEventsListEventsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateEventById"></a>
# **updateEventById**
> ScheduleEventsUpdateEventByIdResponse updateEventById(companyId, eventId, scheduleEventsUpdateEventByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    Client7Shifts client = new Client7Shifts(configuration);
    Long companyId = 1234L; // Company ID
    Long eventId = 1234L; // Event ID
    String title = "title_example"; // The name of the event
    String description = "description_example"; // Description for event
    List<Integer> locationIds = Arrays.asList(); // The list of locations where this event occurs
    String startDate = "startDate_example"; // Start date
    String startTime = "startTime_example"; // Start time
    String endDate = "endDate_example"; // End date for multi-day events
    String endTime = "endTime_example"; // End time
    String color = "color_example"; // A hex number representing the color
    Boolean isMultiDay = true; // If true, the event is a multi-day event
    String recurrence = "recurrence_example"; // Recurrence rules as defined by the RFC 5545 spec
    String recurrenceTarget = "THIS"; // describes which recurring events will be updated
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ScheduleEventsUpdateEventByIdResponse result = client
              .scheduleEvents
              .updateEventById(companyId, eventId)
              .title(title)
              .description(description)
              .locationIds(locationIds)
              .startDate(startDate)
              .startTime(startTime)
              .endDate(endDate)
              .endTime(endTime)
              .color(color)
              .isMultiDay(isMultiDay)
              .recurrence(recurrence)
              .recurrenceTarget(recurrenceTarget)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#updateEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleEventsUpdateEventByIdResponse> response = client
              .scheduleEvents
              .updateEventById(companyId, eventId)
              .title(title)
              .description(description)
              .locationIds(locationIds)
              .startDate(startDate)
              .startTime(startTime)
              .endDate(endDate)
              .endTime(endTime)
              .color(color)
              .isMultiDay(isMultiDay)
              .recurrence(recurrence)
              .recurrenceTarget(recurrenceTarget)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleEventsApi#updateEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **Long**| Company ID | |
| **eventId** | **Long**| Event ID | |
| **scheduleEventsUpdateEventByIdRequest** | [**ScheduleEventsUpdateEventByIdRequest**](ScheduleEventsUpdateEventByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ScheduleEventsUpdateEventByIdResponse**](ScheduleEventsUpdateEventByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

