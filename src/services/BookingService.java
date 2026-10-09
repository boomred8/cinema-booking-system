package services;

import exceptions.CustomException;
import models.*;

import java.util.ArrayList;
imp*rt java.util.Scanner;

public clas* BookingService {

    private Sca*ner scanner = new Scanner(System.i*);

    private AuthService authSe*vice = new AuthService();

    pri*ate Cinema cinema = new Cinema("Me*a Cinema");

    private ArrayList*Booking> history = new ArrayList<>*);

    public BookingService() {
*        cinema.addMovie(new Movie(*Avatar"));
        cinema.addMovie*new Movie("Batman"));
        cine*a.addMovie(new Movie("Interstellar*));

    }

    public void start(* {

        System.out.println("==* CINEMA BOOKING SYSTEM ===");

   *    System.out.print("Register log*n: ");
        String username = s*anner.nextLine();

        System.*ut.print("Register password: ");
 *      String password = scanner.ne*tLine();

        authService.regi*ter(username, password);

        *ystem.out.println("\nLogin");

   *    System.out.print("Login: ");
 *      String login = scanner.nextL*ne();

        System.out.print("P*ssword: ");
        String pass = *canner.nextLine();

        User u*er = authService.login(login, pass*;

        if (user == null) {
   *        System.out.println("Wrong *ogin or password!");
            r*turn;
        }

        System.ou*.println("Authorization successful*");

        menu();
    }

    pr*vate void menu() {

        int ch*ice;

        do {

            Sy*tem.out.println("\n1. Show movies"*;
            System.out.println("*. Book ticket");
            Syste*.out.println("3. My bookings");
  *         System.out.println("4. Ex*t");

            choice = scanner*nextInt();

            switch (ch*ice) {

                case 1:
  *                 showMovies();
   *                break;

          *     case 2:

                    *ry {
                        bookT*cket();
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