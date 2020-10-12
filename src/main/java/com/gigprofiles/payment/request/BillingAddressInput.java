
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "creditCardPaymentInfoId",
    "eCheckCardPaymentInfoId",
    "privateLabelCreditCardPaymentInfoId",
    "paymentDataId",
    "externalAddressId",
    "firstName",
    "lastName",
    "middleName",
    "addressNickName",
    "addressLine1",
    "addressLine2",
    "city",
    "stateProv",
    "postalCode",
    "countryCode",
    "county",
    "phone",
    "faxNumber",
    "email",
    "addressTypeValue",
    "addressVerifiedFlag",
    "isDeleted",
    "lastUsedDTTM",
    "externalCustomerId",
    "referenceId"
})
public class BillingAddressInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("creditCardPaymentInfoId")
    private String creditCardPaymentInfoId;
    @JsonProperty("eCheckCardPaymentInfoId")
    private String eCheckCardPaymentInfoId;
    @JsonProperty("privateLabelCreditCardPaymentInfoId")
    private String privateLabelCreditCardPaymentInfoId;
    @JsonProperty("paymentDataId")
    private String paymentDataId;
    @JsonProperty("externalAddressId")
    private String externalAddressId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("addressNickName")
    private String addressNickName;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("addressLine2")
    private String addressLine2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateProv")
    private String stateProv;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("county")
    private String county;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("faxNumber")
    private String faxNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("addressTypeValue")
    private String addressTypeValue;
    @JsonProperty("addressVerifiedFlag")
    private String addressVerifiedFlag;
    @JsonProperty("isDeleted")
    private String isDeleted;
    @JsonProperty("lastUsedDTTM")
    private String lastUsedDTTM;
    @JsonProperty("externalCustomerId")
    private String externalCustomerId;
    @JsonProperty("referenceId")
    private String referenceId;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("creditCardPaymentInfoId")
    public String getCreditCardPaymentInfoId() {
        return creditCardPaymentInfoId;
    }

    @JsonProperty("creditCardPaymentInfoId")
    public void setCreditCardPaymentInfoId(String creditCardPaymentInfoId) {
        this.creditCardPaymentInfoId = creditCardPaymentInfoId;
    }

    @JsonProperty("eCheckCardPaymentInfoId")
    public String getECheckCardPaymentInfoId() {
        return eCheckCardPaymentInfoId;
    }

    @JsonProperty("eCheckCardPaymentInfoId")
    public void setECheckCardPaymentInfoId(String eCheckCardPaymentInfoId) {
        this.eCheckCardPaymentInfoId = eCheckCardPaymentInfoId;
    }

    @JsonProperty("privateLabelCreditCardPaymentInfoId")
    public String getPrivateLabelCreditCardPaymentInfoId() {
        return privateLabelCreditCardPaymentInfoId;
    }

    @JsonProperty("privateLabelCreditCardPaymentInfoId")
    public void setPrivateLabelCreditCardPaymentInfoId(String privateLabelCreditCardPaymentInfoId) {
        this.privateLabelCreditCardPaymentInfoId = privateLabelCreditCardPaymentInfoId;
    }

    @JsonProperty("paymentDataId")
    public String getPaymentDataId() {
        return paymentDataId;
    }

    @JsonProperty("paymentDataId")
    public void setPaymentDataId(String paymentDataId) {
        this.paymentDataId = paymentDataId;
    }

    @JsonProperty("externalAddressId")
    public String getExternalAddressId() {
        return externalAddressId;
    }

    @JsonProperty("externalAddressId")
    public void setExternalAddressId(String externalAddressId) {
        this.externalAddressId = externalAddressId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("addressNickName")
    public String getAddressNickName() {
        return addressNickName;
    }

    @JsonProperty("addressNickName")
    public void setAddressNickName(String addressNickName) {
        this.addressNickName = addressNickName;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("stateProv")
    public String getStateProv() {
        return stateProv;
    }

    @JsonProperty("stateProv")
    public void setStateProv(String stateProv) {
        this.stateProv = stateProv;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("addressTypeValue")
    public String getAddressTypeValue() {
        return addressTypeValue;
    }

    @JsonProperty("addressTypeValue")
    public void setAddressTypeValue(String addressTypeValue) {
        this.addressTypeValue = addressTypeValue;
    }

    @JsonProperty("addressVerifiedFlag")
    public String getAddressVerifiedFlag() {
        return addressVerifiedFlag;
    }

    @JsonProperty("addressVerifiedFlag")
    public void setAddressVerifiedFlag(String addressVerifiedFlag) {
        this.addressVerifiedFlag = addressVerifiedFlag;
    }

    @JsonProperty("isDeleted")
    public String getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("lastUsedDTTM")
    public String getLastUsedDTTM() {
        return lastUsedDTTM;
    }

    @JsonProperty("lastUsedDTTM")
    public void setLastUsedDTTM(String lastUsedDTTM) {
        this.lastUsedDTTM = lastUsedDTTM;
    }

    @JsonProperty("externalCustomerId")
    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    @JsonProperty("externalCustomerId")
    public void setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
    }

    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

}
