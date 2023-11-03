package ECommerceApp;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private Customer customer;
    private List<Product> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList();

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    // Other methods
}
