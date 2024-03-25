# ShiftsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewShift**](ShiftsApi.md#createNewShift) | **POST** /v2/company/{company_id}/shifts | Create Shift |
| [**deleteShiftById**](ShiftsApi.md#deleteShiftById) | **DELETE** /v2/company/{company_id}/shifts/{shift_id} | Delete Shift |
| [**getShiftById**](ShiftsApi.md#getShiftById) | **GET** /v2/company/{company_id}/shifts/{shift_id} | Retrieve Shift |
| [**list**](ShiftsApi.md#list) | **GET** /v2/company/{company_id}/shifts | List Shifts |
| [**updateShiftById**](ShiftsApi.md#updateShiftById) | **PUT** /v2/company/{company_id}/shifts/{shift_id} | Update Shift |


<a name="createNewShift"></a>
# **createNewShift**
> ShiftsCreateNewShiftResponse createNewShift(companyId, shiftsCreateNewShiftRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Shift

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    Integer locationId = 56; // Shift ID
    OffsetDateTime start = OffsetDateTime.now(); // Start date time of the shift. UTC in ISO8601 format.
    OffsetDateTime end = OffsetDateTime.now(); // End date time of the shift. UTC in ISO8601 format.
    Long companyId = 1234L; // Company ID
    Integer userId = 56; // User ID
    Integer departmentId = 56; // Department ID. Required if the location uses departments.
    Integer roleId = 56; // Role ID. Required if the location uses roles.
    Integer stationId = 56; // Station ID
    Boolean close = true; // Set to true if the shift ends at closing time. If set, end is not used.
    Boolean businessDecline = true; // Set to true if the shift ends at business decline.
    String notes = "notes_example"; // Notes displayed on a shift.
    Boolean draft = true; // If true the shift is not published.
    Boolean notified = true; // If true the user has been notified of the published shift.
    Boolean open = true; // Set to true if the shift is not assigned to any user. Open shifts can be requested by users.
    Integer openOfferType = 56; // Set when open is true. Set to 1 for everyone can request an open shift; set to 1 if only offered to specified role.
    Boolean unassigned = true; // Internal use only
    Integer unassignedSkillLevel = 1; // The skill level required for this shift.
    Integer status = 0; // Shift status type. 0 - none, 1 - sick, 2 - no show, 3 - late, 4 - call out, 5 - left late.
    Integer lateMinutes = 56; // Number of minutes a user can clock in late after the shift starts.
    List<ShiftsCreateNewShiftRequestBreaksInner> breaks = Arrays.asList(); // Breaks to be created with the shift
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ShiftsCreateNewShiftResponse result = client
              .shifts
              .createNewShift(locationId, start, end, companyId)
              .userId(userId)
              .departmentId(departmentId)
              .roleId(roleId)
              .stationId(stationId)
              .close(close)
              .businessDecline(businessDecline)
              .notes(notes)
              .draft(draft)
              .notified(notified)
              .open(open)
              .openOfferType(openOfferType)
              .unassigned(unassigned)
              .unassignedSkillLevel(unassignedSkillLevel)
              .status(status)
              .lateMinutes(lateMinutes)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createNewShift");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsCreateNewShiftResponse> response = client
              .shifts
              .createNewShift(locationId, start, end, companyId)
              .userId(userId)
              .departmentId(departmentId)
              .roleId(roleId)
              .stationId(stationId)
              .close(close)
              .businessDecline(businessDecline)
              .notes(notes)
              .draft(draft)
              .notified(notified)
              .open(open)
              .openOfferType(openOfferType)
              .unassigned(unassigned)
              .unassignedSkillLevel(unassignedSkillLevel)
              .status(status)
              .lateMinutes(lateMinutes)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#createNewShift");
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
| **shiftsCreateNewShiftRequest** | [**ShiftsCreateNewShiftRequest**](ShiftsCreateNewShiftRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ShiftsCreateNewShiftResponse**](ShiftsCreateNewShiftResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Shift created |  -  |

<a name="deleteShiftById"></a>
# **deleteShiftById**
> deleteShiftById(companyId, shiftId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Shift

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    Long shiftId = 56L; // Shift ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .shifts
              .deleteShiftById(companyId, shiftId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#deleteShiftById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shifts
              .deleteShiftById(companyId, shiftId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#deleteShiftById");
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
| **shiftId** | **Long**| Shift ID | |
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

<a name="getShiftById"></a>
# **getShiftById**
> ShiftsGetShiftByIdResponse getShiftById(companyId, shiftId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).includeDeleted(includeDeleted).execute();

Retrieve Shift

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    Long shiftId = 56L; // Shift ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Boolean includeDeleted = true; // Return the shift even if its deleted
    try {
      ShiftsGetShiftByIdResponse result = client
              .shifts
              .getShiftById(companyId, shiftId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .includeDeleted(includeDeleted)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#getShiftById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsGetShiftByIdResponse> response = client
              .shifts
              .getShiftById(companyId, shiftId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .includeDeleted(includeDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#getShiftById");
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
| **shiftId** | **Long**| Shift ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **includeDeleted** | **Boolean**| Return the shift even if its deleted | [optional] |

### Return type

[**ShiftsGetShiftByIdResponse**](ShiftsGetShiftByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="list"></a>
# **list**
> ShiftsListResponse list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).cursor(cursor).limit(limit).locationId(locationId).shiftIds(shiftIds).departmentId(departmentId).departmentIds(departmentIds).roleId(roleId).userId(userId).startLte(startLte).startGte(startGte).endLte(endLte).endGte(endGte).deleted(deleted).draft(draft).includeDraft(includeDraft).open(open).modifiedSince(modifiedSince).sortBy(sortBy).sortDir(sortDir).execute();

List Shifts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    Long limit = 100L; // The number of results desired per page.
    Long locationId = 1234L; // Location ID
    List<Integer> shiftIds = Arrays.asList(); // A comma separated list of Shift IDs
    Long departmentId = 1234L; // Department ID
    List<Integer> departmentIds = Arrays.asList(); // Department IDs
    Long roleId = 1234L; // Role ID
    Long userId = 1234L; // User ID
    OffsetDateTime startLte = OffsetDateTime.parse("2021-01-30T08:30Z"); // Return shifts that start before or on specified date. In ISO8601 Format
    OffsetDateTime startGte = OffsetDateTime.parse("2021-01-30T08:30Z"); // Return shifts that start after or on specified date time. In ISO8601 Format
    OffsetDateTime endLte = OffsetDateTime.parse("2021-01-30T08:30Z"); // Return shifts that end before or on specified date time. In ISO8601 Format
    OffsetDateTime endGte = OffsetDateTime.parse("2021-01-30T08:30Z"); // Return shifts that end after or on specified date time. In ISO8601 Format
    Boolean deleted = false; // Return shifts that were published and have been deleted. Cannot be combined with draft.
    Boolean draft = false; // Return shifts that are in draft. Draft shifts have created, edited or deleted but not been published. Overrides deleted flag.
    Boolean includeDraft = false; // Return shifts that are published, and also shifts in draft. Overrides deleted flag and draft flag.
    Boolean open = true; // Return shifts that are open. Open shifts means anyone can request to take it and not assigned to any individual.
    OffsetDateTime modifiedSince = OffsetDateTime.parse("2021-01-30T08:30Z"); // Return only shifts that have been modified from specified date time. In ISO8601 Format
    String sortBy = "sortBy_example"; // Sort by either start or end
    String sortDir = "sortDir_example"; // Sort by direction (asc, desc)
    try {
      ShiftsListResponse result = client
              .shifts
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .shiftIds(shiftIds)
              .departmentId(departmentId)
              .departmentIds(departmentIds)
              .roleId(roleId)
              .userId(userId)
              .startLte(startLte)
              .startGte(startGte)
              .endLte(endLte)
              .endGte(endGte)
              .deleted(deleted)
              .draft(draft)
              .includeDraft(includeDraft)
              .open(open)
              .modifiedSince(modifiedSince)
              .sortBy(sortBy)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsListResponse> response = client
              .shifts
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .shiftIds(shiftIds)
              .departmentId(departmentId)
              .departmentIds(departmentIds)
              .roleId(roleId)
              .userId(userId)
              .startLte(startLte)
              .startGte(startGte)
              .endLte(endLte)
              .endGte(endGte)
              .deleted(deleted)
              .draft(draft)
              .includeDraft(includeDraft)
              .open(open)
              .modifiedSince(modifiedSince)
              .sortBy(sortBy)
              .sortDir(sortDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#list");
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
| **limit** | **Long**| The number of results desired per page. | [optional] [default to 100] |
| **locationId** | **Long**| Location ID | [optional] |
| **shiftIds** | [**List&lt;Integer&gt;**](Integer.md)| A comma separated list of Shift IDs | [optional] |
| **departmentId** | **Long**| Department ID | [optional] |
| **departmentIds** | [**List&lt;Integer&gt;**](Integer.md)| Department IDs | [optional] |
| **roleId** | **Long**| Role ID | [optional] |
| **userId** | **Long**| User ID | [optional] |
| **startLte** | **OffsetDateTime**| Return shifts that start before or on specified date. In ISO8601 Format | [optional] |
| **startGte** | **OffsetDateTime**| Return shifts that start after or on specified date time. In ISO8601 Format | [optional] |
| **endLte** | **OffsetDateTime**| Return shifts that end before or on specified date time. In ISO8601 Format | [optional] |
| **endGte** | **OffsetDateTime**| Return shifts that end after or on specified date time. In ISO8601 Format | [optional] |
| **deleted** | **Boolean**| Return shifts that were published and have been deleted. Cannot be combined with draft. | [optional] [default to false] |
| **draft** | **Boolean**| Return shifts that are in draft. Draft shifts have created, edited or deleted but not been published. Overrides deleted flag. | [optional] [default to false] |
| **includeDraft** | **Boolean**| Return shifts that are published, and also shifts in draft. Overrides deleted flag and draft flag. | [optional] [default to false] |
| **open** | **Boolean**| Return shifts that are open. Open shifts means anyone can request to take it and not assigned to any individual. | [optional] |
| **modifiedSince** | **OffsetDateTime**| Return only shifts that have been modified from specified date time. In ISO8601 Format | [optional] |
| **sortBy** | **String**| Sort by either start or end | [optional] |
| **sortDir** | **String**| Sort by direction (asc, desc) | [optional] |

### Return type

[**ShiftsListResponse**](ShiftsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateShiftById"></a>
# **updateShiftById**
> ShiftsUpdateShiftByIdResponse updateShiftById(companyId, shiftId, shiftsUpdateShiftByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Shift

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShiftsApi;
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
    Long shiftId = 56L; // Shift ID
    Integer locationId = 56; // Location ID
    Integer userId = 56; // User ID
    Integer departmentId = 56; // Department ID. Required if the location uses departments
    Integer roleId = 56; // Role ID. Required if the location uses roles
    Integer stationId = 56; // The station assigned to the shift
    OffsetDateTime start = OffsetDateTime.now(); // Start date time of the shift. UTC in ISO8601 format
    OffsetDateTime end = OffsetDateTime.now(); // End date time of the shift. UTC in ISO8601 format
    Boolean close = true; // Set to true if the shift ends at closing time. If set end is not used.
    Boolean businessDecline = true; // Set to true if the shift ends at business decline.
    String notes = "notes_example"; // Notes displayed on a shift
    Boolean draft = true; // If true the shift is not published.
    Boolean open = true; // Set to true if the shift is not assigned to any user. Open shifts can be requested by users.
    Integer openOfferType = 0; // Set when open is true. Set to 0 when everyone at a location can request an open shift; set to 1 if only offered to specified role.
    Boolean unassigned = true; // When true the shift is unassigned. Internal use only.
    Integer unassignedSkillLevel = 1; // The skill level required for this shift.  * 1: Beginner  * 2: Intermediate  * 3: Experienced 
    Integer status = 0; // Shift status type.  * 0: None  * 1: Sick  * 2: No Show  * 3: Late  * 4: Call Out  * 5: Left Late 
    Integer lateMinutes = 56; // Number of minutes a user can clock in late after the shift starts.
    List<ShiftsUpdateShiftByIdRequestBreaksInner> breaks = Arrays.asList(); // Breaks to be updated with the shift
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ShiftsUpdateShiftByIdResponse result = client
              .shifts
              .updateShiftById(companyId, shiftId)
              .locationId(locationId)
              .userId(userId)
              .departmentId(departmentId)
              .roleId(roleId)
              .stationId(stationId)
              .start(start)
              .end(end)
              .close(close)
              .businessDecline(businessDecline)
              .notes(notes)
              .draft(draft)
              .open(open)
              .openOfferType(openOfferType)
              .unassigned(unassigned)
              .unassignedSkillLevel(unassignedSkillLevel)
              .status(status)
              .lateMinutes(lateMinutes)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#updateShiftById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShiftsUpdateShiftByIdResponse> response = client
              .shifts
              .updateShiftById(companyId, shiftId)
              .locationId(locationId)
              .userId(userId)
              .departmentId(departmentId)
              .roleId(roleId)
              .stationId(stationId)
              .start(start)
              .end(end)
              .close(close)
              .businessDecline(businessDecline)
              .notes(notes)
              .draft(draft)
              .open(open)
              .openOfferType(openOfferType)
              .unassigned(unassigned)
              .unassignedSkillLevel(unassignedSkillLevel)
              .status(status)
              .lateMinutes(lateMinutes)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShiftsApi#updateShiftById");
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
| **shiftId** | **Long**| Shift ID | |
| **shiftsUpdateShiftByIdRequest** | [**ShiftsUpdateShiftByIdRequest**](ShiftsUpdateShiftByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ShiftsUpdateShiftByIdResponse**](ShiftsUpdateShiftByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

