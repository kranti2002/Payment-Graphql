
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "paymentDataId",
    "transactionType",
    "requestedAmount",
    "paymentProcessParameter",
    "byPass",
    "followOnID",
    "followOnToken",
    "requestID",
    "requestToken",
    "reconcillationID"
})
public class PaymentRequestTransactionDetailInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("paymentDataId")
    private String paymentDataId;
    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("requestedAmount")
    private String requestedAmount;
    @JsonProperty("paymentProcessParameter")
    private String paymentProcessParameter;
    @JsonProperty("byPass")
    private String byPass;
    @JsonProperty("followOnID")
    private String followOnID;
    @JsonProperty("followOnToken")
    private String followOnToken;
    @JsonProperty("requestID")
    private String requestID;
    @JsonProperty("requestToken")
    private String requestToken;
    @JsonProperty("reconcillationID")
    private String reconcillationID;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("paymentDataId")
    public String getPaymentDataId() {
        return paymentDataId;
    }

    @JsonProperty("paymentDataId")
    public void setPaymentDataId(String paymentDataId) {
        this.paymentDataId = paymentDataId;
    }

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("requestedAmount")
    public String getRequestedAmount() {
        return requestedAmount;
    }

    @JsonProperty("requestedAmount")
    public void setRequestedAmount(String requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    @JsonProperty("paymentProcessParameter")
    public String getPaymentProcessParameter() {
        return paymentProcessParameter;
    }

    @JsonProperty("paymentProcessParameter")
    public void setPaymentProcessParameter(String paymentProcessParameter) {
        this.paymentProcessParameter = paymentProcessParameter;
    }

    @JsonProperty("byPass")
    public String getByPass() {
        return byPass;
    }

    @JsonProperty("byPass")
    public void setByPass(String byPass) {
        this.byPass = byPass;
    }

    @JsonProperty("followOnID")
    public String getFollowOnID() {
        return followOnID;
    }

    @JsonProperty("followOnID")
    public void setFollowOnID(String followOnID) {
        this.followOnID = followOnID;
    }

    @JsonProperty("followOnToken")
    public String getFollowOnToken() {
        return followOnToken;
    }

    @JsonProperty("followOnToken")
    public void setFollowOnToken(String followOnToken) {
        this.followOnToken = followOnToken;
    }

    @JsonProperty("requestID")
    public String getRequestID() {
        return requestID;
    }

    @JsonProperty("requestID")
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    @JsonProperty("requestToken")
    public String getRequestToken() {
        return requestToken;
    }

    @JsonProperty("requestToken")
    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    @JsonProperty("reconcillationID")
    public String getReconcillationID() {
        return reconcillationID;
    }

    @JsonProperty("reconcillationID")
    public void setReconcillationID(String reconcillationID) {
        this.reconcillationID = reconcillationID;
    }

}
