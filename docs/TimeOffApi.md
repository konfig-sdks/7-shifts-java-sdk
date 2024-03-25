# TimeOffApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveRequest**](TimeOffApi.md#approveRequest) | **POST** /v2/time_off/{time_off_id}/approve | Approve Time Off Request |
| [**createRequest**](TimeOffApi.md#createRequest) | **POST** /v2/time_off | Create time off |
| [**declineRequest**](TimeOffApi.md#declineRequest) | **POST** /v2/time_off/{time_off_id}/decline | Decline Time Off Request |
| [**getSettings**](TimeOffApi.md#getSettings) | **GET** /v2/time_off_settings/{company_id} | Retrieve Time Off Settings |
| [**getTimeOffById**](TimeOffApi.md#getTimeOffById) | **GET** /v2/time_off/{time_off_id} | Retrieve Time Off |
| [**getTotalHours**](TimeOffApi.md#getTotalHours) | **GET** /v2/time_off/total_hours | Retrieve Time Off Hours |
| [**list**](TimeOffApi.md#list) | **GET** /v2/time_off | List Time Off |
| [**remove**](TimeOffApi.md#remove) | **DELETE** /v2/time_off/{time_off_id} | Delete Time Off |
| [**setTimeOffSettings**](TimeOffApi.md#setTimeOffSettings) | **POST** /v2/time_off_settings/{company_id} | Create Time Off Settings |
| [**updateTimeOffById**](TimeOffApi.md#updateTimeOffById) | **PATCH** /v2/time_off/{time_off_id} | Update Time Off |


<a name="approveRequest"></a>
# **approveRequest**
> TimeOffApproveRequest200Response approveRequest(timeOffId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).timeOffApproveRequestRequest(timeOffApproveRequestRequest).execute();

Approve Time Off Request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long timeOffId = 1234L; // Time Off ID
    String statusActionMessage = "statusActionMessage_example";
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffApproveRequest200Response result = client
              .timeOff
              .approveRequest(timeOffId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getPartial());
      System.out.println(result.getPartialFrom());
      System.out.println(result.getPartialTo());
      System.out.println(result.getComments());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusActionUserId());
      System.out.println(result.getStatusActionMessage());
      System.out.println(result.getCategory());
      System.out.println(result.getCreated());
      System.out.println(result.getAmountOfHours());
      System.out.println(result.getHours());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#approveRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffApproveRequest200Response> response = client
              .timeOff
              .approveRequest(timeOffId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#approveRequest");
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
| **timeOffId** | **Long**| Time Off ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **timeOffApproveRequestRequest** | [**TimeOffApproveRequestRequest**](TimeOffApproveRequestRequest.md)|  | [optional] |

### Return type

[**TimeOffApproveRequest200Response**](TimeOffApproveRequest200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="createRequest"></a>
# **createRequest**
> TimeOffCreateRequest200Response createRequest(timeOffCreateRequestRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create time off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Integer userId = 56;
    Integer companyId = 56;
    String fromDate = "fromDate_example";
    String toDate = "toDate_example";
    Boolean partial = true;
    Integer status = 56;
    String category = "category_example";
    String partialFrom = "partialFrom_example";
    String partialTo = "partialTo_example";
    String comments = "comments_example";
    List<TimeOffCreateRequestRequestHoursInner> hours = Arrays.asList();
    Integer statusActionUserId = 56;
    String statusActionMessage = "statusActionMessage_example";
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffCreateRequest200Response result = client
              .timeOff
              .createRequest(userId, companyId, fromDate, toDate, partial, status, category)
              .partialFrom(partialFrom)
              .partialTo(partialTo)
              .comments(comments)
              .hours(hours)
              .statusActionUserId(statusActionUserId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getPartial());
      System.out.println(result.getPartialFrom());
      System.out.println(result.getPartialTo());
      System.out.println(result.getComments());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusActionUserId());
      System.out.println(result.getStatusActionMessage());
      System.out.println(result.getCategory());
      System.out.println(result.getCreated());
      System.out.println(result.getAmountOfHours());
      System.out.println(result.getHours());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffCreateRequest200Response> response = client
              .timeOff
              .createRequest(userId, companyId, fromDate, toDate, partial, status, category)
              .partialFrom(partialFrom)
              .partialTo(partialTo)
              .comments(comments)
              .hours(hours)
              .statusActionUserId(statusActionUserId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#createRequest");
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
| **timeOffCreateRequestRequest** | [**TimeOffCreateRequestRequest**](TimeOffCreateRequestRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimeOffCreateRequest200Response**](TimeOffCreateRequest200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="declineRequest"></a>
# **declineRequest**
> TimeOffDeclineRequest200Response declineRequest(timeOffId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).timeOffDeclineRequestRequest(timeOffDeclineRequestRequest).execute();

Decline Time Off Request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long timeOffId = 1234L; // Time Off ID
    String statusActionMessage = "statusActionMessage_example";
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffDeclineRequest200Response result = client
              .timeOff
              .declineRequest(timeOffId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getPartial());
      System.out.println(result.getPartialFrom());
      System.out.println(result.getPartialTo());
      System.out.println(result.getComments());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusActionUserId());
      System.out.println(result.getStatusActionMessage());
      System.out.println(result.getCategory());
      System.out.println(result.getCreated());
      System.out.println(result.getAmountOfHours());
      System.out.println(result.getHours());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#declineRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffDeclineRequest200Response> response = client
              .timeOff
              .declineRequest(timeOffId)
              .statusActionMessage(statusActionMessage)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#declineRequest");
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
| **timeOffId** | **Long**| Time Off ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **timeOffDeclineRequestRequest** | [**TimeOffDeclineRequestRequest**](TimeOffDeclineRequestRequest.md)|  | [optional] |

### Return type

[**TimeOffDeclineRequest200Response**](TimeOffDeclineRequest200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="getSettings"></a>
# **getSettings**
> TimeOffGetSettings200Response getSettings(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Time Off Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffGetSettings200Response result = client
              .timeOff
              .getSettings(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyId());
      System.out.println(result.getTimeOffRequestComment());
      System.out.println(result.getTimeOffRequestNotice());
      System.out.println(result.getCategories());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffGetSettings200Response> response = client
              .timeOff
              .getSettings(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getSettings");
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
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimeOffGetSettings200Response**](TimeOffGetSettings200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="getTimeOffById"></a>
# **getTimeOffById**
> TimeOffGetTimeOffById200Response getTimeOffById(timeOffId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Time Off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long timeOffId = 1234L; // Time Off ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffGetTimeOffById200Response result = client
              .timeOff
              .getTimeOffById(timeOffId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getPartial());
      System.out.println(result.getPartialFrom());
      System.out.println(result.getPartialTo());
      System.out.println(result.getComments());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusActionUserId());
      System.out.println(result.getStatusActionMessage());
      System.out.println(result.getCategory());
      System.out.println(result.getCreated());
      System.out.println(result.getAmountOfHours());
      System.out.println(result.getHours());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffGetTimeOffById200Response> response = client
              .timeOff
              .getTimeOffById(timeOffId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffById");
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
| **timeOffId** | **Long**| Time Off ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimeOffGetTimeOffById200Response**](TimeOffGetTimeOffById200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="getTotalHours"></a>
# **getTotalHours**
> TimeOffGetTotalHours200Response getTotalHours(companyId, employeeId, dateStart, dateEnd).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Time Off Hours

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long companyId = 8655L; // Company ID
    List<Integer> employeeId = Arrays.asList(); // Employee IDs
    String dateStart = "2019-11-05T12:32:00-08:00:00"; // An ISO 8601 date string
    String dateEnd = "2019-11-05T12:32:00-08:00:00"; // An ISO 8601 date string
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffGetTotalHours200Response result = client
              .timeOff
              .getTotalHours(companyId, employeeId, dateStart, dateEnd)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTotalHours");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffGetTotalHours200Response> response = client
              .timeOff
              .getTotalHours(companyId, employeeId, dateStart, dateEnd)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTotalHours");
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
| **employeeId** | [**List&lt;Integer&gt;**](Integer.md)| Employee IDs | |
| **dateStart** | **String**| An ISO 8601 date string | |
| **dateEnd** | **String**| An ISO 8601 date string | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimeOffGetTotalHours200Response**](TimeOffGetTotalHours200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="list"></a>
# **list**
> TimeOffList200Response list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).userId(userId).status(status).category(category).toDateGte(toDateGte).sortBy(sortBy).sortDir(sortDir).cursor(cursor).limit(limit).execute();

List Time Off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long companyId = 8655L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 1540L; // Location ID
    Long userId = 1122554L; // User ID
    Long status = 1L; // Status
    String category = "paid"; // Category
    String toDateGte = "2020-01-01"; // Return time offs that end after a specified date.
    String sortBy = "created"; // Sort by column
    String sortDir = "asc"; // Sort by direction (asc, desc)
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 56L; // The number of results desired per page.
    try {
      TimeOffList200Response result = client
              .timeOff
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .userId(userId)
              .status(status)
              .category(category)
              .toDateGte(toDateGte)
              .sortBy(sortBy)
              .sortDir(sortDir)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffList200Response> response = client
              .timeOff
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .userId(userId)
              .status(status)
              .category(category)
              .toDateGte(toDateGte)
              .sortBy(sortBy)
              .sortDir(sortDir)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#list");
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
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |
| **userId** | **Long**| User ID | [optional] |
| **status** | **Long**| Status | [optional] |
| **category** | **String**| Category | [optional] [enum: paid, unpaid, paid_sick] |
| **toDateGte** | **String**| Return time offs that end after a specified date. | [optional] |
| **sortBy** | **String**| Sort by column | [optional] [enum: created, from_date] |
| **sortDir** | **String**| Sort by direction (asc, desc) | [optional] [enum: asc, desc] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] |

### Return type

[**TimeOffList200Response**](TimeOffList200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a name="remove"></a>
# **remove**
> remove(timeOffId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Time Off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long timeOffId = 1234L; // Time Off ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .timeOff
              .remove(timeOffId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .remove(timeOffId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#remove");
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
| **timeOffId** | **Long**| Time Off ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Unexpected error |  -  |

<a name="setTimeOffSettings"></a>
# **setTimeOffSettings**
> TimeOffSetTimeOffSettings200Response setTimeOffSettings(companyId).timeOffSetTimeOffSettingsRequest(timeOffSetTimeOffSettingsRequest).execute();

Create Time Off Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Boolean paidTimeOff = true;
    Boolean sickTimeOff = true;
    Boolean timeOffRequestComment = true;
    Double timeOffRequestNotice = 3.4D;
    try {
      TimeOffSetTimeOffSettings200Response result = client
              .timeOff
              .setTimeOffSettings(companyId)
              .paidTimeOff(paidTimeOff)
              .sickTimeOff(sickTimeOff)
              .timeOffRequestComment(timeOffRequestComment)
              .timeOffRequestNotice(timeOffRequestNotice)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyId());
      System.out.println(result.getTimeOffRequestComment());
      System.out.println(result.getTimeOffRequestNotice());
      System.out.println(result.getCategories());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#setTimeOffSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffSetTimeOffSettings200Response> response = client
              .timeOff
              .setTimeOffSettings(companyId)
              .paidTimeOff(paidTimeOff)
              .sickTimeOff(sickTimeOff)
              .timeOffRequestComment(timeOffRequestComment)
              .timeOffRequestNotice(timeOffRequestNotice)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#setTimeOffSettings");
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
| **timeOffSetTimeOffSettingsRequest** | [**TimeOffSetTimeOffSettingsRequest**](TimeOffSetTimeOffSettingsRequest.md)|  | [optional] |

### Return type

[**TimeOffSetTimeOffSettings200Response**](TimeOffSetTimeOffSettings200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time off settings for company saved |  -  |
| **0** | Unexpected error |  -  |

<a name="updateTimeOffById"></a>
# **updateTimeOffById**
> TimeOffUpdateTimeOffById200Response updateTimeOffById(timeOffId, timeOffUpdateTimeOffByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Time Off

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    Long timeOffId = 1234L; // Time Off ID
    Integer userId = 56;
    String fromDate = "fromDate_example";
    String toDate = "toDate_example";
    Boolean partial = true;
    String partialFrom = "partialFrom_example";
    String partialTo = "partialTo_example";
    String comments = "comments_example";
    Integer status = 56;
    String statusActionMessage = "statusActionMessage_example";
    String category = "category_example";
    List<TimeOffCreateRequestRequestHoursInner> hours = Arrays.asList();
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimeOffUpdateTimeOffById200Response result = client
              .timeOff
              .updateTimeOffById(timeOffId)
              .userId(userId)
              .fromDate(fromDate)
              .toDate(toDate)
              .partial(partial)
              .partialFrom(partialFrom)
              .partialTo(partialTo)
              .comments(comments)
              .status(status)
              .statusActionMessage(statusActionMessage)
              .category(category)
              .hours(hours)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getPartial());
      System.out.println(result.getPartialFrom());
      System.out.println(result.getPartialTo());
      System.out.println(result.getComments());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusActionUserId());
      System.out.println(result.getStatusActionMessage());
      System.out.println(result.getCategory());
      System.out.println(result.getCreated());
      System.out.println(result.getAmountOfHours());
      System.out.println(result.getHours());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateTimeOffById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffUpdateTimeOffById200Response> response = client
              .timeOff
              .updateTimeOffById(timeOffId)
              .userId(userId)
              .fromDate(fromDate)
              .toDate(toDate)
              .partial(partial)
              .partialFrom(partialFrom)
              .partialTo(partialTo)
              .comments(comments)
              .status(status)
              .statusActionMessage(statusActionMessage)
              .category(category)
              .hours(hours)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateTimeOffById");
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
| **timeOffId** | **Long**| Time Off ID | |
| **timeOffUpdateTimeOffByIdRequest** | [**TimeOffUpdateTimeOffByIdRequest**](TimeOffUpdateTimeOffByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimeOffUpdateTimeOffById200Response**](TimeOffUpdateTimeOffById200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

