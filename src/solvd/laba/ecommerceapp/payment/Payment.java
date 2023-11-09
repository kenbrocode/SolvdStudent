package solvd.laba.ecommerceapp.payment;

import solvd.laba.ecommerceapp.base.Order;

public class Payment {
    private int id;
    Order order;
    private String paymentMethod;
    double amount;

    public Payment(int id, Order order) {
        this.id = id;
        this.order = order;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment Method: " + paymentMethod + ", Amount: $" + amount;
    }
}
