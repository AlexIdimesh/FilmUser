package org.example;

import java.awt.*;
import java.util.List;

public class ViewerStatistics {
    public double averageAge(List<Viewer> list) {
        int totalAge = 0;
        int count = 0;

        for (Viewer viewer : list) {
            totalAge += viewer.getAge();
            count++;
        }

        if (count == 0) {
            return 0.0;
        } else {
            return (double) totalAge / count;
        }
    }
}

