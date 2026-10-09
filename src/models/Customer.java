package models;

public class Customer extends User {

    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void showRole() {
        System.out.println("Customer");
    }
}