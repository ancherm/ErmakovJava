package Part1;

public class Circle extends Figure{

    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус не может быть меньше нуля");
        }

        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
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
