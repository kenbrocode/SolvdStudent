package ecommerceapp;

class FastOrderProcessor implements OrderProcessor {
    @Override
    public void process(Order order) {
        // Process the order quickly
        updateStatus(order, "Shipped");
    }

    @Override
    public void updateStatus(Order order, String status) {
        order.getShippingInfo().updateStatus(status);
    }
}