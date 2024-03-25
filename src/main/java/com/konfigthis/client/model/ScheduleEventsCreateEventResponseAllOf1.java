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
import com.konfigthis.client.model.ScheduleEventsCreateEventResponseAllOf1End;
import com.konfigthis.client.model.ScheduleEventsCreateEventResponseAllOf1Start;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ScheduleEventsCreateEventResponseAllOf1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScheduleEventsCreateEventResponseAllOf1 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION_IDS = "location_ids";
  @SerializedName(SERIALIZED_NAME_LOCATION_IDS)
  private List<Integer> locationIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private List<ScheduleEventsCreateEventResponseAllOf1Start> start = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private List<ScheduleEventsCreateEventResponseAllOf1End> end = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_IS_MULTI_DAY = "is_multi_day";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_DAY)
  private Boolean isMultiDay;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private String recurrence;

  public ScheduleEventsCreateEventResponseAllOf1() {
  }

  public ScheduleEventsCreateEventResponseAllOf1 title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The name of the event
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the event")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ScheduleEventsCreateEventResponseAllOf1 description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description for event
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for event")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ScheduleEventsCreateEventResponseAllOf1 locationIds(List<Integer> locationIds) {
    
    
    
    
    this.locationIds = locationIds;
    return this;
  }

  public ScheduleEventsCreateEventResponseAllOf1 addLocationIdsItem(Integer locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * The list of locations where this event occurs
   * @return locationIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of locations where this event occurs")

  public List<Integer> getLocationIds() {
    return locationIds;
  }


  public void setLocationIds(List<Integer> locationIds) {
    
    
    
    this.locationIds = locationIds;
  }


  public ScheduleEventsCreateEventResponseAllOf1 start(List<ScheduleEventsCreateEventResponseAllOf1Start> start) {
    
    
    
    
    this.start = start;
    return this;
  }

  public ScheduleEventsCreateEventResponseAllOf1 addStartItem(ScheduleEventsCreateEventResponseAllOf1Start startItem) {
    if (this.start == null) {
      this.start = new ArrayList<>();
    }
    this.start.add(startItem);
    return this;
  }

   /**
   * The events start date-time for each locations timezone
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The events start date-time for each locations timezone")

  public List<ScheduleEventsCreateEventResponseAllOf1Start> getStart() {
    return start;
  }


  public void setStart(List<ScheduleEventsCreateEventResponseAllOf1Start> start) {
    
    
    
    this.start = start;
  }


  public ScheduleEventsCreateEventResponseAllOf1 startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-01", required = true, value = "Start date")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ScheduleEventsCreateEventResponseAllOf1 startTime(String startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "09:00:00", required = true, value = "Start time")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    
    
    
    this.startTime = startTime;
  }


  public ScheduleEventsCreateEventResponseAllOf1 end(List<ScheduleEventsCreateEventResponseAllOf1End> end) {
    
    
    
    
    this.end = end;
    return this;
  }

  public ScheduleEventsCreateEventResponseAllOf1 addEndItem(ScheduleEventsCreateEventResponseAllOf1End endItem) {
    if (this.end == null) {
      this.end = new ArrayList<>();
    }
    this.end.add(endItem);
    return this;
  }

   /**
   * The events end date-time for each locations timezone
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The events end date-time for each locations timezone")

  public List<ScheduleEventsCreateEventResponseAllOf1End> getEnd() {
    return end;
  }


  public void setEnd(List<ScheduleEventsCreateEventResponseAllOf1End> end) {
    
    
    
    this.end = end;
  }


  public ScheduleEventsCreateEventResponseAllOf1 endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for multi-day events
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-02", required = true, value = "End date for multi-day events")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public ScheduleEventsCreateEventResponseAllOf1 endTime(String endTime) {
    
    
    
    
    this.endTime = endTime;
    return this;
  }

   /**
   * End time
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "61200", required = true, value = "End time")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    
    
    
    this.endTime = endTime;
  }


  public ScheduleEventsCreateEventResponseAllOf1 color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * A hex number representing the color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5ea17c", value = "A hex number representing the color")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public ScheduleEventsCreateEventResponseAllOf1 isMultiDay(Boolean isMultiDay) {
    
    
    
    
    this.isMultiDay = isMultiDay;
    return this;
  }

   /**
   * If true, the event is a multi-day event
   * @return isMultiDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If true, the event is a multi-day event")

  public Boolean getIsMultiDay() {
    return isMultiDay;
  }


  public void setIsMultiDay(Boolean isMultiDay) {
    
    
    
    this.isMultiDay = isMultiDay;
  }


  public ScheduleEventsCreateEventResponseAllOf1 recurrence(String recurrence) {
    
    
    
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Recurrence rules as defined by the RFC 5545 spec
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daily for 10 occurrences ==> (1997 9:00 AM EDT) September 2-11 DTSTART;TZID=America/New_York:19970902T090000 RRULE:FREQ=DAILY;COUNT=10", value = "Recurrence rules as defined by the RFC 5545 spec")

  public String getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(String recurrence) {
    
    
    
    this.recurrence = recurrence;
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
   * @return the ScheduleEventsCreateEventResponseAllOf1 instance itself
   */
  public ScheduleEventsCreateEventResponseAllOf1 putAdditionalProperty(String key, Object value) {
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
    ScheduleEventsCreateEventResponseAllOf1 scheduleEventsCreateEventResponseAllOf1 = (ScheduleEventsCreateEventResponseAllOf1) o;
    return Objects.equals(this.title, scheduleEventsCreateEventResponseAllOf1.title) &&
        Objects.equals(this.description, scheduleEventsCreateEventResponseAllOf1.description) &&
        Objects.equals(this.locationIds, scheduleEventsCreateEventResponseAllOf1.locationIds) &&
        Objects.equals(this.start, scheduleEventsCreateEventResponseAllOf1.start) &&
        Objects.equals(this.startDate, scheduleEventsCreateEventResponseAllOf1.startDate) &&
        Objects.equals(this.startTime, scheduleEventsCreateEventResponseAllOf1.startTime) &&
        Objects.equals(this.end, scheduleEventsCreateEventResponseAllOf1.end) &&
        Objects.equals(this.endDate, scheduleEventsCreateEventResponseAllOf1.endDate) &&
        Objects.equals(this.endTime, scheduleEventsCreateEventResponseAllOf1.endTime) &&
        Objects.equals(this.color, scheduleEventsCreateEventResponseAllOf1.color) &&
        Objects.equals(this.isMultiDay, scheduleEventsCreateEventResponseAllOf1.isMultiDay) &&
        Objects.equals(this.recurrence, scheduleEventsCreateEventResponseAllOf1.recurrence)&&
        Objects.equals(this.additionalProperties, scheduleEventsCreateEventResponseAllOf1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, locationIds, start, startDate, startTime, end, endDate, endTime, color, isMultiDay, recurrence, additionalProperties);
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
    sb.append("class ScheduleEventsCreateEventResponseAllOf1 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    isMultiDay: ").append(toIndentedString(isMultiDay)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("location_ids");
    openapiFields.add("start");
    openapiFields.add("start_date");
    openapiFields.add("start_time");
    openapiFields.add("end");
    openapiFields.add("end_date");
    openapiFields.add("end_time");
    openapiFields.add("color");
    openapiFields.add("is_multi_day");
    openapiFields.add("recurrence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("location_ids");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("is_multi_day");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduleEventsCreateEventResponseAllOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScheduleEventsCreateEventResponseAllOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduleEventsCreateEventResponseAllOf1 is not found in the empty JSON string", ScheduleEventsCreateEventResponseAllOf1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScheduleEventsCreateEventResponseAllOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("location_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("location_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_ids` to be an array in the JSON string but got `%s`", jsonObj.get("location_ids").toString()));
      }
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        JsonArray jsonArraystart = jsonObj.getAsJsonArray("start");
        if (jsonArraystart != null) {
          // ensure the json data is an array
          if (!jsonObj.get("start").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `start` to be an array in the JSON string but got `%s`", jsonObj.get("start").toString()));
          }

          // validate the optional field `start` (array)
          for (int i = 0; i < jsonArraystart.size(); i++) {
            ScheduleEventsCreateEventResponseAllOf1Start.validateJsonObject(jsonArraystart.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (!jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        JsonArray jsonArrayend = jsonObj.getAsJsonArray("end");
        if (jsonArrayend != null) {
          // ensure the json data is an array
          if (!jsonObj.get("end").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `end` to be an array in the JSON string but got `%s`", jsonObj.get("end").toString()));
          }

          // validate the optional field `end` (array)
          for (int i = 0; i < jsonArrayend.size(); i++) {
            ScheduleEventsCreateEventResponseAllOf1End.validateJsonObject(jsonArrayend.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (!jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (!jsonObj.get("color").isJsonNull() && (jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if (!jsonObj.get("recurrence").isJsonNull() && (jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) && !jsonObj.get("recurrence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurrence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurrence").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleEventsCreateEventResponseAllOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleEventsCreateEventResponseAllOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleEventsCreateEventResponseAllOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleEventsCreateEventResponseAllOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleEventsCreateEventResponseAllOf1>() {
           @Override
           public void write(JsonWriter out, ScheduleEventsCreateEventResponseAllOf1 value) throws IOException {
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
           public ScheduleEventsCreateEventResponseAllOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScheduleEventsCreateEventResponseAllOf1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScheduleEventsCreateEventResponseAllOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleEventsCreateEventResponseAllOf1
  * @throws IOException if the JSON string is invalid with respect to ScheduleEventsCreateEventResponseAllOf1
  */
  public static ScheduleEventsCreateEventResponseAllOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleEventsCreateEventResponseAllOf1.class);
  }

 /**
  * Convert an instance of ScheduleEventsCreateEventResponseAllOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

