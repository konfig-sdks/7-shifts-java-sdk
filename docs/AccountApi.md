# AccountApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTrialAccount**](AccountApi.md#createTrialAccount) | **POST** /v2/partner_company_creation | Create Trial Account |


<a name="createTrialAccount"></a>
# **createTrialAccount**
> AccountCreateTrialAccountResponse createTrialAccount(accountCreateTrialAccountRequest).xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Create Trial Account

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountCreateTrialAccountRequest** | [**AccountCreateTrialAccountRequest**](AccountCreateTrialAccountRequest.md)|  | |
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**AccountCreateTrialAccountResponse**](AccountCreateTrialAccountResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

