package ru.chermashentsev.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class CacheProxy<T> {
    private T object;
    private Map<Field, Object> fieldObjectMap = new HashMap<>();
    private Map<Method, Object> cachedMethods = new HashMap<>();

    public CacheProxy(T object) {
        this.object = object;
    }

    private void cacheMethods() {

    }


}
