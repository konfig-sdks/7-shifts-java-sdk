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


import java.util.UUID;
import com.konfigthis.client.model.UserWagesCreateRequest;
import com.konfigthis.client.model.UserWagesCreateResponse;
import com.konfigthis.client.model.UserWagesListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UserWagesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserWagesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UserWagesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createCall(Long companyId, Long userId, UserWagesCreateRequest userWagesCreateRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = userWagesCreateRequest;

        // create path and map variables
        String localVarPath = "/v2/company/{company_id}/users/{user_id}/wages"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call createValidateBeforeCall(Long companyId, Long userId, UserWagesCreateRequest userWagesCreateRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling create(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling create(Async)");
        }

        // verify the required parameter 'userWagesCreateRequest' is set
        if (userWagesCreateRequest == null) {
            throw new ApiException("Missing the required parameter 'userWagesCreateRequest' when calling create(Async)");
        }

        return createCall(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid, _callback);

    }


    private ApiResponse<UserWagesCreateResponse> createWithHttpInfo(Long companyId, Long userId, UserWagesCreateRequest userWagesCreateRequest, String xApiVersion, UUID xCompanyGuid) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid, null);
        Type localVarReturnType = new TypeToken<UserWagesCreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createAsync(Long companyId, Long userId, UserWagesCreateRequest userWagesCreateRequest, String xApiVersion, UUID xCompanyGuid, final ApiCallback<UserWagesCreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid, _callback);
        Type localVarReturnType = new TypeToken<UserWagesCreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateRequestBuilder {
        private final String effectiveDate;
        private final String wageType;
        private final Integer wageCents;
        private final Long companyId;
        private final Long userId;
        private Integer roleId;
        private String xApiVersion;
        private UUID xCompanyGuid;

        private CreateRequestBuilder(String effectiveDate, String wageType, Integer wageCents, Long companyId, Long userId) {
            this.effectiveDate = effectiveDate;
            this.wageType = wageType;
            this.wageCents = wageCents;
            this.companyId = companyId;
            this.userId = userId;
        }

        /**
         * Set roleId
         * @param roleId Role ID (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        
        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return CreateRequestBuilder
         */
        public CreateRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Build call for create
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Wage created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UserWagesCreateRequest userWagesCreateRequest = buildBodyParams();
            return createCall(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid, _callback);
        }

        private UserWagesCreateRequest buildBodyParams() {
            UserWagesCreateRequest userWagesCreateRequest = new UserWagesCreateRequest();
            userWagesCreateRequest.effectiveDate(this.effectiveDate);
            userWagesCreateRequest.roleId(this.roleId);
            if (this.wageType != null)
            userWagesCreateRequest.wageType(UserWagesCreateRequest.WageTypeEnum.fromValue(this.wageType));
            userWagesCreateRequest.wageCents(this.wageCents);
            return userWagesCreateRequest;
        }

        /**
         * Execute create request
         * @return UserWagesCreateResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Wage created </td><td>  -  </td></tr>
         </table>
         */
        public UserWagesCreateResponse execute() throws ApiException {
            UserWagesCreateRequest userWagesCreateRequest = buildBodyParams();
            ApiResponse<UserWagesCreateResponse> localVarResp = createWithHttpInfo(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute create request with HTTP info returned
         * @return ApiResponse&lt;UserWagesCreateResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Wage created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<UserWagesCreateResponse> executeWithHttpInfo() throws ApiException {
            UserWagesCreateRequest userWagesCreateRequest = buildBodyParams();
            return createWithHttpInfo(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute create request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Wage created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserWagesCreateResponse> _callback) throws ApiException {
            UserWagesCreateRequest userWagesCreateRequest = buildBodyParams();
            return createAsync(companyId, userId, userWagesCreateRequest, xApiVersion, xCompanyGuid, _callback);
        }
    }

    /**
     * Create User Wage
     * 
     * @param companyId Company ID (required)
     * @param userId User ID (required)
     * @param userWagesCreateRequest  (required)
     * @return CreateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Wage created </td><td>  -  </td></tr>
     </table>
     */
    public CreateRequestBuilder create(String effectiveDate, String wageType, Integer wageCents, Long companyId, Long userId) throws IllegalArgumentException {
        if (effectiveDate == null) throw new IllegalArgumentException("\"effectiveDate\" is required but got null");
            

        if (wageType == null) throw new IllegalArgumentException("\"wageType\" is required but got null");
            

        if (wageCents == null) throw new IllegalArgumentException("\"wageCents\" is required but got null");
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
        if (userId == null) throw new IllegalArgumentException("\"userId\" is required but got null");
        return new CreateRequestBuilder(effectiveDate, wageType, wageCents, companyId, userId);
    }
    private okhttp3.Call listCall(Long companyId, Long userId, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/company/{company_id}/users/{user_id}/wages"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2", "OAuth2", "cookieAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(Long companyId, Long userId, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling list(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling list(Async)");
        }

        return listCall(companyId, userId, xApiVersion, xCompanyGuid, _callback);

    }


    private ApiResponse<UserWagesListResponse> listWithHttpInfo(Long companyId, Long userId, String xApiVersion, UUID xCompanyGuid) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(companyId, userId, xApiVersion, xCompanyGuid, null);
        Type localVarReturnType = new TypeToken<UserWagesListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Long companyId, Long userId, String xApiVersion, UUID xCompanyGuid, final ApiCallback<UserWagesListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(companyId, userId, xApiVersion, xCompanyGuid, _callback);
        Type localVarReturnType = new TypeToken<UserWagesListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private final Long companyId;
        private final Long userId;
        private String xApiVersion;
        private UUID xCompanyGuid;

        private ListRequestBuilder(Long companyId, Long userId) {
            this.companyId = companyId;
            this.userId = userId;
        }

        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(companyId, userId, xApiVersion, xCompanyGuid, _callback);
        }


        /**
         * Execute list request
         * @return UserWagesListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public UserWagesListResponse execute() throws ApiException {
            ApiResponse<UserWagesListResponse> localVarResp = listWithHttpInfo(companyId, userId, xApiVersion, xCompanyGuid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;UserWagesListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<UserWagesListResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(companyId, userId, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserWagesListResponse> _callback) throws ApiException {
            return listAsync(companyId, userId, xApiVersion, xCompanyGuid, _callback);
        }
    }

    /**
     * List User Wages
     * 
     * @param companyId Company ID (required)
     * @param userId User ID (required)
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list(Long companyId, Long userId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
        if (userId == null) throw new IllegalArgumentException("\"userId\" is required but got null");
        return new ListRequestBuilder(companyId, userId);
    }
}
