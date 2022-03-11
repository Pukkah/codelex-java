package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public static void main(String[] args) {

        Movie[] movies = new Movie[4];
        movies[0] = new Movie("Casino Royale", "Eon Productions", "PG13");
        movies[1] = new Movie("Glass", "Buena Vista International", "PG13");
        movies[2] = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        // adding movie w/o rating
        movies[3] = new Movie("Blizzard of Souls", "Kultfilma");

        System.out.println(Arrays.toString(movies));

        // filtering out PG rated movies
        Movie[] moviesPG = Movie.getPG(movies);
        System.out.println(Arrays.toString(moviesPG));

    }

    public static Movie[] getPG(Movie[] movies) {
        return Arrays.stream(movies).filter(movie -> movie.rating.equals("PG")).toArray(Movie[]::new);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" %s (%s)", title, studio, rating);
    }

}
