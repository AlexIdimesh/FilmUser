package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();

        Viewer viewer1 = new Viewer("John", 25);
        viewer1.addWatchedMovie(new Cinema("Movie 1", "Action", 120));
        viewer1.addWatchedMovie(new Cinema("Movie 2", "Comedy", 90));
        viewers.add(viewer1);

        Viewer viewer2 = new Viewer("Alice", 30);
        viewer2.addWatchedMovie(new Cinema("Movie 3", "Drama", 150));
        viewer2.addWatchedMovie(new Cinema("Movie 4", "Sci-Fi", 110));
        viewer2.addWatchedMovie(new Cinema("Movie 5", "Fantasy", 100));
        viewers.add(viewer2);

        ViewerStatistics statistics = new ViewerStatistics();
        double averageAge = statistics.averageAge(viewers);

        System.out.println("Average age of viewers: " + averageAge);

        for (Viewer viewer : viewers) {
            System.out.println(viewer.getNickname() + " watched " + viewer.getMoviesWatched() + " movies:");
            for (Cinema movie : viewer.getWatchedMovies()) {
                System.out.println("* " + movie.getTitle() + " (" + movie.getGenre() + ", " + movie.getDuration() + " mins)");
            }
            System.out.println();
        }
    }
}



