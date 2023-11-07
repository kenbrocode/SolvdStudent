package solvd.laba.ecommerceapp;

interface PaymentProcessor {
    void processPayment(Payment payment);
    void refundPayment(Payment payment);
}