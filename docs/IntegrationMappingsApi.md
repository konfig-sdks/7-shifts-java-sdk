# IntegrationMappingsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSalesCategoryMappingsBulk**](IntegrationMappingsApi.md#createSalesCategoryMappingsBulk) | **POST** /v2/company/{company_id}/location/{location_id}/sales_category_mappings_bulk | Create Sales Category Mappings |
| [**deleteSalesCategoryMappings**](IntegrationMappingsApi.md#deleteSalesCategoryMappings) | **DELETE** /v2/company/{company_id}/location/{location_id}/sales_category_mappings/{external_id} | Delete Sales Category Mappings |
| [**listSalesCategoryMappings**](IntegrationMappingsApi.md#listSalesCategoryMappings) | **GET** /v2/company/{company_id}/location/{location_id}/sales_category_mappings | List Sales Category Mappings |


<a name="createSalesCategoryMappingsBulk"></a>
# **createSalesCategoryMappingsBulk**
> IntegrationMappingsCreateSalesCategoryMappingsBulkResponse createSalesCategoryMappingsBulk(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Sales Category Mappings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    Long departmentId = 56L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      IntegrationMappingsCreateSalesCategoryMappingsBulkResponse result = client
              .integrationMappings
              .createSalesCategoryMappingsBulk(companyId, locationId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#createSalesCategoryMappingsBulk");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> response = client
              .integrationMappings
              .createSalesCategoryMappingsBulk(companyId, locationId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#createSalesCategoryMappingsBulk");
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
| **departmentId** | **Long**| Department ID | |
| **integrationMappingsCreateSalesCategoryMappingsBulkRequestInner** | [**List&lt;IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner&gt;**](IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**IntegrationMappingsCreateSalesCategoryMappingsBulkResponse**](IntegrationMappingsCreateSalesCategoryMappingsBulkResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="deleteSalesCategoryMappings"></a>
# **deleteSalesCategoryMappings**
> deleteSalesCategoryMappings(companyId, locationId, externalId, departmentId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Sales Category Mappings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    String externalId = "externalId_example"; // External Category ID
    Long departmentId = 56L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .integrationMappings
              .deleteSalesCategoryMappings(companyId, locationId, externalId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#deleteSalesCategoryMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .integrationMappings
              .deleteSalesCategoryMappings(companyId, locationId, externalId, departmentId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#deleteSalesCategoryMappings");
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
| **externalId** | **String**| External Category ID | |
| **departmentId** | **Long**| Department ID | |
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

<a name="listSalesCategoryMappings"></a>
# **listSalesCategoryMappings**
> IntegrationMappingsListSalesCategoryMappingsResponse listSalesCategoryMappings(companyId, locationId, departmentId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).cursor(cursor).limit(limit).execute();

List Sales Category Mappings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    Long departmentId = 56L; // Department ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 56L; // The number of results desired per page.
    try {
      IntegrationMappingsListSalesCategoryMappingsResponse result = client
              .integrationMappings
              .listSalesCategoryMappings(companyId, locationId, departmentId)
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
      System.err.println("Exception when calling IntegrationMappingsApi#listSalesCategoryMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationMappingsListSalesCategoryMappingsResponse> response = client
              .integrationMappings
              .listSalesCategoryMappings(companyId, locationId, departmentId)
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
      System.err.println("Exception when calling IntegrationMappingsApi#listSalesCategoryMappings");
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
| **departmentId** | **Long**| Department ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] |

### Return type

[**IntegrationMappingsListSalesCategoryMappingsResponse**](IntegrationMappingsListSalesCategoryMappingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

