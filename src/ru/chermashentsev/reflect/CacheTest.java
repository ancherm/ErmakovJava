package ru.chermashentsev.reflect;

public class CacheTest implements Cacheable{
    public String str;

    public CacheTest(String str) {
        this.str = str;
    }

    @Override
    public int test() {
        System.out.println("original");
        return 52;
    }
}
