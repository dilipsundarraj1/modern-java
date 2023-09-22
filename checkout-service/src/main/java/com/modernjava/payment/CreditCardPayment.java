package com.modernjava.payment;


import com.modernjava.domain.Card;
import com.modernjava.domain.PaymentResponse;

sealed public class CreditCardPayment extends PaymentGateway permits CashEveryDayCreditCardPayment, SkyMilesCreditCardPayment, CreditCardPayment.RewardPointsCreditCardPayment
{
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Payment for the amount = " + amount);
        return PaymentResponse.SUCCESS;
    }


    public static final class RewardPointsCreditCardPayment extends CreditCardPayment {
    }
}

