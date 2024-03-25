# AvailabilityApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](AvailabilityApi.md#createNew) | **POST** /v2/company/{company_id}/availabilities | Create Availability |
| [**createReason**](AvailabilityApi.md#createReason) | **POST** /v2/company/{company_id}/availability_reasons | Create Availability Reason |
| [**deleteReason**](AvailabilityApi.md#deleteReason) | **DELETE** /v2/company/{company_id}/availability_reasons/{availability_reason_id} | Delete Availability Reason |
| [**getById**](AvailabilityApi.md#getById) | **GET** /v2/company/{company_id}/availabilities/{availability_id} | Retrieve Availability |
| [**listAvailabilities**](AvailabilityApi.md#listAvailabilities) | **GET** /v2/company/{company_id}/availabilities | List Availabilities |
| [**listReasons**](AvailabilityApi.md#listReasons) | **GET** /v2/company/{company_id}/availability_reasons | List Availability Reasons |
| [**removeById**](AvailabilityApi.md#removeById) | **DELETE** /v2/company/{company_id}/availabilities/{availability_id} | Delete Availability |
| [**updateById**](AvailabilityApi.md#updateById) | **PUT** /v2/company/{company_id}/availabilities/{availability_id} | Update Availability |
| [**updateReasonById**](AvailabilityApi.md#updateReasonById) | **PUT** /v2/company/{company_id}/availability_reasons/{availability_reason_id} | Update Availability Reason |
| [**updateStatus**](AvailabilityApi.md#updateStatus) | **PUT** /v2/company/{company_id}/availabilities/{availability_id}/status | Update Availability Status |


<a name="createNew"></a>
# **createNew**
> AvailabilityCreateNewResponse createNew(companyId, availabilityCreateNewRequest).execute();

Create Availability

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    Integer userId = 56; // User ID
    Boolean repeat = true; // If true, availability is repeating
    Integer mon = 56; // The availability status for the day
    String monFrom = "monFrom_example"; // The start time of the availability for the day
    String monTo = "monTo_example"; // The end time of the availability for the day
    String monComments = "monComments_example"; // Comments included in the days availability
    String monReason = "monReason_example"; // The reason ID for the day
    Integer tue = 56; // The availability status for the day
    String tueFrom = "tueFrom_example"; // The start time of the availability for the day
    String tueTo = "tueTo_example"; // The end time of the availability for the day
    String tueComments = "tueComments_example"; // Comments included in the days availability
    String tueReason = "tueReason_example"; // The reason ID for the day
    Integer wed = 56; // The availability status for the day
    String wedFrom = "wedFrom_example"; // The start time of the availability for the day
    String wedTo = "wedTo_example"; // The end time of the availability for the day
    String wedComments = "wedComments_example"; // Comments included in the days availability
    String wedReason = "wedReason_example"; // The reason ID for the day
    Integer thu = 56; // The availability status for the day
    String thuFrom = "thuFrom_example"; // The start time of the availability for the day
    String thuTo = "thuTo_example"; // The end time of the availability for the day
    String thuComments = "thuComments_example"; // Comments included in the days availability
    String thuReason = "thuReason_example"; // The reason ID for the day
    Integer fri = 56; // The availability status for the day
    String friFrom = "friFrom_example"; // The start time of the availability for the day
    String friTo = "friTo_example"; // The end time of the availability for the day
    String friComments = "friComments_example"; // Comments included in the days availability
    String friReason = "friReason_example"; // The reason ID for the day
    Integer sat = 56; // The availability status for the day
    String satFrom = "satFrom_example"; // The start time of the availability for the day
    String satTo = "satTo_example"; // The end time of the availability for the day
    String satComments = "satComments_example"; // Comments included in the days availability
    String satReason = "satReason_example"; // The reason ID for the day
    Integer sun = 56; // The availability status for the day
    String sunFrom = "sunFrom_example"; // The start time of the availability for the day
    String sunTo = "sunTo_example"; // The end time of the availability for the day
    String sunComments = "sunComments_example"; // Comments included in the days availability
    String sunReason = "sunReason_example"; // The reason ID for the day
    Long companyId = 1234L; // Company ID
    String week = "week_example"; // Week date of the availability
    String weekTo = "weekTo_example"; // Week to date of the availability
    try {
      AvailabilityCreateNewResponse result = client
              .availability
              .createNew(userId, repeat, mon, monFrom, monTo, monComments, monReason, tue, tueFrom, tueTo, tueComments, tueReason, wed, wedFrom, wedTo, wedComments, wedReason, thu, thuFrom, thuTo, thuComments, thuReason, fri, friFrom, friTo, friComments, friReason, sat, satFrom, satTo, satComments, satReason, sun, sunFrom, sunTo, sunComments, sunReason, companyId)
              .week(week)
              .weekTo(weekTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityCreateNewResponse> response = client
              .availability
              .createNew(userId, repeat, mon, monFrom, monTo, monComments, monReason, tue, tueFrom, tueTo, tueComments, tueReason, wed, wedFrom, wedTo, wedComments, wedReason, thu, thuFrom, thuTo, thuComments, thuReason, fri, friFrom, friTo, friComments, friReason, sat, satFrom, satTo, satComments, satReason, sun, sunFrom, sunTo, sunComments, sunReason, companyId)
              .week(week)
              .weekTo(weekTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#createNew");
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
| **availabilityCreateNewRequest** | [**AvailabilityCreateNewRequest**](AvailabilityCreateNewRequest.md)|  | |

### Return type

[**AvailabilityCreateNewResponse**](AvailabilityCreateNewResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Availability created |  -  |

<a name="createReason"></a>
# **createReason**
> AvailabilityCreateReasonResponse createReason(companyId, availabilityCreateReasonRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Availability Reason

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    String reason = "reason_example"; // Availability reason
    Long companyId = 1234L; // Company ID
    Boolean commentsRequired = true; // Comments required
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      AvailabilityCreateReasonResponse result = client
              .availability
              .createReason(reason, companyId)
              .commentsRequired(commentsRequired)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#createReason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityCreateReasonResponse> response = client
              .availability
              .createReason(reason, companyId)
              .commentsRequired(commentsRequired)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#createReason");
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
| **availabilityCreateReasonRequest** | [**AvailabilityCreateReasonRequest**](AvailabilityCreateReasonRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**AvailabilityCreateReasonResponse**](AvailabilityCreateReasonResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deleteReason"></a>
# **deleteReason**
> deleteReason(companyId, availabilityReasonId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Availability Reason

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    Long availabilityReasonId = 1234L; // Availability Reason ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .availability
              .deleteReason(companyId, availabilityReasonId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#deleteReason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .availability
              .deleteReason(companyId, availabilityReasonId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#deleteReason");
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
| **availabilityReasonId** | **Long**| Availability Reason ID | |
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
| **204** | No content. |  -  |

<a name="getById"></a>
# **getById**
> AvailabilityGetByIdResponse getById(companyId, availabilityId).execute();

Retrieve Availability

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    Long availabilityId = 1234L; // Availability ID
    try {
      AvailabilityGetByIdResponse result = client
              .availability
              .getById(companyId, availabilityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityGetByIdResponse> response = client
              .availability
              .getById(companyId, availabilityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#getById");
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
| **availabilityId** | **Long**| Availability ID | |

### Return type

[**AvailabilityGetByIdResponse**](AvailabilityGetByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAvailabilities"></a>
# **listAvailabilities**
> AvailabilityListAvailabilitiesResponse listAvailabilities(companyId).cursor(cursor).limit(limit).locationId(locationId).userId(userId).status(status).repeating(repeating).weekGte(weekGte).weekToIncludeRepeatingGte(weekToIncludeRepeatingGte).orderField(orderField).orderDir(orderDir).execute();

List Availabilities

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 100L; // The number results desired per page.
    Long locationId = 1234L; // Location ID
    Long userId = 1234L; // User ID
    Long status = 56L; // Return availabilities for a specified status (pending = 0, approved = 1, declined = 2).
    Boolean repeating = true; // Return repeating or weekly availabilities.
    String weekGte = "2020-01-01"; // Return availabilities for a specific week.
    String weekToIncludeRepeatingGte = "2020-01-01"; // Return repeating availabilities that end before or on a specified week.
    String orderField = "orderField_example"; // The field that availabilities will be sorted by.
    String orderDir = "orderDir_example"; // The direction that availabilities will be sorted by.
    try {
      AvailabilityListAvailabilitiesResponse result = client
              .availability
              .listAvailabilities(companyId)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .userId(userId)
              .status(status)
              .repeating(repeating)
              .weekGte(weekGte)
              .weekToIncludeRepeatingGte(weekToIncludeRepeatingGte)
              .orderField(orderField)
              .orderDir(orderDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#listAvailabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityListAvailabilitiesResponse> response = client
              .availability
              .listAvailabilities(companyId)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .userId(userId)
              .status(status)
              .repeating(repeating)
              .weekGte(weekGte)
              .weekToIncludeRepeatingGte(weekToIncludeRepeatingGte)
              .orderField(orderField)
              .orderDir(orderDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#listAvailabilities");
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
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number results desired per page. | [optional] [default to 100] |
| **locationId** | **Long**| Location ID | [optional] |
| **userId** | **Long**| User ID | [optional] |
| **status** | **Long**| Return availabilities for a specified status (pending &#x3D; 0, approved &#x3D; 1, declined &#x3D; 2). | [optional] |
| **repeating** | **Boolean**| Return repeating or weekly availabilities. | [optional] |
| **weekGte** | **String**| Return availabilities for a specific week. | [optional] |
| **weekToIncludeRepeatingGte** | **String**| Return repeating availabilities that end before or on a specified week. | [optional] |
| **orderField** | **String**| The field that availabilities will be sorted by. | [optional] |
| **orderDir** | **String**| The direction that availabilities will be sorted by. | [optional] |

### Return type

[**AvailabilityListAvailabilitiesResponse**](AvailabilityListAvailabilitiesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listReasons"></a>
# **listReasons**
> AvailabilityListReasonsResponse listReasons(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).cursor(cursor).limit(limit).execute();

List Availability Reasons

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 100L; // The number results desired per page.
    try {
      AvailabilityListReasonsResponse result = client
              .availability
              .listReasons(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#listReasons");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityListReasonsResponse> response = client
              .availability
              .listReasons(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#listReasons");
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
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number results desired per page. | [optional] [default to 100] |

### Return type

[**AvailabilityListReasonsResponse**](AvailabilityListReasonsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(companyId, availabilityId).execute();

Delete Availability

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    Long availabilityId = 1234L; // Availability ID
    try {
      client
              .availability
              .removeById(companyId, availabilityId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .availability
              .removeById(companyId, availabilityId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#removeById");
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
| **availabilityId** | **Long**| Availability ID | |

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

<a name="updateById"></a>
# **updateById**
> AvailabilityUpdateByIdResponse updateById(companyId, availabilityId, availabilityUpdateByIdRequest).execute();

Update Availability

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    Long availabilityId = 1234L; // Availability ID
    String week = "week_example"; // Week date of the availability
    String weekTo = "weekTo_example"; // Week to date of the availability
    Boolean repeat = true; // If true, availability is repeating
    Integer mon = 56; // The availability status for the day
    String monFrom = "monFrom_example"; // The start time of the availability for the day
    String monTo = "monTo_example"; // The end time of the availability for the day
    String monComments = "monComments_example"; // Comments included in the days availability
    String monReason = "monReason_example"; // The reason ID for the day
    Integer tue = 56; // The availability status for the day
    String tueFrom = "tueFrom_example"; // The start time of the availability for the day
    String tueTo = "tueTo_example"; // The end time of the availability for the day
    String tueComments = "tueComments_example"; // Comments included in the days availability
    String tueReason = "tueReason_example"; // The reason ID for the day
    Integer wed = 56; // The availability status for the day
    String wedFrom = "wedFrom_example"; // The start time of the availability for the day
    String wedTo = "wedTo_example"; // The end time of the availability for the day
    String wedComments = "wedComments_example"; // Comments included in the days availability
    String wedReason = "wedReason_example"; // The reason ID for the day
    Integer thu = 56; // The availability status for the day
    String thuFrom = "thuFrom_example"; // The start time of the availability for the day
    String thuTo = "thuTo_example"; // The end time of the availability for the day
    String thuComments = "thuComments_example"; // Comments included in the days availability
    String thuReason = "thuReason_example"; // The reason ID for the day
    Integer fri = 56; // The availability status for the day
    String friFrom = "friFrom_example"; // The start time of the availability for the day
    String friTo = "friTo_example"; // The end time of the availability for the day
    String friComments = "friComments_example"; // Comments included in the days availability
    String friReason = "friReason_example"; // The reason ID for the day
    Integer sat = 56; // The availability status for the day
    String satFrom = "satFrom_example"; // The start time of the availability for the day
    String satTo = "satTo_example"; // The end time of the availability for the day
    String satComments = "satComments_example"; // Comments included in the days availability
    String satReason = "satReason_example"; // The reason ID for the day
    Integer sun = 56; // The availability status for the day
    String sunFrom = "sunFrom_example"; // The start time of the availability for the day
    String sunTo = "sunTo_example"; // The end time of the availability for the day
    String sunComments = "sunComments_example"; // Comments included in the days availability
    String sunReason = "sunReason_example"; // The reason ID for the day
    try {
      AvailabilityUpdateByIdResponse result = client
              .availability
              .updateById(companyId, availabilityId)
              .week(week)
              .weekTo(weekTo)
              .repeat(repeat)
              .mon(mon)
              .monFrom(monFrom)
              .monTo(monTo)
              .monComments(monComments)
              .monReason(monReason)
              .tue(tue)
              .tueFrom(tueFrom)
              .tueTo(tueTo)
              .tueComments(tueComments)
              .tueReason(tueReason)
              .wed(wed)
              .wedFrom(wedFrom)
              .wedTo(wedTo)
              .wedComments(wedComments)
              .wedReason(wedReason)
              .thu(thu)
              .thuFrom(thuFrom)
              .thuTo(thuTo)
              .thuComments(thuComments)
              .thuReason(thuReason)
              .fri(fri)
              .friFrom(friFrom)
              .friTo(friTo)
              .friComments(friComments)
              .friReason(friReason)
              .sat(sat)
              .satFrom(satFrom)
              .satTo(satTo)
              .satComments(satComments)
              .satReason(satReason)
              .sun(sun)
              .sunFrom(sunFrom)
              .sunTo(sunTo)
              .sunComments(sunComments)
              .sunReason(sunReason)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityUpdateByIdResponse> response = client
              .availability
              .updateById(companyId, availabilityId)
              .week(week)
              .weekTo(weekTo)
              .repeat(repeat)
              .mon(mon)
              .monFrom(monFrom)
              .monTo(monTo)
              .monComments(monComments)
              .monReason(monReason)
              .tue(tue)
              .tueFrom(tueFrom)
              .tueTo(tueTo)
              .tueComments(tueComments)
              .tueReason(tueReason)
              .wed(wed)
              .wedFrom(wedFrom)
              .wedTo(wedTo)
              .wedComments(wedComments)
              .wedReason(wedReason)
              .thu(thu)
              .thuFrom(thuFrom)
              .thuTo(thuTo)
              .thuComments(thuComments)
              .thuReason(thuReason)
              .fri(fri)
              .friFrom(friFrom)
              .friTo(friTo)
              .friComments(friComments)
              .friReason(friReason)
              .sat(sat)
              .satFrom(satFrom)
              .satTo(satTo)
              .satComments(satComments)
              .satReason(satReason)
              .sun(sun)
              .sunFrom(sunFrom)
              .sunTo(sunTo)
              .sunComments(sunComments)
              .sunReason(sunReason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateById");
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
| **availabilityId** | **Long**| Availability ID | |
| **availabilityUpdateByIdRequest** | [**AvailabilityUpdateByIdRequest**](AvailabilityUpdateByIdRequest.md)|  | |

### Return type

[**AvailabilityUpdateByIdResponse**](AvailabilityUpdateByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="updateReasonById"></a>
# **updateReasonById**
> AvailabilityUpdateReasonByIdResponse updateReasonById(companyId, availabilityReasonId, availabilityUpdateReasonByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Availability Reason

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    String reason = "reason_example"; // Availability reason
    Long companyId = 1234L; // Company ID
    Long availabilityReasonId = 1234L; // Availability Reason ID
    Boolean commentsRequired = true; // Comments required
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      AvailabilityUpdateReasonByIdResponse result = client
              .availability
              .updateReasonById(reason, companyId, availabilityReasonId)
              .commentsRequired(commentsRequired)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateReasonById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailabilityUpdateReasonByIdResponse> response = client
              .availability
              .updateReasonById(reason, companyId, availabilityReasonId)
              .commentsRequired(commentsRequired)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateReasonById");
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
| **availabilityReasonId** | **Long**| Availability Reason ID | |
| **availabilityUpdateReasonByIdRequest** | [**AvailabilityUpdateReasonByIdRequest**](AvailabilityUpdateReasonByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**AvailabilityUpdateReasonByIdResponse**](AvailabilityUpdateReasonByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateStatus"></a>
# **updateStatus**
> updateStatus(companyId, availabilityId).availabilityUpdateStatusRequest(availabilityUpdateStatusRequest).execute();

Update Availability Status

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvailabilityApi;
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
    String status = "approved";
    Long companyId = 1234L; // Company ID
    Long availabilityId = 1234L; // Availability ID
    String message = "message_example";
    try {
      client
              .availability
              .updateStatus(status, companyId, availabilityId)
              .message(message)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .availability
              .updateStatus(status, companyId, availabilityId)
              .message(message)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvailabilityApi#updateStatus");
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
| **availabilityId** | **Long**| Availability ID | |
| **availabilityUpdateStatusRequest** | [**AvailabilityUpdateStatusRequest**](AvailabilityUpdateStatusRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

