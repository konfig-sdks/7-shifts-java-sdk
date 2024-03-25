package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.AvailabilityApi;
import com.konfigthis.client.api.CompaniesApi;
import com.konfigthis.client.api.DayPartApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.EngageApi;
import com.konfigthis.client.api.ExternalUserMappingsApi;
import com.konfigthis.client.api.ForecastOverridesApi;
import com.konfigthis.client.api.IntegrationMappingsApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.LogBookApi;
import com.konfigthis.client.api.ReceiptsApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.RolesApi;
import com.konfigthis.client.api.ScheduleEnforcementApi;
import com.konfigthis.client.api.ScheduleEventsApi;
import com.konfigthis.client.api.ShiftFeedbackApi;
import com.konfigthis.client.api.ShiftsApi;
import com.konfigthis.client.api.TaskManagementApi;
import com.konfigthis.client.api.TimeOffApi;
import com.konfigthis.client.api.TimePunchesApi;
import com.konfigthis.client.api.TipPoolApi;
import com.konfigthis.client.api.UserAssignmentsApi;
import com.konfigthis.client.api.UserWagesApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.WebhooksApi;

public class Client7Shifts {
    private ApiClient apiClient;
    public final AccountApi account;
    public final AuthenticationApi authentication;
    public final AvailabilityApi availability;
    public final CompaniesApi companies;
    public final DayPartApi dayPart;
    public final DepartmentsApi departments;
    public final EngageApi engage;
    public final ExternalUserMappingsApi externalUserMappings;
    public final ForecastOverridesApi forecastOverrides;
    public final IntegrationMappingsApi integrationMappings;
    public final LocationsApi locations;
    public final LogBookApi logBook;
    public final ReceiptsApi receipts;
    public final ReportsApi reports;
    public final RolesApi roles;
    public final ScheduleEnforcementApi scheduleEnforcement;
    public final ScheduleEventsApi scheduleEvents;
    public final ShiftFeedbackApi shiftFeedback;
    public final ShiftsApi shifts;
    public final TaskManagementApi taskManagement;
    public final TimeOffApi timeOff;
    public final TimePunchesApi timePunches;
    public final TipPoolApi tipPool;
    public final UserAssignmentsApi userAssignments;
    public final UserWagesApi userWages;
    public final UsersApi users;
    public final WebhooksApi webhooks;

    public Client7Shifts() {
        this(null);
    }

    public Client7Shifts(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.availability = new AvailabilityApi(this.apiClient);
        this.companies = new CompaniesApi(this.apiClient);
        this.dayPart = new DayPartApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.engage = new EngageApi(this.apiClient);
        this.externalUserMappings = new ExternalUserMappingsApi(this.apiClient);
        this.forecastOverrides = new ForecastOverridesApi(this.apiClient);
        this.integrationMappings = new IntegrationMappingsApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.logBook = new LogBookApi(this.apiClient);
        this.receipts = new ReceiptsApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.roles = new RolesApi(this.apiClient);
        this.scheduleEnforcement = new ScheduleEnforcementApi(this.apiClient);
        this.scheduleEvents = new ScheduleEventsApi(this.apiClient);
        this.shiftFeedback = new ShiftFeedbackApi(this.apiClient);
        this.shifts = new ShiftsApi(this.apiClient);
        this.taskManagement = new TaskManagementApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
        this.timePunches = new TimePunchesApi(this.apiClient);
        this.tipPool = new TipPoolApi(this.apiClient);
        this.userAssignments = new UserAssignmentsApi(this.apiClient);
        this.userWages = new UserWagesApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
