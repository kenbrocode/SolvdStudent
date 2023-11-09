package solvd.laba.ecommerceapp.payment;


import solvd.laba.ecommerceapp.exceptions.InvalidPaymentAmountException;
import solvd.laba.ecommerceapp.payment.Payment;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Payment payment) throws InvalidPaymentAmountException {
        if (payment.amount <= 0) {
            throw new InvalidPaymentAmountException("Invalid payment amount for Order #" + payment.order.id);
        }
        // Simulate processing payment via credit card
        System.out.println("Processing payment via credit card for Order #" + payment.order.id);
    }

    @Override
    public void refundPayment(Payment payment) {
        // Simulate refunding payment via credit card
        System.out.println("Refunding payment via credit card for Order #" + payment.order.id);
    }
}