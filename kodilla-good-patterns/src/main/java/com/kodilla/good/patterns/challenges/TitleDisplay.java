package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Optional;

public class TitleDisplay {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .map(t -> t + " ! ")
                .forEach(System.out::print);
    }
}
