# ExternalUserMappingsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBulkMappings**](ExternalUserMappingsApi.md#createBulkMappings) | **POST** /v2/company/{company_id}/external_user_mappings_bulk | Create User External Mappings |
| [**createMapping**](ExternalUserMappingsApi.md#createMapping) | **POST** /v2/company/{company_id}/external_user_mappings | Create External User Mapping |
| [**deleteMapping**](ExternalUserMappingsApi.md#deleteMapping) | **DELETE** /v2/company/{company_id}/external_user_mappings/{identifier} | Delete External User Mapping |
| [**getMappingById**](ExternalUserMappingsApi.md#getMappingById) | **GET** /v2/company/{company_id}/external_user_mappings/{identifier} | Retrieve User External Mapping |
| [**list**](ExternalUserMappingsApi.md#list) | **GET** /v2/company/{company_id}/external_user_mappings | List External User Mapping |
| [**updateMappingByIdentifier**](ExternalUserMappingsApi.md#updateMappingByIdentifier) | **PUT** /v2/company/{company_id}/external_user_mappings/{identifier} | Update External User Mappings |


<a name="createBulkMappings"></a>
# **createBulkMappings**
> ExternalUserMappingsCreateBulkMappingsResponse createBulkMappings(companyId, externalUserMappingsCreateBulkMappingsRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).execute();

Create User External Mappings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    List<ExternalUserMappingsCreateBulkMappingsRequestDataInner> data = Arrays.asList();
    Long companyId = 56L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    try {
      ExternalUserMappingsCreateBulkMappingsResponse result = client
              .externalUserMappings
              .createBulkMappings(data, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#createBulkMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalUserMappingsCreateBulkMappingsResponse> response = client
              .externalUserMappings
              .createBulkMappings(data, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#createBulkMappings");
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
| **externalUserMappingsCreateBulkMappingsRequest** | [**ExternalUserMappingsCreateBulkMappingsRequest**](ExternalUserMappingsCreateBulkMappingsRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |

### Return type

[**ExternalUserMappingsCreateBulkMappingsResponse**](ExternalUserMappingsCreateBulkMappingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createMapping"></a>
# **createMapping**
> ExternalUserMappingsCreateMappingResponse createMapping(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).externalUserMappingsCreateMappingRequest(externalUserMappingsCreateMappingRequest).execute();

Create External User Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    Integer userId = 56; // User ID in 7Shifts
    String externalUserId = "externalUserId_example"; // User ID in External System
    Long companyId = 56L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    try {
      ExternalUserMappingsCreateMappingResponse result = client
              .externalUserMappings
              .createMapping(userId, externalUserId, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#createMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalUserMappingsCreateMappingResponse> response = client
              .externalUserMappings
              .createMapping(userId, externalUserId, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#createMapping");
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
| **externalUserMappingsCreateMappingRequest** | [**ExternalUserMappingsCreateMappingRequest**](ExternalUserMappingsCreateMappingRequest.md)|  | [optional] |

### Return type

[**ExternalUserMappingsCreateMappingResponse**](ExternalUserMappingsCreateMappingResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deleteMapping"></a>
# **deleteMapping**
> deleteMapping(companyId, identifier).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).execute();

Delete External User Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    String identifier = "46734"; // User ID. Accepted values are 7Shifts user id, external user id or user email address. Use prefix ext: for external id or email: for email address
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    try {
      client
              .externalUserMappings
              .deleteMapping(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#deleteMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .externalUserMappings
              .deleteMapping(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#deleteMapping");
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
| **identifier** | **String**| User ID. Accepted values are 7Shifts user id, external user id or user email address. Use prefix ext: for external id or email: for email address | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |

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

<a name="getMappingById"></a>
# **getMappingById**
> ExternalUserMappingsGetMappingByIdResponse getMappingById(companyId, identifier).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).execute();

Retrieve User External Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    String identifier = "46734"; // User ID. Accepted values are 7Shifts user id or external user id. Use prefix ext: for external id
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    try {
      ExternalUserMappingsGetMappingByIdResponse result = client
              .externalUserMappings
              .getMappingById(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#getMappingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalUserMappingsGetMappingByIdResponse> response = client
              .externalUserMappings
              .getMappingById(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#getMappingById");
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
| **identifier** | **String**| User ID. Accepted values are 7Shifts user id or external user id. Use prefix ext: for external id | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |

### Return type

[**ExternalUserMappingsGetMappingByIdResponse**](ExternalUserMappingsGetMappingByIdResponse.md)

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
> ExternalUserMappingsListResponse list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).userId(userId).externalUserId(externalUserId).modifiedSince(modifiedSince).cursor(cursor).limit(limit).execute();

List External User Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    Long userId = 56L; // The 7shifts user ID
    String externalUserId = "externalUserId_example"; // The external user ID
    String modifiedSince = "2020-01-01"; // Return records that have been modified since the specified date. Format YYYY-MM-DD
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 56L; // The number of results desired per page.
    try {
      ExternalUserMappingsListResponse result = client
              .externalUserMappings
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .userId(userId)
              .externalUserId(externalUserId)
              .modifiedSince(modifiedSince)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalUserMappingsListResponse> response = client
              .externalUserMappings
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .userId(userId)
              .externalUserId(externalUserId)
              .modifiedSince(modifiedSince)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#list");
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
| **userId** | **Long**| The 7shifts user ID | [optional] |
| **externalUserId** | **String**| The external user ID | [optional] |
| **modifiedSince** | **String**| Return records that have been modified since the specified date. Format YYYY-MM-DD | [optional] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] |

### Return type

[**ExternalUserMappingsListResponse**](ExternalUserMappingsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateMappingByIdentifier"></a>
# **updateMappingByIdentifier**
> ExternalUserMappingsUpdateMappingByIdentifierResponse updateMappingByIdentifier(companyId, identifier).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).externalUserMappingsUpdateMappingByIdentifierRequest(externalUserMappingsUpdateMappingByIdentifierRequest).execute();

Update External User Mappings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalUserMappingsApi;
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
    String identifier = "46734"; // User ID. Accepted values are 7Shifts user id or external user id. Use prefix ext: for external id
    Integer userId = 56; // User ID in 7Shifts
    String externalUserId = "externalUserId_example"; // User ID in External System
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    try {
      ExternalUserMappingsUpdateMappingByIdentifierResponse result = client
              .externalUserMappings
              .updateMappingByIdentifier(companyId, identifier)
              .userId(userId)
              .externalUserId(externalUserId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#updateMappingByIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalUserMappingsUpdateMappingByIdentifierResponse> response = client
              .externalUserMappings
              .updateMappingByIdentifier(companyId, identifier)
              .userId(userId)
              .externalUserId(externalUserId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalUserMappingsApi#updateMappingByIdentifier");
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
| **identifier** | **String**| User ID. Accepted values are 7Shifts user id or external user id. Use prefix ext: for external id | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |
| **externalUserMappingsUpdateMappingByIdentifierRequest** | [**ExternalUserMappingsUpdateMappingByIdentifierRequest**](ExternalUserMappingsUpdateMappingByIdentifierRequest.md)|  | [optional] |

### Return type

[**ExternalUserMappingsUpdateMappingByIdentifierResponse**](ExternalUserMappingsUpdateMappingByIdentifierResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

