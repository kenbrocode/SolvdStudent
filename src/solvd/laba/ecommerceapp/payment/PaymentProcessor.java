package solvd.laba.ecommerceapp.payment;

import solvd.laba.ecommerceapp.exceptions.InvalidPaymentAmountException;
import solvd.laba.ecommerceapp.payment.Payment;

interface PaymentProcessor {
    void processPayment(Payment payment) throws InvalidPaymentAmountException, InvalidPaymentAmountException;
    void refundPayment(Payment payment);
}
