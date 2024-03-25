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
 * AvailabilityUpdateReasonByIdResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AvailabilityUpdateReasonByIdResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_COMMENTS_REQUIRED = "comments_required";
  @SerializedName(SERIALIZED_NAME_COMMENTS_REQUIRED)
  private Boolean commentsRequired;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Integer sort;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public AvailabilityUpdateReasonByIdResponseData() {
  }

  public AvailabilityUpdateReasonByIdResponseData id(Integer id) {
    
    
    
    
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


  public AvailabilityUpdateReasonByIdResponseData companyId(Integer companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    
    
    
    this.companyId = companyId;
  }


  public AvailabilityUpdateReasonByIdResponseData reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public AvailabilityUpdateReasonByIdResponseData commentsRequired(Boolean commentsRequired) {
    
    
    
    
    this.commentsRequired = commentsRequired;
    return this;
  }

   /**
   * Get commentsRequired
   * @return commentsRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCommentsRequired() {
    return commentsRequired;
  }


  public void setCommentsRequired(Boolean commentsRequired) {
    
    
    
    this.commentsRequired = commentsRequired;
  }


  public AvailabilityUpdateReasonByIdResponseData sort(Integer sort) {
    
    
    
    
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSort() {
    return sort;
  }


  public void setSort(Integer sort) {
    
    
    
    this.sort = sort;
  }


  public AvailabilityUpdateReasonByIdResponseData created(OffsetDateTime created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * The date and time are formatted as ISO8601 in the UTC timezone.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-20T12:00Z", value = "The date and time are formatted as ISO8601 in the UTC timezone.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    
    
    
    this.created = created;
  }


  public AvailabilityUpdateReasonByIdResponseData modified(OffsetDateTime modified) {
    
    
    
    
    this.modified = modified;
    return this;
  }

   /**
   * The date and time are formatted as ISO8601 in the UTC timezone.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-20T12:00Z", value = "The date and time are formatted as ISO8601 in the UTC timezone.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    
    
    
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
   * @return the AvailabilityUpdateReasonByIdResponseData instance itself
   */
  public AvailabilityUpdateReasonByIdResponseData putAdditionalProperty(String key, Object value) {
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
    AvailabilityUpdateReasonByIdResponseData availabilityUpdateReasonByIdResponseData = (AvailabilityUpdateReasonByIdResponseData) o;
    return Objects.equals(this.id, availabilityUpdateReasonByIdResponseData.id) &&
        Objects.equals(this.companyId, availabilityUpdateReasonByIdResponseData.companyId) &&
        Objects.equals(this.reason, availabilityUpdateReasonByIdResponseData.reason) &&
        Objects.equals(this.commentsRequired, availabilityUpdateReasonByIdResponseData.commentsRequired) &&
        Objects.equals(this.sort, availabilityUpdateReasonByIdResponseData.sort) &&
        Objects.equals(this.created, availabilityUpdateReasonByIdResponseData.created) &&
        Objects.equals(this.modified, availabilityUpdateReasonByIdResponseData.modified)&&
        Objects.equals(this.additionalProperties, availabilityUpdateReasonByIdResponseData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, reason, commentsRequired, sort, created, modified, additionalProperties);
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
    sb.append("class AvailabilityUpdateReasonByIdResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    commentsRequired: ").append(toIndentedString(commentsRequired)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("company_id");
    openapiFields.add("reason");
    openapiFields.add("comments_required");
    openapiFields.add("sort");
    openapiFields.add("created");
    openapiFields.add("modified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("comments_required");
    openapiRequiredFields.add("sort");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailabilityUpdateReasonByIdResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailabilityUpdateReasonByIdResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilityUpdateReasonByIdResponseData is not found in the empty JSON string", AvailabilityUpdateReasonByIdResponseData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailabilityUpdateReasonByIdResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilityUpdateReasonByIdResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilityUpdateReasonByIdResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilityUpdateReasonByIdResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilityUpdateReasonByIdResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilityUpdateReasonByIdResponseData>() {
           @Override
           public void write(JsonWriter out, AvailabilityUpdateReasonByIdResponseData value) throws IOException {
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
           public AvailabilityUpdateReasonByIdResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AvailabilityUpdateReasonByIdResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AvailabilityUpdateReasonByIdResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailabilityUpdateReasonByIdResponseData
  * @throws IOException if the JSON string is invalid with respect to AvailabilityUpdateReasonByIdResponseData
  */
  public static AvailabilityUpdateReasonByIdResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilityUpdateReasonByIdResponseData.class);
  }

 /**
  * Convert an instance of AvailabilityUpdateReasonByIdResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

