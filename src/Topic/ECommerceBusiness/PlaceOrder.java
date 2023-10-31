
package Topic.ECommerceBusiness;

import java.time.LocalDate;

public class PlaceOrder {

    private Customer customer;
    private Seller seller;
    private DeliveryDestination destination;
    private LocalDate localDate;

    private ReturnPolicy returnPolicy;
    public PlaceOrder(Customer customer, Seller seller, DeliveryDestination destination, LocalDate localDate, ReturnPolicy returnPolicy) throws Exception {

        if(isValid(localDate))
        {
            this.customer = customer;
            this.seller = seller;
            this.destination = destination;
            this.localDate = localDate;
            if(returnPolicy != null){
                this.returnPolicy = returnPolicy;
            }
            else
            {
                this.returnPolicy = null;
            }
        }
        else
        {
            throw new Exception("Wrong date!");
        }
    }

    @Override
    public String toString() {
        return "Customer: " + customer.toString() + "\nSeller: " + seller.toString() + " " + "\nDelivery Address: " + destination.toString() + "\nPurchase date: " + localDate;
    }

    public boolean isValid(LocalDate localDate){
        return LocalDate.now().isBefore(localDate);
    }

    public boolean orderPlace(Customer customer) {
        if (destination.getOrder().availableQuantity()) {
            return destination.getOrder().bookOrder(customer);
        }
        return false;
    }

}
