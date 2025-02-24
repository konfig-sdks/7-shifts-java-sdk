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
 * TaskManagementListTaskListsSummary200ResponseDataTaskListsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskManagementListTaskListsSummary200ResponseDataTaskListsInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets completionStatus
   */
  @JsonAdapter(CompletionStatusEnum.Adapter.class)
 public enum CompletionStatusEnum {
    COMPLETE("complete"),
    
    IN_PROGRESS("in_progress"),
    
    INCOMPLETE("incomplete");

    private String value;

    CompletionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompletionStatusEnum fromValue(String value) {
      for (CompletionStatusEnum b : CompletionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompletionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompletionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompletionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CompletionStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPLETION_STATUS = "completion_status";
  @SerializedName(SERIALIZED_NAME_COMPLETION_STATUS)
  private CompletionStatusEnum completionStatus;

  public static final String SERIALIZED_NAME_TOTAL_TASKS_COMPLETED = "total_tasks_completed";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASKS_COMPLETED)
  private Integer totalTasksCompleted;

  public static final String SERIALIZED_NAME_TOTAL_TASKS = "total_tasks";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASKS)
  private Integer totalTasks;

  public static final String SERIALIZED_NAME_COMPLETION_PERCENTAGE = "completion_percentage";
  @SerializedName(SERIALIZED_NAME_COMPLETION_PERCENTAGE)
  private Integer completionPercentage;

  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner() {
  }

  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner title(String title) {
    
    
    
    
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


  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner completionStatus(CompletionStatusEnum completionStatus) {
    
    
    
    
    this.completionStatus = completionStatus;
    return this;
  }

   /**
   * Get completionStatus
   * @return completionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }


  public void setCompletionStatus(CompletionStatusEnum completionStatus) {
    
    
    
    this.completionStatus = completionStatus;
  }


  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner totalTasksCompleted(Integer totalTasksCompleted) {
    
    
    
    
    this.totalTasksCompleted = totalTasksCompleted;
    return this;
  }

   /**
   * Get totalTasksCompleted
   * @return totalTasksCompleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalTasksCompleted() {
    return totalTasksCompleted;
  }


  public void setTotalTasksCompleted(Integer totalTasksCompleted) {
    
    
    
    this.totalTasksCompleted = totalTasksCompleted;
  }


  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner totalTasks(Integer totalTasks) {
    
    
    
    
    this.totalTasks = totalTasks;
    return this;
  }

   /**
   * Get totalTasks
   * @return totalTasks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalTasks() {
    return totalTasks;
  }


  public void setTotalTasks(Integer totalTasks) {
    
    
    
    this.totalTasks = totalTasks;
  }


  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner completionPercentage(Integer completionPercentage) {
    
    
    
    
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Get completionPercentage
   * @return completionPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCompletionPercentage() {
    return completionPercentage;
  }


  public void setCompletionPercentage(Integer completionPercentage) {
    
    
    
    this.completionPercentage = completionPercentage;
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
   * @return the TaskManagementListTaskListsSummary200ResponseDataTaskListsInner instance itself
   */
  public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner putAdditionalProperty(String key, Object value) {
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
    TaskManagementListTaskListsSummary200ResponseDataTaskListsInner taskManagementListTaskListsSummary200ResponseDataTaskListsInner = (TaskManagementListTaskListsSummary200ResponseDataTaskListsInner) o;
    return Objects.equals(this.title, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.title) &&
        Objects.equals(this.description, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.description) &&
        Objects.equals(this.completionStatus, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.completionStatus) &&
        Objects.equals(this.totalTasksCompleted, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.totalTasksCompleted) &&
        Objects.equals(this.totalTasks, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.totalTasks) &&
        Objects.equals(this.completionPercentage, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.completionPercentage)&&
        Objects.equals(this.additionalProperties, taskManagementListTaskListsSummary200ResponseDataTaskListsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, completionStatus, totalTasksCompleted, totalTasks, completionPercentage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementListTaskListsSummary200ResponseDataTaskListsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    totalTasksCompleted: ").append(toIndentedString(totalTasksCompleted)).append("\n");
    sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
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
    openapiFields.add("completion_status");
    openapiFields.add("total_tasks_completed");
    openapiFields.add("total_tasks");
    openapiFields.add("completion_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("completion_status");
    openapiRequiredFields.add("total_tasks_completed");
    openapiRequiredFields.add("total_tasks");
    openapiRequiredFields.add("completion_percentage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskManagementListTaskListsSummary200ResponseDataTaskListsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskManagementListTaskListsSummary200ResponseDataTaskListsInner is not found in the empty JSON string", TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("completion_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completion_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completion_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskManagementListTaskListsSummary200ResponseDataTaskListsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskManagementListTaskListsSummary200ResponseDataTaskListsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskManagementListTaskListsSummary200ResponseDataTaskListsInner>() {
           @Override
           public void write(JsonWriter out, TaskManagementListTaskListsSummary200ResponseDataTaskListsInner value) throws IOException {
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
           public TaskManagementListTaskListsSummary200ResponseDataTaskListsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskManagementListTaskListsSummary200ResponseDataTaskListsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskManagementListTaskListsSummary200ResponseDataTaskListsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskManagementListTaskListsSummary200ResponseDataTaskListsInner
  * @throws IOException if the JSON string is invalid with respect to TaskManagementListTaskListsSummary200ResponseDataTaskListsInner
  */
  public static TaskManagementListTaskListsSummary200ResponseDataTaskListsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskManagementListTaskListsSummary200ResponseDataTaskListsInner.class);
  }

 /**
  * Convert an instance of TaskManagementListTaskListsSummary200ResponseDataTaskListsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

