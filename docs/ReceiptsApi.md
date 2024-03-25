# ReceiptsApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReceipt**](ReceiptsApi.md#createReceipt) | **POST** /v2/company/{company_id}/receipts | Create Receipt |
| [**getReceipt**](ReceiptsApi.md#getReceipt) | **GET** /v2/company/{company_id}/receipts/{receipt_id} | Retrieve Receipt |
| [**getSummary**](ReceiptsApi.md#getSummary) | **GET** /v2/company/{company_id}/receipts_summary | Retrieve Receipts Summary |
| [**list**](ReceiptsApi.md#list) | **GET** /v2/company/{company_id}/receipts | List Receipts |
| [**updateReceipt**](ReceiptsApi.md#updateReceipt) | **PUT** /v2/company/{company_id}/receipts/{receipt_id} | Update Receipt |


<a name="createReceipt"></a>
# **createReceipt**
> ReceiptsCreateReceiptResponse createReceipt(companyId, receiptsCreateReceiptRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Receipt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptsApi;
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
    Integer locationId = 56; // The 7shifts location_id this receipt belongs to
    OffsetDateTime receiptDate = OffsetDateTime.now(); // Receipt create date time. UTC date time in ISO8601 format
    Integer netTotal = 56; // The net total of the receipt pre tax, post-discounts, pre tips. In cents
    Integer grossTotal = 56; // The gross total of the receipt in cents
    Integer totalReceiptDiscounts = 56; // The total discounts of the receipt in cents
    Integer tips = 56; // Total tips in cents
    String externalUserId = "externalUserId_example"; // External user ID of the sales receipt in your system (must be unique per 7shifts location).
    String revenueCenter = "revenueCenter_example"; // Label for the revenue centre for the receipt
    List<ReceiptsCreateReceiptRequestAllOfReceiptLines> receiptLines = Arrays.asList(); // Receipt line items
    List<ReceiptsCreateReceiptRequestAllOfTipDetails> tipDetails = Arrays.asList(); // Tip line items
    String status = "open"; // Status of the receipt
    String orderType = "dine_in"; // Order type
    String diningOption = "diningOption_example"; // Dining option
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ReceiptsCreateReceiptResponse result = client
              .receipts
              .createReceipt(companyId)
              .locationId(locationId)
              .receiptDate(receiptDate)
              .netTotal(netTotal)
              .grossTotal(grossTotal)
              .totalReceiptDiscounts(totalReceiptDiscounts)
              .tips(tips)
              .externalUserId(externalUserId)
              .revenueCenter(revenueCenter)
              .receiptLines(receiptLines)
              .tipDetails(tipDetails)
              .status(status)
              .orderType(orderType)
              .diningOption(diningOption)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#createReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceiptsCreateReceiptResponse> response = client
              .receipts
              .createReceipt(companyId)
              .locationId(locationId)
              .receiptDate(receiptDate)
              .netTotal(netTotal)
              .grossTotal(grossTotal)
              .totalReceiptDiscounts(totalReceiptDiscounts)
              .tips(tips)
              .externalUserId(externalUserId)
              .revenueCenter(revenueCenter)
              .receiptLines(receiptLines)
              .tipDetails(tipDetails)
              .status(status)
              .orderType(orderType)
              .diningOption(diningOption)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#createReceipt");
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
| **receiptsCreateReceiptRequest** | [**ReceiptsCreateReceiptRequest**](ReceiptsCreateReceiptRequest.md)| Receipt | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ReceiptsCreateReceiptResponse**](ReceiptsCreateReceiptResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Created |  -  |

<a name="getReceipt"></a>
# **getReceipt**
> ReceiptsGetReceiptResponse getReceipt(companyId, receiptId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Receipt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptsApi;
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
    UUID receiptId = UUID.randomUUID(); // Receipt UUID
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ReceiptsGetReceiptResponse result = client
              .receipts
              .getReceipt(companyId, receiptId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceiptsGetReceiptResponse> response = client
              .receipts
              .getReceipt(companyId, receiptId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getReceipt");
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
| **receiptId** | **UUID**| Receipt UUID | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ReceiptsGetReceiptResponse**](ReceiptsGetReceiptResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSummary"></a>
# **getSummary**
> ReceiptsGetSummaryResponse getSummary(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).receiptDateGte(receiptDateGte).receiptDateLte(receiptDateLte).modifiedSince(modifiedSince).execute();

Retrieve Receipts Summary

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptsApi;
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
    UUID xCompanyGuid = UUID.randomUUID(); // Company GUID
    OffsetDateTime receiptDateGte = OffsetDateTime.parse("2022-01-01"); // Return receipts that were created on or after a specific date. Limit to 31-day range with receipt_date[lte].
    OffsetDateTime receiptDateLte = OffsetDateTime.parse("2022-01-01"); // Return receipts that were created on or before a specific date. Limit to 31-day range with receipt_date[gte].
    OffsetDateTime modifiedSince = OffsetDateTime.parse("2022-01-01"); // Return receipts that were modified on or after a specific date. Limited to past 30 days.
    try {
      ReceiptsGetSummaryResponse result = client
              .receipts
              .getSummary(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .receiptDateGte(receiptDateGte)
              .receiptDateLte(receiptDateLte)
              .modifiedSince(modifiedSince)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceiptsGetSummaryResponse> response = client
              .receipts
              .getSummary(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .receiptDateGte(receiptDateGte)
              .receiptDateLte(receiptDateLte)
              .modifiedSince(modifiedSince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#getSummary");
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
| **receiptDateGte** | **OffsetDateTime**| Return receipts that were created on or after a specific date. Limit to 31-day range with receipt_date[lte]. | [optional] |
| **receiptDateLte** | **OffsetDateTime**| Return receipts that were created on or before a specific date. Limit to 31-day range with receipt_date[gte]. | [optional] |
| **modifiedSince** | **OffsetDateTime**| Return receipts that were modified on or after a specific date. Limited to past 30 days. | [optional] |

### Return type

[**ReceiptsGetSummaryResponse**](ReceiptsGetSummaryResponse.md)

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
> ReceiptsListResponse list(companyId, locationId).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).receiptDateGte(receiptDateGte).receiptDateLte(receiptDateLte).modifiedSince(modifiedSince).status(status).externalUserId(externalUserId).cursor(cursor).limit(limit).execute();

List Receipts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptsApi;
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
    OffsetDateTime receiptDateGte = OffsetDateTime.parse("2022-01-01"); // Return receipts that were created on or after a specific date
    OffsetDateTime receiptDateLte = OffsetDateTime.parse("2022-01-01"); // Return receipts that were created on or before a specific date
    OffsetDateTime modifiedSince = OffsetDateTime.parse("2022-01-01"); // Return receipts that were modified on or after a specific date
    String status = "open"; // Filter receipts by status type
    String externalUserId = "ABC123"; // Filter receipts by external user id
    String cursor = "cursor_example"; // An opaque cursor for the next or previous result set.
    Long limit = 100L; // The number of results desired per page.
    try {
      ReceiptsListResponse result = client
              .receipts
              .list(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .receiptDateGte(receiptDateGte)
              .receiptDateLte(receiptDateLte)
              .modifiedSince(modifiedSince)
              .status(status)
              .externalUserId(externalUserId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceiptsListResponse> response = client
              .receipts
              .list(companyId, locationId)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .receiptDateGte(receiptDateGte)
              .receiptDateLte(receiptDateLte)
              .modifiedSince(modifiedSince)
              .status(status)
              .externalUserId(externalUserId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#list");
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
| **receiptDateGte** | **OffsetDateTime**| Return receipts that were created on or after a specific date | [optional] |
| **receiptDateLte** | **OffsetDateTime**| Return receipts that were created on or before a specific date | [optional] |
| **modifiedSince** | **OffsetDateTime**| Return receipts that were modified on or after a specific date | [optional] |
| **status** | **String**| Filter receipts by status type | [optional] [enum: open, closed, voided, deleted] |
| **externalUserId** | **String**| Filter receipts by external user id | [optional] |
| **cursor** | **String**| An opaque cursor for the next or previous result set. | [optional] |
| **limit** | **Long**| The number of results desired per page. | [optional] [default to 100] |

### Return type

[**ReceiptsListResponse**](ReceiptsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReceipt"></a>
# **updateReceipt**
> ReceiptsUpdateReceiptResponse updateReceipt(companyId, receiptId, receiptsUpdateReceiptRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Update Receipt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptsApi;
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
    Integer netTotal = 56; // The net total of the receipt pre tax, post-discounts, pre tips. In cents
    Long companyId = 56L; // Company ID
    String receiptId = "ext:7890:rec_8522451"; // Receipt ID.  Either 7shifts receipt UUID or a combination of the External ID of the sales receipt in your system and a Location ID. External ID's must start with 'ext:' and the format is ext:location_id:receipt_id.
    OffsetDateTime receiptDate = OffsetDateTime.now(); // Receipt create date time. UTC date time in ISO8601 format
    Integer grossTotal = 56; // The gross total of the receipt in cents
    Integer totalReceiptDiscounts = 56; // The total discounts of the receipt in cents
    Integer tips = 56; // Total tips in cents
    String externalUserId = "externalUserId_example"; // External user ID of the sales receipt in your system (must be unique per 7shifts location).
    String revenueCenter = "revenueCenter_example"; // Label for the revenue center for the receipt
    List<ReceiptsUpdateReceiptRequestReceiptLinesInner> receiptLines = Arrays.asList(); // Receipt line items
    List<ReceiptsUpdateReceiptRequestTipDetailsInner> tipDetails = Arrays.asList(); // Tip line items
    String status = "open"; // Status of the receipt
    String orderType = "dine_in"; // Order type
    String diningOption = "diningOption_example"; // Dining option
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      ReceiptsUpdateReceiptResponse result = client
              .receipts
              .updateReceipt(netTotal, companyId, receiptId)
              .receiptDate(receiptDate)
              .grossTotal(grossTotal)
              .totalReceiptDiscounts(totalReceiptDiscounts)
              .tips(tips)
              .externalUserId(externalUserId)
              .revenueCenter(revenueCenter)
              .receiptLines(receiptLines)
              .tipDetails(tipDetails)
              .status(status)
              .orderType(orderType)
              .diningOption(diningOption)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#updateReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceiptsUpdateReceiptResponse> response = client
              .receipts
              .updateReceipt(netTotal, companyId, receiptId)
              .receiptDate(receiptDate)
              .grossTotal(grossTotal)
              .totalReceiptDiscounts(totalReceiptDiscounts)
              .tips(tips)
              .externalUserId(externalUserId)
              .revenueCenter(revenueCenter)
              .receiptLines(receiptLines)
              .tipDetails(tipDetails)
              .status(status)
              .orderType(orderType)
              .diningOption(diningOption)
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptsApi#updateReceipt");
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
| **receiptId** | **String**| Receipt ID.  Either 7shifts receipt UUID or a combination of the External ID of the sales receipt in your system and a Location ID. External ID&#39;s must start with &#39;ext:&#39; and the format is ext:location_id:receipt_id. | |
| **receiptsUpdateReceiptRequest** | [**ReceiptsUpdateReceiptRequest**](ReceiptsUpdateReceiptRequest.md)| Receipt | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**ReceiptsUpdateReceiptResponse**](ReceiptsUpdateReceiptResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The receipt update is queued for processing |  -  |

