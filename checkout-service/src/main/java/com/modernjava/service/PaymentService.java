package com.modernjava.service;

import com.modernjava.domain.*;
import com.modernjava.payment.*;

public class PaymentService {

    public PaymentResponse makePaymentv2(OrderDetails orderDetails) {

        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
    }
}
