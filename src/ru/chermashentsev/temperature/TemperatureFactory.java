package ru.chermashentsev.temperature;

public class TemperatureFactory {

    public String getTemperatureTitle(int value) {
        for (Temperature t : Temperature.values()) {
            if (t.getMinTemperature() <= value && t.getMaxTemperature() > value) {
                return t.getTitle();
            }
        }
        throw new IllegalArgumentException("Такого значения температуры нет");
    }
}
