package models;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showRole() {
        System.out.println("Admin");
    }
}