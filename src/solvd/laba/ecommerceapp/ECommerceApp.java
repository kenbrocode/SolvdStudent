package solvd.laba.ecommerceapp;

import java.time.LocalDate;

public class ECommerceApp {
    public static void main(String[] args) {
        // Instantiate objects
        Customer customer1 = new Customer(1, "Alice", "alice@example.com");
        Product product1 = new Product(1, "Laptop", 799.99, LocalDate.of(2023, 12, 31));
        Product product2 = new Product(2, "T-Shirt", 19.99, LocalDate.of(2024, 12, 31));
        Order order1 = new Order(1);

        // Add products to the shopping cart
        order1.getShoppingCart().addProduct(product1, 2);
        order1.getShoppingCart().addProduct(product2, 3);

        // Process the order
        order1.processOrder();

        // Display order details
        System.out.println(order1);

        // Use a promotion
        double discountedAmount = Promotion.applyDiscount(order1.getTotalAmount(), 10);
        System.out.println("Discounted Amount: $" + discountedAmount);

        // Set estimated delivery date for shipping info
        LocalDate estimatedDelivery = LocalDate.now().plusDays(5);
        order1.getShippingInfo().setEstimatedDeliveryDate(estimatedDelivery);

        // Display shipping information
        System.out.println(order1.getShippingInfo());

        // Display payment information
        Payment payment1 = new Payment(1, order1);
        payment1.setPaymentMethod("Credit Card");
        payment1.setAmount(order1.getTotalAmount());
        System.out.println(payment1);

        // Additional classes
        Review review1 = new Review(1, product1, customer1, "Great laptop!");
        System.out.println(review1);

        Invoice invoice1 = new Invoice(1, order1, payment1.getAmount(), LocalDate.now());
        System.out.println(invoice1);

        // Interfaces and Polymorphism
        OrderProcessor orderProcessor = new FastOrderProcessor();
        orderProcessor.process(order1);

        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        paymentProcessor.processPayment(payment1);

        // Final Class
        final class Constants {
            public static final int MAX_ORDER_QUANTITY = 10;
        }

        System.out.println("Maximum Order Quantity: " + Constants.MAX_ORDER_QUANTITY);

        // Static Block, Method, and Variable
        System.out.println("Static Variable: " + StaticExample.staticVariable);
        StaticExample.staticMethod();
    }
}
