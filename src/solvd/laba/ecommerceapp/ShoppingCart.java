package solvd.laba.ecommerceapp;

class ShoppingCart {
    Product[] products;
    int[] quantities;
    int itemCount;

    public ShoppingCart() {
        products = new Product[10];
        quantities = new int[10];
        itemCount = 0;
    }

    public void addProduct(Product product, int quantity) {
        products[itemCount] = product;
        quantities[itemCount] = quantity;
        itemCount++;
    }
}
