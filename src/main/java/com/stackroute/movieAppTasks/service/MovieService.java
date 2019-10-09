package com.stackroute.movieAppTasks.service;

import com.stackroute.movieAppTasks.domain.Movie;
import com.stackroute.movieAppTasks.exception.MovieNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    public Movie saveNewMovie(Movie movie) throws MovieNotFoundException;

    public List<Movie> getAllMovie();

    public Optional<Movie> getById(int id) throws MovieNotFoundException;

    public boolean deleteById(int id) throws MovieNotFoundException;

    public Movie updateById(Movie movie, int id) throws MovieNotFoundException;

    public List<Movie> getByName(String title);

}