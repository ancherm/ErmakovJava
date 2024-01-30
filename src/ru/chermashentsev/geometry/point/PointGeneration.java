package ru.chermashentsev.geometry.point;

public final class PointGeneration {

    private PointGeneration() {}

    public static Point2D create(int x, int y) {
        return new Point2D(x, y);
    }

    public static Point3D create(int x, int y, int z) {
        return new Point3D(x, y, z);
    }

}
