package ru.chermashentsev.geometry.line;

import ru.chermashentsev.geometry.point.Point2D;

import java.util.Objects;

// 1.2.1 Прямая
public class Line implements Lengthable, BrokenLineAble {
    private Point2D start;
    private Point2D end;


    public Line(Point2D start, Point2D end) {
        if (start == null || end == null) throw new IllegalArgumentException("start или end равен null");
        this.start = start;
        this.end = end;
    }


    public Line(int x1, int y1, int x2, int y2) {
        this(new Point2D(x1, y1), new Point2D(x2, y2));
    }

    public Point2D getStart() {
        return new Point2D(start.getX(), start.getY()) ;
    }

    public Point2D getEnd() {
        return new Point2D(end.getX(), end.getY());
    }

    public void setStart(Point2D start) {
        if (isNotNull(start))  this.start = new Point2D(start.getX(), start.getY());
    }

    public void setEnd(Point2D end) {
        if (isNotNull(end))  this.end = new Point2D(end.getX(), end.getY());
    }

    private boolean isNotNull(Point2D point) {
        if (point == null) throw new IllegalArgumentException("point равен null");
        return true;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2)
                + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(start, end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;
//        if (this.start == null || this.end == null
//                || line.start == null || line.end == null) return false;

        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

}
