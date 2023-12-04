package ru.chermashentsev.geometry.line;

import ru.chermashentsev.geometry.point.Point2D;

import java.util.Objects;

// 1.2.1 Прямая
public class Line<T extends Point2D> implements Lengthable, BrokenLineAble {
    private T start;
    private T end;


    public Line(T start, T end) {
        if (start == null || end == null) throw new IllegalArgumentException("start или end равен null");
        this.start = start;
        this.end = end;
    }

    public T getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setStart(T start) {
        isNotNull(start);
        this.start = start;
    }

    public void setEnd(T end) {
        isNotNull(end);
        this.end = end;
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(start, end);
    }

    private void isNotNull(T point) {
        if (point == null) throw new IllegalArgumentException("point равен null");
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2)
                + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return start.equals(line.start) && end.equals(line.end);
    }


    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Line(start, end);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

}
