package solvd.laba.ecommerceapp;

class Review {
    private int id;
    private Product product;
    private Customer customer;
    private String comment;

    public Review(int id, Product product, Customer customer, String comment) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review by " + customer.name + " for " + product.name + ": " + comment;
    }
}
