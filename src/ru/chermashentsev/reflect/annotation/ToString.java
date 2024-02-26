package ru.chermashentsev.reflect.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE_USE})
public @interface ToString {
    boolean value() default true;
}
