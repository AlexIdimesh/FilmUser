package org.example;

public class Viewer {
    private String nickname;
    private int age;
    private int moviesWatched;

    public Viewer(String nickname, int age, int moviesWatched) {
        this.nickname = nickname;
        this.age = age;
        this.moviesWatched = moviesWatched;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getMoviesWatched() {
        return moviesWatched;
    }
}

