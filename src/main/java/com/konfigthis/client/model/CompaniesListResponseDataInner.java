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
import com.konfigthis.client.model.CompaniesListResponseDataInnerMeta;
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
 * CompaniesListResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CompaniesListResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHOTO = "photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private String photo;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_DAYS_TO_EXPIRE = "days_to_expire";
  @SerializedName(SERIALIZED_NAME_DAYS_TO_EXPIRE)
  private Double daysToExpire;

  public static final String SERIALIZED_NAME_CONVERTED = "converted";
  @SerializedName(SERIALIZED_NAME_CONVERTED)
  private OffsetDateTime converted;

  public static final String SERIALIZED_NAME_POS = "pos";
  @SerializedName(SERIALIZED_NAME_POS)
  private String pos;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("active"),
    
    TRIAL("trial"),
    
    CANCELLED("cancelled"),
    
    DELINQUENT("delinquent"),
    
    EXPIRED("expired"),
    
    UNKNOWN("unknown");

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

  public static final String SERIALIZED_NAME_START_WEEK_ON = "start_week_on";
  @SerializedName(SERIALIZED_NAME_START_WEEK_ON)
  private Double startWeekOn;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private CompaniesListResponseDataInnerMeta meta;

  public CompaniesListResponseDataInner() {
  }

  public CompaniesListResponseDataInner id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public CompaniesListResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public CompaniesListResponseDataInner name(String name) {
    
    
    
    
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


  public CompaniesListResponseDataInner country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public CompaniesListResponseDataInner photo(String photo) {
    
    
    
    
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getPhoto() {
    return photo;
  }


  public void setPhoto(String photo) {
    
    
    
    this.photo = photo;
  }


  public CompaniesListResponseDataInner planId(String planId) {
    
    
    
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    
    
    
    this.planId = planId;
  }


  public CompaniesListResponseDataInner created(OffsetDateTime created) {
    
    
    
    
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


  public CompaniesListResponseDataInner modified(OffsetDateTime modified) {
    
    
    
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    
    
    
    this.modified = modified;
  }


  public CompaniesListResponseDataInner expires(OffsetDateTime expires) {
    
    
    
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    
    
    
    this.expires = expires;
  }


  public CompaniesListResponseDataInner daysToExpire(Double daysToExpire) {
    
    
    
    
    this.daysToExpire = daysToExpire;
    return this;
  }

  public CompaniesListResponseDataInner daysToExpire(Integer daysToExpire) {
    
    
    
    
    this.daysToExpire = daysToExpire.doubleValue();
    return this;
  }

   /**
   * Get daysToExpire
   * @return daysToExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Double getDaysToExpire() {
    return daysToExpire;
  }


  public void setDaysToExpire(Double daysToExpire) {
    
    
    
    this.daysToExpire = daysToExpire;
  }


  public CompaniesListResponseDataInner converted(OffsetDateTime converted) {
    
    
    
    
    this.converted = converted;
    return this;
  }

   /**
   * Get converted
   * @return converted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getConverted() {
    return converted;
  }


  public void setConverted(OffsetDateTime converted) {
    
    
    
    this.converted = converted;
  }


  public CompaniesListResponseDataInner pos(String pos) {
    
    
    
    
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getPos() {
    return pos;
  }


  public void setPos(String pos) {
    
    
    
    this.pos = pos;
  }


  public CompaniesListResponseDataInner status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public CompaniesListResponseDataInner startWeekOn(Double startWeekOn) {
    
    
    
    
    this.startWeekOn = startWeekOn;
    return this;
  }

  public CompaniesListResponseDataInner startWeekOn(Integer startWeekOn) {
    
    
    
    
    this.startWeekOn = startWeekOn.doubleValue();
    return this;
  }

   /**
   * Get startWeekOn
   * @return startWeekOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Double getStartWeekOn() {
    return startWeekOn;
  }


  public void setStartWeekOn(Double startWeekOn) {
    
    
    
    this.startWeekOn = startWeekOn;
  }


  public CompaniesListResponseDataInner meta(CompaniesListResponseDataInnerMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompaniesListResponseDataInnerMeta getMeta() {
    return meta;
  }


  public void setMeta(CompaniesListResponseDataInnerMeta meta) {
    
    
    
    this.meta = meta;
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
   * @return the CompaniesListResponseDataInner instance itself
   */
  public CompaniesListResponseDataInner putAdditionalProperty(String key, Object value) {
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
    CompaniesListResponseDataInner companiesListResponseDataInner = (CompaniesListResponseDataInner) o;
    return Objects.equals(this.id, companiesListResponseDataInner.id) &&
        Objects.equals(this.name, companiesListResponseDataInner.name) &&
        Objects.equals(this.country, companiesListResponseDataInner.country) &&
        Objects.equals(this.photo, companiesListResponseDataInner.photo) &&
        Objects.equals(this.planId, companiesListResponseDataInner.planId) &&
        Objects.equals(this.created, companiesListResponseDataInner.created) &&
        Objects.equals(this.modified, companiesListResponseDataInner.modified) &&
        Objects.equals(this.expires, companiesListResponseDataInner.expires) &&
        Objects.equals(this.daysToExpire, companiesListResponseDataInner.daysToExpire) &&
        Objects.equals(this.converted, companiesListResponseDataInner.converted) &&
        Objects.equals(this.pos, companiesListResponseDataInner.pos) &&
        Objects.equals(this.status, companiesListResponseDataInner.status) &&
        Objects.equals(this.startWeekOn, companiesListResponseDataInner.startWeekOn) &&
        Objects.equals(this.meta, companiesListResponseDataInner.meta)&&
        Objects.equals(this.additionalProperties, companiesListResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, country, photo, planId, created, modified, expires, daysToExpire, converted, pos, status, startWeekOn, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompaniesListResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    daysToExpire: ").append(toIndentedString(daysToExpire)).append("\n");
    sb.append("    converted: ").append(toIndentedString(converted)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startWeekOn: ").append(toIndentedString(startWeekOn)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("country");
    openapiFields.add("photo");
    openapiFields.add("plan_id");
    openapiFields.add("created");
    openapiFields.add("modified");
    openapiFields.add("expires");
    openapiFields.add("days_to_expire");
    openapiFields.add("converted");
    openapiFields.add("pos");
    openapiFields.add("status");
    openapiFields.add("start_week_on");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("photo");
    openapiRequiredFields.add("plan_id");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("modified");
    openapiRequiredFields.add("expires");
    openapiRequiredFields.add("days_to_expire");
    openapiRequiredFields.add("converted");
    openapiRequiredFields.add("pos");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("start_week_on");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompaniesListResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompaniesListResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompaniesListResponseDataInner is not found in the empty JSON string", CompaniesListResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompaniesListResponseDataInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("photo").isJsonNull() && !jsonObj.get("photo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `photo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("photo").toString()));
      }
      if (!jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (!jsonObj.get("pos").isJsonNull() && !jsonObj.get("pos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pos").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        CompaniesListResponseDataInnerMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompaniesListResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompaniesListResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompaniesListResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompaniesListResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CompaniesListResponseDataInner>() {
           @Override
           public void write(JsonWriter out, CompaniesListResponseDataInner value) throws IOException {
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
           public CompaniesListResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompaniesListResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CompaniesListResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompaniesListResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to CompaniesListResponseDataInner
  */
  public static CompaniesListResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompaniesListResponseDataInner.class);
  }

 /**
  * Convert an instance of CompaniesListResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

