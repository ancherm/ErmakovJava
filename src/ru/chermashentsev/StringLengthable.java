package ru.chermashentsev;

import ru.chermashentsev.geometry.line.Lengthable;

public class StringLengthable implements Lengthable {
    private final String s;

    public StringLengthable(String s) {
        this.s = s;
    }

    @Override
    public double length() throws CloneNotSupportedException {
        return s.length();
    }
}
