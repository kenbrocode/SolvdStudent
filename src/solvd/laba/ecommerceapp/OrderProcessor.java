package solvd.laba.ecommerceapp;

interface OrderProcessor {
    void process(Order order);
    void updateStatus(Order order, String status);
}
