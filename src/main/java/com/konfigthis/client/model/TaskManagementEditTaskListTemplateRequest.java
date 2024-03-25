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
import com.konfigthis.client.model.TaskManagementCreateTaskListTemplateRequestAssignmentsInner;
import com.konfigthis.client.model.TaskManagementEditTaskListTemplateRequestTaskTemplatesInner;
import com.konfigthis.client.model.TaskManagementEditTaskListTemplateRequestTimeFrame;
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
 * TaskManagementEditTaskListTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskManagementEditTaskListTemplateRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TASK_TEMPLATES = "task_templates";
  @SerializedName(SERIALIZED_NAME_TASK_TEMPLATES)
  private List<TaskManagementEditTaskListTemplateRequestTaskTemplatesInner> taskTemplates = null;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private String recurrence;

  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> assignments = null;

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  private String due;

  public static final String SERIALIZED_NAME_TIME_FRAME = "time_frame";
  @SerializedName(SERIALIZED_NAME_TIME_FRAME)
  private TaskManagementEditTaskListTemplateRequestTimeFrame timeFrame;

  public TaskManagementEditTaskListTemplateRequest() {
  }

  public TaskManagementEditTaskListTemplateRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public TaskManagementEditTaskListTemplateRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TaskManagementEditTaskListTemplateRequest status(Integer status) {
    if (status != null && status < 0) {
      throw new IllegalArgumentException("Invalid value for status. Must be greater than or equal to 0.");
    }
    if (status != null && status > 1) {
      throw new IllegalArgumentException("Invalid value for status. Must be less than or equal to 1.");
    }
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * minimum: 0
   * maximum: 1
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    if (status != null && status < 0) {
      throw new IllegalArgumentException("Invalid value for status. Must be greater than or equal to 0.");
    }
    if (status != null && status > 1) {
      throw new IllegalArgumentException("Invalid value for status. Must be less than or equal to 1.");
    }
    
    this.status = status;
  }


  public TaskManagementEditTaskListTemplateRequest taskTemplates(List<TaskManagementEditTaskListTemplateRequestTaskTemplatesInner> taskTemplates) {
    
    
    
    
    this.taskTemplates = taskTemplates;
    return this;
  }

  public TaskManagementEditTaskListTemplateRequest addTaskTemplatesItem(TaskManagementEditTaskListTemplateRequestTaskTemplatesInner taskTemplatesItem) {
    if (this.taskTemplates == null) {
      this.taskTemplates = new ArrayList<>();
    }
    this.taskTemplates.add(taskTemplatesItem);
    return this;
  }

   /**
   * Get taskTemplates
   * @return taskTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskManagementEditTaskListTemplateRequestTaskTemplatesInner> getTaskTemplates() {
    return taskTemplates;
  }


  public void setTaskTemplates(List<TaskManagementEditTaskListTemplateRequestTaskTemplatesInner> taskTemplates) {
    
    
    
    this.taskTemplates = taskTemplates;
  }


  public TaskManagementEditTaskListTemplateRequest recurrence(String recurrence) {
    
    
    
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * recurrence rules as defined by the RFC 5545 spec
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RRULE:FREQ=WEEKLY;INTERVAL=1;WKST=MO", value = "recurrence rules as defined by the RFC 5545 spec")

  public String getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(String recurrence) {
    
    
    
    this.recurrence = recurrence;
  }


  public TaskManagementEditTaskListTemplateRequest assignments(List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> assignments) {
    
    
    
    
    this.assignments = assignments;
    return this;
  }

  public TaskManagementEditTaskListTemplateRequest addAssignmentsItem(TaskManagementCreateTaskListTemplateRequestAssignmentsInner assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> getAssignments() {
    return assignments;
  }


  public void setAssignments(List<TaskManagementCreateTaskListTemplateRequestAssignmentsInner> assignments) {
    
    
    
    this.assignments = assignments;
  }


  public TaskManagementEditTaskListTemplateRequest due(String due) {
    
    
    
    
    this.due = due;
    return this;
  }

   /**
   * A date with YYYY-MM-DD format
   * @return due
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01", value = "A date with YYYY-MM-DD format")

  public String getDue() {
    return due;
  }


  public void setDue(String due) {
    
    
    
    this.due = due;
  }


  public TaskManagementEditTaskListTemplateRequest timeFrame(TaskManagementEditTaskListTemplateRequestTimeFrame timeFrame) {
    
    
    
    
    this.timeFrame = timeFrame;
    return this;
  }

   /**
   * Get timeFrame
   * @return timeFrame
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskManagementEditTaskListTemplateRequestTimeFrame getTimeFrame() {
    return timeFrame;
  }


  public void setTimeFrame(TaskManagementEditTaskListTemplateRequestTimeFrame timeFrame) {
    
    
    
    this.timeFrame = timeFrame;
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
   * @return the TaskManagementEditTaskListTemplateRequest instance itself
   */
  public TaskManagementEditTaskListTemplateRequest putAdditionalProperty(String key, Object value) {
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
    TaskManagementEditTaskListTemplateRequest taskManagementEditTaskListTemplateRequest = (TaskManagementEditTaskListTemplateRequest) o;
    return Objects.equals(this.title, taskManagementEditTaskListTemplateRequest.title) &&
        Objects.equals(this.description, taskManagementEditTaskListTemplateRequest.description) &&
        Objects.equals(this.status, taskManagementEditTaskListTemplateRequest.status) &&
        Objects.equals(this.taskTemplates, taskManagementEditTaskListTemplateRequest.taskTemplates) &&
        Objects.equals(this.recurrence, taskManagementEditTaskListTemplateRequest.recurrence) &&
        Objects.equals(this.assignments, taskManagementEditTaskListTemplateRequest.assignments) &&
        Objects.equals(this.due, taskManagementEditTaskListTemplateRequest.due) &&
        Objects.equals(this.timeFrame, taskManagementEditTaskListTemplateRequest.timeFrame)&&
        Objects.equals(this.additionalProperties, taskManagementEditTaskListTemplateRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, status, taskTemplates, recurrence, assignments, due, timeFrame, additionalProperties);
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
    sb.append("class TaskManagementEditTaskListTemplateRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskTemplates: ").append(toIndentedString(taskTemplates)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    timeFrame: ").append(toIndentedString(timeFrame)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("task_templates");
    openapiFields.add("recurrence");
    openapiFields.add("assignments");
    openapiFields.add("due");
    openapiFields.add("time_frame");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskManagementEditTaskListTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskManagementEditTaskListTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskManagementEditTaskListTemplateRequest is not found in the empty JSON string", TaskManagementEditTaskListTemplateRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("task_templates") != null && !jsonObj.get("task_templates").isJsonNull()) {
        JsonArray jsonArraytaskTemplates = jsonObj.getAsJsonArray("task_templates");
        if (jsonArraytaskTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("task_templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `task_templates` to be an array in the JSON string but got `%s`", jsonObj.get("task_templates").toString()));
          }

          // validate the optional field `task_templates` (array)
          for (int i = 0; i < jsonArraytaskTemplates.size(); i++) {
            TaskManagementEditTaskListTemplateRequestTaskTemplatesInner.validateJsonObject(jsonArraytaskTemplates.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) && !jsonObj.get("recurrence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurrence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurrence").toString()));
      }
      if (jsonObj.get("assignments") != null && !jsonObj.get("assignments").isJsonNull()) {
        JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
        if (jsonArrayassignments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assignments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assignments` to be an array in the JSON string but got `%s`", jsonObj.get("assignments").toString()));
          }

          // validate the optional field `assignments` (array)
          for (int i = 0; i < jsonArrayassignments.size(); i++) {
            TaskManagementCreateTaskListTemplateRequestAssignmentsInner.validateJsonObject(jsonArrayassignments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("due") != null && !jsonObj.get("due").isJsonNull()) && !jsonObj.get("due").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `due` to be a primitive type in the JSON string but got `%s`", jsonObj.get("due").toString()));
      }
      // validate the optional field `time_frame`
      if (jsonObj.get("time_frame") != null && !jsonObj.get("time_frame").isJsonNull()) {
        TaskManagementEditTaskListTemplateRequestTimeFrame.validateJsonObject(jsonObj.getAsJsonObject("time_frame"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskManagementEditTaskListTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskManagementEditTaskListTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskManagementEditTaskListTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskManagementEditTaskListTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskManagementEditTaskListTemplateRequest>() {
           @Override
           public void write(JsonWriter out, TaskManagementEditTaskListTemplateRequest value) throws IOException {
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
           public TaskManagementEditTaskListTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskManagementEditTaskListTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskManagementEditTaskListTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskManagementEditTaskListTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to TaskManagementEditTaskListTemplateRequest
  */
  public static TaskManagementEditTaskListTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskManagementEditTaskListTemplateRequest.class);
  }

 /**
  * Convert an instance of TaskManagementEditTaskListTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

