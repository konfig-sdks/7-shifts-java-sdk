# UsersApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkCreate**](UsersApi.md#bulkCreate) | **POST** /v2/company/{company_id}/create_many_users | Create Many Users |
| [**createNewUser**](UsersApi.md#createNewUser) | **POST** /v2/company/{company_id}/users | Create User |
| [**deactivate**](UsersApi.md#deactivate) | **DELETE** /v2/company/{company_id}/users/{identifier} | Deactivate User |
| [**getUserByIdentifier**](UsersApi.md#getUserByIdentifier) | **GET** /v2/company/{company_id}/users/{identifier} | Retrieve User |
| [**list**](UsersApi.md#list) | **GET** /v2/company/{company_id}/users | List Users |
| [**updateUserByIdentifier**](UsersApi.md#updateUserByIdentifier) | **PUT** /v2/company/{company_id}/users/{identifier} | Update User |


<a name="bulkCreate"></a>
# **bulkCreate**
> UsersBulkCreateResponse bulkCreate(companyId, usersBulkCreateRequestInner).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Many Users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    try {
      UsersBulkCreateResponse result = client
              .users
              .bulkCreate(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#bulkCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersBulkCreateResponse> response = client
              .users
              .bulkCreate(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#bulkCreate");
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
| **usersBulkCreateRequestInner** | [**List&lt;UsersBulkCreateRequestInner&gt;**](UsersBulkCreateRequestInner.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**UsersBulkCreateResponse**](UsersBulkCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="createNewUser"></a>
# **createNewUser**
> UsersCreateNewUserResponse createNewUser(companyId, usersCreateNewUserRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String firstName = "firstName_example"; // The user's first name
    String lastName = "lastName_example"; // The user's last name
    List<Integer> locationIds = Arrays.asList(); // An array of location IDs this user will be assigned to
    List<Integer> departmentIds = Arrays.asList(); // An array of department IDs this user will be assigned to. Department ID is required if this user's location has at least one department
    String type = "employee"; // The type of this user
    Long companyId = 56L; // Company ID
    String preferredFirstName = "preferredFirstName_example"; // An optional alternate first name
    String preferredLastName = "preferredLastName_example"; // An optional alternate last name
    List<Integer> roleIds = Arrays.asList(); // An array of role IDs this user will be assigned to.
    String email = "email_example"; // the user's email
    String mobileNumber = "mobileNumber_example"; // The user's mobile phone number. Format with no spaces and include area code
    String homeNumber = "homeNumber_example"; // The user's home phone number. Format with no spaces and include area code
    String address = "address_example"; // The user's address
    String postalZip = "postalZip_example"; // The user's postal code or zip code
    String city = "city_example"; // The user's city
    String provState = "provState_example"; // The user's province or state
    Boolean inviteUser = true; // If true Invite the user to 7shifts
    String notes = "notes_example"; // Notes associated with this user
    LocalDate hireDate = LocalDate.now(); // The hire date of this user. Format YYYY-MM-DD
    String employeeId = "employeeId_example"; // Either an employee ID or an ID assigned by your payroll provider that is used in your payroll export
    String punchId = "punchId_example"; // The punch ID they punch in/out with. If no value is provided a new one will be created
    LocalDate birthDate = LocalDate.now(); // The user's birthdate. Format YYYY-MM-DD
    String language = "en"; // The user's preferred language. Default value is en
    Boolean appearAsEmployee = true; // User should appear in the system as an employee. Applies to admin users only
    Boolean subscribeToUpdates = true; // Subscribe this user to updates from 7shifts. This includes announcing new features for 7shifts
    Integer maxWeeklyHours = 56; // The maximum weekly hours this user is set to work
    Double wageCents = 3.4D;
    String wageType = "hourly"; // The wage type
    List<UsersCreateNewUserRequestWagesInner> wages = Arrays.asList(); // An array of Wages that will be set to the assigned User's roles
    Integer permissionsTemplateId = 56; // Id of a permissions template the user will be assigned to and granted permissions from.
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      UsersCreateNewUserResponse result = client
              .users
              .createNewUser(firstName, lastName, locationIds, departmentIds, type, companyId)
              .preferredFirstName(preferredFirstName)
              .preferredLastName(preferredLastName)
              .roleIds(roleIds)
              .email(email)
              .mobileNumber(mobileNumber)
              .homeNumber(homeNumber)
              .address(address)
              .postalZip(postalZip)
              .city(city)
              .provState(provState)
              .inviteUser(inviteUser)
              .notes(notes)
              .hireDate(hireDate)
              .employeeId(employeeId)
              .punchId(punchId)
              .birthDate(birthDate)
              .language(language)
              .appearAsEmployee(appearAsEmployee)
              .subscribeToUpdates(subscribeToUpdates)
              .maxWeeklyHours(maxWeeklyHours)
              .wageCents(wageCents)
              .wageType(wageType)
              .wages(wages)
              .permissionsTemplateId(permissionsTemplateId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersCreateNewUserResponse> response = client
              .users
              .createNewUser(firstName, lastName, locationIds, departmentIds, type, companyId)
              .preferredFirstName(preferredFirstName)
              .preferredLastName(preferredLastName)
              .roleIds(roleIds)
              .email(email)
              .mobileNumber(mobileNumber)
              .homeNumber(homeNumber)
              .address(address)
              .postalZip(postalZip)
              .city(city)
              .provState(provState)
              .inviteUser(inviteUser)
              .notes(notes)
              .hireDate(hireDate)
              .employeeId(employeeId)
              .punchId(punchId)
              .birthDate(birthDate)
              .language(language)
              .appearAsEmployee(appearAsEmployee)
              .subscribeToUpdates(subscribeToUpdates)
              .maxWeeklyHours(maxWeeklyHours)
              .wageCents(wageCents)
              .wageType(wageType)
              .wages(wages)
              .permissionsTemplateId(permissionsTemplateId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
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
| **usersCreateNewUserRequest** | [**UsersCreateNewUserRequest**](UsersCreateNewUserRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**UsersCreateNewUserResponse**](UsersCreateNewUserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deactivate"></a>
# **deactivate**
> deactivate(companyId, identifier).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).usersDeactivateRequest(usersDeactivateRequest).execute();

Deactivate User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String inactiveReason = "inactiveReason_example"; // Enum value. See inactive_reasons endpoint for list of values.
    Long companyId = 56L; // Company ID
    Long identifier = 56L; // User ID
    String inactiveComments = "inactiveComments_example"; // Comments related to this user deletion.
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .users
              .deactivate(inactiveReason, companyId, identifier)
              .inactiveComments(inactiveComments)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .deactivate(inactiveReason, companyId, identifier)
              .inactiveComments(inactiveComments)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deactivate");
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
| **identifier** | **Long**| User ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **usersDeactivateRequest** | [**UsersDeactivateRequest**](UsersDeactivateRequest.md)|  | [optional] |

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

<a name="getUserByIdentifier"></a>
# **getUserByIdentifier**
> UsersGetUserByIdentifierResponse getUserByIdentifier(companyId, identifier).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String identifier = "46734"; // User ID. Accepted values are 7shifts user id or punch id. Use prefix punch: for punch id
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      UsersGetUserByIdentifierResponse result = client
              .users
              .getUserByIdentifier(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetUserByIdentifierResponse> response = client
              .users
              .getUserByIdentifier(companyId, identifier)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserByIdentifier");
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
| **identifier** | **String**| User ID. Accepted values are 7shifts user id or punch id. Use prefix punch: for punch id | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**UsersGetUserByIdentifierResponse**](UsersGetUserByIdentifierResponse.md)

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
> UsersListResponse list(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).modifiedSince(modifiedSince).locationId(locationId).departmentId(departmentId).roleId(roleId).status(status).name(name).sortBy(sortBy).cursor(cursor).limit(limit).execute();

List Users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String modifiedSince = "2020-01-01"; // Return users that have been modified since the specified date. Format YYYY-MM-DD
    Integer locationId = 56; // Location ID (cannot be used in conjunction with Department ID and Role ID)
    Integer departmentId = 56; // Department ID (cannot be used in conjunction with Location ID and Role ID)
    Integer roleId = 56; // Role ID (cannot be used in conjunction with Location ID and Department ID)
    String status = "active"; // The user status
    String name = "name_example"; // Filter by partial or full employee name
    String sortBy = "firstname.asc,lastname.desc"; // Sort the paginated result by the given field and direction.
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 100L; // The number of results desired per page.
    try {
      UsersListResponse result = client
              .users
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .status(status)
              .name(name)
              .sortBy(sortBy)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListResponse> response = client
              .users
              .list(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .modifiedSince(modifiedSince)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .status(status)
              .name(name)
              .sortBy(sortBy)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#list");
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
| **modifiedSince** | **String**| Return users that have been modified since the specified date. Format YYYY-MM-DD | [optional] |
| **locationId** | **Integer**| Location ID (cannot be used in conjunction with Department ID and Role ID) | [optional] |
| **departmentId** | **Integer**| Department ID (cannot be used in conjunction with Location ID and Role ID) | [optional] |
| **roleId** | **Integer**| Role ID (cannot be used in conjunction with Location ID and Department ID) | [optional] |
| **status** | **String**| The user status | [optional] [enum: active, inactive] |
| **name** | **String**| Filter by partial or full employee name | [optional] |
| **sortBy** | **String**| Sort the paginated result by the given field and direction. | [optional] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] [default to 100] |

### Return type

[**UsersListResponse**](UsersListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateUserByIdentifier"></a>
# **updateUserByIdentifier**
> UsersUpdateUserByIdentifierResponse updateUserByIdentifier(companyId, identifier, usersUpdateUserByIdentifierRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Long identifier = 56L; // User ID
    String firstName = "firstName_example"; // The user's first name
    String lastName = "lastName_example"; // The user's last name
    String preferredFirstName = "preferredFirstName_example"; // An optional alternate first name
    String preferredLastName = "preferredLastName_example"; // An optional alternate last name
    String email = "email_example"; // the user's email
    String mobileNumber = "mobileNumber_example"; // The user's mobile phone number. Format with no spaces and include area code
    String homeNumber = "homeNumber_example"; // The user's home phone number. Format with no spaces and include area code
    String address = "address_example"; // The user's address
    String postalZip = "postalZip_example"; // The user's postal code or zip code
    String city = "city_example"; // The user's city
    String provState = "provState_example"; // The user's province or state
    String notes = "notes_example"; // Notes associated with this user
    LocalDate hireDate = LocalDate.now(); // The hire date of this user. Format YYYY-MM-DD
    String type = "employee"; // The type of this user
    String employeeId = "employeeId_example"; // Either an employee ID or an ID assigned by your payroll provider that is used in your payroll export
    String punchId = "punchId_example"; // The punch ID they punch in/out with. If no value is provided a new one will be created
    LocalDate birthDate = LocalDate.now(); // The user's birthdate. Format YYYY-MM-DD
    String language = "en"; // The user's preferred language. Default value is en
    Boolean appearAsEmployee = true; // User should appear in the system as an employee. Applies to admin users only
    Boolean subscribeToUpdates = true; // Subscribe this user to updates from 7shifts. This includes announcing new features for 7shifts
    Integer maxWeeklyHours = 56; // The maximum weekly hours this user is set to work
    Boolean active = true; // User status. If false the user is unable to login
    String pronouns = "pronouns_example"; // The user's pronouns
    Integer permissionsTemplateId = 56; // Permission Template ID the user is assigned to
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      UsersUpdateUserByIdentifierResponse result = client
              .users
              .updateUserByIdentifier(companyId, identifier)
              .firstName(firstName)
              .lastName(lastName)
              .preferredFirstName(preferredFirstName)
              .preferredLastName(preferredLastName)
              .email(email)
              .mobileNumber(mobileNumber)
              .homeNumber(homeNumber)
              .address(address)
              .postalZip(postalZip)
              .city(city)
              .provState(provState)
              .notes(notes)
              .hireDate(hireDate)
              .type(type)
              .employeeId(employeeId)
              .punchId(punchId)
              .birthDate(birthDate)
              .language(language)
              .appearAsEmployee(appearAsEmployee)
              .subscribeToUpdates(subscribeToUpdates)
              .maxWeeklyHours(maxWeeklyHours)
              .active(active)
              .pronouns(pronouns)
              .permissionsTemplateId(permissionsTemplateId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserByIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersUpdateUserByIdentifierResponse> response = client
              .users
              .updateUserByIdentifier(companyId, identifier)
              .firstName(firstName)
              .lastName(lastName)
              .preferredFirstName(preferredFirstName)
              .preferredLastName(preferredLastName)
              .email(email)
              .mobileNumber(mobileNumber)
              .homeNumber(homeNumber)
              .address(address)
              .postalZip(postalZip)
              .city(city)
              .provState(provState)
              .notes(notes)
              .hireDate(hireDate)
              .type(type)
              .employeeId(employeeId)
              .punchId(punchId)
              .birthDate(birthDate)
              .language(language)
              .appearAsEmployee(appearAsEmployee)
              .subscribeToUpdates(subscribeToUpdates)
              .maxWeeklyHours(maxWeeklyHours)
              .active(active)
              .pronouns(pronouns)
              .permissionsTemplateId(permissionsTemplateId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserByIdentifier");
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
| **identifier** | **Long**| User ID | |
| **usersUpdateUserByIdentifierRequest** | [**UsersUpdateUserByIdentifierRequest**](UsersUpdateUserByIdentifierRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**UsersUpdateUserByIdentifierResponse**](UsersUpdateUserByIdentifierResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

