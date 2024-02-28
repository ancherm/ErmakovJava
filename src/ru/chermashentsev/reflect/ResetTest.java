package ru.chermashentsev.reflect;

import ru.chermashentsev.reflect.annotation.Default;

import java.util.Optional;
@Default(Class.class)
public class ResetTest {
    @Default(String.class)
    String s;
    @Default(int.class)
    int x;
    ResetTest resetTest;
    @Default(Object.class)
    Object ob;

    double f;

    @Override
    public String toString() {
        return "ResetTest{" +
                "s='" + s + '\'' +
                ", x=" + x +
                ", resetTest=" + resetTest +
                ", ob=" + ob +
                ", f=" + f +
                '}';
    }
}
