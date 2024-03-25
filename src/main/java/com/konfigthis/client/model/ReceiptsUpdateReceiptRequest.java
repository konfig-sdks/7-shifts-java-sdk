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
import com.konfigthis.client.model.ReceiptsUpdateReceiptRequestReceiptLinesInner;
import com.konfigthis.client.model.ReceiptsUpdateReceiptRequestTipDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ReceiptsUpdateReceiptRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReceiptsUpdateReceiptRequest {
  public static final String SERIALIZED_NAME_RECEIPT_DATE = "receipt_date";
  @SerializedName(SERIALIZED_NAME_RECEIPT_DATE)
  private OffsetDateTime receiptDate;

  public static final String SERIALIZED_NAME_NET_TOTAL = "net_total";
  @SerializedName(SERIALIZED_NAME_NET_TOTAL)
  private Integer netTotal;

  public static final String SERIALIZED_NAME_GROSS_TOTAL = "gross_total";
  @SerializedName(SERIALIZED_NAME_GROSS_TOTAL)
  private Integer grossTotal;

  public static final String SERIALIZED_NAME_TOTAL_RECEIPT_DISCOUNTS = "total_receipt_discounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECEIPT_DISCOUNTS)
  private Integer totalReceiptDiscounts;

  public static final String SERIALIZED_NAME_TIPS = "tips";
  @SerializedName(SERIALIZED_NAME_TIPS)
  private Integer tips;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "external_user_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_REVENUE_CENTER = "revenue_center";
  @SerializedName(SERIALIZED_NAME_REVENUE_CENTER)
  private String revenueCenter;

  public static final String SERIALIZED_NAME_RECEIPT_LINES = "receipt_lines";
  @SerializedName(SERIALIZED_NAME_RECEIPT_LINES)
  private List<ReceiptsUpdateReceiptRequestReceiptLinesInner> receiptLines = null;

  public static final String SERIALIZED_NAME_TIP_DETAILS = "tip_details";
  @SerializedName(SERIALIZED_NAME_TIP_DETAILS)
  private List<ReceiptsUpdateReceiptRequestTipDetailsInner> tipDetails = null;

  /**
   * Status of the receipt
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    VOIDED("voided"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Order type
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
 public enum OrderTypeEnum {
    DINE_IN("dine_in"),
    
    DELIVERY("delivery"),
    
    TAKE_OUT("take_out");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrderTypeEnum orderType;

  public static final String SERIALIZED_NAME_DINING_OPTION = "dining_option";
  @SerializedName(SERIALIZED_NAME_DINING_OPTION)
  private String diningOption;

  public ReceiptsUpdateReceiptRequest() {
  }

  public ReceiptsUpdateReceiptRequest receiptDate(OffsetDateTime receiptDate) {
    
    
    
    
    this.receiptDate = receiptDate;
    return this;
  }

   /**
   * Receipt create date time. UTC date time in ISO8601 format
   * @return receiptDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "Receipt create date time. UTC date time in ISO8601 format")

  public OffsetDateTime getReceiptDate() {
    return receiptDate;
  }


  public void setReceiptDate(OffsetDateTime receiptDate) {
    
    
    
    this.receiptDate = receiptDate;
  }


  public ReceiptsUpdateReceiptRequest netTotal(Integer netTotal) {
    
    
    
    
    this.netTotal = netTotal;
    return this;
  }

   /**
   * The net total of the receipt pre tax, post-discounts, pre tips. In cents
   * @return netTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The net total of the receipt pre tax, post-discounts, pre tips. In cents")

  public Integer getNetTotal() {
    return netTotal;
  }


  public void setNetTotal(Integer netTotal) {
    
    
    
    this.netTotal = netTotal;
  }


  public ReceiptsUpdateReceiptRequest grossTotal(Integer grossTotal) {
    
    
    
    
    this.grossTotal = grossTotal;
    return this;
  }

   /**
   * The gross total of the receipt in cents
   * @return grossTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gross total of the receipt in cents")

  public Integer getGrossTotal() {
    return grossTotal;
  }


  public void setGrossTotal(Integer grossTotal) {
    
    
    
    this.grossTotal = grossTotal;
  }


  public ReceiptsUpdateReceiptRequest totalReceiptDiscounts(Integer totalReceiptDiscounts) {
    if (totalReceiptDiscounts != null && totalReceiptDiscounts < 0) {
      throw new IllegalArgumentException("Invalid value for totalReceiptDiscounts. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalReceiptDiscounts = totalReceiptDiscounts;
    return this;
  }

   /**
   * The total discounts of the receipt in cents
   * minimum: 0
   * @return totalReceiptDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total discounts of the receipt in cents")

  public Integer getTotalReceiptDiscounts() {
    return totalReceiptDiscounts;
  }


  public void setTotalReceiptDiscounts(Integer totalReceiptDiscounts) {
    if (totalReceiptDiscounts != null && totalReceiptDiscounts < 0) {
      throw new IllegalArgumentException("Invalid value for totalReceiptDiscounts. Must be greater than or equal to 0.");
    }
    
    
    this.totalReceiptDiscounts = totalReceiptDiscounts;
  }


  public ReceiptsUpdateReceiptRequest tips(Integer tips) {
    
    
    
    
    this.tips = tips;
    return this;
  }

   /**
   * Total tips in cents
   * @return tips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total tips in cents")

  public Integer getTips() {
    return tips;
  }


  public void setTips(Integer tips) {
    
    
    
    this.tips = tips;
  }


  public ReceiptsUpdateReceiptRequest externalUserId(String externalUserId) {
    
    
    
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * External user ID of the sales receipt in your system (must be unique per 7shifts location).
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External user ID of the sales receipt in your system (must be unique per 7shifts location).")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    
    
    
    this.externalUserId = externalUserId;
  }


  public ReceiptsUpdateReceiptRequest revenueCenter(String revenueCenter) {
    
    
    
    
    this.revenueCenter = revenueCenter;
    return this;
  }

   /**
   * Label for the revenue center for the receipt
   * @return revenueCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label for the revenue center for the receipt")

  public String getRevenueCenter() {
    return revenueCenter;
  }


  public void setRevenueCenter(String revenueCenter) {
    
    
    
    this.revenueCenter = revenueCenter;
  }


  public ReceiptsUpdateReceiptRequest receiptLines(List<ReceiptsUpdateReceiptRequestReceiptLinesInner> receiptLines) {
    
    
    
    
    this.receiptLines = receiptLines;
    return this;
  }

  public ReceiptsUpdateReceiptRequest addReceiptLinesItem(ReceiptsUpdateReceiptRequestReceiptLinesInner receiptLinesItem) {
    if (this.receiptLines == null) {
      this.receiptLines = new ArrayList<>();
    }
    this.receiptLines.add(receiptLinesItem);
    return this;
  }

   /**
   * Receipt line items
   * @return receiptLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Receipt line items")

  public List<ReceiptsUpdateReceiptRequestReceiptLinesInner> getReceiptLines() {
    return receiptLines;
  }


  public void setReceiptLines(List<ReceiptsUpdateReceiptRequestReceiptLinesInner> receiptLines) {
    
    
    
    this.receiptLines = receiptLines;
  }


  public ReceiptsUpdateReceiptRequest tipDetails(List<ReceiptsUpdateReceiptRequestTipDetailsInner> tipDetails) {
    
    
    
    
    this.tipDetails = tipDetails;
    return this;
  }

  public ReceiptsUpdateReceiptRequest addTipDetailsItem(ReceiptsUpdateReceiptRequestTipDetailsInner tipDetailsItem) {
    if (this.tipDetails == null) {
      this.tipDetails = new ArrayList<>();
    }
    this.tipDetails.add(tipDetailsItem);
    return this;
  }

   /**
   * Tip line items
   * @return tipDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tip line items")

  public List<ReceiptsUpdateReceiptRequestTipDetailsInner> getTipDetails() {
    return tipDetails;
  }


  public void setTipDetails(List<ReceiptsUpdateReceiptRequestTipDetailsInner> tipDetails) {
    
    
    
    this.tipDetails = tipDetails;
  }


  public ReceiptsUpdateReceiptRequest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the receipt
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the receipt")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ReceiptsUpdateReceiptRequest orderType(OrderTypeEnum orderType) {
    
    
    
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Order type
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order type")

  public OrderTypeEnum getOrderType() {
    return orderType;
  }


  public void setOrderType(OrderTypeEnum orderType) {
    
    
    
    this.orderType = orderType;
  }


  public ReceiptsUpdateReceiptRequest diningOption(String diningOption) {
    
    
    
    
    this.diningOption = diningOption;
    return this;
  }

   /**
   * Dining option
   * @return diningOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dining option")

  public String getDiningOption() {
    return diningOption;
  }


  public void setDiningOption(String diningOption) {
    
    
    
    this.diningOption = diningOption;
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
   * @return the ReceiptsUpdateReceiptRequest instance itself
   */
  public ReceiptsUpdateReceiptRequest putAdditionalProperty(String key, Object value) {
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
    ReceiptsUpdateReceiptRequest receiptsUpdateReceiptRequest = (ReceiptsUpdateReceiptRequest) o;
    return Objects.equals(this.receiptDate, receiptsUpdateReceiptRequest.receiptDate) &&
        Objects.equals(this.netTotal, receiptsUpdateReceiptRequest.netTotal) &&
        Objects.equals(this.grossTotal, receiptsUpdateReceiptRequest.grossTotal) &&
        Objects.equals(this.totalReceiptDiscounts, receiptsUpdateReceiptRequest.totalReceiptDiscounts) &&
        Objects.equals(this.tips, receiptsUpdateReceiptRequest.tips) &&
        Objects.equals(this.externalUserId, receiptsUpdateReceiptRequest.externalUserId) &&
        Objects.equals(this.revenueCenter, receiptsUpdateReceiptRequest.revenueCenter) &&
        Objects.equals(this.receiptLines, receiptsUpdateReceiptRequest.receiptLines) &&
        Objects.equals(this.tipDetails, receiptsUpdateReceiptRequest.tipDetails) &&
        Objects.equals(this.status, receiptsUpdateReceiptRequest.status) &&
        Objects.equals(this.orderType, receiptsUpdateReceiptRequest.orderType) &&
        Objects.equals(this.diningOption, receiptsUpdateReceiptRequest.diningOption)&&
        Objects.equals(this.additionalProperties, receiptsUpdateReceiptRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptDate, netTotal, grossTotal, totalReceiptDiscounts, tips, externalUserId, revenueCenter, receiptLines, tipDetails, status, orderType, diningOption, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptsUpdateReceiptRequest {\n");
    sb.append("    receiptDate: ").append(toIndentedString(receiptDate)).append("\n");
    sb.append("    netTotal: ").append(toIndentedString(netTotal)).append("\n");
    sb.append("    grossTotal: ").append(toIndentedString(grossTotal)).append("\n");
    sb.append("    totalReceiptDiscounts: ").append(toIndentedString(totalReceiptDiscounts)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    revenueCenter: ").append(toIndentedString(revenueCenter)).append("\n");
    sb.append("    receiptLines: ").append(toIndentedString(receiptLines)).append("\n");
    sb.append("    tipDetails: ").append(toIndentedString(tipDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    diningOption: ").append(toIndentedString(diningOption)).append("\n");
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
    openapiFields.add("receipt_date");
    openapiFields.add("net_total");
    openapiFields.add("gross_total");
    openapiFields.add("total_receipt_discounts");
    openapiFields.add("tips");
    openapiFields.add("external_user_id");
    openapiFields.add("revenue_center");
    openapiFields.add("receipt_lines");
    openapiFields.add("tip_details");
    openapiFields.add("status");
    openapiFields.add("order_type");
    openapiFields.add("dining_option");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("net_total");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceiptsUpdateReceiptRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReceiptsUpdateReceiptRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceiptsUpdateReceiptRequest is not found in the empty JSON string", ReceiptsUpdateReceiptRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReceiptsUpdateReceiptRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("external_user_id") != null && !jsonObj.get("external_user_id").isJsonNull()) && !jsonObj.get("external_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_user_id").toString()));
      }
      if ((jsonObj.get("revenue_center") != null && !jsonObj.get("revenue_center").isJsonNull()) && !jsonObj.get("revenue_center").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revenue_center` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revenue_center").toString()));
      }
      if (jsonObj.get("receipt_lines") != null && !jsonObj.get("receipt_lines").isJsonNull()) {
        JsonArray jsonArrayreceiptLines = jsonObj.getAsJsonArray("receipt_lines");
        if (jsonArrayreceiptLines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receipt_lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receipt_lines` to be an array in the JSON string but got `%s`", jsonObj.get("receipt_lines").toString()));
          }

          // validate the optional field `receipt_lines` (array)
          for (int i = 0; i < jsonArrayreceiptLines.size(); i++) {
            ReceiptsUpdateReceiptRequestReceiptLinesInner.validateJsonObject(jsonArrayreceiptLines.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("tip_details") != null && !jsonObj.get("tip_details").isJsonNull()) {
        JsonArray jsonArraytipDetails = jsonObj.getAsJsonArray("tip_details");
        if (jsonArraytipDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tip_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tip_details` to be an array in the JSON string but got `%s`", jsonObj.get("tip_details").toString()));
          }

          // validate the optional field `tip_details` (array)
          for (int i = 0; i < jsonArraytipDetails.size(); i++) {
            ReceiptsUpdateReceiptRequestTipDetailsInner.validateJsonObject(jsonArraytipDetails.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("order_type") != null && !jsonObj.get("order_type").isJsonNull()) && !jsonObj.get("order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_type").toString()));
      }
      if ((jsonObj.get("dining_option") != null && !jsonObj.get("dining_option").isJsonNull()) && !jsonObj.get("dining_option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dining_option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dining_option").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceiptsUpdateReceiptRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceiptsUpdateReceiptRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceiptsUpdateReceiptRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceiptsUpdateReceiptRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceiptsUpdateReceiptRequest>() {
           @Override
           public void write(JsonWriter out, ReceiptsUpdateReceiptRequest value) throws IOException {
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
           public ReceiptsUpdateReceiptRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReceiptsUpdateReceiptRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReceiptsUpdateReceiptRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceiptsUpdateReceiptRequest
  * @throws IOException if the JSON string is invalid with respect to ReceiptsUpdateReceiptRequest
  */
  public static ReceiptsUpdateReceiptRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceiptsUpdateReceiptRequest.class);
  }

 /**
  * Convert an instance of ReceiptsUpdateReceiptRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

