# LocationsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](LocationsApi.md#create) | **POST** /v2/company/{company_id}/locations | Create Location |
| [**getLocation**](LocationsApi.md#getLocation) | **GET** /v2/company/{company_id}/locations/{location_id} | Retrieve Location |
| [**listGet**](LocationsApi.md#listGet) | **GET** /v2/company/{company_id}/locations | List Locations |
| [**removeLocationById**](LocationsApi.md#removeLocationById) | **DELETE** /v2/company/{company_id}/locations/{location_id} | Delete Location |
| [**updateLocationById**](LocationsApi.md#updateLocationById) | **PUT** /v2/company/{company_id}/locations/{location_id} | Update Location |


<a name="create"></a>
# **create**
> LocationsCreateResponse create(companyId, locationsCreateRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocationsApi;
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
    String name = "name_example"; // Location name
    String country = "country_example"; // Country two letter abbreviation
    Long companyId = 1234L; // Company ID
    String formattedAddress = "formattedAddress_example"; // Full address
    String state = "state_example"; // State or province
    String city = "city_example"; // City
    String latitude = "latitude_example"; // locations latitude coordinates
    String longitude = "longitude_example"; // locations longitude coordinates
    String placeId = "placeId_example"; // Google Places location Id
    String timezone = "timezone_example"; // Timezone. Valid zone info name
    Boolean holidayPay = true; // When true, holiday pay is enabled
    String sunHoursClose = "00:00:00"; // Sunday closing time
    String monHoursClose = "00:00:00"; // Monday closing time
    String tueHoursClose = "00:00:00"; // Tuesday closing time
    String wedHoursClose = "00:00:00"; // Wednesday closing time
    String thuHoursClose = "00:00:00"; // Thursday closing time
    String friHoursClose = "00:00:00"; // Friday closing time
    String satHoursClose = "00:00:00"; // Saturday closing time
    String sunHoursOpen = "07:00:00"; // Sunday opening time
    String monHoursOpen = "07:00:00"; // Monday opening time
    String tueHoursOpen = "07:00:00"; // Tuesday opening time
    String wedHoursOpen = "07:00:00"; // Wednesday opening time
    String thuHoursOpen = "07:00:00"; // Thursday opening time
    String friHoursOpen = "07:00:00"; // Friday opening time
    String satHoursOpen = "07:00:00"; // Saturday opening time
    Boolean sunIsClosed = true; // If true, location is closed on Sunday
    Boolean monIsClosed = true; // If true, location is closed on Monday
    Boolean tueIsClosed = true; // If true, location is closed on Tuesday
    Boolean wedIsClosed = true; // If true, location is closed on Wednesday
    Boolean thuIsClosed = true; // If true, location is closed on Thursday
    Boolean friIsClosed = true; // If true, location is closed on Friday
    Boolean satIsClosed = true; // If true, location is closed on Saturday
    Boolean enableShiftFeedback = true; // If true end of shift feedback requests are enabled
    Boolean shiftFeedback = true; // If true end of shift feedback requests are enabled
    String coupon = "coupon_example"; // Optional coupon to apply to this location's billing
    String stripeTokenId = "stripeTokenId_example"; // Optional stripe payment token. If this is not provided, the account's default payment information will be used.
    Integer copyFromId = 56; // Optional existing location id whose department and role structure the new location should copy
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      LocationsCreateResponse result = client
              .locations
              .create(name, country, companyId)
              .formattedAddress(formattedAddress)
              .state(state)
              .city(city)
              .latitude(latitude)
              .longitude(longitude)
              .placeId(placeId)
              .timezone(timezone)
              .holidayPay(holidayPay)
              .sunHoursClose(sunHoursClose)
              .monHoursClose(monHoursClose)
              .tueHoursClose(tueHoursClose)
              .wedHoursClose(wedHoursClose)
              .thuHoursClose(thuHoursClose)
              .friHoursClose(friHoursClose)
              .satHoursClose(satHoursClose)
              .sunHoursOpen(sunHoursOpen)
              .monHoursOpen(monHoursOpen)
              .tueHoursOpen(tueHoursOpen)
              .wedHoursOpen(wedHoursOpen)
              .thuHoursOpen(thuHoursOpen)
              .friHoursOpen(friHoursOpen)
              .satHoursOpen(satHoursOpen)
              .sunIsClosed(sunIsClosed)
              .monIsClosed(monIsClosed)
              .tueIsClosed(tueIsClosed)
              .wedIsClosed(wedIsClosed)
              .thuIsClosed(thuIsClosed)
              .friIsClosed(friIsClosed)
              .satIsClosed(satIsClosed)
              .enableShiftFeedback(enableShiftFeedback)
              .shiftFeedback(shiftFeedback)
              .coupon(coupon)
              .stripeTokenId(stripeTokenId)
              .copyFromId(copyFromId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationsCreateResponse> response = client
              .locations
              .create(name, country, companyId)
              .formattedAddress(formattedAddress)
              .state(state)
              .city(city)
              .latitude(latitude)
              .longitude(longitude)
              .placeId(placeId)
              .timezone(timezone)
              .holidayPay(holidayPay)
              .sunHoursClose(sunHoursClose)
              .monHoursClose(monHoursClose)
              .tueHoursClose(tueHoursClose)
              .wedHoursClose(wedHoursClose)
              .thuHoursClose(thuHoursClose)
              .friHoursClose(friHoursClose)
              .satHoursClose(satHoursClose)
              .sunHoursOpen(sunHoursOpen)
              .monHoursOpen(monHoursOpen)
              .tueHoursOpen(tueHoursOpen)
              .wedHoursOpen(wedHoursOpen)
              .thuHoursOpen(thuHoursOpen)
              .friHoursOpen(friHoursOpen)
              .satHoursOpen(satHoursOpen)
              .sunIsClosed(sunIsClosed)
              .monIsClosed(monIsClosed)
              .tueIsClosed(tueIsClosed)
              .wedIsClosed(wedIsClosed)
              .thuIsClosed(thuIsClosed)
              .friIsClosed(friIsClosed)
              .satIsClosed(satIsClosed)
              .enableShiftFeedback(enableShiftFeedback)
              .shiftFeedback(shiftFeedback)
              .coupon(coupon)
              .stripeTokenId(stripeTokenId)
              .copyFromId(copyFromId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#create");
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
| **locationsCreateRequest** | [**LocationsCreateRequest**](LocationsCreateRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**LocationsCreateResponse**](LocationsCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="getLocation"></a>
# **getLocation**
> LocationsGetLocationResponse getLocation(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocationsApi;
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
    Long locationId = 1234L; // Location ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      LocationsGetLocationResponse result = client
              .locations
              .getLocation(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationsGetLocationResponse> response = client
              .locations
              .getLocation(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#getLocation");
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

### Return type

[**LocationsGetLocationResponse**](LocationsGetLocationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listGet"></a>
# **listGet**
> LocationsListGetResponse listGet(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).modifiedSince(modifiedSince).deleted(deleted).cursor(cursor).limit(limit).execute();

List Locations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocationsApi;
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
    String modifiedSince = "2020-01-01"; // Return locations that have been modified since the specified date. Format YYYY-MM-DD
    Boolean deleted = false; // When TRUE the search will return deleted locations
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 100L; // The number of results desired per page.
    try {
      LocationsListGetResponse result = client
              .locations
              .listGet(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .deleted(deleted)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#listGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationsListGetResponse> response = client
              .locations
              .listGet(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .deleted(deleted)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#listGet");
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
| **modifiedSince** | **String**| Return locations that have been modified since the specified date. Format YYYY-MM-DD | [optional] |
| **deleted** | **Boolean**| When TRUE the search will return deleted locations | [optional] [default to false] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] [default to 100] |

### Return type

[**LocationsListGetResponse**](LocationsListGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeLocationById"></a>
# **removeLocationById**
> removeLocationById(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocationsApi;
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
    Long locationId = 1234L; // Location ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .locations
              .removeLocationById(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#removeLocationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .locations
              .removeLocationById(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#removeLocationById");
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

<a name="updateLocationById"></a>
# **updateLocationById**
> LocationsUpdateLocationByIdResponse updateLocationById(companyId, locationId, locationsUpdateLocationByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocationsApi;
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
    Long locationId = 1234L; // Location ID
    String name = "name_example"; // Location name
    String city = "city_example"; // City
    String country = "country_example"; // Country
    String state = "state_example"; // State or province
    Boolean shiftFeedback = false; // If true end of shift feedback requests are enabled
    String formattedAddress = "formattedAddress_example";
    Double lat = 3.4D;
    Double lng = 3.4D;
    String placeId = "placeId_example";
    String timezone = "timezone_example"; // Timezone. Valid zone info name
    String hash = "hash_example";
    Boolean departmentBasedBudget = true;
    Boolean holidayPay = true; // When true, holiday pay is enabled
    String autoSendLogBookTime = "autoSendLogBookTime_example"; // A timestamp with hh:mm:ss format
    String sunHoursClose = "00:00:00"; // Sunday closing time
    String monHoursClose = "00:00:00"; // Monday closing time
    String tueHoursClose = "00:00:00"; // Tuesday closing time
    String wedHoursClose = "00:00:00"; // Wednesday closing time
    String thuHoursClose = "00:00:00"; // Thursday closing time
    String friHoursClose = "00:00:00"; // Friday closing time
    String satHoursClose = "00:00:00"; // Saturday closing time
    String sunHoursOpen = "07:00:00"; // Sunday opening time
    String monHoursOpen = "07:00:00"; // Monday opening time
    String tueHoursOpen = "07:00:00"; // Tuesday opening time
    String wedHoursOpen = "07:00:00"; // Wednesday opening time
    String thuHoursOpen = "07:00:00"; // Thursday opening time
    String friHoursOpen = "07:00:00"; // Friday opening time
    String satHoursOpen = "07:00:00"; // Saturday opening time
    Boolean sunIsClosed = true; // If true, location is closed on Sunday
    Boolean monIsClosed = true; // If true, location is closed on Monday
    Boolean tueIsClosed = true; // If true, location is closed on Tuesday
    Boolean wedIsClosed = true; // If true, location is closed on Wednesday
    Boolean thuIsClosed = true; // If true, location is closed on Thursday
    Boolean friIsClosed = true; // If true, location is closed on Friday
    Boolean satIsClosed = true; // If true, location is closed on Saturday
    String message = "message_example"; // Message visible to all employees
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      LocationsUpdateLocationByIdResponse result = client
              .locations
              .updateLocationById(companyId, locationId)
              .name(name)
              .city(city)
              .country(country)
              .state(state)
              .shiftFeedback(shiftFeedback)
              .formattedAddress(formattedAddress)
              .lat(lat)
              .lng(lng)
              .placeId(placeId)
              .timezone(timezone)
              .hash(hash)
              .departmentBasedBudget(departmentBasedBudget)
              .holidayPay(holidayPay)
              .autoSendLogBookTime(autoSendLogBookTime)
              .sunHoursClose(sunHoursClose)
              .monHoursClose(monHoursClose)
              .tueHoursClose(tueHoursClose)
              .wedHoursClose(wedHoursClose)
              .thuHoursClose(thuHoursClose)
              .friHoursClose(friHoursClose)
              .satHoursClose(satHoursClose)
              .sunHoursOpen(sunHoursOpen)
              .monHoursOpen(monHoursOpen)
              .tueHoursOpen(tueHoursOpen)
              .wedHoursOpen(wedHoursOpen)
              .thuHoursOpen(thuHoursOpen)
              .friHoursOpen(friHoursOpen)
              .satHoursOpen(satHoursOpen)
              .sunIsClosed(sunIsClosed)
              .monIsClosed(monIsClosed)
              .tueIsClosed(tueIsClosed)
              .wedIsClosed(wedIsClosed)
              .thuIsClosed(thuIsClosed)
              .friIsClosed(friIsClosed)
              .satIsClosed(satIsClosed)
              .message(message)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#updateLocationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocationsUpdateLocationByIdResponse> response = client
              .locations
              .updateLocationById(companyId, locationId)
              .name(name)
              .city(city)
              .country(country)
              .state(state)
              .shiftFeedback(shiftFeedback)
              .formattedAddress(formattedAddress)
              .lat(lat)
              .lng(lng)
              .placeId(placeId)
              .timezone(timezone)
              .hash(hash)
              .departmentBasedBudget(departmentBasedBudget)
              .holidayPay(holidayPay)
              .autoSendLogBookTime(autoSendLogBookTime)
              .sunHoursClose(sunHoursClose)
              .monHoursClose(monHoursClose)
              .tueHoursClose(tueHoursClose)
              .wedHoursClose(wedHoursClose)
              .thuHoursClose(thuHoursClose)
              .friHoursClose(friHoursClose)
              .satHoursClose(satHoursClose)
              .sunHoursOpen(sunHoursOpen)
              .monHoursOpen(monHoursOpen)
              .tueHoursOpen(tueHoursOpen)
              .wedHoursOpen(wedHoursOpen)
              .thuHoursOpen(thuHoursOpen)
              .friHoursOpen(friHoursOpen)
              .satHoursOpen(satHoursOpen)
              .sunIsClosed(sunIsClosed)
              .monIsClosed(monIsClosed)
              .tueIsClosed(tueIsClosed)
              .wedIsClosed(wedIsClosed)
              .thuIsClosed(thuIsClosed)
              .friIsClosed(friIsClosed)
              .satIsClosed(satIsClosed)
              .message(message)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#updateLocationById");
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
| **locationsUpdateLocationByIdRequest** | [**LocationsUpdateLocationByIdRequest**](LocationsUpdateLocationByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**LocationsUpdateLocationByIdResponse**](LocationsUpdateLocationByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

