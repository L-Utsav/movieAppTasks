package com.stackroute.movieAppTasks.bootstrap;

import com.stackroute.movieAppTasks.domain.Movie;
import com.stackroute.movieAppTasks.repository.MovieRepository;
import io.swagger.annotations.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import static com.stackroute.movieAppTasks.domain.Movie.*;


@Component
public class bootsTrapDB implements ApplicationListener<ContextRefreshedEvent> {
    private MovieRepository movieRepository;
    @Autowired
    public bootsTrapDB(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        builder().title("Alice").release_date("2018-20-09").id(20).overview("thriller").build();
        Movie movie1 = new Movie(10,"Godfather","2003-12-09","The godfather",2000);
        movieRepository.save(movie1);
    }

}