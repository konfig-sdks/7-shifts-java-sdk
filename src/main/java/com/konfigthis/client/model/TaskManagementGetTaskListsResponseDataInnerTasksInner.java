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
import com.konfigthis.client.model.TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion;
import com.konfigthis.client.model.TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner;
import com.konfigthis.client.model.TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent;
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
 * TaskManagementGetTaskListsResponseDataInnerTasksInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskManagementGetTaskListsResponseDataInnerTasksInner {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TASK_TEMPLATE_UUID = "task_template_uuid";
  @SerializedName(SERIALIZED_NAME_TASK_TEMPLATE_UUID)
  private String taskTemplateUuid;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_TASK_COMPLETION = "task_completion";
  @SerializedName(SERIALIZED_NAME_TASK_COMPLETION)
  private TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion taskCompletion;

  public static final String SERIALIZED_NAME_TASK_COMPLETION_EVENT = "task_completion_event";
  @SerializedName(SERIALIZED_NAME_TASK_COMPLETION_EVENT)
  private TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent taskCompletionEvent;

  public TaskManagementGetTaskListsResponseDataInnerTasksInner() {
  }

  public TaskManagementGetTaskListsResponseDataInnerTasksInner tags(List<TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public TaskManagementGetTaskListsResponseDataInnerTasksInner addTagsItem(TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner> getTags() {
    return tags;
  }


  public void setTags(List<TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner> tags) {
    
    
    
    this.tags = tags;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner description(String description) {
    
    
    
    
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


  public TaskManagementGetTaskListsResponseDataInnerTasksInner id(Integer id) {
    
    
    
    
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


  public TaskManagementGetTaskListsResponseDataInnerTasksInner taskTemplateUuid(String taskTemplateUuid) {
    
    
    
    
    this.taskTemplateUuid = taskTemplateUuid;
    return this;
  }

   /**
   * Get taskTemplateUuid
   * @return taskTemplateUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskTemplateUuid() {
    return taskTemplateUuid;
  }


  public void setTaskTemplateUuid(String taskTemplateUuid) {
    
    
    
    this.taskTemplateUuid = taskTemplateUuid;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner completedAt(OffsetDateTime completedAt) {
    
    
    
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    
    
    
    this.completedAt = completedAt;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner taskCompletion(TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion taskCompletion) {
    
    
    
    
    this.taskCompletion = taskCompletion;
    return this;
  }

   /**
   * Get taskCompletion
   * @return taskCompletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion getTaskCompletion() {
    return taskCompletion;
  }


  public void setTaskCompletion(TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion taskCompletion) {
    
    
    
    this.taskCompletion = taskCompletion;
  }


  public TaskManagementGetTaskListsResponseDataInnerTasksInner taskCompletionEvent(TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent taskCompletionEvent) {
    
    
    
    
    this.taskCompletionEvent = taskCompletionEvent;
    return this;
  }

   /**
   * Get taskCompletionEvent
   * @return taskCompletionEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent getTaskCompletionEvent() {
    return taskCompletionEvent;
  }


  public void setTaskCompletionEvent(TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent taskCompletionEvent) {
    
    
    
    this.taskCompletionEvent = taskCompletionEvent;
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
   * @return the TaskManagementGetTaskListsResponseDataInnerTasksInner instance itself
   */
  public TaskManagementGetTaskListsResponseDataInnerTasksInner putAdditionalProperty(String key, Object value) {
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
    TaskManagementGetTaskListsResponseDataInnerTasksInner taskManagementGetTaskListsResponseDataInnerTasksInner = (TaskManagementGetTaskListsResponseDataInnerTasksInner) o;
    return Objects.equals(this.tags, taskManagementGetTaskListsResponseDataInnerTasksInner.tags) &&
        Objects.equals(this.title, taskManagementGetTaskListsResponseDataInnerTasksInner.title) &&
        Objects.equals(this.description, taskManagementGetTaskListsResponseDataInnerTasksInner.description) &&
        Objects.equals(this.id, taskManagementGetTaskListsResponseDataInnerTasksInner.id) &&
        Objects.equals(this.taskTemplateUuid, taskManagementGetTaskListsResponseDataInnerTasksInner.taskTemplateUuid) &&
        Objects.equals(this.userId, taskManagementGetTaskListsResponseDataInnerTasksInner.userId) &&
        Objects.equals(this.completedAt, taskManagementGetTaskListsResponseDataInnerTasksInner.completedAt) &&
        Objects.equals(this.taskCompletion, taskManagementGetTaskListsResponseDataInnerTasksInner.taskCompletion) &&
        Objects.equals(this.taskCompletionEvent, taskManagementGetTaskListsResponseDataInnerTasksInner.taskCompletionEvent)&&
        Objects.equals(this.additionalProperties, taskManagementGetTaskListsResponseDataInnerTasksInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, title, description, id, taskTemplateUuid, userId, completedAt, taskCompletion, taskCompletionEvent, additionalProperties);
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
    sb.append("class TaskManagementGetTaskListsResponseDataInnerTasksInner {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskTemplateUuid: ").append(toIndentedString(taskTemplateUuid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    taskCompletion: ").append(toIndentedString(taskCompletion)).append("\n");
    sb.append("    taskCompletionEvent: ").append(toIndentedString(taskCompletionEvent)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("task_template_uuid");
    openapiFields.add("user_id");
    openapiFields.add("completed_at");
    openapiFields.add("task_completion");
    openapiFields.add("task_completion_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("completed_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskManagementGetTaskListsResponseDataInnerTasksInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskManagementGetTaskListsResponseDataInnerTasksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskManagementGetTaskListsResponseDataInnerTasksInner is not found in the empty JSON string", TaskManagementGetTaskListsResponseDataInnerTasksInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskManagementGetTaskListsResponseDataInnerTasksInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TaskManagementGetTaskListsResponseDataInnerTasksInnerTagsInner.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("task_template_uuid") != null && !jsonObj.get("task_template_uuid").isJsonNull()) && !jsonObj.get("task_template_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_template_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_template_uuid").toString()));
      }
      // validate the optional field `task_completion`
      if (jsonObj.get("task_completion") != null && !jsonObj.get("task_completion").isJsonNull()) {
        TaskManagementCreateTaskListTemplateRequestTaskTemplatesInnerTaskCompletion.validateJsonObject(jsonObj.getAsJsonObject("task_completion"));
      }
      // validate the optional field `task_completion_event`
      if (jsonObj.get("task_completion_event") != null && !jsonObj.get("task_completion_event").isJsonNull()) {
        TaskManagementGetTaskListsResponseDataInnerTasksInnerTaskCompletionEvent.validateJsonObject(jsonObj.getAsJsonObject("task_completion_event"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskManagementGetTaskListsResponseDataInnerTasksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskManagementGetTaskListsResponseDataInnerTasksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskManagementGetTaskListsResponseDataInnerTasksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskManagementGetTaskListsResponseDataInnerTasksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskManagementGetTaskListsResponseDataInnerTasksInner>() {
           @Override
           public void write(JsonWriter out, TaskManagementGetTaskListsResponseDataInnerTasksInner value) throws IOException {
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
           public TaskManagementGetTaskListsResponseDataInnerTasksInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskManagementGetTaskListsResponseDataInnerTasksInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskManagementGetTaskListsResponseDataInnerTasksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskManagementGetTaskListsResponseDataInnerTasksInner
  * @throws IOException if the JSON string is invalid with respect to TaskManagementGetTaskListsResponseDataInnerTasksInner
  */
  public static TaskManagementGetTaskListsResponseDataInnerTasksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskManagementGetTaskListsResponseDataInnerTasksInner.class);
  }

 /**
  * Convert an instance of TaskManagementGetTaskListsResponseDataInnerTasksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

