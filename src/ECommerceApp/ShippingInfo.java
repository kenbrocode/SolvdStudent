package ECommerceApp;

import java.time.LocalDate;

class ShippingInfo extends BaseEntity {
    private Order order;
    private String recipientName;
    private LocalDate estimatedDeliveryDate;

    public ShippingInfo(int shippingId, Order order, String recipientName) {
        super(shippingId);
        this.order = order;
        this.recipientName = recipientName;
        this.estimatedDeliveryDate = LocalDate.now();
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @Override
    public String getInfo() {
        return "Shipping Information for Order ID " + order.getId();
    }

    @Override
    public double calculateCost() {
        return 0.0;
    }

    // Other methods
}
