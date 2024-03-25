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
import com.konfigthis.client.model.AccountCreateTrialAccountRequest;
import com.konfigthis.client.model.AccountCreateTrialAccountResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Disabled
public class AccountApiTest {

    private static AccountApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccountApi(apiClient);
    }

    /**
     * Create Trial Account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTrialAccountTest() throws ApiException {
        String email = null;
        String firstname = null;
        String lastname = null;
        String companyName = null;
        String country = null;
        String utmSource = null;
        String mobilePhone = null;
        String utmCampaign = null;
        String utmContent = null;
        String utmMedium = null;
        String utmTerm = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        AccountCreateTrialAccountResponse response = api.createTrialAccount(email, firstname, lastname, companyName, country, utmSource)
                .mobilePhone(mobilePhone)
                .utmCampaign(utmCampaign)
                .utmContent(utmContent)
                .utmMedium(utmMedium)
                .utmTerm(utmTerm)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

}
