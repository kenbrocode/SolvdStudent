package ECommerceApp;

import java.time.LocalDate;

class Order extends BaseEntity {
    private Customer customer;
    private boolean isProcessed;
    private double totalAmount;

    public Order(int orderId, Customer customer) {
        super(orderId);
        this.customer = customer;
        this.isProcessed = false;
    }

    public void processOrder(ShoppingCart cart) {
        if (!isProcessed) {
            double orderTotal = calculateOrderTotal(cart);
            setTotalAmount(applyShippingCost(orderTotal));
            isProcessed = true;
        }
    }

    private double calculateOrderTotal(ShoppingCart cart) {
        double orderTotal = 0.0;
        for (int i = 0; i < cart.getProducts().size(); i++) {
            Product product = cart.getProducts().get(i);
            int quantity = cart.getQuantities().get(i);
            orderTotal += product.getPrice() * quantity;
        }
        return orderTotal;
    }

    private double applyShippingCost(double orderTotal) {
        // Apply shipping cost based on the order total, shipping address, or other factors.
        // For simplicity, let's assume a flat shipping fee of $10.
        return orderTotal + 10.0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Implementation of the abstract method getInfo()
    @Override
    public String getInfo() {
        return "Order ID: " + getId();
    }

    @Override
    public double calculateCost() {
        return 0;
    }

    public LocalDate getOrderDate() {
        // Return the order date
        return LocalDate.now(); // You can return the actual order date here
    }

    // Other methods
}