package org.example;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> watchedMovies;

    public Viewer(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMovies = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public List<Cinema> getWatchedMovies() {
        return watchedMovies;
    }

    public int getMoviesWatched() {
        return watchedMovies.size();
    }

    public void addWatchedMovie(Cinema movie) {
        watchedMovies.add(movie);
    }
}


