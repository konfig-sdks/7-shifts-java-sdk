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
 * TimePunchesGetTimePunchResponseDataBreaksInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimePunchesGetTimePunchResponseDataBreaksInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_CUSTOM_BREAK_ID = "custom_break_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BREAK_ID)
  private Integer customBreakId;

  public static final String SERIALIZED_NAME_PAID = "paid";
  @SerializedName(SERIALIZED_NAME_PAID)
  private Boolean paid;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private OffsetDateTime in;

  public static final String SERIALIZED_NAME_OUT = "out";
  @SerializedName(SERIALIZED_NAME_OUT)
  private OffsetDateTime out;

  public TimePunchesGetTimePunchResponseDataBreaksInner() {
  }

  public TimePunchesGetTimePunchResponseDataBreaksInner id(Integer id) {
    
    
    
    
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


  public TimePunchesGetTimePunchResponseDataBreaksInner userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
  }


  public TimePunchesGetTimePunchResponseDataBreaksInner customBreakId(Integer customBreakId) {
    
    
    
    
    this.customBreakId = customBreakId;
    return this;
  }

   /**
   * Get customBreakId
   * @return customBreakId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCustomBreakId() {
    return customBreakId;
  }


  public void setCustomBreakId(Integer customBreakId) {
    
    
    
    this.customBreakId = customBreakId;
  }


  public TimePunchesGetTimePunchResponseDataBreaksInner paid(Boolean paid) {
    
    
    
    
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPaid() {
    return paid;
  }


  public void setPaid(Boolean paid) {
    
    
    
    this.paid = paid;
  }


  public TimePunchesGetTimePunchResponseDataBreaksInner in(OffsetDateTime in) {
    
    
    
    
    this.in = in;
    return this;
  }

   /**
   * Get in
   * @return in
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getIn() {
    return in;
  }


  public void setIn(OffsetDateTime in) {
    
    
    
    this.in = in;
  }


  public TimePunchesGetTimePunchResponseDataBreaksInner out(OffsetDateTime out) {
    
    
    
    
    this.out = out;
    return this;
  }

   /**
   * Get out
   * @return out
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getOut() {
    return out;
  }


  public void setOut(OffsetDateTime out) {
    
    
    
    this.out = out;
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
   * @return the TimePunchesGetTimePunchResponseDataBreaksInner instance itself
   */
  public TimePunchesGetTimePunchResponseDataBreaksInner putAdditionalProperty(String key, Object value) {
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
    TimePunchesGetTimePunchResponseDataBreaksInner timePunchesGetTimePunchResponseDataBreaksInner = (TimePunchesGetTimePunchResponseDataBreaksInner) o;
    return Objects.equals(this.id, timePunchesGetTimePunchResponseDataBreaksInner.id) &&
        Objects.equals(this.userId, timePunchesGetTimePunchResponseDataBreaksInner.userId) &&
        Objects.equals(this.customBreakId, timePunchesGetTimePunchResponseDataBreaksInner.customBreakId) &&
        Objects.equals(this.paid, timePunchesGetTimePunchResponseDataBreaksInner.paid) &&
        Objects.equals(this.in, timePunchesGetTimePunchResponseDataBreaksInner.in) &&
        Objects.equals(this.out, timePunchesGetTimePunchResponseDataBreaksInner.out)&&
        Objects.equals(this.additionalProperties, timePunchesGetTimePunchResponseDataBreaksInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, customBreakId, paid, in, out, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePunchesGetTimePunchResponseDataBreaksInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    customBreakId: ").append(toIndentedString(customBreakId)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("custom_break_id");
    openapiFields.add("paid");
    openapiFields.add("in");
    openapiFields.add("out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("custom_break_id");
    openapiRequiredFields.add("paid");
    openapiRequiredFields.add("in");
    openapiRequiredFields.add("out");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimePunchesGetTimePunchResponseDataBreaksInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimePunchesGetTimePunchResponseDataBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimePunchesGetTimePunchResponseDataBreaksInner is not found in the empty JSON string", TimePunchesGetTimePunchResponseDataBreaksInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimePunchesGetTimePunchResponseDataBreaksInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimePunchesGetTimePunchResponseDataBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimePunchesGetTimePunchResponseDataBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimePunchesGetTimePunchResponseDataBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimePunchesGetTimePunchResponseDataBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TimePunchesGetTimePunchResponseDataBreaksInner>() {
           @Override
           public void write(JsonWriter out, TimePunchesGetTimePunchResponseDataBreaksInner value) throws IOException {
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
           public TimePunchesGetTimePunchResponseDataBreaksInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimePunchesGetTimePunchResponseDataBreaksInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimePunchesGetTimePunchResponseDataBreaksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimePunchesGetTimePunchResponseDataBreaksInner
  * @throws IOException if the JSON string is invalid with respect to TimePunchesGetTimePunchResponseDataBreaksInner
  */
  public static TimePunchesGetTimePunchResponseDataBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimePunchesGetTimePunchResponseDataBreaksInner.class);
  }

 /**
  * Convert an instance of TimePunchesGetTimePunchResponseDataBreaksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

