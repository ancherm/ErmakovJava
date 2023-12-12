package ru.chermashentsev.geometry.line;

import ru.chermashentsev.geometry.point.Point2D;

import java.util.Objects;

// 1.2.1 Прямая
public class Line<T extends Point2D> implements Lengthable, BrokenLineAble, Cloneable {
    private T start;
    private T end;


    public Line(T start, T end) throws CloneNotSupportedException {
        if (start == null || end == null) throw new IllegalArgumentException("start или end равен null");
        setStart(start);
        setEnd(end);
    }

    public static Line<Point2D> create(int x1, int y1, int x2, int y2) throws CloneNotSupportedException {
        return new Line<>(new Point2D(x1, y1), new Point2D(x2, y2));
    }

    public T getStart() {
        return start;
    }

    public T getEnd() {
        return end;
    }

    public void setStart(T start) throws CloneNotSupportedException {
        isNotNull(start);
        this.start = (T) start.clone();
//        try {
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    public void setEnd(T end){
        isNotNull(end);
        try {
            this.end = (T) end.clone();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        return start.length(end);
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
        return super.clone();
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

}
