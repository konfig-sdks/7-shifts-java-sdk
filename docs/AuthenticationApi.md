# AuthenticationApi

All URIs are relative to *https://api.7shifts.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateOAuthToken**](AuthenticationApi.md#generateOAuthToken) | **POST** /oauth2/token | Create OAuth Token |
| [**getIdentity**](AuthenticationApi.md#getIdentity) | **GET** /v2/whoami | Retrieve Identity |


<a name="generateOAuthToken"></a>
# **generateOAuthToken**
> AuthenticationGenerateOAuthTokenResponse generateOAuthToken(grantType, clientId, authenticationGenerateOAuthTokenRequest).clientSecret(clientSecret).scope(scope).execute();

Create OAuth Token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.7shifts.com";
    Client7Shifts client = new Client7Shifts(configuration);
    String grantType = "client_credentials"; // Token grant type. For Partner OAuth tokens specifying client_credentials
    String clientId = "clientId_example";
    String clientSecret = "clientSecret_example";
    String scope = "scope_example"; // A space-delimited list of scopes.
    try {
      AuthenticationGenerateOAuthTokenResponse result = client
              .authentication
              .generateOAuthToken(grantType, clientId)
              .clientSecret(clientSecret)
              .scope(scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getAccessToken());
      System.out.println(result.getRefreshToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#generateOAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationGenerateOAuthTokenResponse> response = client
              .authentication
              .generateOAuthToken(grantType, clientId)
              .clientSecret(clientSecret)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#generateOAuthToken");
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
| **grantType** | **String**| Token grant type. For Partner OAuth tokens specifying client_credentials | [enum: client_credentials, password, authorization_code, refresh_token] |
| **clientId** | **String**|  | |
| **authenticationGenerateOAuthTokenRequest** | [**AuthenticationGenerateOAuthTokenRequest**](AuthenticationGenerateOAuthTokenRequest.md)|  | |
| **clientSecret** | **String**|  | [optional] |
| **scope** | **String**| A space-delimited list of scopes. | [optional] |

### Return type

[**AuthenticationGenerateOAuthTokenResponse**](AuthenticationGenerateOAuthTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getIdentity"></a>
# **getIdentity**
> AuthenticationGetIdentityResponse getIdentity().xApiVersion(xApiVersion).xCompanyGuid(xCompanyGuid).execute();

Retrieve Identity

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Client7Shifts;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    String xApiVersion = "2022-05-01"; // 7shifts API version
    UUID xCompanyGuid = UUID.fromString("1310bfe1-cb3f-4f24-98a2-fde2bc504108"); // Company GUID
    try {
      AuthenticationGetIdentityResponse result = client
              .authentication
              .getIdentity()
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getIdentity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationGetIdentityResponse> response = client
              .authentication
              .getIdentity()
              .xApiVersion(xApiVersion)
              .xCompanyGuid(xCompanyGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getIdentity");
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
| **xApiVersion** | **String**| 7shifts API version | [optional] |
| **xCompanyGuid** | **UUID**| Company GUID | [optional] |

### Return type

[**AuthenticationGetIdentityResponse**](AuthenticationGetIdentityResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

