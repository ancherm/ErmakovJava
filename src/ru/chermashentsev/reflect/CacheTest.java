package ru.chermashentsev.reflect;

import ru.chermashentsev.reflect.annotation.Cache;

import java.util.Objects;

public class CacheTest implements Cacheable{
    private String str;

    public CacheTest(String str) {
        this.str = str;
    }
    @Cache
    @Override
    public String test() {
        System.out.println("original");
        return str;
    }

    @Override
    public void setValue(String obj) {
        str = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CacheTest cacheTest = (CacheTest) o;

        return Objects.equals(str, cacheTest.str);
    }

    @Override
    public int hashCode() {
        return str != null ? 31 * str.hashCode() : 0;
    }
}
