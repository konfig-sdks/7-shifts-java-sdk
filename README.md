<div align="left">

[![Visit 7shifts](./header.png)](https://7shifts.com)

# [7shifts](https://7shifts.com)

7shifts is a team management software designed for restaurants. We help managers and operators spend less time and effort scheduling their staff, reduce their monthly labor costs and improve team communication. The result is simplified team management, one shift at a time.

7shifts also offers free mobile apps (iOS and Android) allowing managers and employees to have everything at their fingertips.

Start your free trial or request a demo at www.7shifts.com.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=7shifts&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>7-shifts-java-sdk</artifactId>
  <version>2023-05-01</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:7-shifts-java-sdk:2023-05-01"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/7-shifts-java-sdk-2023-05-01.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String email = "email_example"; // The user's email
    String firstname = "firstname_example"; // The user's first name
    String lastname = "lastname_example"; // The user's last name
    String companyName = "companyName_example"; // The company's name
    String country = "CA"; // The company's country
    String utmSource = "utmSource_example"; // The UTM source
    String mobilePhone = "mobilePhone_example"; // The user's mobile phone
    String utmCampaign = "utmCampaign_example"; // The UTM campaign
    String utmContent = "utmContent_example"; // The UTM content
    String utmMedium = "utmMedium_example"; // The UTM medium
    String utmTerm = "utmTerm_example"; // The UTM term
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      AccountCreateTrialAccountResponse result = client
              .account
              .createTrialAccount(email, firstname, lastname, companyName, country, utmSource)
              .mobilePhone(mobilePhone)
              .utmCampaign(utmCampaign)
              .utmContent(utmContent)
              .utmMedium(utmMedium)
              .utmTerm(utmTerm)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createTrialAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountCreateTrialAccountResponse> response = client
              .account
              .createTrialAccount(email, firstname, lastname, companyName, country, utmSource)
              .mobilePhone(mobilePhone)
              .utmCampaign(utmCampaign)
              .utmContent(utmContent)
              .utmMedium(utmMedium)
              .utmTerm(utmTerm)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createTrialAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.7shifts.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**createTrialAccount**](docs/AccountApi.md#createTrialAccount) | **POST** /v2/partner_company_creation | Create Trial Account
*AuthenticationApi* | [**generateOAuthToken**](docs/AuthenticationApi.md#generateOAuthToken) | **POST** /oauth2/token | Create OAuth Token
*AuthenticationApi* | [**getIdentity**](docs/AuthenticationApi.md#getIdentity) | **GET** /v2/whoami | Retrieve Identity
*AvailabilityApi* | [**createNew**](docs/AvailabilityApi.md#createNew) | **POST** /v2/company/{company_id}/availabilities | Create Availability
*AvailabilityApi* | [**createReason**](docs/AvailabilityApi.md#createReason) | **POST** /v2/company/{company_id}/availability_reasons | Create Availability Reason
*AvailabilityApi* | [**deleteReason**](docs/AvailabilityApi.md#deleteReason) | **DELETE** /v2/company/{company_id}/availability_reasons/{availability_reason_id} | Delete Availability Reason
*AvailabilityApi* | [**getById**](docs/AvailabilityApi.md#getById) | **GET** /v2/company/{company_id}/availabilities/{availability_id} | Retrieve Availability
*AvailabilityApi* | [**listAvailabilities**](docs/AvailabilityApi.md#listAvailabilities) | **GET** /v2/company/{company_id}/availabilities | List Availabilities
*AvailabilityApi* | [**listReasons**](docs/AvailabilityApi.md#listReasons) | **GET** /v2/company/{company_id}/availability_reasons | List Availability Reasons
*AvailabilityApi* | [**removeById**](docs/AvailabilityApi.md#removeById) | **DELETE** /v2/company/{company_id}/availabilities/{availability_id} | Delete Availability
*AvailabilityApi* | [**updateById**](docs/AvailabilityApi.md#updateById) | **PUT** /v2/company/{company_id}/availabilities/{availability_id} | Update Availability
*AvailabilityApi* | [**updateReasonById**](docs/AvailabilityApi.md#updateReasonById) | **PUT** /v2/company/{company_id}/availability_reasons/{availability_reason_id} | Update Availability Reason
*AvailabilityApi* | [**updateStatus**](docs/AvailabilityApi.md#updateStatus) | **PUT** /v2/company/{company_id}/availabilities/{availability_id}/status | Update Availability Status
*CompaniesApi* | [**getById**](docs/CompaniesApi.md#getById) | **GET** /v2/companies/{id} | Retrieve Company
*CompaniesApi* | [**getLaborSettings**](docs/CompaniesApi.md#getLaborSettings) | **GET** /v2/company/{company_id}/labor_settings | Retrieve Labor Settings
*CompaniesApi* | [**list**](docs/CompaniesApi.md#list) | **GET** /v2/companies | List Companies
*CompaniesApi* | [**listInactiveReasons**](docs/CompaniesApi.md#listInactiveReasons) | **GET** /v2/company/{company_id}/inactive_reasons | List Inactive Reasons
*CompaniesApi* | [**updateCompanyById**](docs/CompaniesApi.md#updateCompanyById) | **PATCH** /v2/companies/{id} | Update Company
*DayPartApi* | [**getSettings**](docs/DayPartApi.md#getSettings) | **GET** /v2/company/{company_id}/day_part/settings | Retrieve day part settings
*DepartmentsApi* | [**createNewDepartment**](docs/DepartmentsApi.md#createNewDepartment) | **POST** /v2/company/{company_id}/departments | Create Department
*DepartmentsApi* | [**deleteById**](docs/DepartmentsApi.md#deleteById) | **DELETE** /v2/company/{company_id}/departments/{department_id} | Delete Department
*DepartmentsApi* | [**getDepartment**](docs/DepartmentsApi.md#getDepartment) | **GET** /v2/company/{company_id}/departments/{department_id} | Retrieve Department
*DepartmentsApi* | [**list**](docs/DepartmentsApi.md#list) | **GET** /v2/company/{company_id}/departments | List Departments
*DepartmentsApi* | [**updateDepartment**](docs/DepartmentsApi.md#updateDepartment) | **PUT** /v2/company/{company_id}/departments/{department_id} | Update Department
*EngageApi* | [**overviewByLocationId**](docs/EngageApi.md#overviewByLocationId) | **GET** /v2/company/{company_id}/locations/{location_id}/engage_overview | Retrieve Engagement Overview
*ExternalUserMappingsApi* | [**createBulkMappings**](docs/ExternalUserMappingsApi.md#createBulkMappings) | **POST** /v2/company/{company_id}/external_user_mappings_bulk | Create User External Mappings
*ExternalUserMappingsApi* | [**createMapping**](docs/ExternalUserMappingsApi.md#createMapping) | **POST** /v2/company/{company_id}/external_user_mappings | Create External User Mapping
*ExternalUserMappingsApi* | [**deleteMapping**](docs/ExternalUserMappingsApi.md#deleteMapping) | **DELETE** /v2/company/{company_id}/external_user_mappings/{identifier} | Delete External User Mapping
*ExternalUserMappingsApi* | [**getMappingById**](docs/ExternalUserMappingsApi.md#getMappingById) | **GET** /v2/company/{company_id}/external_user_mappings/{identifier} | Retrieve User External Mapping
*ExternalUserMappingsApi* | [**list**](docs/ExternalUserMappingsApi.md#list) | **GET** /v2/company/{company_id}/external_user_mappings | List External User Mapping
*ExternalUserMappingsApi* | [**updateMappingByIdentifier**](docs/ExternalUserMappingsApi.md#updateMappingByIdentifier) | **PUT** /v2/company/{company_id}/external_user_mappings/{identifier} | Update External User Mappings
*ForecastOverridesApi* | [**bulkCreateProjectedForecastOverride**](docs/ForecastOverridesApi.md#bulkCreateProjectedForecastOverride) | **POST** /v2/company/{company_id}/location/{location_id}/forecast_overrides | Create Bulk Daily Projected Forecast Overrides
*ForecastOverridesApi* | [**bulkCreateProjectedSalesIntervalOverride**](docs/ForecastOverridesApi.md#bulkCreateProjectedSalesIntervalOverride) | **POST** /v2/company/{company_id}/locations/{location_id}/forecast_overrides_intervals | Create Bulk Daily Projected Forecast Overrides
*ForecastOverridesApi* | [**createDailyProjectedForecastOverride**](docs/ForecastOverridesApi.md#createDailyProjectedForecastOverride) | **POST** /v2/company/{company_id}/location/{location_id}/forecast_override | Create Daily Projected Forecast Override
*ForecastOverridesApi* | [**overrideInterval**](docs/ForecastOverridesApi.md#overrideInterval) | **POST** /v2/company/{company_id}/locations/{location_id}/forecast_override_interval | Create Interval Projected Forecast Override
*ForecastOverridesApi* | [**syncProjectedForecastOverride**](docs/ForecastOverridesApi.md#syncProjectedForecastOverride) | **DELETE** /v2/company/{company_id}/location/{location_id}/forecast_override | Sync Daily Projected Forecast Override
*ForecastOverridesApi* | [**syncProjectedSalesInterval**](docs/ForecastOverridesApi.md#syncProjectedSalesInterval) | **DELETE** /v2/company/{company_id}/locations/{location_id}/forecast_override_interval | Sync Interval Projected Forecast Override
*IntegrationMappingsApi* | [**createSalesCategoryMappingsBulk**](docs/IntegrationMappingsApi.md#createSalesCategoryMappingsBulk) | **POST** /v2/company/{company_id}/location/{location_id}/sales_category_mappings_bulk | Create Sales Category Mappings
*IntegrationMappingsApi* | [**deleteSalesCategoryMappings**](docs/IntegrationMappingsApi.md#deleteSalesCategoryMappings) | **DELETE** /v2/company/{company_id}/location/{location_id}/sales_category_mappings/{external_id} | Delete Sales Category Mappings
*IntegrationMappingsApi* | [**listSalesCategoryMappings**](docs/IntegrationMappingsApi.md#listSalesCategoryMappings) | **GET** /v2/company/{company_id}/location/{location_id}/sales_category_mappings | List Sales Category Mappings
*LocationsApi* | [**create**](docs/LocationsApi.md#create) | **POST** /v2/company/{company_id}/locations | Create Location
*LocationsApi* | [**getLocation**](docs/LocationsApi.md#getLocation) | **GET** /v2/company/{company_id}/locations/{location_id} | Retrieve Location
*LocationsApi* | [**listGet**](docs/LocationsApi.md#listGet) | **GET** /v2/company/{company_id}/locations | List Locations
*LocationsApi* | [**removeLocationById**](docs/LocationsApi.md#removeLocationById) | **DELETE** /v2/company/{company_id}/locations/{location_id} | Delete Location
*LocationsApi* | [**updateLocationById**](docs/LocationsApi.md#updateLocationById) | **PUT** /v2/company/{company_id}/locations/{location_id} | Update Location
*LogBookApi* | [**createCategory**](docs/LogBookApi.md#createCategory) | **POST** /v2/company/{company_id}/log_book_categories | Create Log Book Category
*LogBookApi* | [**createComment**](docs/LogBookApi.md#createComment) | **POST** /v2/company/{company_id}/log_book_comments | Create Log Book Comment
*LogBookApi* | [**createPost**](docs/LogBookApi.md#createPost) | **POST** /v2/company/{company_id}/log_book_posts | Create Log Book Post
*LogBookApi* | [**deleteCategoryById**](docs/LogBookApi.md#deleteCategoryById) | **DELETE** /v2/company/{company_id}/log_book_categories/{id} | Delete Log Book Category
*LogBookApi* | [**deleteComment**](docs/LogBookApi.md#deleteComment) | **DELETE** /v2/company/{company_id}/log_book_comments/{id} | Delete Log Book Comment
*LogBookApi* | [**deletePost**](docs/LogBookApi.md#deletePost) | **DELETE** /v2/company/{company_id}/log_book_posts/{id} | Delete Log Book Post
*LogBookApi* | [**getComment**](docs/LogBookApi.md#getComment) | **GET** /v2/company/{company_id}/log_book_comments/{id} | Retrieve Log Book Comment
*LogBookApi* | [**getPost**](docs/LogBookApi.md#getPost) | **GET** /v2/company/{company_id}/log_book_posts/{id} | Retrieve Log Book Post
*LogBookApi* | [**listCategories**](docs/LogBookApi.md#listCategories) | **GET** /v2/company/{company_id}/log_book_categories | List Log Book Categories
*LogBookApi* | [**listComments**](docs/LogBookApi.md#listComments) | **GET** /v2/company/{company_id}/log_book_comments | List Log Book Comments
*LogBookApi* | [**listPosts**](docs/LogBookApi.md#listPosts) | **GET** /v2/company/{company_id}/log_book_posts | List Log Book Posts
*LogBookApi* | [**updateCategoryById**](docs/LogBookApi.md#updateCategoryById) | **PATCH** /v2/company/{company_id}/log_book_categories/{id} | Update Log Book Category
*ReceiptsApi* | [**createReceipt**](docs/ReceiptsApi.md#createReceipt) | **POST** /v2/company/{company_id}/receipts | Create Receipt
*ReceiptsApi* | [**getReceipt**](docs/ReceiptsApi.md#getReceipt) | **GET** /v2/company/{company_id}/receipts/{receipt_id} | Retrieve Receipt
*ReceiptsApi* | [**getSummary**](docs/ReceiptsApi.md#getSummary) | **GET** /v2/company/{company_id}/receipts_summary | Retrieve Receipts Summary
*ReceiptsApi* | [**list**](docs/ReceiptsApi.md#list) | **GET** /v2/company/{company_id}/receipts | List Receipts
*ReceiptsApi* | [**updateReceipt**](docs/ReceiptsApi.md#updateReceipt) | **PUT** /v2/company/{company_id}/receipts/{receipt_id} | Update Receipt
*ReportsApi* | [**getDailySalesAndLabor**](docs/ReportsApi.md#getDailySalesAndLabor) | **GET** /v2/reports/daily_sales_and_labor | Retrieve Daily Sales &amp; Labor
*ReportsApi* | [**getDailyStats**](docs/ReportsApi.md#getDailyStats) | **GET** /api/v2/company/{company_id}/location/{location_id}/daily_stats | Retrieve Daily Stats
*ReportsApi* | [**getWorkedHoursWages**](docs/ReportsApi.md#getWorkedHoursWages) | **GET** /v2/reports/hours_and_wages | Retrieve Worked Hours &amp; Wages
*RolesApi* | [**createRole**](docs/RolesApi.md#createRole) | **POST** /v2/company/{company_id}/roles | Create Role
*RolesApi* | [**deleteRole**](docs/RolesApi.md#deleteRole) | **DELETE** /v2/company/{company_id}/roles/{role_id} | Delete Role
*RolesApi* | [**getRole**](docs/RolesApi.md#getRole) | **GET** /v2/company/{company_id}/roles/{role_id} | Retrieve Role
*RolesApi* | [**list**](docs/RolesApi.md#list) | **GET** /v2/company/{company_id}/roles | List Roles
*RolesApi* | [**updateRoleById**](docs/RolesApi.md#updateRoleById) | **PUT** /v2/company/{company_id}/roles/{role_id} | Update Role
*ScheduleEnforcementApi* | [**listScheduledShifts**](docs/ScheduleEnforcementApi.md#listScheduledShifts) | **GET** /v2/company/{company_id}/shifts_scheduled/{id} | List Scheduled Shifts
*ScheduleEventsApi* | [**createEvent**](docs/ScheduleEventsApi.md#createEvent) | **POST** /v2/company/{company_id}/events | Create Event
*ScheduleEventsApi* | [**deleteEvent**](docs/ScheduleEventsApi.md#deleteEvent) | **DELETE** /v2/company/{company_id}/events/{event_id} | Delete Event
*ScheduleEventsApi* | [**getEventById**](docs/ScheduleEventsApi.md#getEventById) | **GET** /v2/company/{company_id}/events/{event_id} | Retrieve Event
*ScheduleEventsApi* | [**listEvents**](docs/ScheduleEventsApi.md#listEvents) | **GET** /v2/company/{company_id}/events | List Events
*ScheduleEventsApi* | [**updateEventById**](docs/ScheduleEventsApi.md#updateEventById) | **PATCH** /v2/company/{company_id}/events/{event_id} | Update Event
*ShiftFeedbackApi* | [**list**](docs/ShiftFeedbackApi.md#list) | **GET** /v2/company/{company_id}/shift_feedback | List Shift Feedback
*ShiftsApi* | [**createNewShift**](docs/ShiftsApi.md#createNewShift) | **POST** /v2/company/{company_id}/shifts | Create Shift
*ShiftsApi* | [**deleteShiftById**](docs/ShiftsApi.md#deleteShiftById) | **DELETE** /v2/company/{company_id}/shifts/{shift_id} | Delete Shift
*ShiftsApi* | [**getShiftById**](docs/ShiftsApi.md#getShiftById) | **GET** /v2/company/{company_id}/shifts/{shift_id} | Retrieve Shift
*ShiftsApi* | [**list**](docs/ShiftsApi.md#list) | **GET** /v2/company/{company_id}/shifts | List Shifts
*ShiftsApi* | [**updateShiftById**](docs/ShiftsApi.md#updateShiftById) | **PUT** /v2/company/{company_id}/shifts/{shift_id} | Update Shift
*TaskManagementApi* | [**clearTask**](docs/TaskManagementApi.md#clearTask) | **POST** /v2/company/{company_id}/task_lists/{list_id}/tasks/{task_id}/clear | Clear task
*TaskManagementApi* | [**createTaskListTemplate**](docs/TaskManagementApi.md#createTaskListTemplate) | **POST** /v2/company/{company_id}/task_list_templates | Create Task List Template
*TaskManagementApi* | [**createTaskTags**](docs/TaskManagementApi.md#createTaskTags) | **POST** /v2/company/{company_id}/task_tags | Create Task Tags
*TaskManagementApi* | [**deleteTaskListTemplate**](docs/TaskManagementApi.md#deleteTaskListTemplate) | **DELETE** /v2/company/{company_id}/task_list_templates/{uuid} | Delete Task List Template
*TaskManagementApi* | [**deleteTaskTags**](docs/TaskManagementApi.md#deleteTaskTags) | **DELETE** /v2/company/{company_id}/task_tags | Delete Task Tags
*TaskManagementApi* | [**editTaskListTemplate**](docs/TaskManagementApi.md#editTaskListTemplate) | **PUT** /v2/company/{company_id}/task_list_templates/{uuid} | edit task list template
*TaskManagementApi* | [**getSettings**](docs/TaskManagementApi.md#getSettings) | **GET** /v2/company/{company_id}/task_management_settings | Gets task management settings for a company
*TaskManagementApi* | [**getTaskList**](docs/TaskManagementApi.md#getTaskList) | **GET** /v2/company/{company_id}/task_lists/{list_id} | Retrieve Task List
*TaskManagementApi* | [**getTaskListTemplate**](docs/TaskManagementApi.md#getTaskListTemplate) | **GET** /v2/company/{company_id}/task_list_templates/{uuid} | Retrieve Task List Template
*TaskManagementApi* | [**getTaskListTemplates**](docs/TaskManagementApi.md#getTaskListTemplates) | **GET** /v2/company/{company_id}/task_list_templates | Get task list templates
*TaskManagementApi* | [**getTaskLists**](docs/TaskManagementApi.md#getTaskLists) | **GET** /v2/company/{company_id}/task_lists | List Task Lists
*TaskManagementApi* | [**listTaskListsSummary**](docs/TaskManagementApi.md#listTaskListsSummary) | **GET** /v2/company/{company_id}/task_list_daily_summary | List Task Lists Summary
*TaskManagementApi* | [**markComplete**](docs/TaskManagementApi.md#markComplete) | **POST** /v2/company/{company_id}/task_lists/{list_id}/tasks/{task_id}/complete | Complete Task
*TimeOffApi* | [**approveRequest**](docs/TimeOffApi.md#approveRequest) | **POST** /v2/time_off/{time_off_id}/approve | Approve Time Off Request
*TimeOffApi* | [**createRequest**](docs/TimeOffApi.md#createRequest) | **POST** /v2/time_off | Create time off
*TimeOffApi* | [**declineRequest**](docs/TimeOffApi.md#declineRequest) | **POST** /v2/time_off/{time_off_id}/decline | Decline Time Off Request
*TimeOffApi* | [**getSettings**](docs/TimeOffApi.md#getSettings) | **GET** /v2/time_off_settings/{company_id} | Retrieve Time Off Settings
*TimeOffApi* | [**getTimeOffById**](docs/TimeOffApi.md#getTimeOffById) | **GET** /v2/time_off/{time_off_id} | Retrieve Time Off
*TimeOffApi* | [**getTotalHours**](docs/TimeOffApi.md#getTotalHours) | **GET** /v2/time_off/total_hours | Retrieve Time Off Hours
*TimeOffApi* | [**list**](docs/TimeOffApi.md#list) | **GET** /v2/time_off | List Time Off
*TimeOffApi* | [**remove**](docs/TimeOffApi.md#remove) | **DELETE** /v2/time_off/{time_off_id} | Delete Time Off
*TimeOffApi* | [**setTimeOffSettings**](docs/TimeOffApi.md#setTimeOffSettings) | **POST** /v2/time_off_settings/{company_id} | Create Time Off Settings
*TimeOffApi* | [**updateTimeOffById**](docs/TimeOffApi.md#updateTimeOffById) | **PATCH** /v2/time_off/{time_off_id} | Update Time Off
*TimePunchesApi* | [**create**](docs/TimePunchesApi.md#create) | **POST** /v2/company/{company_id}/time_punches | Create Time Punch
*TimePunchesApi* | [**deleteById**](docs/TimePunchesApi.md#deleteById) | **DELETE** /v2/company/{company_id}/time_punches/{time_punch_id} | Delete Time Punch
*TimePunchesApi* | [**getTimePunch**](docs/TimePunchesApi.md#getTimePunch) | **GET** /v2/company/{company_id}/time_punches/{time_punch_id} | Retrieve Time Punch
*TimePunchesApi* | [**list**](docs/TimePunchesApi.md#list) | **GET** /v2/company/{company_id}/time_punches | List Time Punches
*TimePunchesApi* | [**updateById**](docs/TimePunchesApi.md#updateById) | **PUT** /v2/company/{company_id}/time_punches/{time_punch_id} | Update Time Punch
*TipPoolApi* | [**getDetailedReport**](docs/TipPoolApi.md#getDetailedReport) | **GET** /v2/company/{company_id}/locations/{location_id}/tip_pool_detailed_report | Retreive Tip Pool Detailed Report
*TipPoolApi* | [**getManualEntryTips**](docs/TipPoolApi.md#getManualEntryTips) | **GET** /v2/company/{company_id}/tip_pool/{tip_pool_settings_uuid}/manual_entry | Grabs manual entry tips for a tip pool
*TipPoolApi* | [**getSettings**](docs/TipPoolApi.md#getSettings) | **GET** /v2/company/{company_id}/tip_pool_settings | Gets tip pool settings for a company
*TipPoolApi* | [**getSummaryReport**](docs/TipPoolApi.md#getSummaryReport) | **GET** /v2/company/{company_id}/locations/{location_id}/tip_pool_summary_report | Retreive Tip Pool Summary Report
*TipPoolApi* | [**saveManualEntry**](docs/TipPoolApi.md#saveManualEntry) | **PUT** /v2/company/{company_id}/tip_pool/{tip_pool_settings_uuid}/manual_entry | Saves manual entries for a tip pool
*UserAssignmentsApi* | [**createDepartmentAssignment**](docs/UserAssignmentsApi.md#createDepartmentAssignment) | **POST** /v2/company/{company_id}/users/{user_id}/department_assignments | Create Department Assignment
*UserAssignmentsApi* | [**createLocationAssignment**](docs/UserAssignmentsApi.md#createLocationAssignment) | **POST** /v2/company/{company_id}/users/{user_id}/location_assignments | Create Location Assignments
*UserAssignmentsApi* | [**createRoleAssignment**](docs/UserAssignmentsApi.md#createRoleAssignment) | **POST** /v2/company/{company_id}/users/{user_id}/role_assignments | Create Role Assignment
*UserAssignmentsApi* | [**deleteRoleAssignment**](docs/UserAssignmentsApi.md#deleteRoleAssignment) | **DELETE** /v2/company/{company_id}/users/{user_id}/role_assignments/{role_id} | Delete Role Assignment
*UserAssignmentsApi* | [**list**](docs/UserAssignmentsApi.md#list) | **GET** /v2/company/{company_id}/users/{user_id}/assignments | List Assignments
*UserAssignmentsApi* | [**listDepartmentAssignments**](docs/UserAssignmentsApi.md#listDepartmentAssignments) | **GET** /v2/company/{company_id}/users/{user_id}/department_assignments | List Department Assignments
*UserAssignmentsApi* | [**listLocationAssignments**](docs/UserAssignmentsApi.md#listLocationAssignments) | **GET** /v2/company/{company_id}/users/{user_id}/location_assignments | List Location Assignments
*UserAssignmentsApi* | [**listRoleAssignments**](docs/UserAssignmentsApi.md#listRoleAssignments) | **GET** /v2/company/{company_id}/users/{user_id}/role_assignments | List Role Assignments
*UserAssignmentsApi* | [**removeDepartmentAssignment**](docs/UserAssignmentsApi.md#removeDepartmentAssignment) | **DELETE** /v2/company/{company_id}/users/{user_id}/department_assignments/{department_id} | Delete Department Assignment
*UserAssignmentsApi* | [**removeLocationAssignment**](docs/UserAssignmentsApi.md#removeLocationAssignment) | **DELETE** /v2/company/{company_id}/users/{user_id}/location_assignments/{location_id} | Delete Location Assignment
*UserWagesApi* | [**create**](docs/UserWagesApi.md#create) | **POST** /v2/company/{company_id}/users/{user_id}/wages | Create User Wage
*UserWagesApi* | [**list**](docs/UserWagesApi.md#list) | **GET** /v2/company/{company_id}/users/{user_id}/wages | List User Wages
*UsersApi* | [**bulkCreate**](docs/UsersApi.md#bulkCreate) | **POST** /v2/company/{company_id}/create_many_users | Create Many Users
*UsersApi* | [**createNewUser**](docs/UsersApi.md#createNewUser) | **POST** /v2/company/{company_id}/users | Create User
*UsersApi* | [**deactivate**](docs/UsersApi.md#deactivate) | **DELETE** /v2/company/{company_id}/users/{identifier} | Deactivate User
*UsersApi* | [**getUserByIdentifier**](docs/UsersApi.md#getUserByIdentifier) | **GET** /v2/company/{company_id}/users/{identifier} | Retrieve User
*UsersApi* | [**list**](docs/UsersApi.md#list) | **GET** /v2/company/{company_id}/users | List Users
*UsersApi* | [**updateUserByIdentifier**](docs/UsersApi.md#updateUserByIdentifier) | **PUT** /v2/company/{company_id}/users/{identifier} | Update User
*WebhooksApi* | [**create**](docs/WebhooksApi.md#create) | **POST** /v2/company/{company_id}/webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhookById**](docs/WebhooksApi.md#deleteWebhookById) | **DELETE** /v2/company/{company_id}/webhooks/{webhook_id} | Delete Webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /v2/company/{company_id}/test_webhook | Test Webhook
*WebhooksApi* | [**list**](docs/WebhooksApi.md#list) | **GET** /v2/company/{company_id}/webhooks | List Webhooks
*WebhooksApi* | [**update**](docs/WebhooksApi.md#update) | **PUT** /v2/company/{company_id}/webhooks/{webhook_id} | Update Webhook


## Documentation for Models

 - [AccountCreateTrialAccountRequest](docs/AccountCreateTrialAccountRequest.md)
 - [AccountCreateTrialAccountResponse](docs/AccountCreateTrialAccountResponse.md)
 - [AccountCreateTrialAccountResponseData](docs/AccountCreateTrialAccountResponseData.md)
 - [AuthenticationGenerateOAuthTokenRequest](docs/AuthenticationGenerateOAuthTokenRequest.md)
 - [AuthenticationGenerateOAuthTokenResponse](docs/AuthenticationGenerateOAuthTokenResponse.md)
 - [AuthenticationGetIdentityResponse](docs/AuthenticationGetIdentityResponse.md)
 - [AuthenticationGetIdentityResponseData](docs/AuthenticationGetIdentityResponseData.md)
 - [AuthenticationGetIdentityResponseDataUsersInner](docs/AuthenticationGetIdentityResponseDataUsersInner.md)
 - [AuthenticationGetIdentityResponseDataUsersInnerMeta](docs/AuthenticationGetIdentityResponseDataUsersInnerMeta.md)
 - [AvailabilityCreateNewRequest](docs/AvailabilityCreateNewRequest.md)
 - [AvailabilityCreateNewResponse](docs/AvailabilityCreateNewResponse.md)
 - [AvailabilityCreateNewResponseData](docs/AvailabilityCreateNewResponseData.md)
 - [AvailabilityCreateReasonRequest](docs/AvailabilityCreateReasonRequest.md)
 - [AvailabilityCreateReasonResponse](docs/AvailabilityCreateReasonResponse.md)
 - [AvailabilityCreateReasonResponseData](docs/AvailabilityCreateReasonResponseData.md)
 - [AvailabilityGetByIdResponse](docs/AvailabilityGetByIdResponse.md)
 - [AvailabilityListAvailabilitiesResponse](docs/AvailabilityListAvailabilitiesResponse.md)
 - [AvailabilityListAvailabilitiesResponseDataInner](docs/AvailabilityListAvailabilitiesResponseDataInner.md)
 - [AvailabilityListAvailabilitiesResponseDataInnerOldApprovedData](docs/AvailabilityListAvailabilitiesResponseDataInnerOldApprovedData.md)
 - [AvailabilityListReasonsResponse](docs/AvailabilityListReasonsResponse.md)
 - [AvailabilityListReasonsResponseDataInner](docs/AvailabilityListReasonsResponseDataInner.md)
 - [AvailabilityUpdateByIdRequest](docs/AvailabilityUpdateByIdRequest.md)
 - [AvailabilityUpdateByIdResponse](docs/AvailabilityUpdateByIdResponse.md)
 - [AvailabilityUpdateReasonByIdRequest](docs/AvailabilityUpdateReasonByIdRequest.md)
 - [AvailabilityUpdateReasonByIdResponse](docs/AvailabilityUpdateReasonByIdResponse.md)
 - [AvailabilityUpdateReasonByIdResponseData](docs/AvailabilityUpdateReasonByIdResponseData.md)
 - [AvailabilityUpdateStatusRequest](docs/AvailabilityUpdateStatusRequest.md)
 - [CompaniesGetByIdResponse](docs/CompaniesGetByIdResponse.md)
 - [CompaniesGetLaborSettingsResponse](docs/CompaniesGetLaborSettingsResponse.md)
 - [CompaniesGetLaborSettingsResponseData](docs/CompaniesGetLaborSettingsResponseData.md)
 - [CompaniesListInactiveReasonsResponse](docs/CompaniesListInactiveReasonsResponse.md)
 - [CompaniesListResponse](docs/CompaniesListResponse.md)
 - [CompaniesListResponseDataInner](docs/CompaniesListResponseDataInner.md)
 - [CompaniesListResponseDataInnerMeta](docs/CompaniesListResponseDataInnerMeta.md)
 - [CompaniesUpdateCompanyByIdRequest](docs/CompaniesUpdateCompanyByIdRequest.md)
 - [CompaniesUpdateCompanyByIdResponse](docs/CompaniesUpdateCompanyByIdResponse.md)
 - [DayPartGetSettingsResponse](docs/DayPartGetSettingsResponse.md)
 - [DayPartGetSettingsResponseDataInner](docs/DayPartGetSettingsResponseDataInner.md)
 - [DayPartGetSettingsResponseDataInnerSegmentsInner](docs/DayPartGetSettingsResponseDataInnerSegmentsInner.md)
 - [DepartmentsCreateNewDepartmentRequest](docs/DepartmentsCreateNewDepartmentRequest.md)
 - [DepartmentsCreateNewDepartmentResponse](docs/DepartmentsCreateNewDepartmentResponse.md)
 - [DepartmentsGetDepartmentResponse](docs/DepartmentsGetDepartmentResponse.md)
 - [DepartmentsListResponse](docs/DepartmentsListResponse.md)
 - [DepartmentsListResponseDataInner](docs/DepartmentsListResponseDataInner.md)
 - [DepartmentsUpdateDepartmentRequest](docs/DepartmentsUpdateDepartmentRequest.md)
 - [DepartmentsUpdateDepartmentResponse](docs/DepartmentsUpdateDepartmentResponse.md)
 - [EngageOverviewByLocationIdResponse](docs/EngageOverviewByLocationIdResponse.md)
 - [EngageOverviewByLocationIdResponseData](docs/EngageOverviewByLocationIdResponseData.md)
 - [EngageOverviewByLocationIdResponseDataEmployeeStats](docs/EngageOverviewByLocationIdResponseDataEmployeeStats.md)
 - [EngageOverviewByLocationIdResponseDataEmployeeStatsMostReliable](docs/EngageOverviewByLocationIdResponseDataEmployeeStatsMostReliable.md)
 - [EngageOverviewByLocationIdResponseDataEngagementScores](docs/EngageOverviewByLocationIdResponseDataEngagementScores.md)
 - [EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInner](docs/EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInner.md)
 - [EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInnerMetrics](docs/EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInnerMetrics.md)
 - [EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInnerMetricsShiftBids](docs/EngageOverviewByLocationIdResponseDataEngagementScoresMostEngagedInnerMetricsShiftBids.md)
 - [EngageOverviewByLocationIdResponseDataLocationStats](docs/EngageOverviewByLocationIdResponseDataLocationStats.md)
 - [EngageOverviewByLocationIdResponseDataLocationStatsLates](docs/EngageOverviewByLocationIdResponseDataLocationStatsLates.md)
 - [EngageOverviewByLocationIdResponseDataShiftFeedback](docs/EngageOverviewByLocationIdResponseDataShiftFeedback.md)
 - [EngageOverviewByLocationIdResponseDataTenure](docs/EngageOverviewByLocationIdResponseDataTenure.md)
 - [ExternalUserMappingsCreateBulkMappingsRequest](docs/ExternalUserMappingsCreateBulkMappingsRequest.md)
 - [ExternalUserMappingsCreateBulkMappingsRequestDataInner](docs/ExternalUserMappingsCreateBulkMappingsRequestDataInner.md)
 - [ExternalUserMappingsCreateBulkMappingsResponse](docs/ExternalUserMappingsCreateBulkMappingsResponse.md)
 - [ExternalUserMappingsCreateBulkMappingsResponseData](docs/ExternalUserMappingsCreateBulkMappingsResponseData.md)
 - [ExternalUserMappingsCreateBulkMappingsResponseDataExceptionsInner](docs/ExternalUserMappingsCreateBulkMappingsResponseDataExceptionsInner.md)
 - [ExternalUserMappingsCreateBulkMappingsResponseDataMappedInner](docs/ExternalUserMappingsCreateBulkMappingsResponseDataMappedInner.md)
 - [ExternalUserMappingsCreateMappingRequest](docs/ExternalUserMappingsCreateMappingRequest.md)
 - [ExternalUserMappingsCreateMappingResponse](docs/ExternalUserMappingsCreateMappingResponse.md)
 - [ExternalUserMappingsCreateMappingResponseData](docs/ExternalUserMappingsCreateMappingResponseData.md)
 - [ExternalUserMappingsGetMappingByIdResponse](docs/ExternalUserMappingsGetMappingByIdResponse.md)
 - [ExternalUserMappingsGetMappingByIdResponseData](docs/ExternalUserMappingsGetMappingByIdResponseData.md)
 - [ExternalUserMappingsListResponse](docs/ExternalUserMappingsListResponse.md)
 - [ExternalUserMappingsListResponseDataInner](docs/ExternalUserMappingsListResponseDataInner.md)
 - [ExternalUserMappingsListResponseMeta](docs/ExternalUserMappingsListResponseMeta.md)
 - [ExternalUserMappingsUpdateMappingByIdentifierRequest](docs/ExternalUserMappingsUpdateMappingByIdentifierRequest.md)
 - [ExternalUserMappingsUpdateMappingByIdentifierResponse](docs/ExternalUserMappingsUpdateMappingByIdentifierResponse.md)
 - [ExternalUserMappingsUpdateMappingByIdentifierResponseData](docs/ExternalUserMappingsUpdateMappingByIdentifierResponseData.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideRequest](docs/ForecastOverridesBulkCreateProjectedForecastOverrideRequest.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideRequestDataInner](docs/ForecastOverridesBulkCreateProjectedForecastOverrideRequestDataInner.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideResponse](docs/ForecastOverridesBulkCreateProjectedForecastOverrideResponse.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideResponseData](docs/ForecastOverridesBulkCreateProjectedForecastOverrideResponseData.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideResponseDataExceptionsInner](docs/ForecastOverridesBulkCreateProjectedForecastOverrideResponseDataExceptionsInner.md)
 - [ForecastOverridesBulkCreateProjectedForecastOverrideResponseDataForecastOverridesInner](docs/ForecastOverridesBulkCreateProjectedForecastOverrideResponseDataForecastOverridesInner.md)
 - [ForecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner](docs/ForecastOverridesBulkCreateProjectedSalesIntervalOverrideRequestInner.md)
 - [ForecastOverridesCreateDailyProjectedForecastOverrideRequest](docs/ForecastOverridesCreateDailyProjectedForecastOverrideRequest.md)
 - [ForecastOverridesCreateDailyProjectedForecastOverrideResponse](docs/ForecastOverridesCreateDailyProjectedForecastOverrideResponse.md)
 - [ForecastOverridesCreateDailyProjectedForecastOverrideResponseData](docs/ForecastOverridesCreateDailyProjectedForecastOverrideResponseData.md)
 - [ForecastOverridesOverrideIntervalRequest](docs/ForecastOverridesOverrideIntervalRequest.md)
 - [ForecastOverridesSyncProjectedForecastOverrideRequest](docs/ForecastOverridesSyncProjectedForecastOverrideRequest.md)
 - [ForecastOverridesSyncProjectedSalesIntervalRequest](docs/ForecastOverridesSyncProjectedSalesIntervalRequest.md)
 - [IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner](docs/IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner.md)
 - [IntegrationMappingsCreateSalesCategoryMappingsBulkResponse](docs/IntegrationMappingsCreateSalesCategoryMappingsBulkResponse.md)
 - [IntegrationMappingsListSalesCategoryMappingsResponse](docs/IntegrationMappingsListSalesCategoryMappingsResponse.md)
 - [IntegrationMappingsListSalesCategoryMappingsResponseDataInner](docs/IntegrationMappingsListSalesCategoryMappingsResponseDataInner.md)
 - [LocationsCreateRequest](docs/LocationsCreateRequest.md)
 - [LocationsCreateResponse](docs/LocationsCreateResponse.md)
 - [LocationsCreateResponseData](docs/LocationsCreateResponseData.md)
 - [LocationsGetLocationResponse](docs/LocationsGetLocationResponse.md)
 - [LocationsGetLocationResponseData](docs/LocationsGetLocationResponseData.md)
 - [LocationsListGetResponse](docs/LocationsListGetResponse.md)
 - [LocationsListGetResponseDataInner](docs/LocationsListGetResponseDataInner.md)
 - [LocationsListGetResponseMeta](docs/LocationsListGetResponseMeta.md)
 - [LocationsListGetResponseMetaCursor](docs/LocationsListGetResponseMetaCursor.md)
 - [LocationsUpdateLocationByIdRequest](docs/LocationsUpdateLocationByIdRequest.md)
 - [LocationsUpdateLocationByIdResponse](docs/LocationsUpdateLocationByIdResponse.md)
 - [LocationsUpdateLocationByIdResponseData](docs/LocationsUpdateLocationByIdResponseData.md)
 - [LogBookCreateCategoryRequest](docs/LogBookCreateCategoryRequest.md)
 - [LogBookCreateCategoryResponse](docs/LogBookCreateCategoryResponse.md)
 - [LogBookCreateCommentRequest](docs/LogBookCreateCommentRequest.md)
 - [LogBookCreateCommentResponse](docs/LogBookCreateCommentResponse.md)
 - [LogBookCreateCommentResponseData](docs/LogBookCreateCommentResponseData.md)
 - [LogBookCreatePostRequest](docs/LogBookCreatePostRequest.md)
 - [LogBookCreatePostRequestAttachmentsInner](docs/LogBookCreatePostRequestAttachmentsInner.md)
 - [LogBookCreatePostResponse](docs/LogBookCreatePostResponse.md)
 - [LogBookCreatePostResponseData](docs/LogBookCreatePostResponseData.md)
 - [LogBookGetCommentResponse](docs/LogBookGetCommentResponse.md)
 - [LogBookGetCommentResponseData](docs/LogBookGetCommentResponseData.md)
 - [LogBookGetPostResponse](docs/LogBookGetPostResponse.md)
 - [LogBookGetPostResponseData](docs/LogBookGetPostResponseData.md)
 - [LogBookListCategoriesResponse](docs/LogBookListCategoriesResponse.md)
 - [LogBookListCategoriesResponseDataInner](docs/LogBookListCategoriesResponseDataInner.md)
 - [LogBookListCommentsResponse](docs/LogBookListCommentsResponse.md)
 - [LogBookListCommentsResponseDataInner](docs/LogBookListCommentsResponseDataInner.md)
 - [LogBookListPostsResponse](docs/LogBookListPostsResponse.md)
 - [LogBookListPostsResponseDataInner](docs/LogBookListPostsResponseDataInner.md)
 - [LogBookListPostsResponseDataInnerAttachmentsInner](docs/LogBookListPostsResponseDataInnerAttachmentsInner.md)
 - [LogBookUpdateCategoryByIdRequest](docs/LogBookUpdateCategoryByIdRequest.md)
 - [LogBookUpdateCategoryByIdResponse](docs/LogBookUpdateCategoryByIdResponse.md)
 - [ReceiptFailedRequest](docs/ReceiptFailedRequest.md)
 - [ReceiptsCreateReceiptRequest](docs/ReceiptsCreateReceiptRequest.md)
 - [ReceiptsCreateReceiptRequestAllOf](docs/ReceiptsCreateReceiptRequestAllOf.md)
 - [ReceiptsCreateReceiptRequestAllOfReceiptLines](docs/ReceiptsCreateReceiptRequestAllOfReceiptLines.md)
 - [ReceiptsCreateReceiptRequestAllOfTipDetails](docs/ReceiptsCreateReceiptRequestAllOfTipDetails.md)
 - [ReceiptsCreateReceiptResponse](docs/ReceiptsCreateReceiptResponse.md)
 - [ReceiptsGetReceiptResponse](docs/ReceiptsGetReceiptResponse.md)
 - [ReceiptsGetReceiptResponseData](docs/ReceiptsGetReceiptResponseData.md)
 - [ReceiptsGetReceiptResponseDataReceiptLinesInner](docs/ReceiptsGetReceiptResponseDataReceiptLinesInner.md)
 - [ReceiptsGetReceiptResponseDataTipDetailsInner](docs/ReceiptsGetReceiptResponseDataTipDetailsInner.md)
 - [ReceiptsGetSummaryResponse](docs/ReceiptsGetSummaryResponse.md)
 - [ReceiptsGetSummaryResponseDataInner](docs/ReceiptsGetSummaryResponseDataInner.md)
 - [ReceiptsGetSummaryResponseDataInnerClosed](docs/ReceiptsGetSummaryResponseDataInnerClosed.md)
 - [ReceiptsGetSummaryResponseDataInnerDeleted](docs/ReceiptsGetSummaryResponseDataInnerDeleted.md)
 - [ReceiptsGetSummaryResponseDataInnerOpen](docs/ReceiptsGetSummaryResponseDataInnerOpen.md)
 - [ReceiptsGetSummaryResponseDataInnerVoided](docs/ReceiptsGetSummaryResponseDataInnerVoided.md)
 - [ReceiptsListResponse](docs/ReceiptsListResponse.md)
 - [ReceiptsListResponseDataInner](docs/ReceiptsListResponseDataInner.md)
 - [ReceiptsListResponseDataInnerReceiptLinesInner](docs/ReceiptsListResponseDataInnerReceiptLinesInner.md)
 - [ReceiptsListResponseDataInnerTipDetailsInner](docs/ReceiptsListResponseDataInnerTipDetailsInner.md)
 - [ReceiptsUpdateReceiptRequest](docs/ReceiptsUpdateReceiptRequest.md)
 - [ReceiptsUpdateReceiptRequestReceiptLinesInner](docs/ReceiptsUpdateReceiptRequestReceiptLinesInner.md)
 - [ReceiptsUpdateReceiptRequestTipDetailsInner](docs/ReceiptsUpdateReceiptRequestTipDetailsInner.md)
 - [ReceiptsUpdateReceiptResponse](docs/ReceiptsUpdateReceiptResponse.md)
 - [ReceiptsUpdateReceiptResponseData](docs/ReceiptsUpdateReceiptResponseData.md)
 - [ReportsGetDailySalesAndLaborResponse](docs/ReportsGetDailySalesAndLaborResponse.md)
 - [ReportsGetDailySalesAndLaborResponseDataInner](docs/ReportsGetDailySalesAndLaborResponseDataInner.md)
 - [ReportsGetDailyStatsResponse](docs/ReportsGetDailyStatsResponse.md)
 - [ReportsGetDailyStatsResponseData](docs/ReportsGetDailyStatsResponseData.md)
 - [ReportsGetDailyStatsResponseDataIntervalsInner](docs/ReportsGetDailyStatsResponseDataIntervalsInner.md)
 - [ReportsGetDailyStatsResponseDataSummary](docs/ReportsGetDailyStatsResponseDataSummary.md)
 - [ReportsGetWorkedHoursWagesResponse](docs/ReportsGetWorkedHoursWagesResponse.md)
 - [ReportsGetWorkedHoursWagesResponseTotal](docs/ReportsGetWorkedHoursWagesResponseTotal.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInner](docs/ReportsGetWorkedHoursWagesResponseUsersInner.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerRolesInner](docs/ReportsGetWorkedHoursWagesResponseUsersInnerRolesInner.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerRolesInnerTotal](docs/ReportsGetWorkedHoursWagesResponseUsersInnerRolesInnerTotal.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerTotal](docs/ReportsGetWorkedHoursWagesResponseUsersInnerTotal.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerUser](docs/ReportsGetWorkedHoursWagesResponseUsersInnerUser.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInner](docs/ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInner.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInner](docs/ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInner.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInnerComplianceExceptionsInner](docs/ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInnerComplianceExceptionsInner.md)
 - [ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInnerTotal](docs/ReportsGetWorkedHoursWagesResponseUsersInnerWeeksInnerShiftsInnerTotal.md)
 - [RolesCreateRoleRequest](docs/RolesCreateRoleRequest.md)
 - [RolesCreateRoleRequestStationsInner](docs/RolesCreateRoleRequestStationsInner.md)
 - [RolesCreateRoleResponse](docs/RolesCreateRoleResponse.md)
 - [RolesCreateRoleResponseData](docs/RolesCreateRoleResponseData.md)
 - [RolesGetRoleResponse](docs/RolesGetRoleResponse.md)
 - [RolesGetRoleResponseData](docs/RolesGetRoleResponseData.md)
 - [RolesListResponse](docs/RolesListResponse.md)
 - [RolesListResponseDataInner](docs/RolesListResponseDataInner.md)
 - [RolesListResponseDataInnerStationsInner](docs/RolesListResponseDataInnerStationsInner.md)
 - [RolesUpdateRoleByIdRequest](docs/RolesUpdateRoleByIdRequest.md)
 - [RolesUpdateRoleByIdRequestStationsInner](docs/RolesUpdateRoleByIdRequestStationsInner.md)
 - [RolesUpdateRoleByIdResponse](docs/RolesUpdateRoleByIdResponse.md)
 - [RolesUpdateRoleByIdResponseData](docs/RolesUpdateRoleByIdResponseData.md)
 - [ScheduleEnforcementListScheduledShiftsResponse](docs/ScheduleEnforcementListScheduledShiftsResponse.md)
 - [ScheduleEnforcementListScheduledShiftsResponseDataInner](docs/ScheduleEnforcementListScheduledShiftsResponseDataInner.md)
 - [ScheduleEventsCreateEventRequest](docs/ScheduleEventsCreateEventRequest.md)
 - [ScheduleEventsCreateEventResponse](docs/ScheduleEventsCreateEventResponse.md)
 - [ScheduleEventsCreateEventResponseAllOf](docs/ScheduleEventsCreateEventResponseAllOf.md)
 - [ScheduleEventsCreateEventResponseAllOf1](docs/ScheduleEventsCreateEventResponseAllOf1.md)
 - [ScheduleEventsCreateEventResponseAllOf1End](docs/ScheduleEventsCreateEventResponseAllOf1End.md)
 - [ScheduleEventsCreateEventResponseAllOf1Start](docs/ScheduleEventsCreateEventResponseAllOf1Start.md)
 - [ScheduleEventsDeleteEventResponse](docs/ScheduleEventsDeleteEventResponse.md)
 - [ScheduleEventsDeleteEventResponseDataInner](docs/ScheduleEventsDeleteEventResponseDataInner.md)
 - [ScheduleEventsDeleteEventResponseDataInnerAllOf](docs/ScheduleEventsDeleteEventResponseDataInnerAllOf.md)
 - [ScheduleEventsGetEventByIdResponse](docs/ScheduleEventsGetEventByIdResponse.md)
 - [ScheduleEventsGetEventByIdResponseData](docs/ScheduleEventsGetEventByIdResponseData.md)
 - [ScheduleEventsGetEventByIdResponseDataAllOf](docs/ScheduleEventsGetEventByIdResponseDataAllOf.md)
 - [ScheduleEventsListEventsResponse](docs/ScheduleEventsListEventsResponse.md)
 - [ScheduleEventsListEventsResponseDataInner](docs/ScheduleEventsListEventsResponseDataInner.md)
 - [ScheduleEventsListEventsResponseDataInnerAllOf](docs/ScheduleEventsListEventsResponseDataInnerAllOf.md)
 - [ScheduleEventsListEventsResponseDataInnerAllOf1](docs/ScheduleEventsListEventsResponseDataInnerAllOf1.md)
 - [ScheduleEventsListEventsResponseDataInnerAllOf1EndInner](docs/ScheduleEventsListEventsResponseDataInnerAllOf1EndInner.md)
 - [ScheduleEventsListEventsResponseDataInnerAllOf1StartInner](docs/ScheduleEventsListEventsResponseDataInnerAllOf1StartInner.md)
 - [ScheduleEventsUpdateEventByIdRequest](docs/ScheduleEventsUpdateEventByIdRequest.md)
 - [ScheduleEventsUpdateEventByIdRequestAllOf](docs/ScheduleEventsUpdateEventByIdRequestAllOf.md)
 - [ScheduleEventsUpdateEventByIdRequestAllOf1](docs/ScheduleEventsUpdateEventByIdRequestAllOf1.md)
 - [ScheduleEventsUpdateEventByIdResponse](docs/ScheduleEventsUpdateEventByIdResponse.md)
 - [ScheduleEventsUpdateEventByIdResponseDataInner](docs/ScheduleEventsUpdateEventByIdResponseDataInner.md)
 - [ScheduleEventsUpdateEventByIdResponseDataInnerAllOf](docs/ScheduleEventsUpdateEventByIdResponseDataInnerAllOf.md)
 - [ShiftFeedbackListResponse](docs/ShiftFeedbackListResponse.md)
 - [ShiftFeedbackListResponseDataInner](docs/ShiftFeedbackListResponseDataInner.md)
 - [ShiftsCreateNewShiftRequest](docs/ShiftsCreateNewShiftRequest.md)
 - [ShiftsCreateNewShiftRequestBreaksInner](docs/ShiftsCreateNewShiftRequestBreaksInner.md)
 - [ShiftsCreateNewShiftResponse](docs/ShiftsCreateNewShiftResponse.md)
 - [ShiftsCreateNewShiftResponseData](docs/ShiftsCreateNewShiftResponseData.md)
 - [ShiftsGetShiftByIdResponse](docs/ShiftsGetShiftByIdResponse.md)
 - [ShiftsGetShiftByIdResponseData](docs/ShiftsGetShiftByIdResponseData.md)
 - [ShiftsListResponse](docs/ShiftsListResponse.md)
 - [ShiftsListResponseDataInner](docs/ShiftsListResponseDataInner.md)
 - [ShiftsListResponseDataInnerBreaksInner](docs/ShiftsListResponseDataInnerBreaksInner.md)
 - [ShiftsUpdateShiftByIdRequest](docs/ShiftsUpdateShiftByIdRequest.md)
 - [ShiftsUpdateShiftByIdRequestBreaksInner](docs/ShiftsUpdateShiftByIdRequestBreaksInner.md)
 - [ShiftsUpdateShiftByIdResponse](docs/ShiftsUpdateShiftByIdResponse.md)
 - [ShiftsUpdateShiftByIdResponseData](docs/ShiftsUpdateShiftByIdResponseData.md)
 - [TaskManagementClearTaskRequest](docs/TaskManagementClearTaskRequest.md)
 - [TaskManagementClearTaskResponse](docs/TaskManagementClearTaskResponse.md)
 - [TaskManagementCreateTaskListTemplateRequest](docs/TaskManagementCreateTaskListTemplateRequest.md)
 - [TaskManagementCreateTaskListTemplateRequestAssignmentsInner](docs/TaskManagementCreateTaskListTemplateRequestAssignmentsInner.md)
 - [TaskManagementCreateTaskListTemplateRequestTaskTemplatesInner](docs/TaskManagementCreateTaskListTemplateRequestTaskTemplatesInner.md)
 - [TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion](docs/TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion.md)
 - [TaskManagementCreateTaskListTemplateRequestTimeFrame](docs/TaskManagementCreateTaskListTemplateRequestTimeFrame.md)
 - [TaskManagementCreateTaskListTemplateResponse](docs/TaskManagementCreateTaskListTemplateResponse.md)
 - [TaskManagementCreateTaskListTemplateResponseData](docs/TaskManagementCreateTaskListTemplateResponseData.md)
 - [TaskManagementCreateTaskListTemplateResponseDataTimeFrame](docs/TaskManagementCreateTaskListTemplateResponseDataTimeFrame.md)
 - [TaskManagementCreateTaskTagsRequest](docs/TaskManagementCreateTaskTagsRequest.md)
 - [TaskManagementCreateTaskTagsRequestTagsInner](docs/TaskManagementCreateTaskTagsRequestTagsInner.md)
 - [TaskManagementDeleteTaskTagsRequest](docs/TaskManagementDeleteTaskTagsRequest.md)
 - [TaskManagementEditTaskListTemplateRequest](docs/TaskManagementEditTaskListTemplateRequest.md)
 - [TaskManagementEditTaskListTemplateRequestTaskTemplatesInner](docs/TaskManagementEditTaskListTemplateRequestTaskTemplatesInner.md)
 - [TaskManagementEditTaskListTemplateRequestTaskTemplatesInnerTaskCompletion](docs/TaskManagementEditTaskListTemplateRequestTaskTemplatesInnerTaskCompletion.md)
 - [TaskManagementEditTaskListTemplateRequestTimeFrame](docs/TaskManagementEditTaskListTemplateRequestTimeFrame.md)
 - [TaskManagementEditTaskListTemplateResponse](docs/TaskManagementEditTaskListTemplateResponse.md)
 - [TaskManagementEditTaskListTemplateResponseData](docs/TaskManagementEditTaskListTemplateResponseData.md)
 - [TaskManagementEditTaskListTemplateResponseDataTimeFrame](docs/TaskManagementEditTaskListTemplateResponseDataTimeFrame.md)
 - [TaskManagementGetSettingsResponse](docs/TaskManagementGetSettingsResponse.md)
 - [TaskManagementGetSettingsResponseData](docs/TaskManagementGetSettingsResponseData.md)
 - [TaskManagementGetTaskListResponse](docs/TaskManagementGetTaskListResponse.md)
 - [TaskManagementGetTaskListResponseData](docs/TaskManagementGetTaskListResponseData.md)
 - [TaskManagementGetTaskListResponseDataTimeFrame](docs/TaskManagementGetTaskListResponseDataTimeFrame.md)
 - [TaskManagementGetTaskListTemplateResponse](docs/TaskManagementGetTaskListTemplateResponse.md)
 - [TaskManagementGetTaskListTemplateResponseData](docs/TaskManagementGetTaskListTemplateResponseData.md)
 - [TaskManagementGetTaskListTemplateResponseDataTimeFrame](docs/TaskManagementGetTaskListTemplateResponseDataTimeFrame.md)
 - [TaskManagementGetTaskListTemplates200Response](docs/TaskManagementGetTaskListTemplates200Response.md)
 - [TaskManagementGetTaskListTemplates200ResponseDataInner](docs/TaskManagementGetTaskListTemplates200ResponseDataInner.md)
 - [TaskManagementGetTaskListTemplates200ResponseDataInnerTimeFrame](docs/TaskManagementGetTaskListTemplates200ResponseDataInnerTimeFrame.md)
 - [TaskManagementGetTaskListTemplatesResponse](docs/TaskManagementGetTaskListTemplatesResponse.md)
 - [TaskManagementGetTaskListsResponse](docs/TaskManagementGetTaskListsResponse.md)
 - [TaskManagementGetTaskListsResponseDataInner](docs/TaskManagementGetTaskListsResponseDataInner.md)
 - [TaskManagementGetTaskListsResponseDataInnerAssignmentsInner](docs/TaskManagementGetTaskListsResponseDataInnerAssignmentsInner.md)
 - [TaskManagementGetTaskListsResponseDataInnerDueDate](docs/TaskManagementGetTaskListsResponseDataInnerDueDate.md)
 - [TaskManagementGetTaskListsResponseDataInnerRecurrence](docs/TaskManagementGetTaskListsResponseDataInnerRecurrence.md)
 - [TaskManagementGetTaskListsResponseDataInnerTasksInner](docs/TaskManagementGetTaskListsResponseDataInnerTasksInner.md)
 - [TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner](docs/TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner.md)
 - [TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent](docs/TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent.md)
 - [TaskManagementGetTaskListsResponseDataInnerTimeFrame](docs/TaskManagementGetTaskListsResponseDataInnerTimeFrame.md)
 - [TaskManagementListTaskListsSummary200Response](docs/TaskManagementListTaskListsSummary200Response.md)
 - [TaskManagementListTaskListsSummary200ResponseData](docs/TaskManagementListTaskListsSummary200ResponseData.md)
 - [TaskManagementListTaskListsSummary200ResponseDataTaskListsInner](docs/TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.md)
 - [TaskManagementListTaskListsSummaryResponse](docs/TaskManagementListTaskListsSummaryResponse.md)
 - [TaskManagementMarkCompleteRequest](docs/TaskManagementMarkCompleteRequest.md)
 - [TaskManagementMarkCompleteResponse](docs/TaskManagementMarkCompleteResponse.md)
 - [TimeOffApproveRequest200Response](docs/TimeOffApproveRequest200Response.md)
 - [TimeOffApproveRequestRequest](docs/TimeOffApproveRequestRequest.md)
 - [TimeOffApproveRequestResponse](docs/TimeOffApproveRequestResponse.md)
 - [TimeOffCreateRequest200Response](docs/TimeOffCreateRequest200Response.md)
 - [TimeOffCreateRequestRequest](docs/TimeOffCreateRequestRequest.md)
 - [TimeOffCreateRequestRequestHoursInner](docs/TimeOffCreateRequestRequestHoursInner.md)
 - [TimeOffCreateRequestResponse](docs/TimeOffCreateRequestResponse.md)
 - [TimeOffDeclineRequest200Response](docs/TimeOffDeclineRequest200Response.md)
 - [TimeOffDeclineRequestRequest](docs/TimeOffDeclineRequestRequest.md)
 - [TimeOffDeclineRequestResponse](docs/TimeOffDeclineRequestResponse.md)
 - [TimeOffGetSettings200Response](docs/TimeOffGetSettings200Response.md)
 - [TimeOffGetSettings200ResponseCategoriesInner](docs/TimeOffGetSettings200ResponseCategoriesInner.md)
 - [TimeOffGetSettingsResponse](docs/TimeOffGetSettingsResponse.md)
 - [TimeOffGetTimeOffById200Response](docs/TimeOffGetTimeOffById200Response.md)
 - [TimeOffGetTimeOffByIdResponse](docs/TimeOffGetTimeOffByIdResponse.md)
 - [TimeOffGetTotalHours200Response](docs/TimeOffGetTotalHours200Response.md)
 - [TimeOffGetTotalHours200ResponseDataInner](docs/TimeOffGetTotalHours200ResponseDataInner.md)
 - [TimeOffGetTotalHoursResponse](docs/TimeOffGetTotalHoursResponse.md)
 - [TimeOffList200Response](docs/TimeOffList200Response.md)
 - [TimeOffList200ResponseDataInner](docs/TimeOffList200ResponseDataInner.md)
 - [TimeOffList200ResponseDataInnerHoursInner](docs/TimeOffList200ResponseDataInnerHoursInner.md)
 - [TimeOffListResponse](docs/TimeOffListResponse.md)
 - [TimeOffRemoveResponse](docs/TimeOffRemoveResponse.md)
 - [TimeOffSetTimeOffSettings200Response](docs/TimeOffSetTimeOffSettings200Response.md)
 - [TimeOffSetTimeOffSettingsRequest](docs/TimeOffSetTimeOffSettingsRequest.md)
 - [TimeOffSetTimeOffSettingsResponse](docs/TimeOffSetTimeOffSettingsResponse.md)
 - [TimeOffUpdateTimeOffById200Response](docs/TimeOffUpdateTimeOffById200Response.md)
 - [TimeOffUpdateTimeOffByIdRequest](docs/TimeOffUpdateTimeOffByIdRequest.md)
 - [TimeOffUpdateTimeOffByIdResponse](docs/TimeOffUpdateTimeOffByIdResponse.md)
 - [TimePunchesCreateRequest](docs/TimePunchesCreateRequest.md)
 - [TimePunchesCreateRequestBreaksInner](docs/TimePunchesCreateRequestBreaksInner.md)
 - [TimePunchesCreateResponse](docs/TimePunchesCreateResponse.md)
 - [TimePunchesCreateResponseData](docs/TimePunchesCreateResponseData.md)
 - [TimePunchesCreateResponseDataBreaksInner](docs/TimePunchesCreateResponseDataBreaksInner.md)
 - [TimePunchesGetTimePunchResponse](docs/TimePunchesGetTimePunchResponse.md)
 - [TimePunchesGetTimePunchResponseData](docs/TimePunchesGetTimePunchResponseData.md)
 - [TimePunchesGetTimePunchResponseDataBreaksInner](docs/TimePunchesGetTimePunchResponseDataBreaksInner.md)
 - [TimePunchesListResponse](docs/TimePunchesListResponse.md)
 - [TimePunchesListResponseDataInner](docs/TimePunchesListResponseDataInner.md)
 - [TimePunchesListResponseDataInnerBreaksInner](docs/TimePunchesListResponseDataInnerBreaksInner.md)
 - [TimePunchesUpdateByIdRequest](docs/TimePunchesUpdateByIdRequest.md)
 - [TimePunchesUpdateByIdRequestBreaksInner](docs/TimePunchesUpdateByIdRequestBreaksInner.md)
 - [TimePunchesUpdateByIdResponse](docs/TimePunchesUpdateByIdResponse.md)
 - [TimePunchesUpdateByIdResponseData](docs/TimePunchesUpdateByIdResponseData.md)
 - [TimePunchesUpdateByIdResponseDataBreaksInner](docs/TimePunchesUpdateByIdResponseDataBreaksInner.md)
 - [TipPoolGetDetailedReportResponse](docs/TipPoolGetDetailedReportResponse.md)
 - [TipPoolGetDetailedReportResponseData](docs/TipPoolGetDetailedReportResponseData.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInner](docs/TipPoolGetDetailedReportResponseDataReportRowsInner.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInner](docs/TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInner.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerAssignedTipsInner](docs/TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerAssignedTipsInner.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerAssignedTipsInnerAllOf](docs/TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerAssignedTipsInnerAllOf.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerUnassignedTipsInner](docs/TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerUnassignedTipsInner.md)
 - [TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerUnassignedTipsInnerAllOf](docs/TipPoolGetDetailedReportResponseDataReportRowsInnerTipPoolsInnerUnassignedTipsInnerAllOf.md)
 - [TipPoolGetManualEntryTipsResponse](docs/TipPoolGetManualEntryTipsResponse.md)
 - [TipPoolGetManualEntryTipsResponseDataInner](docs/TipPoolGetManualEntryTipsResponseDataInner.md)
 - [TipPoolGetSettingsResponse](docs/TipPoolGetSettingsResponse.md)
 - [TipPoolGetSettingsResponseDataInner](docs/TipPoolGetSettingsResponseDataInner.md)
 - [TipPoolGetSettingsResponseDataInnerTipPoolCadenceSettings](docs/TipPoolGetSettingsResponseDataInnerTipPoolCadenceSettings.md)
 - [TipPoolGetSettingsResponseDataInnerTipPoolContributionsInner](docs/TipPoolGetSettingsResponseDataInnerTipPoolContributionsInner.md)
 - [TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInner](docs/TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInner.md)
 - [TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInnerFiltersInner](docs/TipPoolGetSettingsResponseDataInnerTipPoolStakeholdersInnerFiltersInner.md)
 - [TipPoolGetSettingsResponseDataInnerUnmappedContributionFiltersInner](docs/TipPoolGetSettingsResponseDataInnerUnmappedContributionFiltersInner.md)
 - [TipPoolGetSummaryReportResponse](docs/TipPoolGetSummaryReportResponse.md)
 - [TipPoolGetSummaryReportResponseDataInner](docs/TipPoolGetSummaryReportResponseDataInner.md)
 - [TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner](docs/TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner.md)
 - [TipPoolGetSummaryReportResponseDataInnerTotal](docs/TipPoolGetSummaryReportResponseDataInnerTotal.md)
 - [TipPoolGetSummaryReportResponseDataInnerUnassignedTips](docs/TipPoolGetSummaryReportResponseDataInnerUnassignedTips.md)
 - [TipPoolGetSummaryReportResponseDataInnerUnassignedTipsAllOf](docs/TipPoolGetSummaryReportResponseDataInnerUnassignedTipsAllOf.md)
 - [TipPoolSaveManualEntryRequest](docs/TipPoolSaveManualEntryRequest.md)
 - [TipPoolSaveManualEntryRequestDataInner](docs/TipPoolSaveManualEntryRequestDataInner.md)
 - [TipPoolSaveManualEntryResponse](docs/TipPoolSaveManualEntryResponse.md)
 - [TipPoolSaveManualEntryResponseDataInner](docs/TipPoolSaveManualEntryResponseDataInner.md)
 - [UserAssignmentsCreateDepartmentAssignmentRequest](docs/UserAssignmentsCreateDepartmentAssignmentRequest.md)
 - [UserAssignmentsCreateDepartmentAssignmentResponse](docs/UserAssignmentsCreateDepartmentAssignmentResponse.md)
 - [UserAssignmentsCreateLocationAssignmentRequest](docs/UserAssignmentsCreateLocationAssignmentRequest.md)
 - [UserAssignmentsCreateLocationAssignmentResponse](docs/UserAssignmentsCreateLocationAssignmentResponse.md)
 - [UserAssignmentsCreateRoleAssignmentRequest](docs/UserAssignmentsCreateRoleAssignmentRequest.md)
 - [UserAssignmentsCreateRoleAssignmentResponse](docs/UserAssignmentsCreateRoleAssignmentResponse.md)
 - [UserAssignmentsListDepartmentAssignmentsResponse](docs/UserAssignmentsListDepartmentAssignmentsResponse.md)
 - [UserAssignmentsListDepartmentAssignmentsResponseDataInner](docs/UserAssignmentsListDepartmentAssignmentsResponseDataInner.md)
 - [UserAssignmentsListLocationAssignmentsResponse](docs/UserAssignmentsListLocationAssignmentsResponse.md)
 - [UserAssignmentsListLocationAssignmentsResponseDataInner](docs/UserAssignmentsListLocationAssignmentsResponseDataInner.md)
 - [UserAssignmentsListResponse](docs/UserAssignmentsListResponse.md)
 - [UserAssignmentsListResponseData](docs/UserAssignmentsListResponseData.md)
 - [UserAssignmentsListResponseDataDepartmentsInner](docs/UserAssignmentsListResponseDataDepartmentsInner.md)
 - [UserAssignmentsListResponseDataLocationsInner](docs/UserAssignmentsListResponseDataLocationsInner.md)
 - [UserAssignmentsListResponseDataRolesInner](docs/UserAssignmentsListResponseDataRolesInner.md)
 - [UserAssignmentsListRoleAssignmentsResponse](docs/UserAssignmentsListRoleAssignmentsResponse.md)
 - [UserAssignmentsListRoleAssignmentsResponseDataInner](docs/UserAssignmentsListRoleAssignmentsResponseDataInner.md)
 - [UserWagesCreateRequest](docs/UserWagesCreateRequest.md)
 - [UserWagesCreateResponse](docs/UserWagesCreateResponse.md)
 - [UserWagesCreateResponseData](docs/UserWagesCreateResponseData.md)
 - [UserWagesListResponse](docs/UserWagesListResponse.md)
 - [UserWagesListResponseData](docs/UserWagesListResponseData.md)
 - [UserWagesListResponseDataCurrentWagesInner](docs/UserWagesListResponseDataCurrentWagesInner.md)
 - [UserWagesListResponseDataUpcomingWagesInner](docs/UserWagesListResponseDataUpcomingWagesInner.md)
 - [UsersBulkCreateRequestInner](docs/UsersBulkCreateRequestInner.md)
 - [UsersBulkCreateRequestInnerWagesInner](docs/UsersBulkCreateRequestInnerWagesInner.md)
 - [UsersBulkCreateResponse](docs/UsersBulkCreateResponse.md)
 - [UsersBulkCreateResponseDataInner](docs/UsersBulkCreateResponseDataInner.md)
 - [UsersCreateNewUserRequest](docs/UsersCreateNewUserRequest.md)
 - [UsersCreateNewUserRequestWagesInner](docs/UsersCreateNewUserRequestWagesInner.md)
 - [UsersCreateNewUserResponse](docs/UsersCreateNewUserResponse.md)
 - [UsersCreateNewUserResponseData](docs/UsersCreateNewUserResponseData.md)
 - [UsersDeactivateRequest](docs/UsersDeactivateRequest.md)
 - [UsersGetUserByIdentifierResponse](docs/UsersGetUserByIdentifierResponse.md)
 - [UsersGetUserByIdentifierResponseData](docs/UsersGetUserByIdentifierResponseData.md)
 - [UsersListResponse](docs/UsersListResponse.md)
 - [UsersListResponseDataInner](docs/UsersListResponseDataInner.md)
 - [UsersListResponseMeta](docs/UsersListResponseMeta.md)
 - [UsersUpdateUserByIdentifierRequest](docs/UsersUpdateUserByIdentifierRequest.md)
 - [UsersUpdateUserByIdentifierResponse](docs/UsersUpdateUserByIdentifierResponse.md)
 - [UsersUpdateUserByIdentifierResponseData](docs/UsersUpdateUserByIdentifierResponseData.md)
 - [WebhooksCreateRequest](docs/WebhooksCreateRequest.md)
 - [WebhooksCreateResponse](docs/WebhooksCreateResponse.md)
 - [WebhooksCreateResponseData](docs/WebhooksCreateResponseData.md)
 - [WebhooksListResponse](docs/WebhooksListResponse.md)
 - [WebhooksListResponseDataInner](docs/WebhooksListResponseDataInner.md)
 - [WebhooksUpdateRequest](docs/WebhooksUpdateRequest.md)
 - [WebhooksUpdateResponse](docs/WebhooksUpdateResponse.md)
 - [WebhooksUpdateResponseData](docs/WebhooksUpdateResponseData.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
