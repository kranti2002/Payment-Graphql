
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "paymentMethod",
    "cardNumber",
    "dataSecurity",
    "cardType",
    "nameAsOnCard",
    "cardExpMonth",
    "cardExpYear",
    "securityCode",
    "billingAddress",
    "referenceFields",
    "gatewayInfo",
    "paymentOrderInfo",
    "paymentRequestTransactionDetail",
    "paymentResponseTransactionDetail"
})
public class PaymentDataInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("dataSecurity")
    private String dataSecurity;
    @JsonProperty("cardType")
    private String cardType;
    @JsonProperty("nameAsOnCard")
    private String nameAsOnCard;
    @JsonProperty("cardExpMonth")
    private Integer cardExpMonth;
    @JsonProperty("cardExpYear")
    private Integer cardExpYear;
    @JsonProperty("securityCode")
    private String securityCode;
    @JsonProperty("billingAddress")
    private BillingAddressInput billingAddressInput;
    @JsonProperty("referenceFields")
    private ReferenceFieldsInput referenceFieldsInput;
    @JsonProperty("gatewayInfo")
    private GatewayInfoInput gatewayInfoInput;
    @JsonProperty("paymentOrderInfo")
    private PaymentOrderInfoInput paymentOrderInfoInput;
    @JsonProperty("paymentRequestTransactionDetail")
    private PaymentRequestTransactionDetailInput paymentRequestTransactionDetailInput;
    @JsonProperty("paymentResponseTransactionDetail")
    private PaymentResponseTransactionDetailInput paymentResponseTransactionDetailInput;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("cardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    @JsonProperty("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @JsonProperty("dataSecurity")
    public String getDataSecurity() {
        return dataSecurity;
    }

    @JsonProperty("dataSecurity")
    public void setDataSecurity(String dataSecurity) {
        this.dataSecurity = dataSecurity;
    }

    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("cardType")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("nameAsOnCard")
    public String getNameAsOnCard() {
        return nameAsOnCard;
    }

    @JsonProperty("nameAsOnCard")
    public void setNameAsOnCard(String nameAsOnCard) {
        this.nameAsOnCard = nameAsOnCard;
    }

    @JsonProperty("cardExpMonth")
    public Integer getCardExpMonth() {
        return cardExpMonth;
    }

    @JsonProperty("cardExpMonth")
    public void setCardExpMonth(Integer cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @JsonProperty("cardExpYear")
    public Integer getCardExpYear() {
        return cardExpYear;
    }

    @JsonProperty("cardExpYear")
    public void setCardExpYear(Integer cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @JsonProperty("securityCode")
    public String getSecurityCode() {
        return securityCode;
    }

    @JsonProperty("securityCode")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @JsonProperty("billingAddress")
    public BillingAddressInput getBillingAddressInput() {
        return billingAddressInput;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddressInput(BillingAddressInput billingAddressInput) {
        this.billingAddressInput = billingAddressInput;
    }

    @JsonProperty("referenceFields")
    public ReferenceFieldsInput getReferenceFieldsInput() {
        return referenceFieldsInput;
    }

    @JsonProperty("referenceFields")
    public void setReferenceFieldsInput(ReferenceFieldsInput referenceFieldsInput) {
        this.referenceFieldsInput = referenceFieldsInput;
    }

    @JsonProperty("gatewayInfo")
    public GatewayInfoInput getGatewayInfoInput() {
        return gatewayInfoInput;
    }

    @JsonProperty("gatewayInfo")
    public void setGatewayInfoInput(GatewayInfoInput gatewayInfoInput) {
        this.gatewayInfoInput = gatewayInfoInput;
    }

    @JsonProperty("paymentOrderInfo")
    public PaymentOrderInfoInput getPaymentOrderInfoInput() {
        return paymentOrderInfoInput;
    }

    @JsonProperty("paymentOrderInfo")
    public void setPaymentOrderInfoInput(PaymentOrderInfoInput paymentOrderInfoInput) {
        this.paymentOrderInfoInput = paymentOrderInfoInput;
    }

    @JsonProperty("paymentRequestTransactionDetail")
    public PaymentRequestTransactionDetailInput getPaymentRequestTransactionDetailInput() {
        return paymentRequestTransactionDetailInput;
    }

    @JsonProperty("paymentRequestTransactionDetail")
    public void setPaymentRequestTransactionDetailInput(PaymentRequestTransactionDetailInput paymentRequestTransactionDetailInput) {
        this.paymentRequestTransactionDetailInput = paymentRequestTransactionDetailInput;
    }

    @JsonProperty("paymentResponseTransactionDetail")
    public PaymentResponseTransactionDetailInput getPaymentResponseTransactionDetailInput() {
        return paymentResponseTransactionDetailInput;
    }

    @JsonProperty("paymentResponseTransactionDetail")
    public void setPaymentResponseTransactionDetailInput(PaymentResponseTransactionDetailInput paymentResponseTransactionDetailInput) {
        this.paymentResponseTransactionDetailInput = paymentResponseTransactionDetailInput;
    }

}
