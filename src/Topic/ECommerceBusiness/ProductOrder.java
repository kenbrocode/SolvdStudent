package Topic.ECommerceBusiness;

public class ProductOrder {
    private int id;
    private String name;
    private Customer[] items;

    private static int quantity;
    public ProductOrder(int id, String name, int quantitycount){
        this.id = id;
        this.name = name;
        this.items = new Customer[quantitycount];
        this.quantity = quantitycount;
    }

    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Customer[] getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean bookOrder(Customer customer) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = customer;
                quantity--;
                return true;
            }
        }
        return false;
    }

    public boolean availableQuantity() {
        for (Customer seat : items) {
            if (seat == null) {
                return true;
            }
        }
        return false;
    }
}
