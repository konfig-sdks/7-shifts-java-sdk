/*
 * 7shifts API
 * 7shifts is a team management software designed for restaurants. We help managers and operators spend less time and effort scheduling their staff, reduce their monthly labor costs and improve team communication. The result is simplified team management, one shift at a time.  7shifts also offers free mobile apps (iOS and Android) allowing managers and employees to have everything at their fingertips.  Start your free trial or request a demo at www.7shifts.com.
 *
 * The version of the OpenAPI document: 2023-05-01
 * Contact: api-support@7shifts.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AccountCreateTrialAccountRequest;
import com.konfigthis.client.model.AccountCreateTrialAccountResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccountApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AccountApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createTrialAccountCall(AccountCreateTrialAccountRequest accountCreateTrialAccountRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = accountCreateTrialAccountRequest;

        // create path and map variables
        String localVarPath = "/v2/partner_company_creation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        if (xCompanyGuid != null) {
            localVarHeaderParams.put("x-company-guid", localVarApiClient.parameterToString(xCompanyGuid));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2", "OAuth2", "cookieAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTrialAccountValidateBeforeCall(AccountCreateTrialAccountRequest accountCreateTrialAccountRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountCreateTrialAccountRequest' is set
        if (accountCreateTrialAccountRequest == null) {
            throw new ApiException("Missing the required parameter 'accountCreateTrialAccountRequest' when calling createTrialAccount(Async)");
        }

        return createTrialAccountCall(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid, _callback);

    }


    private ApiResponse<AccountCreateTrialAccountResponse> createTrialAccountWithHttpInfo(AccountCreateTrialAccountRequest accountCreateTrialAccountRequest, String xApiVersion, UUID xCompanyGuid) throws ApiException {
        okhttp3.Call localVarCall = createTrialAccountValidateBeforeCall(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid, null);
        Type localVarReturnType = new TypeToken<AccountCreateTrialAccountResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createTrialAccountAsync(AccountCreateTrialAccountRequest accountCreateTrialAccountRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback<AccountCreateTrialAccountResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTrialAccountValidateBeforeCall(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid, _callback);
        Type localVarReturnType = new TypeToken<AccountCreateTrialAccountResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateTrialAccountRequestBuilder {
        private final String email;
        private final String firstname;
        private final String lastname;
        private final String companyName;
        private final String country;
        private final String utmSource;
        private String mobilePhone;
        private String utmCampaign;
        private String utmContent;
        private String utmMedium;
        private String utmTerm;
        private String xApiVersion;
        private UUID xCompanyGuid;

        private CreateTrialAccountRequestBuilder(String email, String firstname, String lastname, String companyName, String country, String utmSource) {
            this.email = email;
            this.firstname = firstname;
            this.lastname = lastname;
            this.companyName = companyName;
            this.country = country;
            this.utmSource = utmSource;
        }

        /**
         * Set mobilePhone
         * @param mobilePhone The user&#39;s mobile phone (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        
        /**
         * Set utmCampaign
         * @param utmCampaign The UTM campaign (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder utmCampaign(String utmCampaign) {
            this.utmCampaign = utmCampaign;
            return this;
        }
        
        /**
         * Set utmContent
         * @param utmContent The UTM content (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder utmContent(String utmContent) {
            this.utmContent = utmContent;
            return this;
        }
        
        /**
         * Set utmMedium
         * @param utmMedium The UTM medium (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder utmMedium(String utmMedium) {
            this.utmMedium = utmMedium;
            return this;
        }
        
        /**
         * Set utmTerm
         * @param utmTerm The UTM term (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder utmTerm(String utmTerm) {
            this.utmTerm = utmTerm;
            return this;
        }
        
        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return CreateTrialAccountRequestBuilder
         */
        public CreateTrialAccountRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Build call for createTrialAccount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AccountCreateTrialAccountRequest accountCreateTrialAccountRequest = buildBodyParams();
            return createTrialAccountCall(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid, _callback);
        }

        private AccountCreateTrialAccountRequest buildBodyParams() {
            AccountCreateTrialAccountRequest accountCreateTrialAccountRequest = new AccountCreateTrialAccountRequest();
            accountCreateTrialAccountRequest.email(this.email);
            accountCreateTrialAccountRequest.firstname(this.firstname);
            accountCreateTrialAccountRequest.lastname(this.lastname);
            accountCreateTrialAccountRequest.companyName(this.companyName);
            if (this.country != null)
            accountCreateTrialAccountRequest.country(AccountCreateTrialAccountRequest.CountryEnum.fromValue(this.country));
            accountCreateTrialAccountRequest.mobilePhone(this.mobilePhone);
            accountCreateTrialAccountRequest.utmCampaign(this.utmCampaign);
            accountCreateTrialAccountRequest.utmContent(this.utmContent);
            accountCreateTrialAccountRequest.utmMedium(this.utmMedium);
            accountCreateTrialAccountRequest.utmSource(this.utmSource);
            accountCreateTrialAccountRequest.utmTerm(this.utmTerm);
            return accountCreateTrialAccountRequest;
        }

        /**
         * Execute createTrialAccount request
         * @return AccountCreateTrialAccountResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public AccountCreateTrialAccountResponse execute() throws ApiException {
            AccountCreateTrialAccountRequest accountCreateTrialAccountRequest = buildBodyParams();
            ApiResponse<AccountCreateTrialAccountResponse> localVarResp = createTrialAccountWithHttpInfo(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createTrialAccount request with HTTP info returned
         * @return ApiResponse&lt;AccountCreateTrialAccountResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AccountCreateTrialAccountResponse> executeWithHttpInfo() throws ApiException {
            AccountCreateTrialAccountRequest accountCreateTrialAccountRequest = buildBodyParams();
            return createTrialAccountWithHttpInfo(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute createTrialAccount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AccountCreateTrialAccountResponse> _callback) throws ApiException {
            AccountCreateTrialAccountRequest accountCreateTrialAccountRequest = buildBodyParams();
            return createTrialAccountAsync(accountCreateTrialAccountRequest, xApiVersion, xCompanyGuid, _callback);
        }
    }

    /**
     * Create Trial Account
     * 
     * @param accountCreateTrialAccountRequest  (required)
     * @return CreateTrialAccountRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public CreateTrialAccountRequestBuilder createTrialAccount(String email, String firstname, String lastname, String companyName, String country, String utmSource) throws IllegalArgumentException {
        if (email == null) throw new IllegalArgumentException("\"email\" is required but got null");
            

        if (firstname == null) throw new IllegalArgumentException("\"firstname\" is required but got null");
            

        if (lastname == null) throw new IllegalArgumentException("\"lastname\" is required but got null");
            

        if (companyName == null) throw new IllegalArgumentException("\"companyName\" is required but got null");
            

        if (country == null) throw new IllegalArgumentException("\"country\" is required but got null");
            

        if (utmSource == null) throw new IllegalArgumentException("\"utmSource\" is required but got null");
            

        return new CreateTrialAccountRequestBuilder(email, firstname, lastname, companyName, country, utmSource);
    }
}
