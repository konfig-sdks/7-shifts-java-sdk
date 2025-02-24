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
import java.util.UUID;
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
 * TipPoolSaveManualEntryRequestDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TipPoolSaveManualEntryRequestDataInner {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_TIP_POOL_SETTINGS_UUID = "tip_pool_settings_uuid";
  @SerializedName(SERIALIZED_NAME_TIP_POOL_SETTINGS_UUID)
  private UUID tipPoolSettingsUuid;

  public static final String SERIALIZED_NAME_DAY_PART_UUID = "day_part_uuid";
  @SerializedName(SERIALIZED_NAME_DAY_PART_UUID)
  private UUID dayPartUuid;

  public static final String SERIALIZED_NAME_ENTRY_DATE = "entry_date";
  @SerializedName(SERIALIZED_NAME_ENTRY_DATE)
  private String entryDate;

  public static final String SERIALIZED_NAME_TIP_AMOUNT = "tip_amount";
  @SerializedName(SERIALIZED_NAME_TIP_AMOUNT)
  private Float tipAmount;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public TipPoolSaveManualEntryRequestDataInner() {
  }

  public TipPoolSaveManualEntryRequestDataInner uuid(UUID uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Manual Entry UUID
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manual Entry UUID")

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    
    
    
    this.uuid = uuid;
  }


  public TipPoolSaveManualEntryRequestDataInner tipPoolSettingsUuid(UUID tipPoolSettingsUuid) {
    
    
    
    
    this.tipPoolSettingsUuid = tipPoolSettingsUuid;
    return this;
  }

   /**
   * UUID for the associated Tip Pool
   * @return tipPoolSettingsUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UUID for the associated Tip Pool")

  public UUID getTipPoolSettingsUuid() {
    return tipPoolSettingsUuid;
  }


  public void setTipPoolSettingsUuid(UUID tipPoolSettingsUuid) {
    
    
    
    this.tipPoolSettingsUuid = tipPoolSettingsUuid;
  }


  public TipPoolSaveManualEntryRequestDataInner dayPartUuid(UUID dayPartUuid) {
    
    
    
    
    this.dayPartUuid = dayPartUuid;
    return this;
  }

   /**
   * UUID for the associated Day Part (if any)
   * @return dayPartUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID for the associated Day Part (if any)")

  public UUID getDayPartUuid() {
    return dayPartUuid;
  }


  public void setDayPartUuid(UUID dayPartUuid) {
    
    
    
    this.dayPartUuid = dayPartUuid;
  }


  public TipPoolSaveManualEntryRequestDataInner entryDate(String entryDate) {
    
    
    
    
    this.entryDate = entryDate;
    return this;
  }

   /**
   * The date of the manually entered tips
   * @return entryDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-01-01", required = true, value = "The date of the manually entered tips")

  public String getEntryDate() {
    return entryDate;
  }


  public void setEntryDate(String entryDate) {
    
    
    
    this.entryDate = entryDate;
  }


  public TipPoolSaveManualEntryRequestDataInner tipAmount(Float tipAmount) {
    
    
    
    
    this.tipAmount = tipAmount;
    return this;
  }

   /**
   * The tip amount for the given manual entry
   * @return tipAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12.5", required = true, value = "The tip amount for the given manual entry")

  public Float getTipAmount() {
    return tipAmount;
  }


  public void setTipAmount(Float tipAmount) {
    
    
    
    this.tipAmount = tipAmount;
  }


  public TipPoolSaveManualEntryRequestDataInner created(String created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * When this manual entry record was created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-12T12:00:00Z", value = "When this manual entry record was created")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    
    
    
    this.created = created;
  }


  public TipPoolSaveManualEntryRequestDataInner modified(String modified) {
    
    
    
    
    this.modified = modified;
    return this;
  }

   /**
   * When this manual entry record was last modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-12T13:00:00Z", value = "When this manual entry record was last modified")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    
    
    
    this.modified = modified;
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
   * @return the TipPoolSaveManualEntryRequestDataInner instance itself
   */
  public TipPoolSaveManualEntryRequestDataInner putAdditionalProperty(String key, Object value) {
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
    TipPoolSaveManualEntryRequestDataInner tipPoolSaveManualEntryRequestDataInner = (TipPoolSaveManualEntryRequestDataInner) o;
    return Objects.equals(this.uuid, tipPoolSaveManualEntryRequestDataInner.uuid) &&
        Objects.equals(this.tipPoolSettingsUuid, tipPoolSaveManualEntryRequestDataInner.tipPoolSettingsUuid) &&
        Objects.equals(this.dayPartUuid, tipPoolSaveManualEntryRequestDataInner.dayPartUuid) &&
        Objects.equals(this.entryDate, tipPoolSaveManualEntryRequestDataInner.entryDate) &&
        Objects.equals(this.tipAmount, tipPoolSaveManualEntryRequestDataInner.tipAmount) &&
        Objects.equals(this.created, tipPoolSaveManualEntryRequestDataInner.created) &&
        Objects.equals(this.modified, tipPoolSaveManualEntryRequestDataInner.modified)&&
        Objects.equals(this.additionalProperties, tipPoolSaveManualEntryRequestDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, tipPoolSettingsUuid, dayPartUuid, entryDate, tipAmount, created, modified, additionalProperties);
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
    sb.append("class TipPoolSaveManualEntryRequestDataInner {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    tipPoolSettingsUuid: ").append(toIndentedString(tipPoolSettingsUuid)).append("\n");
    sb.append("    dayPartUuid: ").append(toIndentedString(dayPartUuid)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    tipAmount: ").append(toIndentedString(tipAmount)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("tip_pool_settings_uuid");
    openapiFields.add("day_part_uuid");
    openapiFields.add("entry_date");
    openapiFields.add("tip_amount");
    openapiFields.add("created");
    openapiFields.add("modified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tip_pool_settings_uuid");
    openapiRequiredFields.add("entry_date");
    openapiRequiredFields.add("tip_amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TipPoolSaveManualEntryRequestDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TipPoolSaveManualEntryRequestDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TipPoolSaveManualEntryRequestDataInner is not found in the empty JSON string", TipPoolSaveManualEntryRequestDataInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TipPoolSaveManualEntryRequestDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("uuid").isJsonNull() && (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("tip_pool_settings_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tip_pool_settings_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tip_pool_settings_uuid").toString()));
      }
      if (!jsonObj.get("day_part_uuid").isJsonNull() && (jsonObj.get("day_part_uuid") != null && !jsonObj.get("day_part_uuid").isJsonNull()) && !jsonObj.get("day_part_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_part_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_part_uuid").toString()));
      }
      if (!jsonObj.get("entry_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entry_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entry_date").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if ((jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull()) && !jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TipPoolSaveManualEntryRequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TipPoolSaveManualEntryRequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TipPoolSaveManualEntryRequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TipPoolSaveManualEntryRequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TipPoolSaveManualEntryRequestDataInner>() {
           @Override
           public void write(JsonWriter out, TipPoolSaveManualEntryRequestDataInner value) throws IOException {
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
           public TipPoolSaveManualEntryRequestDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TipPoolSaveManualEntryRequestDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TipPoolSaveManualEntryRequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TipPoolSaveManualEntryRequestDataInner
  * @throws IOException if the JSON string is invalid with respect to TipPoolSaveManualEntryRequestDataInner
  */
  public static TipPoolSaveManualEntryRequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TipPoolSaveManualEntryRequestDataInner.class);
  }

 /**
  * Convert an instance of TipPoolSaveManualEntryRequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

