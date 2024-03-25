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
import com.konfigthis.client.model.LogBookListPostsResponseDataInnerAttachmentsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * LogBookListPostsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LogBookListPostsResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Long locationId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_LOG_BOOK_CATEGORY_ID = "log_book_category_id";
  @SerializedName(SERIALIZED_NAME_LOG_BOOK_CATEGORY_ID)
  private Long logBookCategoryId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<LogBookListPostsResponseDataInnerAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOG_BOOK_COMMENT_COUNT = "log_book_comment_count";
  @SerializedName(SERIALIZED_NAME_LOG_BOOK_COMMENT_COUNT)
  private Long logBookCommentCount;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public LogBookListPostsResponseDataInner() {
  }

  public LogBookListPostsResponseDataInner id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public LogBookListPostsResponseDataInner uuid(UUID uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    
    
    
    this.uuid = uuid;
  }


  public LogBookListPostsResponseDataInner locationId(Long locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getLocationId() {
    return locationId;
  }


  public void setLocationId(Long locationId) {
    
    
    
    this.locationId = locationId;
  }


  public LogBookListPostsResponseDataInner userId(Long userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    
    
    
    this.userId = userId;
  }


  public LogBookListPostsResponseDataInner logBookCategoryId(Long logBookCategoryId) {
    
    
    
    
    this.logBookCategoryId = logBookCategoryId;
    return this;
  }

   /**
   * Get logBookCategoryId
   * @return logBookCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getLogBookCategoryId() {
    return logBookCategoryId;
  }


  public void setLogBookCategoryId(Long logBookCategoryId) {
    
    
    
    this.logBookCategoryId = logBookCategoryId;
  }


  public LogBookListPostsResponseDataInner date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * The posted date. Format YYYY-MM-DD
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01", required = true, value = "The posted date. Format YYYY-MM-DD")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public LogBookListPostsResponseDataInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public LogBookListPostsResponseDataInner attachments(List<LogBookListPostsResponseDataInnerAttachmentsInner> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public LogBookListPostsResponseDataInner addAttachmentsItem(LogBookListPostsResponseDataInnerAttachmentsInner attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public List<LogBookListPostsResponseDataInnerAttachmentsInner> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<LogBookListPostsResponseDataInnerAttachmentsInner> attachments) {
    
    
    
    this.attachments = attachments;
  }


  public LogBookListPostsResponseDataInner logBookCommentCount(Long logBookCommentCount) {
    if (logBookCommentCount != null && logBookCommentCount < 0) {
      throw new IllegalArgumentException("Invalid value for logBookCommentCount. Must be greater than or equal to 0.");
    }
    
    
    
    this.logBookCommentCount = logBookCommentCount;
    return this;
  }

   /**
   * Get logBookCommentCount
   * minimum: 0
   * @return logBookCommentCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getLogBookCommentCount() {
    return logBookCommentCount;
  }


  public void setLogBookCommentCount(Long logBookCommentCount) {
    if (logBookCommentCount != null && logBookCommentCount < 0) {
      throw new IllegalArgumentException("Invalid value for logBookCommentCount. Must be greater than or equal to 0.");
    }
    
    
    this.logBookCommentCount = logBookCommentCount;
  }


  public LogBookListPostsResponseDataInner created(OffsetDateTime created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    
    
    
    this.created = created;
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
   * @return the LogBookListPostsResponseDataInner instance itself
   */
  public LogBookListPostsResponseDataInner putAdditionalProperty(String key, Object value) {
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
    LogBookListPostsResponseDataInner logBookListPostsResponseDataInner = (LogBookListPostsResponseDataInner) o;
    return Objects.equals(this.id, logBookListPostsResponseDataInner.id) &&
        Objects.equals(this.uuid, logBookListPostsResponseDataInner.uuid) &&
        Objects.equals(this.locationId, logBookListPostsResponseDataInner.locationId) &&
        Objects.equals(this.userId, logBookListPostsResponseDataInner.userId) &&
        Objects.equals(this.logBookCategoryId, logBookListPostsResponseDataInner.logBookCategoryId) &&
        Objects.equals(this.date, logBookListPostsResponseDataInner.date) &&
        Objects.equals(this.message, logBookListPostsResponseDataInner.message) &&
        Objects.equals(this.attachments, logBookListPostsResponseDataInner.attachments) &&
        Objects.equals(this.logBookCommentCount, logBookListPostsResponseDataInner.logBookCommentCount) &&
        Objects.equals(this.created, logBookListPostsResponseDataInner.created)&&
        Objects.equals(this.additionalProperties, logBookListPostsResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, locationId, userId, logBookCategoryId, date, message, attachments, logBookCommentCount, created, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogBookListPostsResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    logBookCategoryId: ").append(toIndentedString(logBookCategoryId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    logBookCommentCount: ").append(toIndentedString(logBookCommentCount)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("location_id");
    openapiFields.add("user_id");
    openapiFields.add("log_book_category_id");
    openapiFields.add("date");
    openapiFields.add("message");
    openapiFields.add("attachments");
    openapiFields.add("log_book_comment_count");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("location_id");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("log_book_category_id");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("log_book_comment_count");
    openapiRequiredFields.add("created");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogBookListPostsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LogBookListPostsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogBookListPostsResponseDataInner is not found in the empty JSON string", LogBookListPostsResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LogBookListPostsResponseDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        LogBookListPostsResponseDataInnerAttachmentsInner.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogBookListPostsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogBookListPostsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogBookListPostsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogBookListPostsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LogBookListPostsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, LogBookListPostsResponseDataInner value) throws IOException {
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
           public LogBookListPostsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LogBookListPostsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LogBookListPostsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogBookListPostsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to LogBookListPostsResponseDataInner
  */
  public static LogBookListPostsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogBookListPostsResponseDataInner.class);
  }

 /**
  * Convert an instance of LogBookListPostsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

