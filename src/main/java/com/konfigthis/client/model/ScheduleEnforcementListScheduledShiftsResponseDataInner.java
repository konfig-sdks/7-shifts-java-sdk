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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ScheduleEnforcementListScheduledShiftsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScheduleEnforcementListScheduledShiftsResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Integer locationId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_DEPARTMENT_ID = "department_id";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID)
  private Integer departmentId;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private Integer roleId;

  public static final String SERIALIZED_NAME_STATION_ID = "station_id";
  @SerializedName(SERIALIZED_NAME_STATION_ID)
  private Integer stationId;

  public static final String SERIALIZED_NAME_STATION_NAME = "station_name";
  @SerializedName(SERIALIZED_NAME_STATION_NAME)
  private String stationName;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_CLOSE = "close";
  @SerializedName(SERIALIZED_NAME_CLOSE)
  private Boolean close;

  public static final String SERIALIZED_NAME_BUSINESS_DECLINE = "business_decline";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DECLINE)
  private Boolean businessDecline;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  /**
   * Gets or Sets publishStatus
   */
  @JsonAdapter(PublishStatusEnum.Adapter.class)
 public enum PublishStatusEnum {
    DRAFT("draft"),
    
    PUBLISHED("published"),
    
    DRAFT_DELETED("draft_deleted"),
    
    PUBLISHED_DELETED("published_deleted");

    private String value;

    PublishStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PublishStatusEnum fromValue(String value) {
      for (PublishStatusEnum b : PublishStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PublishStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PublishStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PublishStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PublishStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PUBLISH_STATUS = "publish_status";
  @SerializedName(SERIALIZED_NAME_PUBLISH_STATUS)
  private PublishStatusEnum publishStatus;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private Boolean open;

  /**
   * Gets or Sets attendanceStatus
   */
  @JsonAdapter(AttendanceStatusEnum.Adapter.class)
 public enum AttendanceStatusEnum {
    NONE("none"),
    
    SICK("sick"),
    
    NO_SHOW("no_show"),
    
    LATE("late");

    private String value;

    AttendanceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttendanceStatusEnum fromValue(String value) {
      for (AttendanceStatusEnum b : AttendanceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttendanceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttendanceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttendanceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttendanceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATTENDANCE_STATUS = "attendance_status";
  @SerializedName(SERIALIZED_NAME_ATTENDANCE_STATUS)
  private AttendanceStatusEnum attendanceStatus;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public ScheduleEnforcementListScheduledShiftsResponseDataInner() {
  }

  public ScheduleEnforcementListScheduledShiftsResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner locationId(Integer locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLocationId() {
    return locationId;
  }


  public void setLocationId(Integer locationId) {
    
    
    
    this.locationId = locationId;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner departmentId(Integer departmentId) {
    
    
    
    
    this.departmentId = departmentId;
    return this;
  }

   /**
   * Get departmentId
   * @return departmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDepartmentId() {
    return departmentId;
  }


  public void setDepartmentId(Integer departmentId) {
    
    
    
    this.departmentId = departmentId;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner roleId(Integer roleId) {
    
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRoleId() {
    return roleId;
  }


  public void setRoleId(Integer roleId) {
    
    
    
    this.roleId = roleId;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner stationId(Integer stationId) {
    
    
    
    
    this.stationId = stationId;
    return this;
  }

   /**
   * Get stationId
   * @return stationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStationId() {
    return stationId;
  }


  public void setStationId(Integer stationId) {
    
    
    
    this.stationId = stationId;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner stationName(String stationName) {
    
    
    
    
    this.stationName = stationName;
    return this;
  }

   /**
   * Get stationName
   * @return stationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStationName() {
    return stationName;
  }


  public void setStationName(String stationName) {
    
    
    
    this.stationName = stationName;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner start(OffsetDateTime start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    
    
    
    this.start = start;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner end(OffsetDateTime end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    
    
    
    this.end = end;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner close(Boolean close) {
    
    
    
    
    this.close = close;
    return this;
  }

   /**
   * Get close
   * @return close
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getClose() {
    return close;
  }


  public void setClose(Boolean close) {
    
    
    
    this.close = close;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner businessDecline(Boolean businessDecline) {
    
    
    
    
    this.businessDecline = businessDecline;
    return this;
  }

   /**
   * Get businessDecline
   * @return businessDecline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBusinessDecline() {
    return businessDecline;
  }


  public void setBusinessDecline(Boolean businessDecline) {
    
    
    
    this.businessDecline = businessDecline;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner publishStatus(PublishStatusEnum publishStatus) {
    
    
    
    
    this.publishStatus = publishStatus;
    return this;
  }

   /**
   * Get publishStatus
   * @return publishStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PublishStatusEnum getPublishStatus() {
    return publishStatus;
  }


  public void setPublishStatus(PublishStatusEnum publishStatus) {
    
    
    
    this.publishStatus = publishStatus;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner open(Boolean open) {
    
    
    
    
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOpen() {
    return open;
  }


  public void setOpen(Boolean open) {
    
    
    
    this.open = open;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner attendanceStatus(AttendanceStatusEnum attendanceStatus) {
    
    
    
    
    this.attendanceStatus = attendanceStatus;
    return this;
  }

   /**
   * Get attendanceStatus
   * @return attendanceStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AttendanceStatusEnum getAttendanceStatus() {
    return attendanceStatus;
  }


  public void setAttendanceStatus(AttendanceStatusEnum attendanceStatus) {
    
    
    
    this.attendanceStatus = attendanceStatus;
  }


  public ScheduleEnforcementListScheduledShiftsResponseDataInner companyId(Integer companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    
    
    
    this.companyId = companyId;
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
   * @return the ScheduleEnforcementListScheduledShiftsResponseDataInner instance itself
   */
  public ScheduleEnforcementListScheduledShiftsResponseDataInner putAdditionalProperty(String key, Object value) {
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
    ScheduleEnforcementListScheduledShiftsResponseDataInner scheduleEnforcementListScheduledShiftsResponseDataInner = (ScheduleEnforcementListScheduledShiftsResponseDataInner) o;
    return Objects.equals(this.id, scheduleEnforcementListScheduledShiftsResponseDataInner.id) &&
        Objects.equals(this.locationId, scheduleEnforcementListScheduledShiftsResponseDataInner.locationId) &&
        Objects.equals(this.userId, scheduleEnforcementListScheduledShiftsResponseDataInner.userId) &&
        Objects.equals(this.departmentId, scheduleEnforcementListScheduledShiftsResponseDataInner.departmentId) &&
        Objects.equals(this.roleId, scheduleEnforcementListScheduledShiftsResponseDataInner.roleId) &&
        Objects.equals(this.stationId, scheduleEnforcementListScheduledShiftsResponseDataInner.stationId) &&
        Objects.equals(this.stationName, scheduleEnforcementListScheduledShiftsResponseDataInner.stationName) &&
        Objects.equals(this.start, scheduleEnforcementListScheduledShiftsResponseDataInner.start) &&
        Objects.equals(this.end, scheduleEnforcementListScheduledShiftsResponseDataInner.end) &&
        Objects.equals(this.close, scheduleEnforcementListScheduledShiftsResponseDataInner.close) &&
        Objects.equals(this.businessDecline, scheduleEnforcementListScheduledShiftsResponseDataInner.businessDecline) &&
        Objects.equals(this.notes, scheduleEnforcementListScheduledShiftsResponseDataInner.notes) &&
        Objects.equals(this.publishStatus, scheduleEnforcementListScheduledShiftsResponseDataInner.publishStatus) &&
        Objects.equals(this.open, scheduleEnforcementListScheduledShiftsResponseDataInner.open) &&
        Objects.equals(this.attendanceStatus, scheduleEnforcementListScheduledShiftsResponseDataInner.attendanceStatus) &&
        Objects.equals(this.companyId, scheduleEnforcementListScheduledShiftsResponseDataInner.companyId)&&
        Objects.equals(this.additionalProperties, scheduleEnforcementListScheduledShiftsResponseDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, userId, departmentId, roleId, stationId, stationName, start, end, close, businessDecline, notes, publishStatus, open, attendanceStatus, companyId, additionalProperties);
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
    sb.append("class ScheduleEnforcementListScheduledShiftsResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    businessDecline: ").append(toIndentedString(businessDecline)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    attendanceStatus: ").append(toIndentedString(attendanceStatus)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
    openapiFields.add("location_id");
    openapiFields.add("user_id");
    openapiFields.add("department_id");
    openapiFields.add("role_id");
    openapiFields.add("station_id");
    openapiFields.add("station_name");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("close");
    openapiFields.add("business_decline");
    openapiFields.add("notes");
    openapiFields.add("publish_status");
    openapiFields.add("open");
    openapiFields.add("attendance_status");
    openapiFields.add("company_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("location_id");
    openapiRequiredFields.add("station_name");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("close");
    openapiRequiredFields.add("business_decline");
    openapiRequiredFields.add("notes");
    openapiRequiredFields.add("publish_status");
    openapiRequiredFields.add("open");
    openapiRequiredFields.add("attendance_status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduleEnforcementListScheduledShiftsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScheduleEnforcementListScheduledShiftsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduleEnforcementListScheduledShiftsResponseDataInner is not found in the empty JSON string", ScheduleEnforcementListScheduledShiftsResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScheduleEnforcementListScheduledShiftsResponseDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("station_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `station_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("station_name").toString()));
      }
      if (!jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (!jsonObj.get("publish_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_status").toString()));
      }
      if (!jsonObj.get("attendance_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendance_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendance_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleEnforcementListScheduledShiftsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleEnforcementListScheduledShiftsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleEnforcementListScheduledShiftsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleEnforcementListScheduledShiftsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleEnforcementListScheduledShiftsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, ScheduleEnforcementListScheduledShiftsResponseDataInner value) throws IOException {
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
           public ScheduleEnforcementListScheduledShiftsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScheduleEnforcementListScheduledShiftsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScheduleEnforcementListScheduledShiftsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleEnforcementListScheduledShiftsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to ScheduleEnforcementListScheduledShiftsResponseDataInner
  */
  public static ScheduleEnforcementListScheduledShiftsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleEnforcementListScheduledShiftsResponseDataInner.class);
  }

 /**
  * Convert an instance of ScheduleEnforcementListScheduledShiftsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

