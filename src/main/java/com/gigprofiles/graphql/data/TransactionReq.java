package com.gigprofiles.graphql.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionReq {

	private String cardNumber;
    private String cardType;
    private String nameAsOnCard;
    private String cardExpMonth;
    private String cardExpYear;
    private String securityCode;
    private BillingAddressIn billingAddressIn;
}
