
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "paymentDataId",
    "orderType",
    "orderNumber"
})
public class PaymentOrderInfoInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("paymentDataId")
    private String paymentDataId;
    @JsonProperty("orderType")
    private String orderType;
    @JsonProperty("orderNumber")
    private Integer orderNumber;

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

    @JsonProperty("orderType")
    public String getOrderType() {
        return orderType;
    }

    @JsonProperty("orderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("orderNumber")
    public Integer getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

}
