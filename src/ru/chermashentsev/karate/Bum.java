package ru.chermashentsev.karate;

public class Bum {
    private static final Bum bum = new Bum();

    private Bum() {}
    public static Bum create() {
        return bum;
    }
}
