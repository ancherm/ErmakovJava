package ru.chermashentsev.reflect.annotation;

import ru.chermashentsev.reflect.ReflectHumanTests;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Validate({ReflectHumanTests.class})
public @interface AValidate {}
