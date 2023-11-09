package solvd.laba.ecommerceapp.processor;

import solvd.laba.ecommerceapp.base.Order;
import solvd.laba.ecommerceapp.exceptions.OrderProcessingException;

import java.time.LocalDate;

public class FastOrderProcessor implements OrderProcessor {
    @Override
    public void process(Order order) throws OrderProcessingException {
        // Simulate order processing logic
        order.processOrder();
        updateStatus(order, "Shipped");
    }

    @Override
    public void updateStatus(Order order, String status) {
        order.getShippingInfo().setEstimatedDeliveryDate(LocalDate.now().plusDays(5));
    }
}