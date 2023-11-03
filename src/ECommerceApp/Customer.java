package ECommerceApp;

class Customer extends BaseEntity {
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        super(customerId);
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getInfo() {
        return "Customer: " + name;
    }

    @Override
    public double calculateCost() {
        return 0.0;
    }
}