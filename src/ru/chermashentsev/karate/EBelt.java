package ru.chermashentsev.karate;
// EBelt == Belt
public enum EBelt {
    WHITE(5),
    YELLOW(10),
    RED(15),
    BLACK(30);

    final int power;

    EBelt(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
