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


import com.konfigthis.client.model.IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner;
import com.konfigthis.client.model.IntegrationMappingsCreateSalesCategoryMappingsBulkResponse;
import com.konfigthis.client.model.IntegrationMappingsListSalesCategoryMappingsResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class IntegrationMappingsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IntegrationMappingsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public IntegrationMappingsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createSalesCategoryMappingsBulkCall(Long companyId, Long locationId, Long departmentId, List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = integrationMappingsCreateSalesCategoryMappingsBulkRequestInner;

        // create path and map variables
        String localVarPath = "/v2/company/{company_id}/location/{location_id}/sales_category_mappings_bulk"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "location_id" + "}", localVarApiClient.escapeString(locationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (departmentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("department_id", departmentId));
        }

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
    private okhttp3.Call createSalesCategoryMappingsBulkValidateBeforeCall(Long companyId, Long locationId, Long departmentId, List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createSalesCategoryMappingsBulk(Async)");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling createSalesCategoryMappingsBulk(Async)");
        }

        // verify the required parameter 'departmentId' is set
        if (departmentId == null) {
            throw new ApiException("Missing the required parameter 'departmentId' when calling createSalesCategoryMappingsBulk(Async)");
        }

        // verify the required parameter 'integrationMappingsCreateSalesCategoryMappingsBulkRequestInner' is set
        if (integrationMappingsCreateSalesCategoryMappingsBulkRequestInner == null) {
            throw new ApiException("Missing the required parameter 'integrationMappingsCreateSalesCategoryMappingsBulkRequestInner' when calling createSalesCategoryMappingsBulk(Async)");
        }

        return createSalesCategoryMappingsBulkCall(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid, _callback);

    }


    private ApiResponse<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> createSalesCategoryMappingsBulkWithHttpInfo(Long companyId, Long locationId, Long departmentId, List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, String xApiVersion, UUID xCompanyGuid) throws ApiException {
        okhttp3.Call localVarCall = createSalesCategoryMappingsBulkValidateBeforeCall(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid, null);
        Type localVarReturnType = new TypeToken<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createSalesCategoryMappingsBulkAsync(Long companyId, Long locationId, Long departmentId, List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, String xApiVersion, UUID xCompanyGuid, final ApiCallback<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSalesCategoryMappingsBulkValidateBeforeCall(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid, _callback);
        Type localVarReturnType = new TypeToken<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateSalesCategoryMappingsBulkRequestBuilder {
        private final Long companyId;
        private final Long locationId;
        private final Long departmentId;
        private String xApiVersion;
        private UUID xCompanyGuid;
        private List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner;

        private CreateSalesCategoryMappingsBulkRequestBuilder(Long companyId, Long locationId, Long departmentId) {
            this.companyId = companyId;
            this.locationId = locationId;
            this.departmentId = departmentId;
        }

        /**
         * Set integrationMappingsCreateSalesCategoryMappingsBulkRequestInner
         * @param integrationMappingsCreateSalesCategoryMappingsBulkRequestInner  (optional)
         * @return CreateSalesCategoryMappingsBulkRequestBuilder
         */
        public CreateSalesCategoryMappingsBulkRequestBuilder integrationMappingsCreateSalesCategoryMappingsBulkRequestInner(List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner) {
            this.integrationMappingsCreateSalesCategoryMappingsBulkRequestInner = integrationMappingsCreateSalesCategoryMappingsBulkRequestInner;
            return this;
        }

        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return CreateSalesCategoryMappingsBulkRequestBuilder
         */
        public CreateSalesCategoryMappingsBulkRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return CreateSalesCategoryMappingsBulkRequestBuilder
         */
        public CreateSalesCategoryMappingsBulkRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Build call for createSalesCategoryMappingsBulk
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner = buildBodyParams();
            return createSalesCategoryMappingsBulkCall(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid, _callback);
        }

        private List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> buildBodyParams() {
            return this.integrationMappingsCreateSalesCategoryMappingsBulkRequestInner;
        }

        /**
         * Execute createSalesCategoryMappingsBulk request
         * @return IntegrationMappingsCreateSalesCategoryMappingsBulkResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationMappingsCreateSalesCategoryMappingsBulkResponse execute() throws ApiException {
            List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner = buildBodyParams();
            ApiResponse<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> localVarResp = createSalesCategoryMappingsBulkWithHttpInfo(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createSalesCategoryMappingsBulk request with HTTP info returned
         * @return ApiResponse&lt;IntegrationMappingsCreateSalesCategoryMappingsBulkResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> executeWithHttpInfo() throws ApiException {
            List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner = buildBodyParams();
            return createSalesCategoryMappingsBulkWithHttpInfo(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute createSalesCategoryMappingsBulk request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationMappingsCreateSalesCategoryMappingsBulkResponse> _callback) throws ApiException {
            List<IntegrationMappingsCreateSalesCategoryMappingsBulkRequestInner> integrationMappingsCreateSalesCategoryMappingsBulkRequestInner = buildBodyParams();
            return createSalesCategoryMappingsBulkAsync(companyId, locationId, departmentId, integrationMappingsCreateSalesCategoryMappingsBulkRequestInner, xApiVersion, xCompanyGuid, _callback);
        }
    }

    /**
     * Create Sales Category Mappings
     * 
     * @param companyId Company ID (required)
     * @param locationId Location ID (required)
     * @param departmentId Department ID (required)
     * @param integrationMappingsCreateSalesCategoryMappingsBulkRequestInner  (required)
     * @return CreateSalesCategoryMappingsBulkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public CreateSalesCategoryMappingsBulkRequestBuilder createSalesCategoryMappingsBulk(Long companyId, Long locationId, Long departmentId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
        if (locationId == null) throw new IllegalArgumentException("\"locationId\" is required but got null");
        if (departmentId == null) throw new IllegalArgumentException("\"departmentId\" is required but got null");
        return new CreateSalesCategoryMappingsBulkRequestBuilder(companyId, locationId, departmentId);
    }
    private okhttp3.Call deleteSalesCategoryMappingsCall(Long companyId, Long locationId, String externalId, Long departmentId, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/company/{company_id}/location/{location_id}/sales_category_mappings/{external_id}"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "location_id" + "}", localVarApiClient.escapeString(locationId.toString()))
            .replace("{" + "external_id" + "}", localVarApiClient.escapeString(externalId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (departmentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("department_id", departmentId));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

        if (xCompanyGuid != null) {
            localVarHeaderParams.put("x-company-guid", localVarApiClient.parameterToString(xCompanyGuid));
        }

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSalesCategoryMappingsValidateBeforeCall(Long companyId, Long locationId, String externalId, Long departmentId, String xApiVersion, UUID xCompanyGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteSalesCategoryMappings(Async)");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling deleteSalesCategoryMappings(Async)");
        }

        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new ApiException("Missing the required parameter 'externalId' when calling deleteSalesCategoryMappings(Async)");
        }

        // verify the required parameter 'departmentId' is set
        if (departmentId == null) {
            throw new ApiException("Missing the required parameter 'departmentId' when calling deleteSalesCategoryMappings(Async)");
        }

        return deleteSalesCategoryMappingsCall(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid, _callback);

    }


    private ApiResponse<Void> deleteSalesCategoryMappingsWithHttpInfo(Long companyId, Long locationId, String externalId, Long departmentId, String xApiVersion, UUID xCompanyGuid) throws ApiException {
        okhttp3.Call localVarCall = deleteSalesCategoryMappingsValidateBeforeCall(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteSalesCategoryMappingsAsync(Long companyId, Long locationId, String externalId, Long departmentId, String xApiVersion, UUID xCompanyGuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSalesCategoryMappingsValidateBeforeCall(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteSalesCategoryMappingsRequestBuilder {
        private final Long companyId;
        private final Long locationId;
        private final String externalId;
        private final Long departmentId;
        private String xApiVersion;
        private UUID xCompanyGuid;

        private DeleteSalesCategoryMappingsRequestBuilder(Long companyId, Long locationId, String externalId, Long departmentId) {
            this.companyId = companyId;
            this.locationId = locationId;
            this.externalId = externalId;
            this.departmentId = departmentId;
        }

        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return DeleteSalesCategoryMappingsRequestBuilder
         */
        public DeleteSalesCategoryMappingsRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return DeleteSalesCategoryMappingsRequestBuilder
         */
        public DeleteSalesCategoryMappingsRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Build call for deleteSalesCategoryMappings
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteSalesCategoryMappingsCall(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid, _callback);
        }


        /**
         * Execute deleteSalesCategoryMappings request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteSalesCategoryMappingsWithHttpInfo(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute deleteSalesCategoryMappings request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteSalesCategoryMappingsWithHttpInfo(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid);
        }

        /**
         * Execute deleteSalesCategoryMappings request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteSalesCategoryMappingsAsync(companyId, locationId, externalId, departmentId, xApiVersion, xCompanyGuid, _callback);
        }
    }

    /**
     * Delete Sales Category Mappings
     * 
     * @param companyId Company ID (required)
     * @param locationId Location ID (required)
     * @param externalId External Category ID (required)
     * @param departmentId Department ID (required)
     * @return DeleteSalesCategoryMappingsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public DeleteSalesCategoryMappingsRequestBuilder deleteSalesCategoryMappings(Long companyId, Long locationId, String externalId, Long departmentId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
        if (locationId == null) throw new IllegalArgumentException("\"locationId\" is required but got null");
        if (externalId == null) throw new IllegalArgumentException("\"externalId\" is required but got null");
            

        if (departmentId == null) throw new IllegalArgumentException("\"departmentId\" is required but got null");
        return new DeleteSalesCategoryMappingsRequestBuilder(companyId, locationId, externalId, departmentId);
    }
    private okhttp3.Call listSalesCategoryMappingsCall(Long companyId, Long locationId, Long departmentId, String xApiVersion, UUID xCompanyGuid, String cursor, Long limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/company/{company_id}/location/{location_id}/sales_category_mappings"
            .replace("{" + "company_id" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "location_id" + "}", localVarApiClient.escapeString(locationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (departmentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("department_id", departmentId));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

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
    private okhttp3.Call listSalesCategoryMappingsValidateBeforeCall(Long companyId, Long locationId, Long departmentId, String xApiVersion, UUID xCompanyGuid, String cursor, Long limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling listSalesCategoryMappings(Async)");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling listSalesCategoryMappings(Async)");
        }

        // verify the required parameter 'departmentId' is set
        if (departmentId == null) {
            throw new ApiException("Missing the required parameter 'departmentId' when calling listSalesCategoryMappings(Async)");
        }

        return listSalesCategoryMappingsCall(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit, _callback);

    }


    private ApiResponse<IntegrationMappingsListSalesCategoryMappingsResponse> listSalesCategoryMappingsWithHttpInfo(Long companyId, Long locationId, Long departmentId, String xApiVersion, UUID xCompanyGuid, String cursor, Long limit) throws ApiException {
        okhttp3.Call localVarCall = listSalesCategoryMappingsValidateBeforeCall(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit, null);
        Type localVarReturnType = new TypeToken<IntegrationMappingsListSalesCategoryMappingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listSalesCategoryMappingsAsync(Long companyId, Long locationId, Long departmentId, String xApiVersion, UUID xCompanyGuid, String cursor, Long limit, final ApiCallback<IntegrationMappingsListSalesCategoryMappingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSalesCategoryMappingsValidateBeforeCall(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit, _callback);
        Type localVarReturnType = new TypeToken<IntegrationMappingsListSalesCategoryMappingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListSalesCategoryMappingsRequestBuilder {
        private final Long companyId;
        private final Long locationId;
        private final Long departmentId;
        private String xApiVersion;
        private UUID xCompanyGuid;
        private String cursor;
        private Long limit;

        private ListSalesCategoryMappingsRequestBuilder(Long companyId, Long locationId, Long departmentId) {
            this.companyId = companyId;
            this.locationId = locationId;
            this.departmentId = departmentId;
        }

        /**
         * Set xApiVersion
         * @param xApiVersion 7shifts API version (optional)
         * @return ListSalesCategoryMappingsRequestBuilder
         */
        public ListSalesCategoryMappingsRequestBuilder xApiVersion(String xApiVersion) {
            this.xApiVersion = xApiVersion;
            return this;
        }
        
        /**
         * Set xCompanyGuid
         * @param xCompanyGuid Company GUID (optional)
         * @return ListSalesCategoryMappingsRequestBuilder
         */
        public ListSalesCategoryMappingsRequestBuilder xCompanyGuid(UUID xCompanyGuid) {
            this.xCompanyGuid = xCompanyGuid;
            return this;
        }
        
        /**
         * Set cursor
         * @param cursor Cursor for the next or previous page of results. (optional)
         * @return ListSalesCategoryMappingsRequestBuilder
         */
        public ListSalesCategoryMappingsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The number of results desired per page. (optional)
         * @return ListSalesCategoryMappingsRequestBuilder
         */
        public ListSalesCategoryMappingsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for listSalesCategoryMappings
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listSalesCategoryMappingsCall(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit, _callback);
        }


        /**
         * Execute listSalesCategoryMappings request
         * @return IntegrationMappingsListSalesCategoryMappingsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public IntegrationMappingsListSalesCategoryMappingsResponse execute() throws ApiException {
            ApiResponse<IntegrationMappingsListSalesCategoryMappingsResponse> localVarResp = listSalesCategoryMappingsWithHttpInfo(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listSalesCategoryMappings request with HTTP info returned
         * @return ApiResponse&lt;IntegrationMappingsListSalesCategoryMappingsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntegrationMappingsListSalesCategoryMappingsResponse> executeWithHttpInfo() throws ApiException {
            return listSalesCategoryMappingsWithHttpInfo(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit);
        }

        /**
         * Execute listSalesCategoryMappings request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IntegrationMappingsListSalesCategoryMappingsResponse> _callback) throws ApiException {
            return listSalesCategoryMappingsAsync(companyId, locationId, departmentId, xApiVersion, xCompanyGuid, cursor, limit, _callback);
        }
    }

    /**
     * List Sales Category Mappings
     * 
     * @param companyId Company ID (required)
     * @param locationId Location ID (required)
     * @param departmentId Department ID (required)
     * @return ListSalesCategoryMappingsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ListSalesCategoryMappingsRequestBuilder listSalesCategoryMappings(Long companyId, Long locationId, Long departmentId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
        if (locationId == null) throw new IllegalArgumentException("\"locationId\" is required but got null");
        if (departmentId == null) throw new IllegalArgumentException("\"departmentId\" is required but got null");
        return new ListSalesCategoryMappingsRequestBuilder(companyId, locationId, departmentId);
    }
}
