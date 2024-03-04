package ru.chermashentsev.reflect;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheUtil {
    private Map<String, Object> methodCache = new HashMap<>();
    private Object cachedObject;

    public <T> T cache(T object) {
        if (object == null) {
            return null;
        }

        Class<?> clazz = object.getClass();
        T proxyObject = (T) java.lang.reflect.Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
            String methodName = method.getName();

            if (!methodCache.containsKey(methodName)) {
                methodCache.put(methodName, method.invoke(object));
            } else {
                Method objectMethod = clazz.getMethod(methodName);
                Object currentValue = objectMethod.invoke(object);

                if (!currentValue.equals(methodCache.get(methodName))) {
                    methodCache.put(methodName, currentValue);
                }
            }

            return methodCache.get(methodName);
        });

        cachedObject = object;

        return proxyObject;
    }

    public Object getCachedObject() {
        return cachedObject;
    }

}
