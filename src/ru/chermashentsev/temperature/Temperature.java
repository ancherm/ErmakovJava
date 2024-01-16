package ru.chermashentsev.temperature;

public enum Temperature {
    COLD("Холодно", -50, 10),
    NORMAL("Нормально", 10, 25),
    HOT("Горячо", 25, 60);

    private final String title;
    private final int minTemperature;
    private final int maxTemperature;

    Temperature(String title, int minTemperature, int maxTemperature) {
        this.title = title;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    String getTitle() {
        return title;
    }

    int getMinTemperature() {
        return minTemperature;
    }

    int getMaxTemperature() {
        return maxTemperature;
    }
}
//TODO
//1. В фабрике брать инт температуру