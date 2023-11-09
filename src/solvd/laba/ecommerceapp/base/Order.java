package solvd.laba.ecommerceapp.base;


import solvd.laba.ecommerceapp.exceptions.OrderProcessingException;

public class Order {
    public int id;
    private ShoppingCart shoppingCart;
    private ShippingInfo shippingInfo;

    public Order(int id) {
        this.id = id;
        this.shoppingCart = new ShoppingCart();
        this.shippingInfo = new ShippingInfo();
    }

    public void processOrder() throws OrderProcessingException {
        // Simulate order processing, e.g., updating inventory, generating invoices, etc.
        if (id == 2) {
            throw new OrderProcessingException("Failed to process order " + id);
        }
        System.out.println("Processing Order #" + id);
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < shoppingCart.itemCount; i++) {
            totalAmount += shoppingCart.products[i].price * shoppingCart.quantities[i];
        }
        return totalAmount;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }
}