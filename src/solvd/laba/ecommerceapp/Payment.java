package solvd.laba.ecommerceapp;

class Payment {
    private int id;
    private Order order;
    private String paymentMethod;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;

    public Payment(int id, Order order) {
        this.id = id;
        this.order = order;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }



    @Override
    public String toString() {
        return "Payment Method: " + paymentMethod + ", Amount: $" + amount;
    }
}