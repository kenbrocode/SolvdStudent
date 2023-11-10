package solvd.laba.ecommerceapp.base;


import solvd.laba.ecommerceapp.exceptions.InvalidPaymentAmountException;
import solvd.laba.ecommerceapp.exceptions.OrderProcessingException;
import solvd.laba.ecommerceapp.payment.CreditCardPaymentProcessor;
import solvd.laba.ecommerceapp.payment.Invoice;
import solvd.laba.ecommerceapp.payment.Payment;
import solvd.laba.ecommerceapp.processor.FastOrderProcessor;
import solvd.laba.ecommerceapp.review.Review;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.time.LocalDate;

public class ECommerceApp {
    private static final Logger LOGGER = Logger.getLogger(ECommerceApp.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Starting ECommerceApp");
        Customer customer1 = new Customer(1, "John", "john@example.com");
        Customer customer2 = new Customer(2, "Alice", "alice@example.com");

        Product product1 = new Product(1, "Smartphone", 499.99, LocalDate.of(2023, 1, 15));
        Product product2 = new Product(2, "Laptop", 899.99, LocalDate.of(2023, 1, 10));

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(product1, 2);

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addProduct(product2, 1);

        Order order1 = new Order(1);
        order1.getShoppingCart().addProduct(product1, 2);
        order1.getShoppingCart().addProduct(product2, 1);

        Order order2 = new Order(2);
        order2.getShoppingCart().addProduct(product1, 3);

        FastOrderProcessor orderProcessor = new FastOrderProcessor();
        try {
            orderProcessor.process(order1);
            orderProcessor.process(order2);
        } catch (OrderProcessingException e) {
            LOGGER.log(Level.SEVERE,"Order processing failed: " + e.getMessage());
        }

        LOGGER.info("Total amount for order 1: $" + order1.getTotalAmount());
        LOGGER.info("Total amount for order 2: $" + order2.getTotalAmount());

        Payment payment1 = new Payment(1, order1);
        payment1.setPaymentMethod("Credit Card");
        payment1.setAmount(order1.getTotalAmount());

        Payment payment2 = new Payment(2, order2);
        payment2.setPaymentMethod("PayPal");
        payment2.setAmount(order2.getTotalAmount());

        CreditCardPaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        try {
            paymentProcessor.processPayment(payment1);
            paymentProcessor.processPayment(payment2);
        } catch (InvalidPaymentAmountException e) {
            LOGGER.log(Level.SEVERE,"Payment processing failed: " + e.getMessage());
        }

        LOGGER.info("Payment 1 details: " + payment1);
        LOGGER.info("Payment 2 details: " + payment2);

        Review review1 = new Review(1, product1, customer1, "Great product!");
        Review review2 = new Review(2, product2, customer2, "Excellent laptop!");

        LOGGER.info("Review 1: " + review1);
        LOGGER.info("Review 2: " + review2);

        Invoice invoice1 = new Invoice(1, order1, order1.getTotalAmount(), LocalDate.now());
        Invoice invoice2 = new Invoice(2, order2, order2.getTotalAmount(), LocalDate.now());

        LOGGER.info("Invoice 1: " + invoice1);
        LOGGER.info("Invoice 2: " + invoice2);
    }
}
