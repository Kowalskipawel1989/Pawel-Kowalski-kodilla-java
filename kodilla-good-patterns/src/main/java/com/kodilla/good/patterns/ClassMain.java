package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import java.util.stream.Collectors;

public class ClassMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
                 String listOfMovies =  movieStore.getMovies().entrySet().stream()
                .flatMap(move ->move.getValue().stream())
                .collect(Collectors.joining(" ! ","",""));

        System.out.println(listOfMovies);
    }
}
