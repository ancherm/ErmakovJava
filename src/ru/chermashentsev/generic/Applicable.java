package ru.chermashentsev.generic;

public interface Applicable<T, P> {
    P apply(T value);
}
