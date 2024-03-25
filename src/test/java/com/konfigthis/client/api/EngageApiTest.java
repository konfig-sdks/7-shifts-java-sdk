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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.EngageOverviewByLocationIdResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EngageApi
 */
@Disabled
public class EngageApiTest {

    private static EngageApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EngageApi(apiClient);
    }

    /**
     * Retrieve Engagement Overview
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void overviewByLocationIdTest() throws ApiException {
        Long companyId = null;
        Long locationId = null;
        String date = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        String frequency = null;
        String userType = null;
        EngageOverviewByLocationIdResponse response = api.overviewByLocationId(companyId, locationId, date)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .frequency(frequency)
                .userType(userType)
                .execute();
        // TODO: test validations
    }

}
