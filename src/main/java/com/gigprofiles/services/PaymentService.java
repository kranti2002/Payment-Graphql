package com.gigprofiles.services;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gigprofiles.graphql.data.TransactionReq;
import com.gigprofiles.graphql.data.TransactionResp;
import com.gigprofiles.services.SSLClientFactory.HttpClientType;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class PaymentService {

	public TransactionResp processPayment(TransactionReq transReq) {
		
		RestTemplate restTemplate = new RestTemplate(SSLClientFactory.getClientHttpRequestFactory(HttpClientType.HttpClient));
		ObjectMapper mapper = new ObjectMapper();
		HttpHeaders header = new HttpHeaders();
		header.set("cache-control", "no-cache");
		TransactionResp transactionResp=new TransactionResp();
		try {
			transactionResp.setMessage("Success");
			transactionResp.setTransactionId("isjadcsha12456543");
			transactionResp.setSuccess(true);
			return transactionResp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
