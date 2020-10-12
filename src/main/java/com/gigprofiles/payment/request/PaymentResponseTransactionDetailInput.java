
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "paymentDataId"
})
public class PaymentResponseTransactionDetailInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("paymentDataId")
    private String paymentDataId;

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

}
