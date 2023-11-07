package solvd.laba.ecommerceapp;

import java.time.LocalDate;

class Product {
    private int id;
    String name;
    double price;
    private LocalDate manufacturingDate;

    public Product(int id, String name, double price, LocalDate manufacturingDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo() {
        return "Product: " + name;
    }
}