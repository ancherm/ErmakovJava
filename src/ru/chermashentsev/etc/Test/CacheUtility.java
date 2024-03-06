package ru.chermashentsev.etc.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class CacheUtility {
    @SuppressWarnings("unchecked")
    public static <T> T cache(T obj) {
        Class<?> clazz = obj.getClass();
        if (clazz.isInterface()) {
            InvocationHandler handler = new CacheInvocationHandler(obj);
            return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[] { clazz }, handler);
        } else {
            InvocationHandler handler = new CacheInvocationHandler(obj, clazz);
            return (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);
        }
    }

    private static class CacheInvocationHandler implements InvocationHandler {
        private final Object target;
        private final Map<Method, Object> cache;
        private final Class<?> targetClass;

        public CacheInvocationHandler(Object target) {
            this.target = target;
            this.cache = new HashMap<>();
            this.targetClass = target.getClass();
        }

        public CacheInvocationHandler(Object target, Class<?> targetClass) {
            this.target = target;
            this.cache = new HashMap<>();
            this.targetClass = targetClass;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (args != null && args.length > 0) {
                throw new IllegalArgumentException("Cached methods must not have parameters.");
            }

            Method realMethod = targetClass.getMethod(method.getName(), method.getParameterTypes());
            if (!isMethodCached(realMethod)) {
                Object result = realMethod.invoke(target);
                cache.put(realMethod, result);
                return result;
            } else {
                return cache.get(realMethod);
            }
        }

        private boolean isMethodCached(Method method) {
            return cache.containsKey(method);
        }
    }
}

