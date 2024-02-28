package ru.chermashentsev.reflect;

public class ObjectReadWriteTest {
    String s1;
    int x;
    float f;

    public ObjectReadWriteTest(String s1, int x, float f) {
        this.s1 = s1;
        this.x = x;
        this.f = f;
    }

    @Override
    public String toString() {
        return "ObjectReadWriteTest{" +
                "s1='" + s1 + '\'' +
                ", x=" + x +
                ", f=" + f +
                '}';
    }
}
