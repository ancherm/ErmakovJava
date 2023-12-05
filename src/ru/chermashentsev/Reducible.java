package ru.chermashentsev;

public interface Reducible<T> {
    T reduce(T t1, T t2);
}
