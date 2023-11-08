package ru.chermashentsev.line;

import ru.chermashentsev.point.Point2D;

// 1.2.1 Прямая
public class Line implements Lengthable, BrokenLineAble {
    private Point2D start;
    private Point2D end;


    public Line(Point2D start, Point2D end) {
        this(start.getX(), start.getY(), end.getX(), end.getY());
    }


    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public Point2D getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setStart(Point2D start) {
        this.start = new Point2D(start.getX(), start.getY());
    }

    public void setEnd(Point2D end) {
        this.end = new Point2D(end.getX(), end.getY());
    }


    @Override
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(start, end);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

}
