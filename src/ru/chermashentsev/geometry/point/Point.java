package ru.chermashentsev.geometry.point;

public class Point {
    private final int x;

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return x + "";
    }
}
