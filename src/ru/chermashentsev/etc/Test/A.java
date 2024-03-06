package ru.chermashentsev.etc.Test;

public class A {
    String str;

    public A(String str) {
        this.str = str;
    }

    public int cacheTest() {
        System.out.println("original");
        return 52;
    }

}
