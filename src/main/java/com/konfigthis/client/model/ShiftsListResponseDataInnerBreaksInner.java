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
 * ShiftsListResponseDataInnerBreaksInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShiftsListResponseDataInnerBreaksInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SHIFT_ID = "shift_id";
  @SerializedName(SERIALIZED_NAME_SHIFT_ID)
  private Integer shiftId;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_BREAK_TYPE_ID = "break_type_id";
  @SerializedName(SERIALIZED_NAME_BREAK_TYPE_ID)
  private Integer breakTypeId;

  /**
   * Break type paid or unpaid
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    PAID("paid"),
    
    UNPAID("unpaid");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public ShiftsListResponseDataInnerBreaksInner() {
  }

  public ShiftsListResponseDataInnerBreaksInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Break ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Break ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public ShiftsListResponseDataInnerBreaksInner shiftId(Integer shiftId) {
    
    
    
    
    this.shiftId = shiftId;
    return this;
  }

   /**
   * Shift ID
   * @return shiftId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Shift ID")

  public Integer getShiftId() {
    return shiftId;
  }


  public void setShiftId(Integer shiftId) {
    
    
    
    this.shiftId = shiftId;
  }


  public ShiftsListResponseDataInnerBreaksInner start(OffsetDateTime start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Start date time of the break. UTC in ISO8601 format.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date time of the break. UTC in ISO8601 format.")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    
    
    
    this.start = start;
  }


  public ShiftsListResponseDataInnerBreaksInner end(OffsetDateTime end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * End date time of the break. UTC in ISO8601 format.
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date time of the break. UTC in ISO8601 format.")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    
    
    
    this.end = end;
  }


  public ShiftsListResponseDataInnerBreaksInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Break type name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Break type name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ShiftsListResponseDataInnerBreaksInner length(Integer length) {
    
    
    
    
    this.length = length;
    return this;
  }

   /**
   * Break type length in minutes
   * @return length
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Break type length in minutes")

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    
    
    
    this.length = length;
  }


  public ShiftsListResponseDataInnerBreaksInner breakTypeId(Integer breakTypeId) {
    
    
    
    
    this.breakTypeId = breakTypeId;
    return this;
  }

   /**
   * Break type ID
   * @return breakTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Break type ID")

  public Integer getBreakTypeId() {
    return breakTypeId;
  }


  public void setBreakTypeId(Integer breakTypeId) {
    
    
    
    this.breakTypeId = breakTypeId;
  }


  public ShiftsListResponseDataInnerBreaksInner type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Break type paid or unpaid
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Break type paid or unpaid")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the ShiftsListResponseDataInnerBreaksInner instance itself
   */
  public ShiftsListResponseDataInnerBreaksInner putAdditionalProperty(String key, Object value) {
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
    ShiftsListResponseDataInnerBreaksInner shiftsListResponseDataInnerBreaksInner = (ShiftsListResponseDataInnerBreaksInner) o;
    return Objects.equals(this.id, shiftsListResponseDataInnerBreaksInner.id) &&
        Objects.equals(this.shiftId, shiftsListResponseDataInnerBreaksInner.shiftId) &&
        Objects.equals(this.start, shiftsListResponseDataInnerBreaksInner.start) &&
        Objects.equals(this.end, shiftsListResponseDataInnerBreaksInner.end) &&
        Objects.equals(this.name, shiftsListResponseDataInnerBreaksInner.name) &&
        Objects.equals(this.length, shiftsListResponseDataInnerBreaksInner.length) &&
        Objects.equals(this.breakTypeId, shiftsListResponseDataInnerBreaksInner.breakTypeId) &&
        Objects.equals(this.type, shiftsListResponseDataInnerBreaksInner.type)&&
        Objects.equals(this.additionalProperties, shiftsListResponseDataInnerBreaksInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shiftId, start, end, name, length, breakTypeId, type, additionalProperties);
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
    sb.append("class ShiftsListResponseDataInnerBreaksInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    breakTypeId: ").append(toIndentedString(breakTypeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("shift_id");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("name");
    openapiFields.add("length");
    openapiFields.add("break_type_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("shift_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("length");
    openapiRequiredFields.add("break_type_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShiftsListResponseDataInnerBreaksInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShiftsListResponseDataInnerBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShiftsListResponseDataInnerBreaksInner is not found in the empty JSON string", ShiftsListResponseDataInnerBreaksInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShiftsListResponseDataInnerBreaksInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShiftsListResponseDataInnerBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShiftsListResponseDataInnerBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShiftsListResponseDataInnerBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShiftsListResponseDataInnerBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShiftsListResponseDataInnerBreaksInner>() {
           @Override
           public void write(JsonWriter out, ShiftsListResponseDataInnerBreaksInner value) throws IOException {
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
           public ShiftsListResponseDataInnerBreaksInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShiftsListResponseDataInnerBreaksInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShiftsListResponseDataInnerBreaksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShiftsListResponseDataInnerBreaksInner
  * @throws IOException if the JSON string is invalid with respect to ShiftsListResponseDataInnerBreaksInner
  */
  public static ShiftsListResponseDataInnerBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShiftsListResponseDataInnerBreaksInner.class);
  }

 /**
  * Convert an instance of ShiftsListResponseDataInnerBreaksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

