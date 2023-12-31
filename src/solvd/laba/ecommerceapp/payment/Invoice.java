package solvd.laba.ecommerceapp.payment;

import solvd.laba.ecommerceapp.base.Order;

import java.time.LocalDate;

public class Invoice {
    private int id;
    private Order order;
    private double amount;
    private LocalDate issueDate;

    public Invoice(int id, Order order, double amount, LocalDate issueDate) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Invoice for Order #" + order.id + ": Amount $" + amount + " issued on " + issueDate;
    }
}