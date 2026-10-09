package models;

import java.util.ArrayList;

public class Cinema {

    private String name;
    private ArrayList<Movie> movies;

    public Cinema(String name) {
        this.name = name;
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}