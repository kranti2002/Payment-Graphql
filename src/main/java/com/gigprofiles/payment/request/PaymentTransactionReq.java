
package com.gigprofiles.payment.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paymentData"
})
public class PaymentTransactionReq {

    @JsonProperty("paymentData")
    private PaymentDataInput paymentDataInput;

    @JsonProperty("paymentData")
    public PaymentDataInput getPaymentDataInput() {
        return paymentDataInput;
    }

    @JsonProperty("paymentData")
    public void setPaymentDataInput(PaymentDataInput paymentDataInput) {
        this.paymentDataInput = paymentDataInput;
    }

}
