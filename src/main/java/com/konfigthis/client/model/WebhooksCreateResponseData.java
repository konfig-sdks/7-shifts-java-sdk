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
 * WebhooksCreateResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhooksCreateResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Webhook method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
 public enum MethodEnum {
    POST("post"),
    
    GET("get"),
    
    PUT("put"),
    
    PATCH("patch"),
    
    DELETE("delete");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public WebhooksCreateResponseData() {
  }

  public WebhooksCreateResponseData id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Webhook ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Webhook ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public WebhooksCreateResponseData companyId(Integer companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company ID
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Company ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    
    
    
    this.companyId = companyId;
  }


  public WebhooksCreateResponseData url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Webhook URL
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Webhook URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public WebhooksCreateResponseData method(MethodEnum method) {
    
    
    
    
    this.method = method;
    return this;
  }

   /**
   * Webhook method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Webhook method")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    
    
    
    this.method = method;
  }


  public WebhooksCreateResponseData event(String event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * Webhook event
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "user.created", required = true, value = "Webhook event")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    
    
    
    this.event = event;
  }


  public WebhooksCreateResponseData created(String created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Webhook create date time. UTC date time in ISO8601 format
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Webhook create date time. UTC date time in ISO8601 format")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    
    
    
    this.created = created;
  }


  public WebhooksCreateResponseData modified(String modified) {
    
    
    
    
    this.modified = modified;
    return this;
  }

   /**
   * Webhook modified date time. UTC date time in ISO8601 format
   * @return modified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Webhook modified date time. UTC date time in ISO8601 format")

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
   * @return the WebhooksCreateResponseData instance itself
   */
  public WebhooksCreateResponseData putAdditionalProperty(String key, Object value) {
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
    WebhooksCreateResponseData webhooksCreateResponseData = (WebhooksCreateResponseData) o;
    return Objects.equals(this.id, webhooksCreateResponseData.id) &&
        Objects.equals(this.companyId, webhooksCreateResponseData.companyId) &&
        Objects.equals(this.url, webhooksCreateResponseData.url) &&
        Objects.equals(this.method, webhooksCreateResponseData.method) &&
        Objects.equals(this.event, webhooksCreateResponseData.event) &&
        Objects.equals(this.created, webhooksCreateResponseData.created) &&
        Objects.equals(this.modified, webhooksCreateResponseData.modified)&&
        Objects.equals(this.additionalProperties, webhooksCreateResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, url, method, event, created, modified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksCreateResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("method");
    openapiFields.add("event");
    openapiFields.add("created");
    openapiFields.add("modified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("modified");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksCreateResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksCreateResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksCreateResponseData is not found in the empty JSON string", WebhooksCreateResponseData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhooksCreateResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if (!jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (!jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksCreateResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksCreateResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksCreateResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksCreateResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksCreateResponseData>() {
           @Override
           public void write(JsonWriter out, WebhooksCreateResponseData value) throws IOException {
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
           public WebhooksCreateResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhooksCreateResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhooksCreateResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksCreateResponseData
  * @throws IOException if the JSON string is invalid with respect to WebhooksCreateResponseData
  */
  public static WebhooksCreateResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksCreateResponseData.class);
  }

 /**
  * Convert an instance of WebhooksCreateResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

