# DepartmentsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDepartment**](DepartmentsApi.md#createNewDepartment) | **POST** /v2/company/{company_id}/departments | Create Department |
| [**deleteById**](DepartmentsApi.md#deleteById) | **DELETE** /v2/company/{company_id}/departments/{department_id} | Delete Department |
| [**getDepartment**](DepartmentsApi.md#getDepartment) | **GET** /v2/company/{company_id}/departments/{department_id} | Retrieve Department |
| [**list**](DepartmentsApi.md#list) | **GET** /v2/company/{company_id}/departments | List Departments |
| [**updateDepartment**](DepartmentsApi.md#updateDepartment) | **PUT** /v2/company/{company_id}/departments/{department_id} | Update Department |


<a name="createNewDepartment"></a>
# **createNewDepartment**
> DepartmentsCreateNewDepartmentResponse createNewDepartment(companyId, departmentsCreateNewDepartmentRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Department

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    Double locationId = 3.4D; // Location ID
    String name = "name_example"; // Department name
    Boolean _default = true; // If true department is set as the default for the location
    Long companyId = 1234L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      DepartmentsCreateNewDepartmentResponse result = client
              .departments
              .createNewDepartment(locationId, name, _default, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#createNewDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentsCreateNewDepartmentResponse> response = client
              .departments
              .createNewDepartment(locationId, name, _default, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#createNewDepartment");
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
| **departmentsCreateNewDepartmentRequest** | [**DepartmentsCreateNewDepartmentRequest**](DepartmentsCreateNewDepartmentRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**DepartmentsCreateNewDepartmentResponse**](DepartmentsCreateNewDepartmentResponse.md)

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
> deleteById(companyId, departmentId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).transferTo(transferTo).execute();

Delete Department

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    Long departmentId = 1234L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long transferTo = 1234L; // Department ID to move roles and shifts to
    try {
      client
              .departments
              .deleteById(companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .transferTo(transferTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .departments
              .deleteById(companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .transferTo(transferTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#deleteById");
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
| **departmentId** | **Long**| Department ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **transferTo** | **Long**| Department ID to move roles and shifts to | [optional] |

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

<a name="getDepartment"></a>
# **getDepartment**
> DepartmentsGetDepartmentResponse getDepartment(companyId, departmentId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Department

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    Long departmentId = 1234L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      DepartmentsGetDepartmentResponse result = client
              .departments
              .getDepartment(companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#getDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentsGetDepartmentResponse> response = client
              .departments
              .getDepartment(companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#getDepartment");
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
| **departmentId** | **Long**| Department ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**DepartmentsGetDepartmentResponse**](DepartmentsGetDepartmentResponse.md)

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
> DepartmentsListResponse list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).modifiedSince(modifiedSince).cursor(cursor).limit(limit).locationId(locationId).execute();

List Departments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    String modifiedSince = "2020-01-01"; // Return departments that have been modified since the specified date. Format YYYY-MM-DD
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 56L; // The number of results desired per page.
    Long locationId = 1234L; // Return departments that match the provided location ID
    try {
      DepartmentsListResponse result = client
              .departments
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentsListResponse> response = client
              .departments
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .cursor(cursor)
              .limit(limit)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#list");
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
| **modifiedSince** | **String**| Return departments that have been modified since the specified date. Format YYYY-MM-DD | [optional] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] |
| **locationId** | **Long**| Return departments that match the provided location ID | [optional] |

### Return type

[**DepartmentsListResponse**](DepartmentsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDepartment"></a>
# **updateDepartment**
> DepartmentsUpdateDepartmentResponse updateDepartment(companyId, departmentId, departmentsUpdateDepartmentRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Department

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DepartmentsApi;
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
    String name = "name_example"; // Department name
    Boolean _default = true; // If true department is set as the default for the location
    Long companyId = 1234L; // Company ID
    Long departmentId = 1234L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      DepartmentsUpdateDepartmentResponse result = client
              .departments
              .updateDepartment(name, _default, companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#updateDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DepartmentsUpdateDepartmentResponse> response = client
              .departments
              .updateDepartment(name, _default, companyId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DepartmentsApi#updateDepartment");
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
| **departmentId** | **Long**| Department ID | |
| **departmentsUpdateDepartmentRequest** | [**DepartmentsUpdateDepartmentRequest**](DepartmentsUpdateDepartmentRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**DepartmentsUpdateDepartmentResponse**](DepartmentsUpdateDepartmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

