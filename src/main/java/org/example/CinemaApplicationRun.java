package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();

        viewers.add(new Viewer("John", 25, 10));
        viewers.add(new Viewer("Alice", 30, 5));
        viewers.add(new Viewer("Bob", 20, 8));
        viewers.add(new Viewer("Eve", 35, 3));
        viewers.add(new Viewer("Frank", 28, 12));

        ViewerStatistics statistics = new ViewerStatistics();
        double averageAge = statistics.averageAge(viewers);

        System.out.println("Average age of viewers: " + averageAge);
    }
}

