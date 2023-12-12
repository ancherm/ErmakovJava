package ru.chermashentsev.generic;

public interface Reducible<T> {
    T reduce(T t1, T t2);
}
