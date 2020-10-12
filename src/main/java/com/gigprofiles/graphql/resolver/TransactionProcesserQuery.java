package com.gigprofiles.graphql.resolver;

import org.springframework.stereotype.Component;

import com.gigprofiles.graphql.data.TransactionReq;
import com.gigprofiles.graphql.data.TransactionResp;
import com.gigprofiles.payment.request.PaymentTransactionReq;
import com.gigprofiles.services.PaymentService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class TransactionProcesserQuery implements GraphQLQueryResolver {

	public TransactionProcesserQuery(PaymentService service){
		this.service=service;
	}
	  private PaymentService service;

	  public TransactionResp processPayment(TransactionReq paymentTransactionReq) {
		  //PaymentTransactionResp resp = new PaymentTransactionResp();
		  PaymentTransactionReq req=new PaymentTransactionReq();
		  //resp.setMessage(service.processPayment(paymentTransactionReq).getResponse());
		  //return service.processPayment(req);
		  TransactionResp resp = service.processPayment(paymentTransactionReq);
		  return resp;
	  }
}
