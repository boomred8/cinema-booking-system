package services;

import exceptions.CustomException;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingService {

    private Scanner scanner = new Scanner(System.in);

    private AuthService authService = new AuthService();

    private Cinema cinema = new Cinema("Mega Cinema");

    private ArrayList<Booking> history = new ArrayList<>();

    public BookingService() {

        cinema.addMovie(new Movie("Avatar"));
        cinema.addMovie(new Movie("Batman"));
        cinema.addMovie(new Movie("Interstellar"));

    }

    public void start() {

        System.out.println("=== CINEMA BOOKING SYSTEM ===");

        System.out.print("Register login: ");
        String username = scanner.nextLine();

        System.out.print("Register password: ");
        String password = scanner.nextLine();

        authService.register(username, password);

        System.out.println("\nLogin");

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Password: ");
        String pass = scanner.nextLine();

        User user = authService.login(login, pass);

        if (user == null) {
            System.out.println("Wrong login or password!");
            return;
        }

        System.out.println("Authorization successful!");

        menu();
    }

    private void menu() {

        int choice;

        do {

            System.out.println("\n1. Show movies");
            System.out.println("2. Book ticket");
            System.out.println("3. My bookings");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showMovies();
                    break;

                case 2:

                    try {
                        bookTicket();
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:
                    showHistory();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Wrong choice");

            }

        } while (choice != 4);
    }

    private void showMovies() {

        System.out.println("Movies:");

        for (int i = 0; i < cinema.getMovies().size(); i++) {

            System.out.println(
                    (i + 1) + ". " +
                    cinema.getMovies().get(i).getTitle()
            );

        }
    }

    private void bookTicket() throws CustomException {

        showMovies();

        System.out.print("Choose movie: ");
        int movieIndex = scanner.nextInt();

        if (movieIndex < 1 ||
                movieIndex > cinema.getMovies().size()) {

            throw new CustomException("Movie not found");

        }

        Movie movie = cinema.getMovies().get(movieIndex - 1);

        Hall hall = new Hall(1);

        System.out.print("Choose seat: ");
        int seatNumber = scanner.nextInt();

        if (seatNumber <= 0) {

            throw new CustomException("Invalid seat");

        }

        Seat seat = new Seat(seatNumber);

        Ticket ticket = new Ticket(
                movie,
                hall,
                seat,
                3000
        );

        Booking booking = new Booking(ticket);

        Payment payment = new Payment();

        payment.pay(ticket.getPrice());

        history.add(booking);

        System.out.println("Ticket booked successfully!");
    }

    private void showHistory() {

        if (history.isEmpty()) {

            System.out.println("No bookings");
            return;

        }

        for (Booking booking : history) {

            booking.getTicket().showInfo();
            System.out.println("----------------");

        }
    }
}