
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "orderId",
    "returnOrderId",
    "orderLineRefFieldId",
    "paymentDataId",
    "paymentDetailId",
    "referenceNumber4",
    "referenceNumber5"
})
public class ReferenceFieldsInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("returnOrderId")
    private String returnOrderId;
    @JsonProperty("orderLineRefFieldId")
    private String orderLineRefFieldId;
    @JsonProperty("paymentDataId")
    private String paymentDataId;
    @JsonProperty("paymentDetailId")
    private String paymentDetailId;
    @JsonProperty("referenceNumber4")
    private String referenceNumber4;
    @JsonProperty("referenceNumber5")
    private String referenceNumber5;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("returnOrderId")
    public String getReturnOrderId() {
        return returnOrderId;
    }

    @JsonProperty("returnOrderId")
    public void setReturnOrderId(String returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    @JsonProperty("orderLineRefFieldId")
    public String getOrderLineRefFieldId() {
        return orderLineRefFieldId;
    }

    @JsonProperty("orderLineRefFieldId")
    public void setOrderLineRefFieldId(String orderLineRefFieldId) {
        this.orderLineRefFieldId = orderLineRefFieldId;
    }

    @JsonProperty("paymentDataId")
    public String getPaymentDataId() {
        return paymentDataId;
    }

    @JsonProperty("paymentDataId")
    public void setPaymentDataId(String paymentDataId) {
        this.paymentDataId = paymentDataId;
    }

    @JsonProperty("paymentDetailId")
    public String getPaymentDetailId() {
        return paymentDetailId;
    }

    @JsonProperty("paymentDetailId")
    public void setPaymentDetailId(String paymentDetailId) {
        this.paymentDetailId = paymentDetailId;
    }

    @JsonProperty("referenceNumber4")
    public String getReferenceNumber4() {
        return referenceNumber4;
    }

    @JsonProperty("referenceNumber4")
    public void setReferenceNumber4(String referenceNumber4) {
        this.referenceNumber4 = referenceNumber4;
    }

    @JsonProperty("referenceNumber5")
    public String getReferenceNumber5() {
        return referenceNumber5;
    }

    @JsonProperty("referenceNumber5")
    public void setReferenceNumber5(String referenceNumber5) {
        this.referenceNumber5 = referenceNumber5;
    }

}
