package ECommerceApp;

class Payment extends BaseEntity {
    private Order order;
    private String paymentMethod;
    private double amount;

    public Payment(int paymentId, Order order, String paymentMethod, double amount) {
        super(paymentId);
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String getInfo() {
        return "Payment Information for Order ID " + order.getId();
    }

    @Override
    public double calculateCost() {
        return amount;
    }

    // Other methods
}