package ru.chermashentsev.reflect;

public class ReflectCacheTest {
    public String str;

    public ReflectCacheTest(String str) {
        this.str = str;
    }

    public int cacheTest() {
        System.out.println("original");
        return 52;
    }
}
