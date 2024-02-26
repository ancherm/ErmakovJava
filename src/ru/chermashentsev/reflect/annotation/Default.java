package ru.chermashentsev.reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.FIELD})
public @interface Default {
    Class value();
}
