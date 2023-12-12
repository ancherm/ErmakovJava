package ru.chermashentsev.geometry.point;

public class Point3D extends Point2D {
    private final int z;

    public Point3D(){
        this(0, 0, 0);
    }
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double length(Point2D end) {
        if (this.getClass() == end.getClass()) {
            return super.length(this);
        }
        else {
            return Math.sqrt(Math.pow(end.getX() - this.getX(), 2)
                    + Math.pow(end.getY() - this.getY(), 2)
                    + Math.pow(z, 2));
        }
    }

    public double getLength(Point3D end) {
        return Math.sqrt(Math.pow(end.getX() - this.getX(), 2)
                + Math.pow(end.getY() - this.getY(), 2)
                + Math.pow(end.getZ() - this.getZ(), 2));
    }


    @Override
    public Point3D clone(){
        try {
            return (Point3D) super.clone();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "{ " + getX() + "; " + getY() + "; " + z + " }";
    }
}
