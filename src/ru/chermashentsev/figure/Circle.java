package ru.chermashentsev.figure;

import ru.chermashentsev.point.Point2D;

public class Circle extends Figure {

    private Point2D center;
    private float radius;

    public Circle(Point2D center, float radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус не может быть меньше нуля");
        }

        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return super.getPoint(center);
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
