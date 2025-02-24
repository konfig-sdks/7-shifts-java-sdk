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
 * Hours and pay info for a shift or group of shifts
 */
@ApiModel(description = "Hours and pay info for a shift or group of shifts")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetWorkedHoursWagesResponseTotal {
  public static final String SERIALIZED_NAME_REGULAR_HOURS = "regular_hours";
  @SerializedName(SERIALIZED_NAME_REGULAR_HOURS)
  private Double regularHours;

  public static final String SERIALIZED_NAME_REGULAR_PAY = "regular_pay";
  @SerializedName(SERIALIZED_NAME_REGULAR_PAY)
  private Double regularPay;

  public static final String SERIALIZED_NAME_OVERTIME_HOURS = "overtime_hours";
  @SerializedName(SERIALIZED_NAME_OVERTIME_HOURS)
  private Double overtimeHours;

  public static final String SERIALIZED_NAME_PREMIUM_OVERTIME_HOURS = "premium_overtime_hours";
  @SerializedName(SERIALIZED_NAME_PREMIUM_OVERTIME_HOURS)
  private Double premiumOvertimeHours;

  public static final String SERIALIZED_NAME_NON_PREMIUM_OVERTIME_HOURS = "non_premium_overtime_hours";
  @SerializedName(SERIALIZED_NAME_NON_PREMIUM_OVERTIME_HOURS)
  private Double nonPremiumOvertimeHours;

  public static final String SERIALIZED_NAME_OVERTIME_PAY = "overtime_pay";
  @SerializedName(SERIALIZED_NAME_OVERTIME_PAY)
  private Double overtimePay;

  public static final String SERIALIZED_NAME_PREMIUM_OVERTIME_PAY = "premium_overtime_pay";
  @SerializedName(SERIALIZED_NAME_PREMIUM_OVERTIME_PAY)
  private Double premiumOvertimePay;

  public static final String SERIALIZED_NAME_NON_PREMIUM_OVERTIME_PAY = "non_premium_overtime_pay";
  @SerializedName(SERIALIZED_NAME_NON_PREMIUM_OVERTIME_PAY)
  private Double nonPremiumOvertimePay;

  public static final String SERIALIZED_NAME_HOLIDAY_HOURS = "holiday_hours";
  @SerializedName(SERIALIZED_NAME_HOLIDAY_HOURS)
  private Double holidayHours;

  public static final String SERIALIZED_NAME_HOLIDAY_PAY = "holiday_pay";
  @SerializedName(SERIALIZED_NAME_HOLIDAY_PAY)
  private Double holidayPay;

  public static final String SERIALIZED_NAME_COMPLIANCE_EXCEPTIONS_PAY = "compliance_exceptions_pay";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_EXCEPTIONS_PAY)
  private Double complianceExceptionsPay;

  public static final String SERIALIZED_NAME_TOTAL_HOURS = "total_hours";
  @SerializedName(SERIALIZED_NAME_TOTAL_HOURS)
  private Double totalHours;

  public static final String SERIALIZED_NAME_TOTAL_PAY = "total_pay";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY)
  private Double totalPay;

  public static final String SERIALIZED_NAME_TOTAL_TIPS = "total_tips";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIPS)
  private Double totalTips;

  public static final String SERIALIZED_NAME_CASH_TIPS = "cash_tips";
  @SerializedName(SERIALIZED_NAME_CASH_TIPS)
  private Double cashTips;

  public static final String SERIALIZED_NAME_CREDIT_CARD_TIPS = "credit_card_tips";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD_TIPS)
  private Double creditCardTips;

  public static final String SERIALIZED_NAME_TOTAL_PAYMENT_TIPS = "total_payment_tips";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYMENT_TIPS)
  private Double totalPaymentTips;

  public static final String SERIALIZED_NAME_DECLARED_TIPS = "declared_tips";
  @SerializedName(SERIALIZED_NAME_DECLARED_TIPS)
  private Double declaredTips;

  public static final String SERIALIZED_NAME_POS_DECLARED_TIPS = "pos_declared_tips";
  @SerializedName(SERIALIZED_NAME_POS_DECLARED_TIPS)
  private Double posDeclaredTips;

  public static final String SERIALIZED_NAME_AUTO_GRATUITY = "auto_gratuity";
  @SerializedName(SERIALIZED_NAME_AUTO_GRATUITY)
  private Double autoGratuity;

  public static final String SERIALIZED_NAME_WITHHELD_CC_AMOUNT = "withheld_cc_amount";
  @SerializedName(SERIALIZED_NAME_WITHHELD_CC_AMOUNT)
  private Double withheldCcAmount;

  public static final String SERIALIZED_NAME_TIP_IN = "tip_in";
  @SerializedName(SERIALIZED_NAME_TIP_IN)
  private Double tipIn;

  public static final String SERIALIZED_NAME_TIP_OUT = "tip_out";
  @SerializedName(SERIALIZED_NAME_TIP_OUT)
  private Double tipOut;

  public static final String SERIALIZED_NAME_EARNED_TIPS = "earned_tips";
  @SerializedName(SERIALIZED_NAME_EARNED_TIPS)
  private Double earnedTips;

  public ReportsGetWorkedHoursWagesResponseTotal() {
  }

  public ReportsGetWorkedHoursWagesResponseTotal regularHours(Double regularHours) {
    
    
    
    
    this.regularHours = regularHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal regularHours(Integer regularHours) {
    
    
    
    
    this.regularHours = regularHours.doubleValue();
    return this;
  }

   /**
   * Regular hours
   * @return regularHours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.5", required = true, value = "Regular hours")

  public Double getRegularHours() {
    return regularHours;
  }


  public void setRegularHours(Double regularHours) {
    
    
    
    this.regularHours = regularHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal regularPay(Double regularPay) {
    
    
    
    
    this.regularPay = regularPay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal regularPay(Integer regularPay) {
    
    
    
    
    this.regularPay = regularPay.doubleValue();
    return this;
  }

   /**
   * Regular pay
   * @return regularPay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15.75", required = true, value = "Regular pay")

  public Double getRegularPay() {
    return regularPay;
  }


  public void setRegularPay(Double regularPay) {
    
    
    
    this.regularPay = regularPay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal overtimeHours(Double overtimeHours) {
    
    
    
    
    this.overtimeHours = overtimeHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal overtimeHours(Integer overtimeHours) {
    
    
    
    
    this.overtimeHours = overtimeHours.doubleValue();
    return this;
  }

   /**
   * Overtime hours
   * @return overtimeHours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2.5", required = true, value = "Overtime hours")

  public Double getOvertimeHours() {
    return overtimeHours;
  }


  public void setOvertimeHours(Double overtimeHours) {
    
    
    
    this.overtimeHours = overtimeHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal premiumOvertimeHours(Double premiumOvertimeHours) {
    
    
    
    
    this.premiumOvertimeHours = premiumOvertimeHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal premiumOvertimeHours(Integer premiumOvertimeHours) {
    
    
    
    
    this.premiumOvertimeHours = premiumOvertimeHours.doubleValue();
    return this;
  }

   /**
   * Premium / Double overtime hours
   * @return premiumOvertimeHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "Premium / Double overtime hours")

  public Double getPremiumOvertimeHours() {
    return premiumOvertimeHours;
  }


  public void setPremiumOvertimeHours(Double premiumOvertimeHours) {
    
    
    
    this.premiumOvertimeHours = premiumOvertimeHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal nonPremiumOvertimeHours(Double nonPremiumOvertimeHours) {
    
    
    
    
    this.nonPremiumOvertimeHours = nonPremiumOvertimeHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal nonPremiumOvertimeHours(Integer nonPremiumOvertimeHours) {
    
    
    
    
    this.nonPremiumOvertimeHours = nonPremiumOvertimeHours.doubleValue();
    return this;
  }

   /**
   * Daily + Weekly + Consecutive overtime hours
   * @return nonPremiumOvertimeHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "Daily + Weekly + Consecutive overtime hours")

  public Double getNonPremiumOvertimeHours() {
    return nonPremiumOvertimeHours;
  }


  public void setNonPremiumOvertimeHours(Double nonPremiumOvertimeHours) {
    
    
    
    this.nonPremiumOvertimeHours = nonPremiumOvertimeHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal overtimePay(Double overtimePay) {
    
    
    
    
    this.overtimePay = overtimePay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal overtimePay(Integer overtimePay) {
    
    
    
    
    this.overtimePay = overtimePay.doubleValue();
    return this;
  }

   /**
   * Overtime pay
   * @return overtimePay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "35.5", required = true, value = "Overtime pay")

  public Double getOvertimePay() {
    return overtimePay;
  }


  public void setOvertimePay(Double overtimePay) {
    
    
    
    this.overtimePay = overtimePay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal premiumOvertimePay(Double premiumOvertimePay) {
    
    
    
    
    this.premiumOvertimePay = premiumOvertimePay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal premiumOvertimePay(Integer premiumOvertimePay) {
    
    
    
    
    this.premiumOvertimePay = premiumOvertimePay.doubleValue();
    return this;
  }

   /**
   * Premium / Double overtime pay
   * @return premiumOvertimePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35.5", value = "Premium / Double overtime pay")

  public Double getPremiumOvertimePay() {
    return premiumOvertimePay;
  }


  public void setPremiumOvertimePay(Double premiumOvertimePay) {
    
    
    
    this.premiumOvertimePay = premiumOvertimePay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal nonPremiumOvertimePay(Double nonPremiumOvertimePay) {
    
    
    
    
    this.nonPremiumOvertimePay = nonPremiumOvertimePay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal nonPremiumOvertimePay(Integer nonPremiumOvertimePay) {
    
    
    
    
    this.nonPremiumOvertimePay = nonPremiumOvertimePay.doubleValue();
    return this;
  }

   /**
   * Daily + Weekly + Consecutive overtime pay
   * @return nonPremiumOvertimePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35.5", value = "Daily + Weekly + Consecutive overtime pay")

  public Double getNonPremiumOvertimePay() {
    return nonPremiumOvertimePay;
  }


  public void setNonPremiumOvertimePay(Double nonPremiumOvertimePay) {
    
    
    
    this.nonPremiumOvertimePay = nonPremiumOvertimePay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal holidayHours(Double holidayHours) {
    
    
    
    
    this.holidayHours = holidayHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal holidayHours(Integer holidayHours) {
    
    
    
    
    this.holidayHours = holidayHours.doubleValue();
    return this;
  }

   /**
   * Holiday hours
   * @return holidayHours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3.5", required = true, value = "Holiday hours")

  public Double getHolidayHours() {
    return holidayHours;
  }


  public void setHolidayHours(Double holidayHours) {
    
    
    
    this.holidayHours = holidayHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal holidayPay(Double holidayPay) {
    
    
    
    
    this.holidayPay = holidayPay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal holidayPay(Integer holidayPay) {
    
    
    
    
    this.holidayPay = holidayPay.doubleValue();
    return this;
  }

   /**
   * Holiday pay
   * @return holidayPay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "40.25", required = true, value = "Holiday pay")

  public Double getHolidayPay() {
    return holidayPay;
  }


  public void setHolidayPay(Double holidayPay) {
    
    
    
    this.holidayPay = holidayPay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal complianceExceptionsPay(Double complianceExceptionsPay) {
    
    
    
    
    this.complianceExceptionsPay = complianceExceptionsPay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal complianceExceptionsPay(Integer complianceExceptionsPay) {
    
    
    
    
    this.complianceExceptionsPay = complianceExceptionsPay.doubleValue();
    return this;
  }

   /**
   * Compliance exceptions pay
   * @return complianceExceptionsPay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "33.5", required = true, value = "Compliance exceptions pay")

  public Double getComplianceExceptionsPay() {
    return complianceExceptionsPay;
  }


  public void setComplianceExceptionsPay(Double complianceExceptionsPay) {
    
    
    
    this.complianceExceptionsPay = complianceExceptionsPay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal totalHours(Double totalHours) {
    
    
    
    
    this.totalHours = totalHours;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal totalHours(Integer totalHours) {
    
    
    
    
    this.totalHours = totalHours.doubleValue();
    return this;
  }

   /**
   * Total hours
   * @return totalHours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7.5", required = true, value = "Total hours")

  public Double getTotalHours() {
    return totalHours;
  }


  public void setTotalHours(Double totalHours) {
    
    
    
    this.totalHours = totalHours;
  }


  public ReportsGetWorkedHoursWagesResponseTotal totalPay(Double totalPay) {
    
    
    
    
    this.totalPay = totalPay;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal totalPay(Integer totalPay) {
    
    
    
    
    this.totalPay = totalPay.doubleValue();
    return this;
  }

   /**
   * Total pay
   * @return totalPay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Total pay")

  public Double getTotalPay() {
    return totalPay;
  }


  public void setTotalPay(Double totalPay) {
    
    
    
    this.totalPay = totalPay;
  }


  public ReportsGetWorkedHoursWagesResponseTotal totalTips(Double totalTips) {
    
    
    
    
    this.totalTips = totalTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal totalTips(Integer totalTips) {
    
    
    
    
    this.totalTips = totalTips.doubleValue();
    return this;
  }

   /**
   * Tips declared by employee through 7punches
   * @return totalTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Tips declared by employee through 7punches")

  public Double getTotalTips() {
    return totalTips;
  }


  public void setTotalTips(Double totalTips) {
    
    
    
    this.totalTips = totalTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal cashTips(Double cashTips) {
    
    
    
    
    this.cashTips = cashTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal cashTips(Integer cashTips) {
    
    
    
    
    this.cashTips = cashTips.doubleValue();
    return this;
  }

   /**
   * Cash tips
   * @return cashTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Cash tips")

  public Double getCashTips() {
    return cashTips;
  }


  public void setCashTips(Double cashTips) {
    
    
    
    this.cashTips = cashTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal creditCardTips(Double creditCardTips) {
    
    
    
    
    this.creditCardTips = creditCardTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal creditCardTips(Integer creditCardTips) {
    
    
    
    
    this.creditCardTips = creditCardTips.doubleValue();
    return this;
  }

   /**
   * Credit card tips
   * @return creditCardTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Credit card tips")

  public Double getCreditCardTips() {
    return creditCardTips;
  }


  public void setCreditCardTips(Double creditCardTips) {
    
    
    
    this.creditCardTips = creditCardTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal totalPaymentTips(Double totalPaymentTips) {
    
    
    
    
    this.totalPaymentTips = totalPaymentTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal totalPaymentTips(Integer totalPaymentTips) {
    
    
    
    
    this.totalPaymentTips = totalPaymentTips.doubleValue();
    return this;
  }

   /**
   * Total payment tips
   * @return totalPaymentTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Total payment tips")

  public Double getTotalPaymentTips() {
    return totalPaymentTips;
  }


  public void setTotalPaymentTips(Double totalPaymentTips) {
    
    
    
    this.totalPaymentTips = totalPaymentTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal declaredTips(Double declaredTips) {
    
    
    
    
    this.declaredTips = declaredTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal declaredTips(Integer declaredTips) {
    
    
    
    
    this.declaredTips = declaredTips.doubleValue();
    return this;
  }

   /**
   * Declared tips either from 7punches or POS
   * @return declaredTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Declared tips either from 7punches or POS")

  public Double getDeclaredTips() {
    return declaredTips;
  }


  public void setDeclaredTips(Double declaredTips) {
    
    
    
    this.declaredTips = declaredTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal posDeclaredTips(Double posDeclaredTips) {
    
    
    
    
    this.posDeclaredTips = posDeclaredTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal posDeclaredTips(Integer posDeclaredTips) {
    
    
    
    
    this.posDeclaredTips = posDeclaredTips.doubleValue();
    return this;
  }

   /**
   * Declared tips from POS
   * @return posDeclaredTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.5", value = "Declared tips from POS")

  public Double getPosDeclaredTips() {
    return posDeclaredTips;
  }


  public void setPosDeclaredTips(Double posDeclaredTips) {
    
    
    
    this.posDeclaredTips = posDeclaredTips;
  }


  public ReportsGetWorkedHoursWagesResponseTotal autoGratuity(Double autoGratuity) {
    
    
    
    
    this.autoGratuity = autoGratuity;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal autoGratuity(Integer autoGratuity) {
    
    
    
    
    this.autoGratuity = autoGratuity.doubleValue();
    return this;
  }

   /**
   * Autogratuity
   * @return autoGratuity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Autogratuity")

  public Double getAutoGratuity() {
    return autoGratuity;
  }


  public void setAutoGratuity(Double autoGratuity) {
    
    
    
    this.autoGratuity = autoGratuity;
  }


  public ReportsGetWorkedHoursWagesResponseTotal withheldCcAmount(Double withheldCcAmount) {
    
    
    
    
    this.withheldCcAmount = withheldCcAmount;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal withheldCcAmount(Integer withheldCcAmount) {
    
    
    
    
    this.withheldCcAmount = withheldCcAmount.doubleValue();
    return this;
  }

   /**
   * Withheld CC amount
   * @return withheldCcAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Withheld CC amount")

  public Double getWithheldCcAmount() {
    return withheldCcAmount;
  }


  public void setWithheldCcAmount(Double withheldCcAmount) {
    
    
    
    this.withheldCcAmount = withheldCcAmount;
  }


  public ReportsGetWorkedHoursWagesResponseTotal tipIn(Double tipIn) {
    
    
    
    
    this.tipIn = tipIn;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal tipIn(Integer tipIn) {
    
    
    
    
    this.tipIn = tipIn.doubleValue();
    return this;
  }

   /**
   * Tip in amount
   * @return tipIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Tip in amount")

  public Double getTipIn() {
    return tipIn;
  }


  public void setTipIn(Double tipIn) {
    
    
    
    this.tipIn = tipIn;
  }


  public ReportsGetWorkedHoursWagesResponseTotal tipOut(Double tipOut) {
    
    
    
    
    this.tipOut = tipOut;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal tipOut(Integer tipOut) {
    
    
    
    
    this.tipOut = tipOut.doubleValue();
    return this;
  }

   /**
   * Tip out amount
   * @return tipOut
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Tip out amount")

  public Double getTipOut() {
    return tipOut;
  }


  public void setTipOut(Double tipOut) {
    
    
    
    this.tipOut = tipOut;
  }


  public ReportsGetWorkedHoursWagesResponseTotal earnedTips(Double earnedTips) {
    
    
    
    
    this.earnedTips = earnedTips;
    return this;
  }

  public ReportsGetWorkedHoursWagesResponseTotal earnedTips(Integer earnedTips) {
    
    
    
    
    this.earnedTips = earnedTips.doubleValue();
    return this;
  }

   /**
   * Earned Tips
   * @return earnedTips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.5", required = true, value = "Earned Tips")

  public Double getEarnedTips() {
    return earnedTips;
  }


  public void setEarnedTips(Double earnedTips) {
    
    
    
    this.earnedTips = earnedTips;
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
   * @return the ReportsGetWorkedHoursWagesResponseTotal instance itself
   */
  public ReportsGetWorkedHoursWagesResponseTotal putAdditionalProperty(String key, Object value) {
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
    ReportsGetWorkedHoursWagesResponseTotal reportsGetWorkedHoursWagesResponseTotal = (ReportsGetWorkedHoursWagesResponseTotal) o;
    return Objects.equals(this.regularHours, reportsGetWorkedHoursWagesResponseTotal.regularHours) &&
        Objects.equals(this.regularPay, reportsGetWorkedHoursWagesResponseTotal.regularPay) &&
        Objects.equals(this.overtimeHours, reportsGetWorkedHoursWagesResponseTotal.overtimeHours) &&
        Objects.equals(this.premiumOvertimeHours, reportsGetWorkedHoursWagesResponseTotal.premiumOvertimeHours) &&
        Objects.equals(this.nonPremiumOvertimeHours, reportsGetWorkedHoursWagesResponseTotal.nonPremiumOvertimeHours) &&
        Objects.equals(this.overtimePay, reportsGetWorkedHoursWagesResponseTotal.overtimePay) &&
        Objects.equals(this.premiumOvertimePay, reportsGetWorkedHoursWagesResponseTotal.premiumOvertimePay) &&
        Objects.equals(this.nonPremiumOvertimePay, reportsGetWorkedHoursWagesResponseTotal.nonPremiumOvertimePay) &&
        Objects.equals(this.holidayHours, reportsGetWorkedHoursWagesResponseTotal.holidayHours) &&
        Objects.equals(this.holidayPay, reportsGetWorkedHoursWagesResponseTotal.holidayPay) &&
        Objects.equals(this.complianceExceptionsPay, reportsGetWorkedHoursWagesResponseTotal.complianceExceptionsPay) &&
        Objects.equals(this.totalHours, reportsGetWorkedHoursWagesResponseTotal.totalHours) &&
        Objects.equals(this.totalPay, reportsGetWorkedHoursWagesResponseTotal.totalPay) &&
        Objects.equals(this.totalTips, reportsGetWorkedHoursWagesResponseTotal.totalTips) &&
        Objects.equals(this.cashTips, reportsGetWorkedHoursWagesResponseTotal.cashTips) &&
        Objects.equals(this.creditCardTips, reportsGetWorkedHoursWagesResponseTotal.creditCardTips) &&
        Objects.equals(this.totalPaymentTips, reportsGetWorkedHoursWagesResponseTotal.totalPaymentTips) &&
        Objects.equals(this.declaredTips, reportsGetWorkedHoursWagesResponseTotal.declaredTips) &&
        Objects.equals(this.posDeclaredTips, reportsGetWorkedHoursWagesResponseTotal.posDeclaredTips) &&
        Objects.equals(this.autoGratuity, reportsGetWorkedHoursWagesResponseTotal.autoGratuity) &&
        Objects.equals(this.withheldCcAmount, reportsGetWorkedHoursWagesResponseTotal.withheldCcAmount) &&
        Objects.equals(this.tipIn, reportsGetWorkedHoursWagesResponseTotal.tipIn) &&
        Objects.equals(this.tipOut, reportsGetWorkedHoursWagesResponseTotal.tipOut) &&
        Objects.equals(this.earnedTips, reportsGetWorkedHoursWagesResponseTotal.earnedTips)&&
        Objects.equals(this.additionalProperties, reportsGetWorkedHoursWagesResponseTotal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regularHours, regularPay, overtimeHours, premiumOvertimeHours, nonPremiumOvertimeHours, overtimePay, premiumOvertimePay, nonPremiumOvertimePay, holidayHours, holidayPay, complianceExceptionsPay, totalHours, totalPay, totalTips, cashTips, creditCardTips, totalPaymentTips, declaredTips, posDeclaredTips, autoGratuity, withheldCcAmount, tipIn, tipOut, earnedTips, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetWorkedHoursWagesResponseTotal {\n");
    sb.append("    regularHours: ").append(toIndentedString(regularHours)).append("\n");
    sb.append("    regularPay: ").append(toIndentedString(regularPay)).append("\n");
    sb.append("    overtimeHours: ").append(toIndentedString(overtimeHours)).append("\n");
    sb.append("    premiumOvertimeHours: ").append(toIndentedString(premiumOvertimeHours)).append("\n");
    sb.append("    nonPremiumOvertimeHours: ").append(toIndentedString(nonPremiumOvertimeHours)).append("\n");
    sb.append("    overtimePay: ").append(toIndentedString(overtimePay)).append("\n");
    sb.append("    premiumOvertimePay: ").append(toIndentedString(premiumOvertimePay)).append("\n");
    sb.append("    nonPremiumOvertimePay: ").append(toIndentedString(nonPremiumOvertimePay)).append("\n");
    sb.append("    holidayHours: ").append(toIndentedString(holidayHours)).append("\n");
    sb.append("    holidayPay: ").append(toIndentedString(holidayPay)).append("\n");
    sb.append("    complianceExceptionsPay: ").append(toIndentedString(complianceExceptionsPay)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    totalTips: ").append(toIndentedString(totalTips)).append("\n");
    sb.append("    cashTips: ").append(toIndentedString(cashTips)).append("\n");
    sb.append("    creditCardTips: ").append(toIndentedString(creditCardTips)).append("\n");
    sb.append("    totalPaymentTips: ").append(toIndentedString(totalPaymentTips)).append("\n");
    sb.append("    declaredTips: ").append(toIndentedString(declaredTips)).append("\n");
    sb.append("    posDeclaredTips: ").append(toIndentedString(posDeclaredTips)).append("\n");
    sb.append("    autoGratuity: ").append(toIndentedString(autoGratuity)).append("\n");
    sb.append("    withheldCcAmount: ").append(toIndentedString(withheldCcAmount)).append("\n");
    sb.append("    tipIn: ").append(toIndentedString(tipIn)).append("\n");
    sb.append("    tipOut: ").append(toIndentedString(tipOut)).append("\n");
    sb.append("    earnedTips: ").append(toIndentedString(earnedTips)).append("\n");
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
    openapiFields.add("regular_hours");
    openapiFields.add("regular_pay");
    openapiFields.add("overtime_hours");
    openapiFields.add("premium_overtime_hours");
    openapiFields.add("non_premium_overtime_hours");
    openapiFields.add("overtime_pay");
    openapiFields.add("premium_overtime_pay");
    openapiFields.add("non_premium_overtime_pay");
    openapiFields.add("holiday_hours");
    openapiFields.add("holiday_pay");
    openapiFields.add("compliance_exceptions_pay");
    openapiFields.add("total_hours");
    openapiFields.add("total_pay");
    openapiFields.add("total_tips");
    openapiFields.add("cash_tips");
    openapiFields.add("credit_card_tips");
    openapiFields.add("total_payment_tips");
    openapiFields.add("declared_tips");
    openapiFields.add("pos_declared_tips");
    openapiFields.add("auto_gratuity");
    openapiFields.add("withheld_cc_amount");
    openapiFields.add("tip_in");
    openapiFields.add("tip_out");
    openapiFields.add("earned_tips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("regular_hours");
    openapiRequiredFields.add("regular_pay");
    openapiRequiredFields.add("overtime_hours");
    openapiRequiredFields.add("overtime_pay");
    openapiRequiredFields.add("holiday_hours");
    openapiRequiredFields.add("holiday_pay");
    openapiRequiredFields.add("compliance_exceptions_pay");
    openapiRequiredFields.add("total_hours");
    openapiRequiredFields.add("total_pay");
    openapiRequiredFields.add("total_tips");
    openapiRequiredFields.add("cash_tips");
    openapiRequiredFields.add("credit_card_tips");
    openapiRequiredFields.add("total_payment_tips");
    openapiRequiredFields.add("declared_tips");
    openapiRequiredFields.add("auto_gratuity");
    openapiRequiredFields.add("withheld_cc_amount");
    openapiRequiredFields.add("tip_in");
    openapiRequiredFields.add("tip_out");
    openapiRequiredFields.add("earned_tips");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetWorkedHoursWagesResponseTotal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetWorkedHoursWagesResponseTotal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetWorkedHoursWagesResponseTotal is not found in the empty JSON string", ReportsGetWorkedHoursWagesResponseTotal.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportsGetWorkedHoursWagesResponseTotal.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetWorkedHoursWagesResponseTotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetWorkedHoursWagesResponseTotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetWorkedHoursWagesResponseTotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetWorkedHoursWagesResponseTotal.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetWorkedHoursWagesResponseTotal>() {
           @Override
           public void write(JsonWriter out, ReportsGetWorkedHoursWagesResponseTotal value) throws IOException {
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
           public ReportsGetWorkedHoursWagesResponseTotal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetWorkedHoursWagesResponseTotal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetWorkedHoursWagesResponseTotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetWorkedHoursWagesResponseTotal
  * @throws IOException if the JSON string is invalid with respect to ReportsGetWorkedHoursWagesResponseTotal
  */
  public static ReportsGetWorkedHoursWagesResponseTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetWorkedHoursWagesResponseTotal.class);
  }

 /**
  * Convert an instance of ReportsGetWorkedHoursWagesResponseTotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

