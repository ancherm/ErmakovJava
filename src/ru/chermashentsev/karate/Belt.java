package ru.chermashentsev.karate;

import java.util.ArrayList;
import java.util.List;

public class Belt implements Comparable<Belt>{
    public static final Belt WHITE = new Belt("Белый", 0);
    public static final Belt YELLOW = new Belt("Желтый", 1);
    public static final Belt RED = new Belt("Красный", 2);
    public static final Belt BLACK = new Belt("Черный", 3);

    private String color;
    private int rating;
    private static List<Belt> belts = new ArrayList<>();


    private Belt(String color, int rating) {
        this.color = color;
        this.rating = rating;
        belts.add(this);
    }

    public static List<Belt> getBelts() {
        return new ArrayList<>(belts);
    }

    public static Belt of(String color) {
        for (Belt belt : belts) {
            if (belt.color.equals(color)) return belt;
        }
        throw new RuntimeException();
    }

    @Override
    public int compareTo(Belt o) {
        return this.rating - o.rating;
    }
}
