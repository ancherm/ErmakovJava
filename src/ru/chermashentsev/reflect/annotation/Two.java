package ru.chermashentsev.reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target({ElementType.TYPE_USE})
public @interface Two {
    String first();
    int second();
}
