package com.gigprofiles.graphql.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionResp {

	private String message;
	private String transactionId;
	private boolean success;
}
