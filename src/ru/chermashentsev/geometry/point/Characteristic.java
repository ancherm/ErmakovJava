package ru.chermashentsev.geometry.point;

public class Characteristic {
    private final NameEnum title;
    private final Object value;

    public Characteristic(NameEnum title, Object value) {
        this.title = title;
        this.value = value;
    }

    public NameEnum getTitle() {
        return title;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
