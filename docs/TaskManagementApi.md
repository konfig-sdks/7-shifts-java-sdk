# TaskManagementApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearTask**](TaskManagementApi.md#clearTask) | **POST** /v2/company/{company_id}/task_lists/{list_id}/tasks/{task_id}/clear | Clear task |
| [**createTaskListTemplate**](TaskManagementApi.md#createTaskListTemplate) | **POST** /v2/company/{company_id}/task_list_templates | Create Task List Template |
| [**createTaskTags**](TaskManagementApi.md#createTaskTags) | **POST** /v2/company/{company_id}/task_tags | Create Task Tags |
| [**deleteTaskListTemplate**](TaskManagementApi.md#deleteTaskListTemplate) | **DELETE** /v2/company/{company_id}/task_list_templates/{uuid} | Delete Task List Template |
| [**deleteTaskTags**](TaskManagementApi.md#deleteTaskTags) | **DELETE** /v2/company/{company_id}/task_tags | Delete Task Tags |
| [**editTaskListTemplate**](TaskManagementApi.md#editTaskListTemplate) | **PUT** /v2/company/{company_id}/task_list_templates/{uuid} | edit task list template |
| [**getSettings**](TaskManagementApi.md#getSettings) | **GET** /v2/company/{company_id}/task_management_settings | Gets task management settings for a company |
| [**getTaskList**](TaskManagementApi.md#getTaskList) | **GET** /v2/company/{company_id}/task_lists/{list_id} | Retrieve Task List |
| [**getTaskListTemplate**](TaskManagementApi.md#getTaskListTemplate) | **GET** /v2/company/{company_id}/task_list_templates/{uuid} | Retrieve Task List Template |
| [**getTaskListTemplates**](TaskManagementApi.md#getTaskListTemplates) | **GET** /v2/company/{company_id}/task_list_templates | Get task list templates |
| [**getTaskLists**](TaskManagementApi.md#getTaskLists) | **GET** /v2/company/{company_id}/task_lists | List Task Lists |
| [**listTaskListsSummary**](TaskManagementApi.md#listTaskListsSummary) | **GET** /v2/company/{company_id}/task_list_daily_summary | List Task Lists Summary |
| [**markComplete**](TaskManagementApi.md#markComplete) | **POST** /v2/company/{company_id}/task_lists/{list_id}/tasks/{task_id}/complete | Complete Task |


<a name="clearTask"></a>
# **clearTask**
> TaskManagementClearTaskResponse clearTask(companyId, listId, taskId, taskManagementClearTaskRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Clear task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Integer userId = 56;
    Long companyId = 1234L; // Company ID
    Long listId = 1234L; // Task List ID
    Long taskId = 1234L; // Task ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TaskManagementClearTaskResponse result = client
              .taskManagement
              .clearTask(userId, companyId, listId, taskId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#clearTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementClearTaskResponse> response = client
              .taskManagement
              .clearTask(userId, companyId, listId, taskId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#clearTask");
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
| **listId** | **Long**| Task List ID | |
| **taskId** | **Long**| Task ID | |
| **taskManagementClearTaskRequest** | [**TaskManagementClearTaskRequest**](TaskManagementClearTaskRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TaskManagementClearTaskResponse**](TaskManagementClearTaskResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Clear a task |  -  |

<a name="createTaskListTemplate"></a>
# **createTaskListTemplate**
> TaskManagementCreateTaskListTemplateResponse createTaskListTemplate(companyId, taskManagementCreateTaskListTemplateRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Task List Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    String title = "title_example";
    String recurrence = "recurrence_example"; // recurrence rules as defined by the RFC 5545 spec
    List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> assignments = Arrays.asList();
    Long companyId = 8655L; // Company ID
    String description = "description_example";
    String due = "due_example"; // A date with YYYY-MM-DD format
    TaskManagementCreateTaskListTemplateRequestTimeFrame timeFrame = new TaskManagementCreateTaskListTemplateRequestTimeFrame();
    List<TaskManagementCreateTaskListTemplateRequestTaskTemplatesInner> taskTemplates = Arrays.asList();
    Integer status = 56;
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TaskManagementCreateTaskListTemplateResponse result = client
              .taskManagement
              .createTaskListTemplate(title, recurrence, assignments, companyId)
              .description(description)
              .due(due)
              .timeFrame(timeFrame)
              .taskTemplates(taskTemplates)
              .status(status)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#createTaskListTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementCreateTaskListTemplateResponse> response = client
              .taskManagement
              .createTaskListTemplate(title, recurrence, assignments, companyId)
              .description(description)
              .due(due)
              .timeFrame(timeFrame)
              .taskTemplates(taskTemplates)
              .status(status)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#createTaskListTemplate");
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
| **taskManagementCreateTaskListTemplateRequest** | [**TaskManagementCreateTaskListTemplateRequest**](TaskManagementCreateTaskListTemplateRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TaskManagementCreateTaskListTemplateResponse**](TaskManagementCreateTaskListTemplateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created a new task list template |  -  |

<a name="createTaskTags"></a>
# **createTaskTags**
> createTaskTags(companyId, taskManagementCreateTaskTagsRequest).xApiVersion(xApiVersion).execute();

Create Task Tags

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    List<TaskManagementCreateTaskTagsRequestTagsInner> tags = Arrays.asList();
    Integer companyId = 56;
    Long companyId = 1234L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    try {
      client
              .taskManagement
              .createTaskTags(tags, companyId, companyId)
              .xApiVersion(xApiVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#createTaskTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .taskManagement
              .createTaskTags(tags, companyId, companyId)
              .xApiVersion(xApiVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#createTaskTags");
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
| **taskManagementCreateTaskTagsRequest** | [**TaskManagementCreateTaskTagsRequest**](TaskManagementCreateTaskTagsRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |

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

<a name="deleteTaskListTemplate"></a>
# **deleteTaskListTemplate**
> deleteTaskListTemplate(companyId, uuid).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Task List Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long companyId = 8655L; // Company ID
    String uuid = "uuid_example"; // Task List Template UUID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .taskManagement
              .deleteTaskListTemplate(companyId, uuid)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#deleteTaskListTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .taskManagement
              .deleteTaskListTemplate(companyId, uuid)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#deleteTaskListTemplate");
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
| **uuid** | **String**| Task List Template UUID | |
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

<a name="deleteTaskTags"></a>
# **deleteTaskTags**
> deleteTaskTags(companyId, taskManagementDeleteTaskTagsRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Delete Task Tags

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Integer companyId = 56;
    List<String> uuids = Arrays.asList();
    Long companyId = 1234L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      client
              .taskManagement
              .deleteTaskTags(companyId, uuids, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#deleteTaskTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .taskManagement
              .deleteTaskTags(companyId, uuids, companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#deleteTaskTags");
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
| **taskManagementDeleteTaskTagsRequest** | [**TaskManagementDeleteTaskTagsRequest**](TaskManagementDeleteTaskTagsRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

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

<a name="editTaskListTemplate"></a>
# **editTaskListTemplate**
> TaskManagementEditTaskListTemplateResponse editTaskListTemplate(companyId, uuid, taskManagementEditTaskListTemplateRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

edit task list template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long companyId = 8655L; // Company ID
    String uuid = "8cff3c09-e328-4425-bea5-20151ddc805a"; // Task List Template UUID
    String title = "title_example";
    String description = "description_example";
    Integer status = 56;
    List<TaskManagementEditTaskListTemplateRequestTaskTemplatesInner> taskTemplates = Arrays.asList();
    String recurrence = "recurrence_example"; // recurrence rules as defined by the RFC 5545 spec
    List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> assignments = Arrays.asList();
    String due = "due_example"; // A date with YYYY-MM-DD format
    TaskManagementEditTaskListTemplateRequestTimeFrame timeFrame = new TaskManagementEditTaskListTemplateRequestTimeFrame();
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TaskManagementEditTaskListTemplateResponse result = client
              .taskManagement
              .editTaskListTemplate(companyId, uuid)
              .title(title)
              .description(description)
              .status(status)
              .taskTemplates(taskTemplates)
              .recurrence(recurrence)
              .assignments(assignments)
              .due(due)
              .timeFrame(timeFrame)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#editTaskListTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementEditTaskListTemplateResponse> response = client
              .taskManagement
              .editTaskListTemplate(companyId, uuid)
              .title(title)
              .description(description)
              .status(status)
              .taskTemplates(taskTemplates)
              .recurrence(recurrence)
              .assignments(assignments)
              .due(due)
              .timeFrame(timeFrame)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#editTaskListTemplate");
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
| **uuid** | **String**| Task List Template UUID | |
| **taskManagementEditTaskListTemplateRequest** | [**TaskManagementEditTaskListTemplateRequest**](TaskManagementEditTaskListTemplateRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TaskManagementEditTaskListTemplateResponse**](TaskManagementEditTaskListTemplateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task list template |  -  |

<a name="getSettings"></a>
# **getSettings**
> TaskManagementGetSettingsResponse getSettings(companyId).xApiVersion(xApiVersion).execute();

Gets task management settings for a company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    try {
      TaskManagementGetSettingsResponse result = client
              .taskManagement
              .getSettings(companyId)
              .xApiVersion(xApiVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementGetSettingsResponse> response = client
              .taskManagement
              .getSettings(companyId)
              .xApiVersion(xApiVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getSettings");
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

### Return type

[**TaskManagementGetSettingsResponse**](TaskManagementGetSettingsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTaskList"></a>
# **getTaskList**
> TaskManagementGetTaskListResponse getTaskList(companyId, listId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).userId(userId).execute();

Retrieve Task List

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long listId = 1234L; // List ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long userId = 5678L; // User ID
    try {
      TaskManagementGetTaskListResponse result = client
              .taskManagement
              .getTaskList(companyId, listId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementGetTaskListResponse> response = client
              .taskManagement
              .getTaskList(companyId, listId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskList");
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
| **listId** | **Long**| List ID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |
| **userId** | **Long**| User ID | [optional] |

### Return type

[**TaskManagementGetTaskListResponse**](TaskManagementGetTaskListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTaskListTemplate"></a>
# **getTaskListTemplate**
> TaskManagementGetTaskListTemplateResponse getTaskListTemplate(companyId, uuid).xApiVersion(xApiVersion).execute();

Retrieve Task List Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long companyId = 8655L; // Company ID
    String uuid = "uuid_example"; // Task List Template UUID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    try {
      TaskManagementGetTaskListTemplateResponse result = client
              .taskManagement
              .getTaskListTemplate(companyId, uuid)
              .xApiVersion(xApiVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskListTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementGetTaskListTemplateResponse> response = client
              .taskManagement
              .getTaskListTemplate(companyId, uuid)
              .xApiVersion(xApiVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskListTemplate");
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
| **uuid** | **String**| Task List Template UUID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |

### Return type

[**TaskManagementGetTaskListTemplateResponse**](TaskManagementGetTaskListTemplateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task list template |  -  |

<a name="getTaskListTemplates"></a>
# **getTaskListTemplates**
> TaskManagementGetTaskListTemplates200Response getTaskListTemplates(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).locationId(locationId).departmentId(departmentId).roleId(roleId).cursor(cursor).limit(limit).execute();

Get task list templates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long companyId = 8655L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long locationId = 56L; // Location ID
    Long departmentId = 56L; // Department ID
    Long roleId = 56L; // Role ID
    String cursor = "cursor_example"; // Cursor for the next or previous page of results.
    Long limit = 56L; // The number of results desired per page.
    try {
      TaskManagementGetTaskListTemplates200Response result = client
              .taskManagement
              .getTaskListTemplates(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskListTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementGetTaskListTemplates200Response> response = client
              .taskManagement
              .getTaskListTemplates(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .locationId(locationId)
              .departmentId(departmentId)
              .roleId(roleId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskListTemplates");
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
| **departmentId** | **Long**| Department ID | [optional] |
| **roleId** | **Long**| Role ID | [optional] |
| **cursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] |

### Return type

[**TaskManagementGetTaskListTemplates200Response**](TaskManagementGetTaskListTemplates200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task list templates |  -  |
| **0** | Unexpected error |  -  |

<a name="getTaskLists"></a>
# **getTaskLists**
> TaskManagementGetTaskListsResponse getTaskLists(companyId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).userId(userId).locationId(locationId).uuid(uuid).activeOnDate(activeOnDate).execute();

List Task Lists

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long companyId = 8655L; // Company ID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    Long userId = 5678L; // User ID
    Long locationId = 8655L; // Location ID
    String uuid = "325bf7a2-21a8-4599-a377-2380140b6710"; // Task List Template UUID
    String activeOnDate = "2019-11-05T00:00:00.000Z"; // Show only tasks lists that were active on a date (YYYY-MM-DD)
    try {
      TaskManagementGetTaskListsResponse result = client
              .taskManagement
              .getTaskLists(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .userId(userId)
              .locationId(locationId)
              .uuid(uuid)
              .activeOnDate(activeOnDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskLists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementGetTaskListsResponse> response = client
              .taskManagement
              .getTaskLists(companyId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .userId(userId)
              .locationId(locationId)
              .uuid(uuid)
              .activeOnDate(activeOnDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#getTaskLists");
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
| **userId** | **Long**| User ID | [optional] |
| **locationId** | **Long**| Location ID | [optional] |
| **uuid** | **String**| Task List Template UUID | [optional] |
| **activeOnDate** | **String**| Show only tasks lists that were active on a date (YYYY-MM-DD) | [optional] |

### Return type

[**TaskManagementGetTaskListsResponse**](TaskManagementGetTaskListsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listTaskListsSummary"></a>
# **listTaskListsSummary**
> TaskManagementListTaskListsSummary200Response listTaskListsSummary(companyId, locationId, date).execute();

List Task Lists Summary

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Long locationId = 5678L; // Location ID
    String date = "2019-07-01T00:00:00.000Z"; // Date of requested task lists
    try {
      TaskManagementListTaskListsSummary200Response result = client
              .taskManagement
              .listTaskListsSummary(companyId, locationId, date)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#listTaskListsSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementListTaskListsSummary200Response> response = client
              .taskManagement
              .listTaskListsSummary(companyId, locationId, date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#listTaskListsSummary");
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
| **date** | **String**| Date of requested task lists | |

### Return type

[**TaskManagementListTaskListsSummary200Response**](TaskManagementListTaskListsSummary200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task list daily summary |  -  |
| **0** | Unexpected error |  -  |

<a name="markComplete"></a>
# **markComplete**
> TaskManagementMarkCompleteResponse markComplete(companyId, listId, taskId, taskManagementMarkCompleteRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Complete Task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskManagementApi;
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
    Integer userId = 56;
    Long companyId = 1234L; // Company ID
    Long listId = 1234L; // Task List ID
    Long taskId = 1234L; // Task ID
    Object completionValue = null;
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      TaskManagementMarkCompleteResponse result = client
              .taskManagement
              .markComplete(userId, companyId, listId, taskId)
              .completionValue(completionValue)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#markComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskManagementMarkCompleteResponse> response = client
              .taskManagement
              .markComplete(userId, companyId, listId, taskId)
              .completionValue(completionValue)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskManagementApi#markComplete");
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
| **listId** | **Long**| Task List ID | |
| **taskId** | **Long**| Task ID | |
| **taskManagementMarkCompleteRequest** | [**TaskManagementMarkCompleteRequest**](TaskManagementMarkCompleteRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**TaskManagementMarkCompleteResponse**](TaskManagementMarkCompleteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

