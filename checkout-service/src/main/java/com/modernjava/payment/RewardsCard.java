package com.modernjava.payment;

import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

public final class RewardsCard extends PaymentGateway {
    //@Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Payment for the amount = " + amount);
        return PaymentResponse.SUCCESS;
    }
}
