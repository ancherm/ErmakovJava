package ru.chermashentsev.etc.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AProxy implements InvocationHandler {
    private final A target;

    public AProxy(A target) {
        this.target = target;
    }

    public static A createProxy(A target) {
        return (A) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new AProxy(target)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        // Добавляем свою логику перед вызовом оригинального метода
        if (method.getName().equals("cacheTest")) {
            System.out.println("Proxy: Before calling cacheTest");
            // Вызываем оригинальный метод
            result = method.invoke(target, args);
            // Добавляем свою логику после вызова оригинального метода
            System.out.println("Proxy: After calling cacheTest");
        } else {
            // Если метод не cacheTest, вызываем его напрямую на оригинальном объекте
            result = method.invoke(target, args);
        }

        return result;
    }
}

