package ru.chermashentsev.geometry.point;

import java.util.Objects;

// 1.1.1 Точка координат
public class Point2D extends Point implements Cloneable{
    protected final int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double length(Point2D end) {
        return Math.sqrt(Math.pow(end.getX() - this.getX(), 2)
                + Math.pow(end.getY() - this.getY(), 2));
    }

    @Override
    public Point2D clone(){

        try {
            return (Point2D) super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point2D point2D = (Point2D) o;

        return y == point2D.y && getX() == point2D.getX();
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }

    @Override
    public String toString() {
        return "{ " + getX() + "; " + y + " }";
    }
}
