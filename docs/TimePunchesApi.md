# TimePunchesApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](TimePunchesApi.md#create) | **POST** /v2/company/{company_id}/time_punches | Create Time Punch |
| [**deleteById**](TimePunchesApi.md#deleteById) | **DELETE** /v2/company/{company_id}/time_punches/{time_punch_id} | Delete Time Punch |
| [**getTimePunch**](TimePunchesApi.md#getTimePunch) | **GET** /v2/company/{company_id}/time_punches/{time_punch_id} | Retrieve Time Punch |
| [**list**](TimePunchesApi.md#list) | **GET** /v2/company/{company_id}/time_punches | List Time Punches |
| [**updateById**](TimePunchesApi.md#updateById) | **PUT** /v2/company/{company_id}/time_punches/{time_punch_id} | Update Time Punch |


<a name="create"></a>
# **create**
> TimePunchesCreateResponse create(companyId, timePunchesCreateRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Time Punch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimePunchesApi;
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
    Integer locationId = 56; // Location ID.
    Integer userId = 56; // The 7shifts ID of the user who is clocking in.
    OffsetDateTime clockedIn = OffsetDateTime.now(); // The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone.
    Long companyId = 1234L; // The company id
    Integer departmentId = 56; // Department ID. Defaults to 0 if not defined.
    Integer roleId = 56; // The ID of the role that the user is clocking in to work for. Defaults to 0 if not defined.
    OffsetDateTime clockedOut = OffsetDateTime.now(); // The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone.
    String notes = "notes_example"; // Additional notes for a shift.
    Integer tips = 56; // Tips declared for the shift in cents
    List<TimePunchesCreateRequestBreaksInner> breaks = Arrays.asList();
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimePunchesCreateResponse result = client
              .timePunches
              .create(locationId, userId, clockedIn, companyId)
              .departmentId(departmentId)
              .roleId(roleId)
              .clockedOut(clockedOut)
              .notes(notes)
              .tips(tips)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimePunchesCreateResponse> response = client
              .timePunches
              .create(locationId, userId, clockedIn, companyId)
              .departmentId(departmentId)
              .roleId(roleId)
              .clockedOut(clockedOut)
              .notes(notes)
              .tips(tips)
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
      System.err.println("Exception when calling TimePunchesApi#create");
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
| **companyId** | **Long**| The company id | |
| **timePunchesCreateRequest** | [**TimePunchesCreateRequest**](TimePunchesCreateRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimePunchesCreateResponse**](TimePunchesCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(companyId, timePunchId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Time Punch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimePunchesApi;
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
    Long timePunchId = 1234L; // Time punch ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .timePunches
              .deleteById(companyId, timePunchId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timePunches
              .deleteById(companyId, timePunchId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#deleteById");
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
| **timePunchId** | **Long**| Time punch ID | |
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

<a name="getTimePunch"></a>
# **getTimePunch**
> TimePunchesGetTimePunchResponse getTimePunch(companyId, timePunchId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Time Punch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimePunchesApi;
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
    Long timePunchId = 1234L; // Time punch ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimePunchesGetTimePunchResponse result = client
              .timePunches
              .getTimePunch(companyId, timePunchId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#getTimePunch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimePunchesGetTimePunchResponse> response = client
              .timePunches
              .getTimePunch(companyId, timePunchId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#getTimePunch");
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
| **timePunchId** | **Long**| Time punch ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimePunchesGetTimePunchResponse**](TimePunchesGetTimePunchResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="list"></a>
# **list**
> TimePunchesListResponse list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).departmentId(departmentId).roleId(roleId).userId(userId).approved(approved).limit(limit).modifiedSince(modifiedSince).clockedInLte(clockedInLte).clockedInGte(clockedInGte).clockedOutLte(clockedOutLte).clockedOutGte(clockedOutGte).includeDeleted(includeDeleted).deleted(deleted).localizeSearchTime(localizeSearchTime).cursor(cursor).sortBy(sortBy).execute();

List Time Punches

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimePunchesApi;
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
    Integer locationId = 56; // Location ID
    Integer departmentId = 56; // Department ID
    Integer roleId = 56; // Role ID
    Integer userId = 56; // User ID
    Boolean approved = true; // Returns time punches that have been approved. Default null, returns both approved and unapproved punches. If true returns only approved punches. If false returns only unapproved punches.
    Integer limit = 20; // The limit of results that will be returned.
    OffsetDateTime modifiedSince = OffsetDateTime.parse("2020-12-30T15:00:00.000Z"); // Return time punches that have been modified after the specified date time. UTC in ISO8601 Format
    OffsetDateTime clockedInLte = OffsetDateTime.now(); // Return time punches with clocked in before or on the specified date.  UTC in ISO8601 format
    OffsetDateTime clockedInGte = OffsetDateTime.now(); // Return time punches with clocked in after or on the specified date.  UTC in ISO8601 format
    OffsetDateTime clockedOutLte = OffsetDateTime.now(); // Return time punches with clocked out before or on the specified date.  UTC in ISO8601 format
    OffsetDateTime clockedOutGte = OffsetDateTime.now(); // Return time punches with clocked out after or on the specified date.  UTC in ISO8601 format
    Boolean includeDeleted = false; // Deprecated, see 'deleted'
    Boolean deleted = false; // Returns punches filtered by deleted status.  Default false, returns undeleted punches. If true returns only deleted punches. if value is null then returns both deleted and undeleted punches.
    Boolean localizeSearchTime = false; // If true, convert any date ranges to consider the local timezone of the punches.  If false, date ranges will be in UTC
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    String sortBy = "sortBy_example"; // The name of the field and direction you want the results ordered by.
    try {
      TimePunchesListResponse result = client
              .timePunches
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .userId(userId)
              .approved(approved)
              .limit(limit)
              .modifiedSince(modifiedSince)
              .clockedInLte(clockedInLte)
              .clockedInGte(clockedInGte)
              .clockedOutLte(clockedOutLte)
              .clockedOutGte(clockedOutGte)
              .includeDeleted(includeDeleted)
              .deleted(deleted)
              .localizeSearchTime(localizeSearchTime)
              .cursor(cursor)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimePunchesListResponse> response = client
              .timePunches
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .userId(userId)
              .approved(approved)
              .limit(limit)
              .modifiedSince(modifiedSince)
              .clockedInLte(clockedInLte)
              .clockedInGte(clockedInGte)
              .clockedOutLte(clockedOutLte)
              .clockedOutGte(clockedOutGte)
              .includeDeleted(includeDeleted)
              .deleted(deleted)
              .localizeSearchTime(localizeSearchTime)
              .cursor(cursor)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#list");
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
| **locationId** | **Integer**| Location ID | [optional] |
| **departmentId** | **Integer**| Department ID | [optional] |
| **roleId** | **Integer**| Role ID | [optional] |
| **userId** | **Integer**| User ID | [optional] |
| **approved** | **Boolean**| Returns time punches that have been approved. Default null, returns both approved and unapproved punches. If true returns only approved punches. If false returns only unapproved punches. | [optional] |
| **limit** | **Integer**| The limit of results that will be returned. | [optional] [default to 20] |
| **modifiedSince** | **OffsetDateTime**| Return time punches that have been modified after the specified date time. UTC in ISO8601 Format | [optional] |
| **clockedInLte** | **OffsetDateTime**| Return time punches with clocked in before or on the specified date.  UTC in ISO8601 format | [optional] |
| **clockedInGte** | **OffsetDateTime**| Return time punches with clocked in after or on the specified date.  UTC in ISO8601 format | [optional] |
| **clockedOutLte** | **OffsetDateTime**| Return time punches with clocked out before or on the specified date.  UTC in ISO8601 format | [optional] |
| **clockedOutGte** | **OffsetDateTime**| Return time punches with clocked out after or on the specified date.  UTC in ISO8601 format | [optional] |
| **includeDeleted** | **Boolean**| Deprecated, see &#39;deleted&#39; | [optional] [default to false] |
| **deleted** | **Boolean**| Returns punches filtered by deleted status.  Default false, returns undeleted punches. If true returns only deleted punches. if value is null then returns both deleted and undeleted punches. | [optional] [default to false] |
| **localizeSearchTime** | **Boolean**| If true, convert any date ranges to consider the local timezone of the punches.  If false, date ranges will be in UTC | [optional] [default to false] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **sortBy** | **String**| The name of the field and direction you want the results ordered by. | [optional] |

### Return type

[**TimePunchesListResponse**](TimePunchesListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateById"></a>
# **updateById**
> TimePunchesUpdateByIdResponse updateById(companyId, timePunchId, timePunchesUpdateByIdRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Time Punch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimePunchesApi;
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
    Long companyId = 1234L; // Company id
    Long timePunchId = 1234L; // Time punch id
    Integer departmentId = 56; // Department ID
    Integer roleId = 56; // The ID of the role that the user is clocking in to work for.
    OffsetDateTime clockedIn = OffsetDateTime.now(); // The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone.
    OffsetDateTime clockedOut = OffsetDateTime.now(); // The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone.
    String notes = "notes_example"; // Additional notes for a shift.
    Integer tips = 56; // Tips declared for the shift in cents
    List<TimePunchesUpdateByIdRequestBreaksInner> breaks = Arrays.asList(); // List of breaks during a shift. Breaks must always be included in a correct state in update requests. The absence of an existing break in the payload implies that it should be deleted.
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TimePunchesUpdateByIdResponse result = client
              .timePunches
              .updateById(companyId, timePunchId)
              .departmentId(departmentId)
              .roleId(roleId)
              .clockedIn(clockedIn)
              .clockedOut(clockedOut)
              .notes(notes)
              .tips(tips)
              .breaks(breaks)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimePunchesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimePunchesUpdateByIdResponse> response = client
              .timePunches
              .updateById(companyId, timePunchId)
              .departmentId(departmentId)
              .roleId(roleId)
              .clockedIn(clockedIn)
              .clockedOut(clockedOut)
              .notes(notes)
              .tips(tips)
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
      System.err.println("Exception when calling TimePunchesApi#updateById");
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
| **companyId** | **Long**| Company id | |
| **timePunchId** | **Long**| Time punch id | |
| **timePunchesUpdateByIdRequest** | [**TimePunchesUpdateByIdRequest**](TimePunchesUpdateByIdRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TimePunchesUpdateByIdResponse**](TimePunchesUpdateByIdResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

