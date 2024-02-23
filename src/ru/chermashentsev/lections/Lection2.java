package ru.chermashentsev.lections;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PublicKey;
import java.util.*;
import java.util.stream.Collectors;

public class Lection2 {
    public static void main(String[] args) {
        Annotation[] annotations = A.class.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));


//        ToStringAnnotationHandler ts = new ToStringAnnotationHandler();

        A a = new A();
        a.x = "text";
        Able able = (Able)Proxy.newProxyInstance(
                a.getClass().getClassLoader(),
                a.getClass().getInterfaces(),
                new ToStringAnnotationHandler(a)
        );
        System.out.println(able);

        able.m();
        able.toString();
        able.equals(null);
    }
}

class ToStringAnnotationHandler implements InvocationHandler {
    Object able;
    List<Field> toStringFields = new ArrayList<>();

    public ToStringAnnotationHandler(Object able) {
        this.able = able;
        Field[] fields = able.getClass().getDeclaredFields();
        toStringFields = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(ToString.class))
                .collect(Collectors.toList());


    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.getName().equals("toString"))
            return method.invoke(able,args);
        Map<String, Object> res = new HashMap<>();
        for (Field f : toStringFields) {
            res.put(f.getName(), f.get(able));
        }
        return able.getClass().getName() + res;
    }
}


class DataPrinterProxy implements InvocationHandler {
    Object able;

    public DataPrinterProxy(Object able) {
        this.able = able;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date() + " = " + method.getClass());
        return method.invoke(able, args);
    }
}

interface Able {
    public void m();
}


//Аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface ToString{
    String text();
} //маркерная аннотация

@interface ToString2{
    YesOrNo value() default YesOrNo.YES;
}


enum YesOrNo {
    YES, NO
}