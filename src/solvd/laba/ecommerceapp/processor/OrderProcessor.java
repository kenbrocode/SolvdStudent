package solvd.laba.ecommerceapp.processor;

import solvd.laba.ecommerceapp.base.Order;
import solvd.laba.ecommerceapp.exceptions.OrderProcessingException;

interface OrderProcessor {
    void process(Order order) throws OrderProcessingException, OrderProcessingException;
    void updateStatus(Order order, String status);
}
