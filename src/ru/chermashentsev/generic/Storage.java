package ru.chermashentsev.generic;

public class Storage<T> {
    private final T object;

    private Storage(T object) {
        this.object = object;
    }



    public static<U> Storage<U> create(U object) {
        return new Storage<>(object);
    }

    public static<U> Storage<U> createWithoutNull(U object) {
        if (object == null) {
            throw new IllegalArgumentException("Нельзя создать Storage со значением null");
        }
        return new Storage<>(object);
    }

    public T getObject() {
        return object;
    }

    public T getObject(T defaultValue) {
        if (object == null) return defaultValue;
        return object;
    }
}
