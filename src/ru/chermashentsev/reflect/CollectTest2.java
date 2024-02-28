package ru.chermashentsev.reflect;

import ru.chermashentsev.reflect.annotation.Invoke;

public class CollectTest2 {

    @Invoke
    private String m1_2() {
        return "Hello";
    }
}
