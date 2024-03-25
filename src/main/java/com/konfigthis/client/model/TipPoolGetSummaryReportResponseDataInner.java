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
import com.konfigthis.client.model.TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner;
import com.konfigthis.client.model.TipPoolGetSummaryReportResponseDataInnerTotal;
import com.konfigthis.client.model.TipPoolGetSummaryReportResponseDataInnerUnassignedTips;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * TipPoolGetSummaryReportResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TipPoolGetSummaryReportResponseDataInner {
  public static final String SERIALIZED_NAME_TIP_POOL_UUID = "tip_pool_uuid";
  @SerializedName(SERIALIZED_NAME_TIP_POOL_UUID)
  private UUID tipPoolUuid;

  public static final String SERIALIZED_NAME_TIP_POOL_NAME = "tip_pool_name";
  @SerializedName(SERIALIZED_NAME_TIP_POOL_NAME)
  private String tipPoolName;

  public static final String SERIALIZED_NAME_UNASSIGNED_TIPS = "unassigned_tips";
  @SerializedName(SERIALIZED_NAME_UNASSIGNED_TIPS)
  private TipPoolGetSummaryReportResponseDataInnerUnassignedTips unassignedTips;

  public static final String SERIALIZED_NAME_ASSIGNED_TIPS = "assigned_tips";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TIPS)
  private List<TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner> assignedTips = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private TipPoolGetSummaryReportResponseDataInnerTotal total;

  public TipPoolGetSummaryReportResponseDataInner() {
  }

  public TipPoolGetSummaryReportResponseDataInner tipPoolUuid(UUID tipPoolUuid) {
    
    
    
    
    this.tipPoolUuid = tipPoolUuid;
    return this;
  }

   /**
   * The tip pool UUID
   * @return tipPoolUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The tip pool UUID")

  public UUID getTipPoolUuid() {
    return tipPoolUuid;
  }


  public void setTipPoolUuid(UUID tipPoolUuid) {
    
    
    
    this.tipPoolUuid = tipPoolUuid;
  }


  public TipPoolGetSummaryReportResponseDataInner tipPoolName(String tipPoolName) {
    
    
    
    
    this.tipPoolName = tipPoolName;
    return this;
  }

   /**
   * The tip pool name
   * @return tipPoolName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The tip pool name")

  public String getTipPoolName() {
    return tipPoolName;
  }


  public void setTipPoolName(String tipPoolName) {
    
    
    
    this.tipPoolName = tipPoolName;
  }


  public TipPoolGetSummaryReportResponseDataInner unassignedTips(TipPoolGetSummaryReportResponseDataInnerUnassignedTips unassignedTips) {
    
    
    
    
    this.unassignedTips = unassignedTips;
    return this;
  }

   /**
   * Get unassignedTips
   * @return unassignedTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips getUnassignedTips() {
    return unassignedTips;
  }


  public void setUnassignedTips(TipPoolGetSummaryReportResponseDataInnerUnassignedTips unassignedTips) {
    
    
    
    this.unassignedTips = unassignedTips;
  }


  public TipPoolGetSummaryReportResponseDataInner assignedTips(List<TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner> assignedTips) {
    
    
    
    
    this.assignedTips = assignedTips;
    return this;
  }

  public TipPoolGetSummaryReportResponseDataInner addAssignedTipsItem(TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner assignedTipsItem) {
    this.assignedTips.add(assignedTipsItem);
    return this;
  }

   /**
   * Get assignedTips
   * @return assignedTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner> getAssignedTips() {
    return assignedTips;
  }


  public void setAssignedTips(List<TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner> assignedTips) {
    
    
    
    this.assignedTips = assignedTips;
  }


  public TipPoolGetSummaryReportResponseDataInner total(TipPoolGetSummaryReportResponseDataInnerTotal total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TipPoolGetSummaryReportResponseDataInnerTotal getTotal() {
    return total;
  }


  public void setTotal(TipPoolGetSummaryReportResponseDataInnerTotal total) {
    
    
    
    this.total = total;
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
   * @return the TipPoolGetSummaryReportResponseDataInner instance itself
   */
  public TipPoolGetSummaryReportResponseDataInner putAdditionalProperty(String key, Object value) {
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
    TipPoolGetSummaryReportResponseDataInner tipPoolGetSummaryReportResponseDataInner = (TipPoolGetSummaryReportResponseDataInner) o;
    return Objects.equals(this.tipPoolUuid, tipPoolGetSummaryReportResponseDataInner.tipPoolUuid) &&
        Objects.equals(this.tipPoolName, tipPoolGetSummaryReportResponseDataInner.tipPoolName) &&
        Objects.equals(this.unassignedTips, tipPoolGetSummaryReportResponseDataInner.unassignedTips) &&
        Objects.equals(this.assignedTips, tipPoolGetSummaryReportResponseDataInner.assignedTips) &&
        Objects.equals(this.total, tipPoolGetSummaryReportResponseDataInner.total)&&
        Objects.equals(this.additionalProperties, tipPoolGetSummaryReportResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipPoolUuid, tipPoolName, unassignedTips, assignedTips, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipPoolGetSummaryReportResponseDataInner {\n");
    sb.append("    tipPoolUuid: ").append(toIndentedString(tipPoolUuid)).append("\n");
    sb.append("    tipPoolName: ").append(toIndentedString(tipPoolName)).append("\n");
    sb.append("    unassignedTips: ").append(toIndentedString(unassignedTips)).append("\n");
    sb.append("    assignedTips: ").append(toIndentedString(assignedTips)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("tip_pool_uuid");
    openapiFields.add("tip_pool_name");
    openapiFields.add("unassigned_tips");
    openapiFields.add("assigned_tips");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tip_pool_uuid");
    openapiRequiredFields.add("tip_pool_name");
    openapiRequiredFields.add("unassigned_tips");
    openapiRequiredFields.add("assigned_tips");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TipPoolGetSummaryReportResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TipPoolGetSummaryReportResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TipPoolGetSummaryReportResponseDataInner is not found in the empty JSON string", TipPoolGetSummaryReportResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TipPoolGetSummaryReportResponseDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("tip_pool_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tip_pool_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tip_pool_uuid").toString()));
      }
      if (!jsonObj.get("tip_pool_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tip_pool_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tip_pool_name").toString()));
      }
      // validate the required field `unassigned_tips`
      TipPoolGetSummaryReportResponseDataInnerUnassignedTips.validateJsonObject(jsonObj.getAsJsonObject("unassigned_tips"));
      // ensure the json data is an array
      if (!jsonObj.get("assigned_tips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigned_tips` to be an array in the JSON string but got `%s`", jsonObj.get("assigned_tips").toString()));
      }

      JsonArray jsonArrayassignedTips = jsonObj.getAsJsonArray("assigned_tips");
      // validate the required field `assigned_tips` (array)
      for (int i = 0; i < jsonArrayassignedTips.size(); i++) {
        TipPoolGetSummaryReportResponseDataInnerAssignedTipsInner.validateJsonObject(jsonArrayassignedTips.get(i).getAsJsonObject());
      };
      // validate the required field `total`
      TipPoolGetSummaryReportResponseDataInnerTotal.validateJsonObject(jsonObj.getAsJsonObject("total"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TipPoolGetSummaryReportResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TipPoolGetSummaryReportResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TipPoolGetSummaryReportResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TipPoolGetSummaryReportResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TipPoolGetSummaryReportResponseDataInner>() {
           @Override
           public void write(JsonWriter out, TipPoolGetSummaryReportResponseDataInner value) throws IOException {
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
           public TipPoolGetSummaryReportResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TipPoolGetSummaryReportResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TipPoolGetSummaryReportResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TipPoolGetSummaryReportResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to TipPoolGetSummaryReportResponseDataInner
  */
  public static TipPoolGetSummaryReportResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TipPoolGetSummaryReportResponseDataInner.class);
  }

 /**
  * Convert an instance of TipPoolGetSummaryReportResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

