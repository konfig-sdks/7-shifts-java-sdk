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
import java.time.LocalDate;
import java.util.UUID;
import com.konfigthis.client.model.UsersBulkCreateRequestInner;
import com.konfigthis.client.model.UsersBulkCreateResponse;
import com.konfigthis.client.model.UsersCreateNewUserRequest;
import com.konfigthis.client.model.UsersCreateNewUserRequestWagesInner;
import com.konfigthis.client.model.UsersCreateNewUserResponse;
import com.konfigthis.client.model.UsersDeactivateRequest;
import com.konfigthis.client.model.UsersGetUserByIdentifierResponse;
import com.konfigthis.client.model.UsersListResponse;
import com.konfigthis.client.model.UsersUpdateUserByIdentifierRequest;
import com.konfigthis.client.model.UsersUpdateUserByIdentifierResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * Create Many Users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkCreateTest() throws ApiException {
        Long companyId = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        UsersBulkCreateResponse response = api.bulkCreate(companyId)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * Create User
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewUserTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        List<Integer> locationIds = null;
        List<Integer> departmentIds = null;
        String type = null;
        Long companyId = null;
        String preferredFirstName = null;
        String preferredLastName = null;
        List<Integer> roleIds = null;
        String email = null;
        String mobileNumber = null;
        String homeNumber = null;
        String address = null;
        String postalZip = null;
        String city = null;
        String provState = null;
        Boolean inviteUser = null;
        String notes = null;
        LocalDate hireDate = null;
        String employeeId = null;
        String punchId = null;
        LocalDate birthDate = null;
        String language = null;
        Boolean appearAsEmployee = null;
        Boolean subscribeToUpdates = null;
        Integer maxWeeklyHours = null;
        Double wageCents = null;
        String wageType = null;
        List<UsersCreateNewUserRequestWagesInner> wages = null;
        Integer permissionsTemplateId = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        UsersCreateNewUserResponse response = api.createNewUser(firstName, lastName, locationIds, departmentIds, type, companyId)
                .preferredFirstName(preferredFirstName)
                .preferredLastName(preferredLastName)
                .roleIds(roleIds)
                .email(email)
                .mobileNumber(mobileNumber)
                .homeNumber(homeNumber)
                .address(address)
                .postalZip(postalZip)
                .city(city)
                .provState(provState)
                .inviteUser(inviteUser)
                .notes(notes)
                .hireDate(hireDate)
                .employeeId(employeeId)
                .punchId(punchId)
                .birthDate(birthDate)
                .language(language)
                .appearAsEmployee(appearAsEmployee)
                .subscribeToUpdates(subscribeToUpdates)
                .maxWeeklyHours(maxWeeklyHours)
                .wageCents(wageCents)
                .wageType(wageType)
                .wages(wages)
                .permissionsTemplateId(permissionsTemplateId)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivate User
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateTest() throws ApiException {
        String inactiveReason = null;
        Long companyId = null;
        Long identifier = null;
        String inactiveComments = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        api.deactivate(inactiveReason, companyId, identifier)
                .inactiveComments(inactiveComments)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve User
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdentifierTest() throws ApiException {
        Long companyId = null;
        String identifier = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        UsersGetUserByIdentifierResponse response = api.getUserByIdentifier(companyId, identifier)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * List Users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Long companyId = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        String modifiedSince = null;
        Integer locationId = null;
        Integer departmentId = null;
        Integer roleId = null;
        String status = null;
        String name = null;
        String sortBy = null;
        String cursor = null;
        Long limit = null;
        UsersListResponse response = api.list(companyId)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .modifiedSince(modifiedSince)
                .locationId(locationId)
                .departmentId(departmentId)
                .roleId(roleId)
                .status(status)
                .name(name)
                .sortBy(sortBy)
                .cursor(cursor)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Update User
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserByIdentifierTest() throws ApiException {
        Long companyId = null;
        Long identifier = null;
        String firstName = null;
        String lastName = null;
        String preferredFirstName = null;
        String preferredLastName = null;
        String email = null;
        String mobileNumber = null;
        String homeNumber = null;
        String address = null;
        String postalZip = null;
        String city = null;
        String provState = null;
        String notes = null;
        LocalDate hireDate = null;
        String type = null;
        String employeeId = null;
        String punchId = null;
        LocalDate birthDate = null;
        String language = null;
        Boolean appearAsEmployee = null;
        Boolean subscribeToUpdates = null;
        Integer maxWeeklyHours = null;
        Boolean active = null;
        String pronouns = null;
        Integer permissionsTemplateId = null;
        String xApiVersion = null;
        UUID xCompanyGuid = null;
        UsersUpdateUserByIdentifierResponse response = api.updateUserByIdentifier(companyId, identifier)
                .firstName(firstName)
                .lastName(lastName)
                .preferredFirstName(preferredFirstName)
                .preferredLastName(preferredLastName)
                .email(email)
                .mobileNumber(mobileNumber)
                .homeNumber(homeNumber)
                .address(address)
                .postalZip(postalZip)
                .city(city)
                .provState(provState)
                .notes(notes)
                .hireDate(hireDate)
                .type(type)
                .employeeId(employeeId)
                .punchId(punchId)
                .birthDate(birthDate)
                .language(language)
                .appearAsEmployee(appearAsEmployee)
                .subscribeToUpdates(subscribeToUpdates)
                .maxWeeklyHours(maxWeeklyHours)
                .active(active)
                .pronouns(pronouns)
                .permissionsTemplateId(permissionsTemplateId)
                .xApiVersion(xApiVersion)
                .xCompanyGuid(xCompanyGuid)
                .execute();
        // TODO: test validations
    }

}
