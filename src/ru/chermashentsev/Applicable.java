package ru.chermashentsev;

public interface Applicable<T, P> {
    P apply(T value);
}
