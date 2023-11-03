package Topic;

import Topic.ECommerceBusiness.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Customer customer1 = new Customer(111,"Kevin", "kevinman", "4246667777", "kevinazoid@gmail.com");
        Customer customer2 = new Customer(112,"Kyle", "kyleman", "6665554343", "kylozavr@gmail.com");
        Customer[] customers = {customer1, customer2};

        Location location1 = new Location("street","city","country");
        Reviews productReview = new Reviews("firstReview", "it is a cool review");
        Reviews[] productReviews = {productReview};
        Product product = new Product("product",customers,location1, productReviews);

        Reviews[] listingReviews = new Reviews[2];
        listingReviews[0] = new Reviews("listing1 reviewed", "review is review");
        listingReviews[1] = new Reviews("listing1 cool", "reviewed2");

        Seller seller1 = new Seller(1,"Seller1");
        Seller seller2 = new Seller(2, "Seller2");

        Seller[] sellerPosition = new Seller[2];
        sellerPosition[0] = seller1;
        sellerPosition[1] = seller2;






        Location location = new Location("testStreet", "testCity", "testCountry");
        Location location2 = new Location("testStreet2", "testCity2", "testCountry2");



        ProductOrder Laptop = new ProductOrder(1,"laptop",100);
        ProductOrder TV = new ProductOrder(2,"tv", 4);


        DeliveryDestination destination1 = new DeliveryDestination(1,location, Laptop);
        DeliveryDestination destination2 = new DeliveryDestination(2, location2,TV);

        ReturnPolicy returnPolicy = new ReturnPolicy(1, LocalDate.of(2023,11,30), LocalDate.of(2023, 12,10));




        Listing listing1 = new Listing("shipperTester1", location, null, sellerPosition);
        Listing listing2 = new Listing("shipperTester2", location2, listingReviews, sellerPosition);

        PlaceOrder placeOrder1 = new PlaceOrder(customer1, seller1, destination1, LocalDate.of(2023, 11,20), null);
        PlaceOrder placeOrder2 = new PlaceOrder(customer1, seller2, destination2, LocalDate.of(2023, 11,20), returnPolicy);




        System.out.println(placeOrder1);
        System.out.println(placeOrder1);


        if (placeOrder1.orderPlace(customer1)) {
            System.out.println("Order placed by: " + customer1.getName());

        } else {
            System.out.println("Out of stock: order could not be placed for" + customer1.getName());
        }







        //seller1 location shipper1 MeanofTransport, destination1, customer1, placeOrder, insurance, product, reviews




    }
}
