package models;

public class Ticket {

    private Movie movie;
    private Hall hall;
    private Seat seat;
    private double price;

    public Ticket(Movie movie, Hall hall, Seat seat, double price) {
        this.movie = movie;
        this.hall = hall;
        this.seat = seat;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        return price;
    }

    public void showInfo() {

        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Hall: " + hall.getNumber());
        System.out.println("Seat: " + seat.getSeatNumber());
        System.out.println("Price: " + price);

    }
}