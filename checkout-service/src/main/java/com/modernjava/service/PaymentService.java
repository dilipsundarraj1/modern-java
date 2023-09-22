package com.modernjava.service;

import com.modernjava.domain.*;
import com.modernjava.payment.*;

public class PaymentService {


    public PaymentResponse makePayment(OrderDetails orderDetails, PaymentGateway paymentGateway) {

        if(paymentGateway instanceof DebitCardPayment debitCardPayment){
            debitCardPayment.makePayment(orderDetails.card(), orderDetails.finalAmount());
            return PaymentResponse.SUCCESS;
        }else if(paymentGateway instanceof  CreditCardPayment creditCard){
            creditCard.makePayment(orderDetails.card(), orderDetails.finalAmount());
            return PaymentResponse.FAILURE;
        }
        return null; // Optional is another way of treating a return value has an actual value or null.
    }

    public PaymentResponse makePaymentv2(OrderDetails orderDetails) {

        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
    }
}
