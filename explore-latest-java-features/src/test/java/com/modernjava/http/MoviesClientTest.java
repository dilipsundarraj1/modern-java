package com.modernjava.http;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class MoviesClientTest {

    MoviesClient moviesClient = new MoviesClient();

    @Test

    void getAllMovies() {
        var moviesList = moviesClient.getAllMovies();
        assert moviesList.size()==10;
    }

    @Test
    void getMovieById() {
        var movie = moviesClient.getMovieById();
        assertEquals("Batman Begins", movie.name());
    }
}
