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
import com.konfigthis.client.model.UserWagesListResponseDataCurrentWagesInner;
import com.konfigthis.client.model.UserWagesListResponseDataUpcomingWagesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * UserWagesListResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserWagesListResponseData {
  public static final String SERIALIZED_NAME_CURRENT_WAGES = "current_wages";
  @SerializedName(SERIALIZED_NAME_CURRENT_WAGES)
  private List<UserWagesListResponseDataCurrentWagesInner> currentWages = null;

  public static final String SERIALIZED_NAME_UPCOMING_WAGES = "upcoming_wages";
  @SerializedName(SERIALIZED_NAME_UPCOMING_WAGES)
  private List<UserWagesListResponseDataUpcomingWagesInner> upcomingWages = null;

  public UserWagesListResponseData() {
  }

  public UserWagesListResponseData currentWages(List<UserWagesListResponseDataCurrentWagesInner> currentWages) {
    
    
    
    
    this.currentWages = currentWages;
    return this;
  }

  public UserWagesListResponseData addCurrentWagesItem(UserWagesListResponseDataCurrentWagesInner currentWagesItem) {
    if (this.currentWages == null) {
      this.currentWages = new ArrayList<>();
    }
    this.currentWages.add(currentWagesItem);
    return this;
  }

   /**
   * Get currentWages
   * @return currentWages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserWagesListResponseDataCurrentWagesInner> getCurrentWages() {
    return currentWages;
  }


  public void setCurrentWages(List<UserWagesListResponseDataCurrentWagesInner> currentWages) {
    
    
    
    this.currentWages = currentWages;
  }


  public UserWagesListResponseData upcomingWages(List<UserWagesListResponseDataUpcomingWagesInner> upcomingWages) {
    
    
    
    
    this.upcomingWages = upcomingWages;
    return this;
  }

  public UserWagesListResponseData addUpcomingWagesItem(UserWagesListResponseDataUpcomingWagesInner upcomingWagesItem) {
    if (this.upcomingWages == null) {
      this.upcomingWages = new ArrayList<>();
    }
    this.upcomingWages.add(upcomingWagesItem);
    return this;
  }

   /**
   * Get upcomingWages
   * @return upcomingWages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserWagesListResponseDataUpcomingWagesInner> getUpcomingWages() {
    return upcomingWages;
  }


  public void setUpcomingWages(List<UserWagesListResponseDataUpcomingWagesInner> upcomingWages) {
    
    
    
    this.upcomingWages = upcomingWages;
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
   * @return the UserWagesListResponseData instance itself
   */
  public UserWagesListResponseData putAdditionalProperty(String key, Object value) {
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
    UserWagesListResponseData userWagesListResponseData = (UserWagesListResponseData) o;
    return Objects.equals(this.currentWages, userWagesListResponseData.currentWages) &&
        Objects.equals(this.upcomingWages, userWagesListResponseData.upcomingWages)&&
        Objects.equals(this.additionalProperties, userWagesListResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentWages, upcomingWages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWagesListResponseData {\n");
    sb.append("    currentWages: ").append(toIndentedString(currentWages)).append("\n");
    sb.append("    upcomingWages: ").append(toIndentedString(upcomingWages)).append("\n");
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
    openapiFields.add("current_wages");
    openapiFields.add("upcoming_wages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserWagesListResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserWagesListResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserWagesListResponseData is not found in the empty JSON string", UserWagesListResponseData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("current_wages") != null && !jsonObj.get("current_wages").isJsonNull()) {
        JsonArray jsonArraycurrentWages = jsonObj.getAsJsonArray("current_wages");
        if (jsonArraycurrentWages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("current_wages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `current_wages` to be an array in the JSON string but got `%s`", jsonObj.get("current_wages").toString()));
          }

          // validate the optional field `current_wages` (array)
          for (int i = 0; i < jsonArraycurrentWages.size(); i++) {
            UserWagesListResponseDataCurrentWagesInner.validateJsonObject(jsonArraycurrentWages.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("upcoming_wages") != null && !jsonObj.get("upcoming_wages").isJsonNull()) {
        JsonArray jsonArrayupcomingWages = jsonObj.getAsJsonArray("upcoming_wages");
        if (jsonArrayupcomingWages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("upcoming_wages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `upcoming_wages` to be an array in the JSON string but got `%s`", jsonObj.get("upcoming_wages").toString()));
          }

          // validate the optional field `upcoming_wages` (array)
          for (int i = 0; i < jsonArrayupcomingWages.size(); i++) {
            UserWagesListResponseDataUpcomingWagesInner.validateJsonObject(jsonArrayupcomingWages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserWagesListResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserWagesListResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserWagesListResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserWagesListResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UserWagesListResponseData>() {
           @Override
           public void write(JsonWriter out, UserWagesListResponseData value) throws IOException {
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
           public UserWagesListResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserWagesListResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserWagesListResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserWagesListResponseData
  * @throws IOException if the JSON string is invalid with respect to UserWagesListResponseData
  */
  public static UserWagesListResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserWagesListResponseData.class);
  }

 /**
  * Convert an instance of UserWagesListResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

