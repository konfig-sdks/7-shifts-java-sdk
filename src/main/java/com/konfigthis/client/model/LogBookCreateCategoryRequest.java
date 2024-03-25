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
 * LogBookCreateCategoryRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LogBookCreateCategoryRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COL = "col";
  @SerializedName(SERIALIZED_NAME_COL)
  private Integer col;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Integer sort;

  /**
   * Gets or Sets fieldType
   */
  @JsonAdapter(FieldTypeEnum.Adapter.class)
 public enum FieldTypeEnum {
    DOLLAR("dollar"),
    
    NUMBER("number"),
    
    PERCENTAGE("percentage"),
    
    TEXTAREA("textarea");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD_TYPE = "field_type";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private FieldTypeEnum fieldType;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private Boolean notify;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public LogBookCreateCategoryRequest() {
  }

  public LogBookCreateCategoryRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LogBookCreateCategoryRequest col(Integer col) {
    if (col != null && col < 1) {
      throw new IllegalArgumentException("Invalid value for col. Must be greater than or equal to 1.");
    }
    if (col != null && col > 2) {
      throw new IllegalArgumentException("Invalid value for col. Must be less than or equal to 2.");
    }
    
    
    this.col = col;
    return this;
  }

   /**
   * Get col
   * minimum: 1
   * maximum: 2
   * @return col
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCol() {
    return col;
  }


  public void setCol(Integer col) {
    if (col != null && col < 1) {
      throw new IllegalArgumentException("Invalid value for col. Must be greater than or equal to 1.");
    }
    if (col != null && col > 2) {
      throw new IllegalArgumentException("Invalid value for col. Must be less than or equal to 2.");
    }
    
    this.col = col;
  }


  public LogBookCreateCategoryRequest sort(Integer sort) {
    if (sort != null && sort < 1) {
      throw new IllegalArgumentException("Invalid value for sort. Must be greater than or equal to 1.");
    }
    
    
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * minimum: 1
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSort() {
    return sort;
  }


  public void setSort(Integer sort) {
    if (sort != null && sort < 1) {
      throw new IllegalArgumentException("Invalid value for sort. Must be greater than or equal to 1.");
    }
    
    
    this.sort = sort;
  }


  public LogBookCreateCategoryRequest fieldType(FieldTypeEnum fieldType) {
    
    
    
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }


  public void setFieldType(FieldTypeEnum fieldType) {
    
    
    
    this.fieldType = fieldType;
  }


  public LogBookCreateCategoryRequest notify(Boolean notify) {
    
    
    
    
    this.notify = notify;
    return this;
  }

   /**
   * Get notify
   * @return notify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNotify() {
    return notify;
  }


  public void setNotify(Boolean notify) {
    
    
    
    this.notify = notify;
  }


  public LogBookCreateCategoryRequest required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
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
   * @return the LogBookCreateCategoryRequest instance itself
   */
  public LogBookCreateCategoryRequest putAdditionalProperty(String key, Object value) {
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
    LogBookCreateCategoryRequest logBookCreateCategoryRequest = (LogBookCreateCategoryRequest) o;
    return Objects.equals(this.name, logBookCreateCategoryRequest.name) &&
        Objects.equals(this.col, logBookCreateCategoryRequest.col) &&
        Objects.equals(this.sort, logBookCreateCategoryRequest.sort) &&
        Objects.equals(this.fieldType, logBookCreateCategoryRequest.fieldType) &&
        Objects.equals(this.notify, logBookCreateCategoryRequest.notify) &&
        Objects.equals(this.required, logBookCreateCategoryRequest.required)&&
        Objects.equals(this.additionalProperties, logBookCreateCategoryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, col, sort, fieldType, notify, required, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogBookCreateCategoryRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    col: ").append(toIndentedString(col)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("col");
    openapiFields.add("sort");
    openapiFields.add("field_type");
    openapiFields.add("notify");
    openapiFields.add("required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogBookCreateCategoryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LogBookCreateCategoryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogBookCreateCategoryRequest is not found in the empty JSON string", LogBookCreateCategoryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LogBookCreateCategoryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("field_type") != null && !jsonObj.get("field_type").isJsonNull()) && !jsonObj.get("field_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogBookCreateCategoryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogBookCreateCategoryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogBookCreateCategoryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogBookCreateCategoryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LogBookCreateCategoryRequest>() {
           @Override
           public void write(JsonWriter out, LogBookCreateCategoryRequest value) throws IOException {
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
           public LogBookCreateCategoryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LogBookCreateCategoryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LogBookCreateCategoryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogBookCreateCategoryRequest
  * @throws IOException if the JSON string is invalid with respect to LogBookCreateCategoryRequest
  */
  public static LogBookCreateCategoryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogBookCreateCategoryRequest.class);
  }

 /**
  * Convert an instance of LogBookCreateCategoryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

