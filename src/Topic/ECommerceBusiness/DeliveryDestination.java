package Topic.ECommerceBusiness;

public class DeliveryDestination {

    private int id;

    private Location location;
    private ProductOrder order;

    public DeliveryDestination(int id, Location location, ProductOrder order)
    {
        this.id = id;
        this.location = location;
        this.order = order;
    }

    public int getId() {
        return id;
    }


    public ProductOrder getOrder() {
        return order;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setOrder(ProductOrder order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return id + " " + location.toString() + " " + order.getName();
    }

}
