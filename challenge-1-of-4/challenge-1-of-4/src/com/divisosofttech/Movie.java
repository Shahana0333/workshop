package com.divisosofttech ;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Movie {
    public static ToDoubleFunction getRating;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating; // rating out of 10
    private int duration; // duration in minutes

    public Movie(String title, String genre, int releaseYear, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", duration=" + duration +
                '}';
    }

    public static List<Movie> getMovies() {
        return Arrays.asList(
            new Movie("The Shawshank Redemption", "Drama", 1994, 9.3, 142),
            new Movie("The Godfather", "Crime", 1972, 9.2, 175),
            new Movie("The Dark Knight", "Action", 2008, 9.0, 152),
            new Movie("Pulp Fiction", "Crime", 1994, 8.9, 154),
            new Movie("The Lord of the Rings: The Return of the King", "Fantasy", 2003, 8.9, 201),
            new Movie("Schindler's List", "Drama", 1993, 8.9, 195),
            new Movie("Fight Club", "Drama", 1999, 8.8, 139),
            new Movie("Forrest Gump", "Drama", 1994, 8.8, 142),
            new Movie("Inception", "Sci-Fi", 2010, 8.8, 148),
            new Movie("The Matrix", "Sci-Fi", 1999, 8.7, 136),
            new Movie("The Silence of the Lambs", "Thriller", 1991, 8.6, 118),
            new Movie("Se7en", "Thriller", 1995, 8.6, 127),
            new Movie("The Usual Suspects", "Crime", 1995, 8.5, 106),
            new Movie("Interstellar", "Sci-Fi", 2014, 8.6, 169),
            new Movie("Gladiator", "Action", 2000, 8.5, 155),
            new Movie("Whiplash", "Drama", 2014, 8.5, 106),
            new Movie("The Prestige", "Drama", 2006, 8.5, 130),
            new Movie("The Departed", "Crime", 2006, 8.5, 151),
            new Movie("The Wolf of Wall Street", "Drama", 2013, 8.2, 180),
            new Movie("Django Unchained", "Western", 2012, 8.4, 165),
            new Movie("Mad Max: Fury Road", "Action", 2015, 8.1, 120),
            new Movie("The Revenant", "Adventure", 2015, 8.0, 156),
            new Movie("The Lion King", "Animation", 1994, 8.5, 88),
            new Movie("Spider-Man: Into the Spider-Verse", "Animation", 2018, 8.4, 117),
            new Movie("Joker", "Drama", 2019, 8.4, 122),
            new Movie("Avengers: Endgame", "Action", 2019, 8.4, 181),
            new Movie("Parasite", "Thriller", 2019, 8.6, 132),
            new Movie("Shutter Island", "Thriller", 2010, 8.2, 138),
            new Movie("The Social Network", "Biography", 2010, 7.7, 120),
            new Movie("The Irishman", "Crime", 2019, 7.8, 209)
        );
    }
}
