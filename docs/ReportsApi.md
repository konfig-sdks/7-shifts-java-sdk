# ReportsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDailySalesAndLabor**](ReportsApi.md#getDailySalesAndLabor) | **GET** /v2/reports/daily_sales_and_labor | Retrieve Daily Sales &amp; Labor |
| [**getDailyStats**](ReportsApi.md#getDailyStats) | **GET** /api/v2/company/{company_id}/location/{location_id}/daily_stats | Retrieve Daily Stats |
| [**getWorkedHoursWages**](ReportsApi.md#getWorkedHoursWages) | **GET** /v2/reports/hours_and_wages | Retrieve Worked Hours &amp; Wages |


<a name="getDailySalesAndLabor"></a>
# **getDailySalesAndLabor**
> ReportsGetDailySalesAndLaborResponse getDailySalesAndLabor(startDate, endDate, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).departmentId(departmentId).execute();

Retrieve Daily Sales &amp; Labor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    String startDate = "2019-12-01"; // Starting date for which you want the daily sales and labor data for.
    String endDate = "2019-12-01"; // Ending date for which you want the daily sales and labor data for.
    Long locationId = 1234L; // Location ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long departmentId = 1234L; // Department ID
    try {
      ReportsGetDailySalesAndLaborResponse result = client
              .reports
              .getDailySalesAndLabor(startDate, endDate, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .departmentId(departmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailySalesAndLabor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetDailySalesAndLaborResponse> response = client
              .reports
              .getDailySalesAndLabor(startDate, endDate, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .departmentId(departmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailySalesAndLabor");
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
| **startDate** | **String**| Starting date for which you want the daily sales and labor data for. | |
| **endDate** | **String**| Ending date for which you want the daily sales and labor data for. | |
| **locationId** | **Long**| Location ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **departmentId** | **Long**| Department ID | [optional] |

### Return type

[**ReportsGetDailySalesAndLaborResponse**](ReportsGetDailySalesAndLaborResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDailyStats"></a>
# **getDailyStats**
> ReportsGetDailyStatsResponse getDailyStats(companyId, locationId, date).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).departmentId(departmentId).includeFuture(includeFuture).execute();

Retrieve Daily Stats

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    Long locationId = 56L; // Location ID
    LocalDate date = LocalDate.now(); // Date
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long departmentId = 56L; // Department ID
    Boolean includeFuture = true; // include future
    try {
      ReportsGetDailyStatsResponse result = client
              .reports
              .getDailyStats(companyId, locationId, date)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .departmentId(departmentId)
              .includeFuture(includeFuture)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailyStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetDailyStatsResponse> response = client
              .reports
              .getDailyStats(companyId, locationId, date)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .departmentId(departmentId)
              .includeFuture(includeFuture)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailyStats");
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
| **date** | **LocalDate**| Date | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **departmentId** | **Long**| Department ID | [optional] |
| **includeFuture** | **Boolean**| include future | [optional] |

### Return type

[**ReportsGetDailyStatsResponse**](ReportsGetDailyStatsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getWorkedHoursWages"></a>
# **getWorkedHoursWages**
> ReportsGetWorkedHoursWagesResponse getWorkedHoursWages(punches, companyId, from, to).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).departmentId(departmentId).roleId(roleId).userId(userId).execute();

Retrieve Worked Hours &amp; Wages

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    Boolean punches = true; // Whether or not to use the punch labour source
    Long companyId = 56L; // The company id to pull the report for.
    String from = "2019-12-01"; // Starting date for which you want the report to start.
    String to = "2019-12-01"; // Ending date for which you want the report to end.
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 1234L; // The location id for which you want the report for.
    Long departmentId = 1234L; // The department id for the report.
    Long roleId = 1234L; // The role id for the report
    Long userId = 1234L; // The user id the report should be fetched for - internal use only
    try {
      ReportsGetWorkedHoursWagesResponse result = client
              .reports
              .getWorkedHoursWages(punches, companyId, from, to)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getShowExceptionCosts());
      System.out.println(result.getTipTrackingEnabled());
      System.out.println(result.getShowTips());
      System.out.println(result.getTotal());
      System.out.println(result.getStart());
      System.out.println(result.getEnd());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWorkedHoursWages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetWorkedHoursWagesResponse> response = client
              .reports
              .getWorkedHoursWages(punches, companyId, from, to)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWorkedHoursWages");
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
| **punches** | **Boolean**| Whether or not to use the punch labour source | |
| **companyId** | **Long**| The company id to pull the report for. | |
| **from** | **String**| Starting date for which you want the report to start. | |
| **to** | **String**| Ending date for which you want the report to end. | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| The location id for which you want the report for. | [optional] |
| **departmentId** | **Long**| The department id for the report. | [optional] |
| **roleId** | **Long**| The role id for the report | [optional] |
| **userId** | **Long**| The user id the report should be fetched for - internal use only | [optional] |

### Return type

[**ReportsGetWorkedHoursWagesResponse**](ReportsGetWorkedHoursWagesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

