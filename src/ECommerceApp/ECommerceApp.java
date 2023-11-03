package ECommerceApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate objects
        Customer customer1 = new Customer(1, "Alice", "alice@example.com");
        ShoppingCart cart1 = new ShoppingCart(customer1);
        Product product1 = new Product(1, "Laptop", 799.99, LocalDate.of(2023, 12, 31));
        Product product2 = new Product(2, "T-Shirt", 19.99, LocalDate.of(2024, 12, 31));
        Order order1 = new Order(1, customer1);
        Category category1 = new Category(1, "Electronics");
        Promotion promotion1 = new Promotion(1, "Discount", "SAVE10", 10);
        ShippingInfo shippingInfo1 = new ShippingInfo(1, order1, "Alice Johnson");
        Payment payment1 = new Payment(1, order1, "Credit Card", 99.99);

        // Add products to the shopping cart
        cart1.addProduct(product1, 2);
        cart1.addProduct(product2, 3);

        // Process the order
        order1.processOrder(cart1);

        // Display order details
        System.out.println(order1);

        // Use a promotion
        double discountedAmount = promotion1.applyDiscount(order1.getTotalAmount());
        System.out.println("Discounted Amount: $" + discountedAmount);

        // Set estimated delivery date for shipping info
        LocalDate estimatedDelivery = LocalDate.now().plusDays(5);
        shippingInfo1.setEstimatedDeliveryDate(estimatedDelivery);

        // Display shipping information
        System.out.println(shippingInfo1);

        // Display payment information
        System.out.println(payment1);

        scanner.close();
    }
}
