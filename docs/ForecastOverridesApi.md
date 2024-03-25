# ForecastOverridesApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkCreateProjectedForecastOverride**](ForecastOverridesApi.md#bulkCreateProjectedForecastOverride) | **POST** /v2/company/{company_id}/location/{location_id}/forecast_overrides | Create Bulk Daily Projected Forecast Overrides |
| [**bulkCreateProjectedSalesIntervalOverride**](ForecastOverridesApi.md#bulkCreateProjectedSalesIntervalOverride) | **POST** /v2/company/{company_id}/locations/{location_id}/forecast_overrides_intervals | Create Bulk Daily Projected Forecast Overrides |
| [**createDailyProjectedForecastOverride**](ForecastOverridesApi.md#createDailyProjectedForecastOverride) | **POST** /v2/company/{company_id}/location/{location_id}/forecast_override | Create Daily Projected Forecast Override |
| [**overrideInterval**](ForecastOverridesApi.md#overrideInterval) | **POST** /v2/company/{company_id}/locations/{location_id}/forecast_override_interval | Create Interval Projected Forecast Override |
| [**syncProjectedForecastOverride**](ForecastOverridesApi.md#syncProjectedForecastOverride) | **DELETE** /v2/company/{company_id}/location/{location_id}/forecast_override | Sync Daily Projected Forecast Override |
| [**syncProjectedSalesInterval**](ForecastOverridesApi.md#syncProjectedSalesInterval) | **DELETE** /v2/company/{company_id}/locations/{location_id}/forecast_override_interval | Sync Interval Projected Forecast Override |


<a name="bulkCreateProjectedForecastOverride"></a>
# **bulkCreateProjectedForecastOverride**
> ForecastOverridesBulkCreateProjectedForecastOverrideResponse bulkCreateProjectedForecastOverride(companyId, locationId, forecastOverridesBulkCreateProjectedForecastOverrideRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Bulk Daily Projected Forecast Overrides

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    List<ForecastOverridesBulkCreateProjectedForecastOverrideRequestDataInner> data = Arrays.asList();
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ForecastOverridesBulkCreateProjectedForecastOverrideResponse result = client
              .forecastOverrides
              .bulkCreateProjectedForecastOverride(data, companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#bulkCreateProjectedForecastOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ForecastOverridesBulkCreateProjectedForecastOverrideResponse> response = client
              .forecastOverrides
              .bulkCreateProjectedForecastOverride(data, companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#bulkCreateProjectedForecastOverride");
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
| **locationId** | **Long**| Location ID | |
| **forecastOverridesBulkCreateProjectedForecastOverrideRequest** | [**ForecastOverridesBulkCreateProjectedForecastOverrideRequest**](ForecastOverridesBulkCreateProjectedForecastOverrideRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ForecastOverridesBulkCreateProjectedForecastOverrideResponse**](ForecastOverridesBulkCreateProjectedForecastOverrideResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkCreateProjectedSalesIntervalOverride"></a>
# **bulkCreateProjectedSalesIntervalOverride**
> bulkCreateProjectedSalesIntervalOverride(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).forecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner(forecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner).execute();

Create Bulk Daily Projected Forecast Overrides

Overrides many project sales intervals of 15 minutes or 1 hour. (In Development)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .forecastOverrides
              .bulkCreateProjectedSalesIntervalOverride(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#bulkCreateProjectedSalesIntervalOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .forecastOverrides
              .bulkCreateProjectedSalesIntervalOverride(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#bulkCreateProjectedSalesIntervalOverride");
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
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **forecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner** | [**List&lt;ForecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner&gt;**](ForecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner.md)|  | [optional] |

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

<a name="createDailyProjectedForecastOverride"></a>
# **createDailyProjectedForecastOverride**
> ForecastOverridesCreateDailyProjectedForecastOverrideResponse createDailyProjectedForecastOverride(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).forecastOverridesCreateDailyProjectedForecastOverrideRequest(forecastOverridesCreateDailyProjectedForecastOverrideRequest).execute();

Create Daily Projected Forecast Override

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    LocalDate date = LocalDate.now(); // The date of the daily report data to override. Format YYYY-MM-DD
    Long value = 56L; // Override value. Currency values in cents
    String reportType = "sales"; // Type of value to override. Default is sales
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    Integer departmentId = 56; // Department ID. Optional
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ForecastOverridesCreateDailyProjectedForecastOverrideResponse result = client
              .forecastOverrides
              .createDailyProjectedForecastOverride(date, value, reportType, companyId, locationId)
              .departmentId(departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#createDailyProjectedForecastOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ForecastOverridesCreateDailyProjectedForecastOverrideResponse> response = client
              .forecastOverrides
              .createDailyProjectedForecastOverride(date, value, reportType, companyId, locationId)
              .departmentId(departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#createDailyProjectedForecastOverride");
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
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **forecastOverridesCreateDailyProjectedForecastOverrideRequest** | [**ForecastOverridesCreateDailyProjectedForecastOverrideRequest**](ForecastOverridesCreateDailyProjectedForecastOverrideRequest.md)|  | [optional] |

### Return type

[**ForecastOverridesCreateDailyProjectedForecastOverrideResponse**](ForecastOverridesCreateDailyProjectedForecastOverrideResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="overrideInterval"></a>
# **overrideInterval**
> overrideInterval(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).forecastOverridesOverrideIntervalRequest(forecastOverridesOverrideIntervalRequest).execute();

Create Interval Projected Forecast Override

Overrides the project sales interval of 15 minutes or 1 hour.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    OffsetDateTime start = OffsetDateTime.now(); // Starting date/time (UTC) of the interval for which you wish to update the sales projection.
    OffsetDateTime end = OffsetDateTime.now(); // Ending date/time (UTC) of the interval for which you wish to update the sales projection.
    Long value = 56L; // Override value. Currency value in cents. Only whole dollars are accepted.
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    Integer departmentId = 56; // Department ID
    String reportType = "sales"; // Type of value to override. Default is sales
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .forecastOverrides
              .overrideInterval(start, end, value, companyId, locationId)
              .departmentId(departmentId)
              .reportType(reportType)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#overrideInterval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .forecastOverrides
              .overrideInterval(start, end, value, companyId, locationId)
              .departmentId(departmentId)
              .reportType(reportType)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#overrideInterval");
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
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **forecastOverridesOverrideIntervalRequest** | [**ForecastOverridesOverrideIntervalRequest**](ForecastOverridesOverrideIntervalRequest.md)|  | [optional] |

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

<a name="syncProjectedForecastOverride"></a>
# **syncProjectedForecastOverride**
> syncProjectedForecastOverride(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).forecastOverridesSyncProjectedForecastOverrideRequest(forecastOverridesSyncProjectedForecastOverrideRequest).execute();

Sync Daily Projected Forecast Override

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    LocalDate startDate = LocalDate.now(); // The start date of the date range of override data to remove. Override data will be removed from only this date if no end date is provided. Format YYYY-MM-DD
    String reportType = "sales"; // Type of override data to remove
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    LocalDate endDate = LocalDate.now(); // The ending date of a date range of override data to remove. Optional. Format YYYY-MM-DD
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .forecastOverrides
              .syncProjectedForecastOverride(startDate, reportType, companyId, locationId)
              .endDate(endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#syncProjectedForecastOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .forecastOverrides
              .syncProjectedForecastOverride(startDate, reportType, companyId, locationId)
              .endDate(endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#syncProjectedForecastOverride");
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
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **forecastOverridesSyncProjectedForecastOverrideRequest** | [**ForecastOverridesSyncProjectedForecastOverrideRequest**](ForecastOverridesSyncProjectedForecastOverrideRequest.md)|  | [optional] |

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

<a name="syncProjectedSalesInterval"></a>
# **syncProjectedSalesInterval**
> syncProjectedSalesInterval(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).forecastOverridesSyncProjectedSalesIntervalRequest(forecastOverridesSyncProjectedSalesIntervalRequest).execute();

Sync Interval Projected Forecast Override

Syncs the overridden project sales interval of 15 minutes or 1 hour.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ForecastOverridesApi;
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
    OffsetDateTime start = OffsetDateTime.now(); // Starting date/time (UTC) of the interval for which you wish to update the sales projection.
    OffsetDateTime end = OffsetDateTime.now(); // Ending date/time (UTC) of the interval for which you wish to update the sales projection.
    Long companyId = 56L; // Company ID
    Long locationId = 56L; // Location ID
    String reportType = "sales"; // Type of value to override. Default is sales
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .forecastOverrides
              .syncProjectedSalesInterval(start, end, companyId, locationId)
              .reportType(reportType)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#syncProjectedSalesInterval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .forecastOverrides
              .syncProjectedSalesInterval(start, end, companyId, locationId)
              .reportType(reportType)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ForecastOverridesApi#syncProjectedSalesInterval");
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
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **forecastOverridesSyncProjectedSalesIntervalRequest** | [**ForecastOverridesSyncProjectedSalesIntervalRequest**](ForecastOverridesSyncProjectedSalesIntervalRequest.md)|  | [optional] |

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

