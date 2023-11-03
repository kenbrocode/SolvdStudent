package ECommerceApp;

import java.time.LocalDate;

class Product extends BaseEntity {
    private String name;
    private double price;
    private LocalDate manufacturingDate;

    public Product(int productId, String name, double price, LocalDate manufacturingDate) {
        super(productId);
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String getInfo() {
        return "Product: " + name;
    }

    @Override
    public double calculateCost() {
        return price;
    }
}
