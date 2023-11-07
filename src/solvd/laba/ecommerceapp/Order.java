package solvd.laba.ecommerceapp;

class Order {
    int id;
    private ShoppingCart shoppingCart;
    private ShippingInfo shippingInfo;

    public Order(int id) {
        this.id = id;
        this.shoppingCart = new ShoppingCart();
        this.shippingInfo = new ShippingInfo();
    }

    public void processOrder() {
        // Order processing logic
    }

    public double getTotalAmount() {
        // Calculate the total order amount
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
