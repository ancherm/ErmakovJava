package ru.chermashentsev.reflect.annotation;


import ru.chermashentsev.reflect.ToStringType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    ToStringType value() default ToStringType.YES;
}
