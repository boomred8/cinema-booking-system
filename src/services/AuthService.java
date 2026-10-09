package services;

import models.Customer;
import models.User;

import java.util.ArrayList;

public class AuthService {

    private ArrayList<User> users = new ArrayList<>();

    public void register(String username, String password) {

        users.add(new Customer(username, password));
        System.out.println("Registration successful!");

    }

    public User login(String username, String password) {

        for (User user : users) {

            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                return user;

            }
        }

        return null;
    }
}