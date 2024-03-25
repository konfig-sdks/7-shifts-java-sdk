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
 * TipPoolGetSummaryReportResponseDataInnerUnassignedTips
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TipPoolGetSummaryReportResponseDataInnerUnassignedTips {
  public static final String SERIALIZED_NAME_HOURS_WORKED = "hours_worked";
  @SerializedName(SERIALIZED_NAME_HOURS_WORKED)
  private Double hoursWorked;

  public static final String SERIALIZED_NAME_TIP_IN = "tip_in";
  @SerializedName(SERIALIZED_NAME_TIP_IN)
  private Integer tipIn;

  public static final String SERIALIZED_NAME_NET_SALES = "net_sales";
  @SerializedName(SERIALIZED_NAME_NET_SALES)
  private Integer netSales;

  public static final String SERIALIZED_NAME_CC_TIPS = "cc_tips";
  @SerializedName(SERIALIZED_NAME_CC_TIPS)
  private Integer ccTips;

  public static final String SERIALIZED_NAME_CC_TIPS_WITHHELD = "cc_tips_withheld";
  @SerializedName(SERIALIZED_NAME_CC_TIPS_WITHHELD)
  private Integer ccTipsWithheld;

  public static final String SERIALIZED_NAME_AUTO_GRAT_TIPS = "auto_grat_tips";
  @SerializedName(SERIALIZED_NAME_AUTO_GRAT_TIPS)
  private Integer autoGratTips;

  public static final String SERIALIZED_NAME_CASH_TIPS = "cash_tips";
  @SerializedName(SERIALIZED_NAME_CASH_TIPS)
  private Integer cashTips;

  public static final String SERIALIZED_NAME_DECLARED_TIPS = "declared_tips";
  @SerializedName(SERIALIZED_NAME_DECLARED_TIPS)
  private Integer declaredTips;

  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips() {
  }

  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips hoursWorked(Double hoursWorked) {
    
    
    
    
    this.hoursWorked = hoursWorked;
    return this;
  }

  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips hoursWorked(Integer hoursWorked) {
    
    
    
    
    this.hoursWorked = hoursWorked.doubleValue();
    return this;
  }

   /**
   * The amount of hours worked
   * @return hoursWorked
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of hours worked")

  public Double getHoursWorked() {
    return hoursWorked;
  }


  public void setHoursWorked(Double hoursWorked) {
    
    
    
    this.hoursWorked = hoursWorked;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips tipIn(Integer tipIn) {
    
    
    
    
    this.tipIn = tipIn;
    return this;
  }

   /**
   * Tip in amount (in cents)
   * @return tipIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tip in amount (in cents)")

  public Integer getTipIn() {
    return tipIn;
  }


  public void setTipIn(Integer tipIn) {
    
    
    
    this.tipIn = tipIn;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips netSales(Integer netSales) {
    
    
    
    
    this.netSales = netSales;
    return this;
  }

   /**
   * The net sales (in cents)
   * @return netSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The net sales (in cents)")

  public Integer getNetSales() {
    return netSales;
  }


  public void setNetSales(Integer netSales) {
    
    
    
    this.netSales = netSales;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips ccTips(Integer ccTips) {
    
    
    
    
    this.ccTips = ccTips;
    return this;
  }

   /**
   * Tips from credit card (in cents)
   * @return ccTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tips from credit card (in cents)")

  public Integer getCcTips() {
    return ccTips;
  }


  public void setCcTips(Integer ccTips) {
    
    
    
    this.ccTips = ccTips;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips ccTipsWithheld(Integer ccTipsWithheld) {
    
    
    
    
    this.ccTipsWithheld = ccTipsWithheld;
    return this;
  }

   /**
   * Tips from credit card withheld (in cents)
   * @return ccTipsWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tips from credit card withheld (in cents)")

  public Integer getCcTipsWithheld() {
    return ccTipsWithheld;
  }


  public void setCcTipsWithheld(Integer ccTipsWithheld) {
    
    
    
    this.ccTipsWithheld = ccTipsWithheld;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips autoGratTips(Integer autoGratTips) {
    
    
    
    
    this.autoGratTips = autoGratTips;
    return this;
  }

   /**
   * Auto gratuity tips (in cents)
   * @return autoGratTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auto gratuity tips (in cents)")

  public Integer getAutoGratTips() {
    return autoGratTips;
  }


  public void setAutoGratTips(Integer autoGratTips) {
    
    
    
    this.autoGratTips = autoGratTips;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips cashTips(Integer cashTips) {
    
    
    
    
    this.cashTips = cashTips;
    return this;
  }

   /**
   * Tips in cash (in cents)
   * @return cashTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tips in cash (in cents)")

  public Integer getCashTips() {
    return cashTips;
  }


  public void setCashTips(Integer cashTips) {
    
    
    
    this.cashTips = cashTips;
  }


  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips declaredTips(Integer declaredTips) {
    
    
    
    
    this.declaredTips = declaredTips;
    return this;
  }

   /**
   * Declared tips (in cents)
   * @return declaredTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Declared tips (in cents)")

  public Integer getDeclaredTips() {
    return declaredTips;
  }


  public void setDeclaredTips(Integer declaredTips) {
    
    
    
    this.declaredTips = declaredTips;
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
   * @return the TipPoolGetSummaryReportResponseDataInnerUnassignedTips instance itself
   */
  public TipPoolGetSummaryReportResponseDataInnerUnassignedTips putAdditionalProperty(String key, Object value) {
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
    TipPoolGetSummaryReportResponseDataInnerUnassignedTips tipPoolGetSummaryReportResponseDataInnerUnassignedTips = (TipPoolGetSummaryReportResponseDataInnerUnassignedTips) o;
    return Objects.equals(this.hoursWorked, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.hoursWorked) &&
        Objects.equals(this.tipIn, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.tipIn) &&
        Objects.equals(this.netSales, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.netSales) &&
        Objects.equals(this.ccTips, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.ccTips) &&
        Objects.equals(this.ccTipsWithheld, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.ccTipsWithheld) &&
        Objects.equals(this.autoGratTips, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.autoGratTips) &&
        Objects.equals(this.cashTips, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.cashTips) &&
        Objects.equals(this.declaredTips, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.declaredTips)&&
        Objects.equals(this.additionalProperties, tipPoolGetSummaryReportResponseDataInnerUnassignedTips.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoursWorked, tipIn, netSales, ccTips, ccTipsWithheld, autoGratTips, cashTips, declaredTips, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipPoolGetSummaryReportResponseDataInnerUnassignedTips {\n");
    sb.append("    hoursWorked: ").append(toIndentedString(hoursWorked)).append("\n");
    sb.append("    tipIn: ").append(toIndentedString(tipIn)).append("\n");
    sb.append("    netSales: ").append(toIndentedString(netSales)).append("\n");
    sb.append("    ccTips: ").append(toIndentedString(ccTips)).append("\n");
    sb.append("    ccTipsWithheld: ").append(toIndentedString(ccTipsWithheld)).append("\n");
    sb.append("    autoGratTips: ").append(toIndentedString(autoGratTips)).append("\n");
    sb.append("    cashTips: ").append(toIndentedString(cashTips)).append("\n");
    sb.append("    declaredTips: ").append(toIndentedString(declaredTips)).append("\n");
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
    openapiFields.add("net_sales");
    openapiFields.add("cc_tips");
    openapiFields.add("cc_tips_withheld");
    openapiFields.add("auto_grat_tips");
    openapiFields.add("cash_tips");
    openapiFields.add("declared_tips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hours_worked");
    openapiRequiredFields.add("tip_in");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TipPoolGetSummaryReportResponseDataInnerUnassignedTips
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TipPoolGetSummaryReportResponseDataInnerUnassignedTips.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TipPoolGetSummaryReportResponseDataInnerUnassignedTips is not found in the empty JSON string", TipPoolGetSummaryReportResponseDataInnerUnassignedTips.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TipPoolGetSummaryReportResponseDataInnerUnassignedTips.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TipPoolGetSummaryReportResponseDataInnerUnassignedTips.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TipPoolGetSummaryReportResponseDataInnerUnassignedTips' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TipPoolGetSummaryReportResponseDataInnerUnassignedTips> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TipPoolGetSummaryReportResponseDataInnerUnassignedTips.class));

       return (TypeAdapter<T>) new TypeAdapter<TipPoolGetSummaryReportResponseDataInnerUnassignedTips>() {
           @Override
           public void write(JsonWriter out, TipPoolGetSummaryReportResponseDataInnerUnassignedTips value) throws IOException {
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
           public TipPoolGetSummaryReportResponseDataInnerUnassignedTips read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TipPoolGetSummaryReportResponseDataInnerUnassignedTips instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TipPoolGetSummaryReportResponseDataInnerUnassignedTips given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TipPoolGetSummaryReportResponseDataInnerUnassignedTips
  * @throws IOException if the JSON string is invalid with respect to TipPoolGetSummaryReportResponseDataInnerUnassignedTips
  */
  public static TipPoolGetSummaryReportResponseDataInnerUnassignedTips fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TipPoolGetSummaryReportResponseDataInnerUnassignedTips.class);
  }

 /**
  * Convert an instance of TipPoolGetSummaryReportResponseDataInnerUnassignedTips to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

