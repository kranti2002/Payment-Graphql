{
  processPayment(
    paymentTransactionReq: 
    {cardNumber: "411111111111111", 
      cardType: "Master Card", 
      nameAsOnCard: "kranti kandukuri", 
      cardExpMonth: "11", 
      cardExpYear: "2020", 
      securityCode: "111"}) {
    message,
    success,
    transactionId
  }
}


URL:
http://localhost:8080/graphiql