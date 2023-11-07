package ecommerceapp;

interface OrderService {
    void placeOrder(Customer customer, ShoppingCart shoppingCart);
    void cancelOrder(Order order);
}