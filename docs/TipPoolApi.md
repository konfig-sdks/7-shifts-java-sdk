# TipPoolApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailedReport**](TipPoolApi.md#getDetailedReport) | **GET** /v2/company/{company_id}/locations/{location_id}/tip_pool_detailed_report | Retreive Tip Pool Detailed Report |
| [**getManualEntryTips**](TipPoolApi.md#getManualEntryTips) | **GET** /v2/company/{company_id}/tip_pool/{tip_pool_settings_uuid}/manual_entry | Grabs manual entry tips for a tip pool |
| [**getSettings**](TipPoolApi.md#getSettings) | **GET** /v2/company/{company_id}/tip_pool_settings | Gets tip pool settings for a company |
| [**getSummaryReport**](TipPoolApi.md#getSummaryReport) | **GET** /v2/company/{company_id}/locations/{location_id}/tip_pool_summary_report | Retreive Tip Pool Summary Report |
| [**saveManualEntry**](TipPoolApi.md#saveManualEntry) | **PUT** /v2/company/{company_id}/tip_pool/{tip_pool_settings_uuid}/manual_entry | Saves manual entries for a tip pool |


<a name="getDetailedReport"></a>
# **getDetailedReport**
> TipPoolGetDetailedReportResponse getDetailedReport(companyId, locationId, startDate, endDate).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).tipPoolUuid(tipPoolUuid).dayPartUuid(dayPartUuid).execute();

Retreive Tip Pool Detailed Report

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TipPoolApi;
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
    String startDate = "2020-12-25"; // The start date in YYYY-MM-DD format
    String endDate = "2020-12-25"; // The end date in YYYY-MM-DD format
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    UUID tipPoolUuid = UUID.randomUUID(); // The tip pool UUID, when omitted the report will return all tip pools
    UUID dayPartUuid = UUID.randomUUID(); // Daypart UUID, when omitted the report will return all dayparts
    try {
      TipPoolGetDetailedReportResponse result = client
              .tipPool
              .getDetailedReport(companyId, locationId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .tipPoolUuid(tipPoolUuid)
              .dayPartUuid(dayPartUuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getDetailedReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TipPoolGetDetailedReportResponse> response = client
              .tipPool
              .getDetailedReport(companyId, locationId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .tipPoolUuid(tipPoolUuid)
              .dayPartUuid(dayPartUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getDetailedReport");
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
| **startDate** | **String**| The start date in YYYY-MM-DD format | |
| **endDate** | **String**| The end date in YYYY-MM-DD format | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **tipPoolUuid** | **UUID**| The tip pool UUID, when omitted the report will return all tip pools | [optional] |
| **dayPartUuid** | **UUID**| Daypart UUID, when omitted the report will return all dayparts | [optional] |

### Return type

[**TipPoolGetDetailedReportResponse**](TipPoolGetDetailedReportResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getManualEntryTips"></a>
# **getManualEntryTips**
> TipPoolGetManualEntryTipsResponse getManualEntryTips(companyId, tipPoolSettingsUuid, startDate, endDate).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Grabs manual entry tips for a tip pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TipPoolApi;
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
    Integer companyId = 384; // The company ID for the target tip pool settings
    UUID tipPoolSettingsUuid = UUID.randomUUID(); // The tip pool settings uuid
    LocalDate startDate = LocalDate.now(); // The start date of the manual entry query range
    LocalDate endDate = LocalDate.now(); // The end date of the manual entry query range
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TipPoolGetManualEntryTipsResponse result = client
              .tipPool
              .getManualEntryTips(companyId, tipPoolSettingsUuid, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getManualEntryTips");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TipPoolGetManualEntryTipsResponse> response = client
              .tipPool
              .getManualEntryTips(companyId, tipPoolSettingsUuid, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getManualEntryTips");
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
| **companyId** | **Integer**| The company ID for the target tip pool settings | |
| **tipPoolSettingsUuid** | **UUID**| The tip pool settings uuid | |
| **startDate** | **LocalDate**| The start date of the manual entry query range | |
| **endDate** | **LocalDate**| The end date of the manual entry query range | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TipPoolGetManualEntryTipsResponse**](TipPoolGetManualEntryTipsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Manual tip entry data |  -  |

<a name="getSettings"></a>
# **getSettings**
> TipPoolGetSettingsResponse getSettings(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Gets tip pool settings for a company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TipPoolApi;
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
      TipPoolGetSettingsResponse result = client
              .tipPool
              .getSettings(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TipPoolGetSettingsResponse> response = client
              .tipPool
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
      System.err.println("Exception when calling TipPoolApi#getSettings");
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

[**TipPoolGetSettingsResponse**](TipPoolGetSettingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tip pool settings for a company |  -  |

<a name="getSummaryReport"></a>
# **getSummaryReport**
> TipPoolGetSummaryReportResponse getSummaryReport(companyId, locationId, startDate, endDate).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).tipPoolUuid(tipPoolUuid).dayPartUuid(dayPartUuid).execute();

Retreive Tip Pool Summary Report

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TipPoolApi;
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
    String startDate = "2020-12-25"; // The start date in YYYY-MM-DD format
    String endDate = "2020-12-25"; // The end date in YYYY-MM-DD format
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    UUID tipPoolUuid = UUID.randomUUID(); // The tip pool UUID, when omitted the report will return all tip pools
    UUID dayPartUuid = UUID.randomUUID(); // Daypart UUID, when omitted the report will return all dayparts
    try {
      TipPoolGetSummaryReportResponse result = client
              .tipPool
              .getSummaryReport(companyId, locationId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .tipPoolUuid(tipPoolUuid)
              .dayPartUuid(dayPartUuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getSummaryReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TipPoolGetSummaryReportResponse> response = client
              .tipPool
              .getSummaryReport(companyId, locationId, startDate, endDate)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .tipPoolUuid(tipPoolUuid)
              .dayPartUuid(dayPartUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#getSummaryReport");
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
| **startDate** | **String**| The start date in YYYY-MM-DD format | |
| **endDate** | **String**| The end date in YYYY-MM-DD format | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **tipPoolUuid** | **UUID**| The tip pool UUID, when omitted the report will return all tip pools | [optional] |
| **dayPartUuid** | **UUID**| Daypart UUID, when omitted the report will return all dayparts | [optional] |

### Return type

[**TipPoolGetSummaryReportResponse**](TipPoolGetSummaryReportResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="saveManualEntry"></a>
# **saveManualEntry**
> TipPoolSaveManualEntryResponse saveManualEntry(companyId, tipPoolSettingsUuid, tipPoolSaveManualEntryRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Saves manual entries for a tip pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TipPoolApi;
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
    List<TipPoolSaveManualEntryRequestDataInner> data = Arrays.asList();
    Integer companyId = 384; // The company ID for the target tip pool settings
    UUID tipPoolSettingsUuid = UUID.randomUUID(); // The tip pool settings uuid
    String _object = "manual_tip_pooling";
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TipPoolSaveManualEntryResponse result = client
              .tipPool
              .saveManualEntry(data, companyId, tipPoolSettingsUuid)
              ._object(_object)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#saveManualEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TipPoolSaveManualEntryResponse> response = client
              .tipPool
              .saveManualEntry(data, companyId, tipPoolSettingsUuid)
              ._object(_object)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TipPoolApi#saveManualEntry");
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
| **companyId** | **Integer**| The company ID for the target tip pool settings | |
| **tipPoolSettingsUuid** | **UUID**| The tip pool settings uuid | |
| **tipPoolSaveManualEntryRequest** | [**TipPoolSaveManualEntryRequest**](TipPoolSaveManualEntryRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TipPoolSaveManualEntryResponse**](TipPoolSaveManualEntryResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

