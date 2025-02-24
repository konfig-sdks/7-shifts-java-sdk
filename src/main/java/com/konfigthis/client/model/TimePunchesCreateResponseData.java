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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TimePunchesCreateResponseDataBreaksInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * TimePunchesCreateResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimePunchesCreateResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SHIFT_ID = "shift_id";
  @SerializedName(SERIALIZED_NAME_SHIFT_ID)
  private Integer shiftId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_EDITABLE_PUNCH = "editable_punch";
  @SerializedName(SERIALIZED_NAME_EDITABLE_PUNCH)
  private Boolean editablePunch;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private Integer roleId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Integer locationId;

  public static final String SERIALIZED_NAME_DEPARTMENT_ID = "department_id";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID)
  private Integer departmentId;

  public static final String SERIALIZED_NAME_HOURLY_WAGE = "hourly_wage";
  @SerializedName(SERIALIZED_NAME_HOURLY_WAGE)
  private Integer hourlyWage;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_CLOCKED_IN = "clocked_in";
  @SerializedName(SERIALIZED_NAME_CLOCKED_IN)
  private OffsetDateTime clockedIn;

  public static final String SERIALIZED_NAME_CLOCKED_OUT = "clocked_out";
  @SerializedName(SERIALIZED_NAME_CLOCKED_OUT)
  private OffsetDateTime clockedOut;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_AUTO_CLOCKED_OUT = "auto_clocked_out";
  @SerializedName(SERIALIZED_NAME_AUTO_CLOCKED_OUT)
  private Boolean autoClockedOut;

  public static final String SERIALIZED_NAME_CLOCKED_IN_OFFLINE = "clocked_in_offline";
  @SerializedName(SERIALIZED_NAME_CLOCKED_IN_OFFLINE)
  private Boolean clockedInOffline;

  public static final String SERIALIZED_NAME_CLOCKED_OUT_OFFLINE = "clocked_out_offline";
  @SerializedName(SERIALIZED_NAME_CLOCKED_OUT_OFFLINE)
  private Boolean clockedOutOffline;

  public static final String SERIALIZED_NAME_TIPS = "tips";
  @SerializedName(SERIALIZED_NAME_TIPS)
  private Integer tips;

  public static final String SERIALIZED_NAME_POS_TYPE = "pos_type";
  @SerializedName(SERIALIZED_NAME_POS_TYPE)
  private String posType;

  public static final String SERIALIZED_NAME_BREAKS = "breaks";
  @SerializedName(SERIALIZED_NAME_BREAKS)
  private List<TimePunchesCreateResponseDataBreaksInner> breaks = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public TimePunchesCreateResponseData() {
  }

  public TimePunchesCreateResponseData id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Time punch ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time punch ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public TimePunchesCreateResponseData shiftId(Integer shiftId) {
    
    
    
    
    this.shiftId = shiftId;
    return this;
  }

   /**
   * Shift ID. Can be unassigned
   * @return shiftId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Shift ID. Can be unassigned")

  public Integer getShiftId() {
    return shiftId;
  }


  public void setShiftId(Integer shiftId) {
    
    
    
    this.shiftId = shiftId;
  }


  public TimePunchesCreateResponseData userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * The 7shifts ID of the user who is clocking in.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The 7shifts ID of the user who is clocking in.")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
  }


  public TimePunchesCreateResponseData editablePunch(Boolean editablePunch) {
    
    
    
    
    this.editablePunch = editablePunch;
    return this;
  }

   /**
   * If true the time punch can be edited by a manager. Set to false via POS integrations
   * @return editablePunch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true the time punch can be edited by a manager. Set to false via POS integrations")

  public Boolean getEditablePunch() {
    return editablePunch;
  }


  public void setEditablePunch(Boolean editablePunch) {
    
    
    
    this.editablePunch = editablePunch;
  }


  public TimePunchesCreateResponseData roleId(Integer roleId) {
    
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Role ID
   * @return roleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Role ID")

  public Integer getRoleId() {
    return roleId;
  }


  public void setRoleId(Integer roleId) {
    
    
    
    this.roleId = roleId;
  }


  public TimePunchesCreateResponseData companyId(Integer companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company ID
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Company ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    
    
    
    this.companyId = companyId;
  }


  public TimePunchesCreateResponseData locationId(Integer locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Location ID
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Location ID")

  public Integer getLocationId() {
    return locationId;
  }


  public void setLocationId(Integer locationId) {
    
    
    
    this.locationId = locationId;
  }


  public TimePunchesCreateResponseData departmentId(Integer departmentId) {
    
    
    
    
    this.departmentId = departmentId;
    return this;
  }

   /**
   * Department ID. Defaults to 0 if not defined.
   * @return departmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Department ID. Defaults to 0 if not defined.")

  public Integer getDepartmentId() {
    return departmentId;
  }


  public void setDepartmentId(Integer departmentId) {
    
    
    
    this.departmentId = departmentId;
  }


  public TimePunchesCreateResponseData hourlyWage(Integer hourlyWage) {
    if (hourlyWage != null && hourlyWage < 0) {
      throw new IllegalArgumentException("Invalid value for hourlyWage. Must be greater than or equal to 0.");
    }
    
    
    
    this.hourlyWage = hourlyWage;
    return this;
  }

   /**
   * Calculated hourly wage. Use the users_wages endpoint value for accuracy
   * minimum: 0
   * @return hourlyWage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculated hourly wage. Use the users_wages endpoint value for accuracy")

  public Integer getHourlyWage() {
    return hourlyWage;
  }


  public void setHourlyWage(Integer hourlyWage) {
    if (hourlyWage != null && hourlyWage < 0) {
      throw new IllegalArgumentException("Invalid value for hourlyWage. Must be greater than or equal to 0.");
    }
    
    
    this.hourlyWage = hourlyWage;
  }


  public TimePunchesCreateResponseData approved(Boolean approved) {
    
    
    
    
    this.approved = approved;
    return this;
  }

   /**
   * If true the time punch is approved
   * @return approved
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true the time punch is approved")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    
    
    
    this.approved = approved;
  }


  public TimePunchesCreateResponseData clockedIn(OffsetDateTime clockedIn) {
    
    
    
    
    this.clockedIn = clockedIn;
    return this;
  }

   /**
   * The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone.
   * @return clockedIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-20T12:00Z", required = true, value = "The start date and time when the user clocked in. Formatted as ISO8601 datetime in UTC timezone.")

  public OffsetDateTime getClockedIn() {
    return clockedIn;
  }


  public void setClockedIn(OffsetDateTime clockedIn) {
    
    
    
    this.clockedIn = clockedIn;
  }


  public TimePunchesCreateResponseData clockedOut(OffsetDateTime clockedOut) {
    
    
    
    
    this.clockedOut = clockedOut;
    return this;
  }

   /**
   * The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone.
   * @return clockedOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-20T12:00Z", required = true, value = "The start date and time when the user clocked out. Formatted as ISO8601 datetime in UTC timezone.")

  public OffsetDateTime getClockedOut() {
    return clockedOut;
  }


  public void setClockedOut(OffsetDateTime clockedOut) {
    
    
    
    this.clockedOut = clockedOut;
  }


  public TimePunchesCreateResponseData notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Additional notes for a shift
   * @return notes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Additional notes for a shift")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public TimePunchesCreateResponseData autoClockedOut(Boolean autoClockedOut) {
    
    
    
    
    this.autoClockedOut = autoClockedOut;
    return this;
  }

   /**
   * If true the time punch was auto clocked out
   * @return autoClockedOut
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true the time punch was auto clocked out")

  public Boolean getAutoClockedOut() {
    return autoClockedOut;
  }


  public void setAutoClockedOut(Boolean autoClockedOut) {
    
    
    
    this.autoClockedOut = autoClockedOut;
  }


  public TimePunchesCreateResponseData clockedInOffline(Boolean clockedInOffline) {
    
    
    
    
    this.clockedInOffline = clockedInOffline;
    return this;
  }

   /**
   * If true the time punch was clocked in offline
   * @return clockedInOffline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true the time punch was clocked in offline")

  public Boolean getClockedInOffline() {
    return clockedInOffline;
  }


  public void setClockedInOffline(Boolean clockedInOffline) {
    
    
    
    this.clockedInOffline = clockedInOffline;
  }


  public TimePunchesCreateResponseData clockedOutOffline(Boolean clockedOutOffline) {
    
    
    
    
    this.clockedOutOffline = clockedOutOffline;
    return this;
  }

   /**
   * If true the time punch was clocked out offline
   * @return clockedOutOffline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true the time punch was clocked out offline")

  public Boolean getClockedOutOffline() {
    return clockedOutOffline;
  }


  public void setClockedOutOffline(Boolean clockedOutOffline) {
    
    
    
    this.clockedOutOffline = clockedOutOffline;
  }


  public TimePunchesCreateResponseData tips(Integer tips) {
    
    
    
    
    this.tips = tips;
    return this;
  }

   /**
   * Tips declared for the shift in cents
   * @return tips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tips declared for the shift in cents")

  public Integer getTips() {
    return tips;
  }


  public void setTips(Integer tips) {
    
    
    
    this.tips = tips;
  }


  public TimePunchesCreateResponseData posType(String posType) {
    
    
    
    
    this.posType = posType;
    return this;
  }

   /**
   * The source of the time punch. 7shift apps will be web
   * @return posType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "web", value = "The source of the time punch. 7shift apps will be web")

  public String getPosType() {
    return posType;
  }


  public void setPosType(String posType) {
    
    
    
    this.posType = posType;
  }


  public TimePunchesCreateResponseData breaks(List<TimePunchesCreateResponseDataBreaksInner> breaks) {
    
    
    
    
    this.breaks = breaks;
    return this;
  }

  public TimePunchesCreateResponseData addBreaksItem(TimePunchesCreateResponseDataBreaksInner breaksItem) {
    if (this.breaks == null) {
      this.breaks = new ArrayList<>();
    }
    this.breaks.add(breaksItem);
    return this;
  }

   /**
   * Get breaks
   * @return breaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimePunchesCreateResponseDataBreaksInner> getBreaks() {
    return breaks;
  }


  public void setBreaks(List<TimePunchesCreateResponseDataBreaksInner> breaks) {
    
    
    
    this.breaks = breaks;
  }


  public TimePunchesCreateResponseData created(OffsetDateTime created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * The date and time when created. Formatted as ISO8601 datetime in UTC timezone.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-20T12:00Z", required = true, value = "The date and time when created. Formatted as ISO8601 datetime in UTC timezone.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    
    
    
    this.created = created;
  }


  public TimePunchesCreateResponseData modified(OffsetDateTime modified) {
    
    
    
    
    this.modified = modified;
    return this;
  }

   /**
   * The date and time when last modified. Formatted as ISO8601 datetime in UTC timezone.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-20T12:00Z", required = true, value = "The date and time when last modified. Formatted as ISO8601 datetime in UTC timezone.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    
    
    
    this.modified = modified;
  }


  public TimePunchesCreateResponseData deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * If true the time punch is deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true the time punch is deleted")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TimePunchesCreateResponseData instance itself
   */
  public TimePunchesCreateResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePunchesCreateResponseData timePunchesCreateResponseData = (TimePunchesCreateResponseData) o;
    return Objects.equals(this.id, timePunchesCreateResponseData.id) &&
        Objects.equals(this.shiftId, timePunchesCreateResponseData.shiftId) &&
        Objects.equals(this.userId, timePunchesCreateResponseData.userId) &&
        Objects.equals(this.editablePunch, timePunchesCreateResponseData.editablePunch) &&
        Objects.equals(this.roleId, timePunchesCreateResponseData.roleId) &&
        Objects.equals(this.companyId, timePunchesCreateResponseData.companyId) &&
        Objects.equals(this.locationId, timePunchesCreateResponseData.locationId) &&
        Objects.equals(this.departmentId, timePunchesCreateResponseData.departmentId) &&
        Objects.equals(this.hourlyWage, timePunchesCreateResponseData.hourlyWage) &&
        Objects.equals(this.approved, timePunchesCreateResponseData.approved) &&
        Objects.equals(this.clockedIn, timePunchesCreateResponseData.clockedIn) &&
        Objects.equals(this.clockedOut, timePunchesCreateResponseData.clockedOut) &&
        Objects.equals(this.notes, timePunchesCreateResponseData.notes) &&
        Objects.equals(this.autoClockedOut, timePunchesCreateResponseData.autoClockedOut) &&
        Objects.equals(this.clockedInOffline, timePunchesCreateResponseData.clockedInOffline) &&
        Objects.equals(this.clockedOutOffline, timePunchesCreateResponseData.clockedOutOffline) &&
        Objects.equals(this.tips, timePunchesCreateResponseData.tips) &&
        Objects.equals(this.posType, timePunchesCreateResponseData.posType) &&
        Objects.equals(this.breaks, timePunchesCreateResponseData.breaks) &&
        Objects.equals(this.created, timePunchesCreateResponseData.created) &&
        Objects.equals(this.modified, timePunchesCreateResponseData.modified) &&
        Objects.equals(this.deleted, timePunchesCreateResponseData.deleted)&&
        Objects.equals(this.additionalProperties, timePunchesCreateResponseData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shiftId, userId, editablePunch, roleId, companyId, locationId, departmentId, hourlyWage, approved, clockedIn, clockedOut, notes, autoClockedOut, clockedInOffline, clockedOutOffline, tips, posType, breaks, created, modified, deleted, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePunchesCreateResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    editablePunch: ").append(toIndentedString(editablePunch)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    hourlyWage: ").append(toIndentedString(hourlyWage)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    clockedIn: ").append(toIndentedString(clockedIn)).append("\n");
    sb.append("    clockedOut: ").append(toIndentedString(clockedOut)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    autoClockedOut: ").append(toIndentedString(autoClockedOut)).append("\n");
    sb.append("    clockedInOffline: ").append(toIndentedString(clockedInOffline)).append("\n");
    sb.append("    clockedOutOffline: ").append(toIndentedString(clockedOutOffline)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    posType: ").append(toIndentedString(posType)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("shift_id");
    openapiFields.add("user_id");
    openapiFields.add("editable_punch");
    openapiFields.add("role_id");
    openapiFields.add("company_id");
    openapiFields.add("location_id");
    openapiFields.add("department_id");
    openapiFields.add("hourly_wage");
    openapiFields.add("approved");
    openapiFields.add("clocked_in");
    openapiFields.add("clocked_out");
    openapiFields.add("notes");
    openapiFields.add("auto_clocked_out");
    openapiFields.add("clocked_in_offline");
    openapiFields.add("clocked_out_offline");
    openapiFields.add("tips");
    openapiFields.add("pos_type");
    openapiFields.add("breaks");
    openapiFields.add("created");
    openapiFields.add("modified");
    openapiFields.add("deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("shift_id");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("editable_punch");
    openapiRequiredFields.add("role_id");
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("location_id");
    openapiRequiredFields.add("hourly_wage");
    openapiRequiredFields.add("approved");
    openapiRequiredFields.add("clocked_in");
    openapiRequiredFields.add("clocked_out");
    openapiRequiredFields.add("notes");
    openapiRequiredFields.add("auto_clocked_out");
    openapiRequiredFields.add("clocked_in_offline");
    openapiRequiredFields.add("clocked_out_offline");
    openapiRequiredFields.add("tips");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("modified");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimePunchesCreateResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimePunchesCreateResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimePunchesCreateResponseData is not found in the empty JSON string", TimePunchesCreateResponseData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimePunchesCreateResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (!jsonObj.get("pos_type").isJsonNull() && (jsonObj.get("pos_type") != null && !jsonObj.get("pos_type").isJsonNull()) && !jsonObj.get("pos_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pos_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pos_type").toString()));
      }
      if (jsonObj.get("breaks") != null && !jsonObj.get("breaks").isJsonNull()) {
        JsonArray jsonArraybreaks = jsonObj.getAsJsonArray("breaks");
        if (jsonArraybreaks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("breaks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `breaks` to be an array in the JSON string but got `%s`", jsonObj.get("breaks").toString()));
          }

          // validate the optional field `breaks` (array)
          for (int i = 0; i < jsonArraybreaks.size(); i++) {
            TimePunchesCreateResponseDataBreaksInner.validateJsonObject(jsonArraybreaks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimePunchesCreateResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimePunchesCreateResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimePunchesCreateResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimePunchesCreateResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TimePunchesCreateResponseData>() {
           @Override
           public void write(JsonWriter out, TimePunchesCreateResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TimePunchesCreateResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimePunchesCreateResponseData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimePunchesCreateResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimePunchesCreateResponseData
  * @throws IOException if the JSON string is invalid with respect to TimePunchesCreateResponseData
  */
  public static TimePunchesCreateResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimePunchesCreateResponseData.class);
  }

 /**
  * Convert an instance of TimePunchesCreateResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

