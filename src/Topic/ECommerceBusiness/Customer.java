package Topic.ECommerceBusiness;

public class Customer {
    private final int id;
    private String name;
    private String username;
    private String phoneNumber;
    private String email;

    private static int totalCustomers;


    public Customer(int id, String name, String username, String phoneNumber, String email)  {
        this.id = id;
        this.name = name;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.email = email;
        totalCustomers++;


    }

    // getters
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getId(){
        return id;
    }
    public int getTotalCustomers(){
        return totalCustomers;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }


    @Override
    public String toString() {

        return name + " " + username + " " + email + " " + phoneNumber;

    }
}
