package ru.chermashentsev.reflect;

import ru.chermashentsev.geometry.line.Line;
import ru.chermashentsev.reflect.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import java.lang.reflect.Proxy;
import java.util.stream.Collectors;

public class ReflectUtils {
    public static List<Field> getFields(Class clz) {
        List<Field> fields = new ArrayList<>(Arrays.asList(clz.getFields()));

        while (clz != Object.class) {
            fields.addAll(Arrays.asList(clz.getDeclaredFields()));
            clz = clz.getSuperclass();
        }

        return fields;
    }



    // 7.1.1
    public static List<Field> fieldCollection(Object obj) {
        Class clz = obj.getClass();
        List<Field> resultList = new ArrayList<>(Arrays.asList(clz.getFields()));


        while (clz != Object.class) {
            resultList.addAll(List.of(clz.getDeclaredFields()));
            clz = clz.getSuperclass();
        }

        return resultList;
    }

    // 7.1.2
    public static void lineConnector(Line line1, Line line2) throws NoSuchFieldException, IllegalAccessException {
        Field lineEndField = line1.getClass().getDeclaredField("end");
        Field lineStartField = line2.getClass().getDeclaredField("start");

        lineEndField.setAccessible(true);
        lineStartField.setAccessible(true);

        lineStartField.set(line2, lineEndField.get(line1));

    }

    // 7.1.4
    private static List<Exception> validate(Object obj) {
        Class<?> clz = obj.getClass();
        Class<?>[] classTests = null;

        List<Annotation> annotationList = List.of(clz.getDeclaredAnnotations());


        if (clz.isAnnotationPresent(Validate.class)) {
            classTests = clz.getAnnotation(Validate.class).value();
        } else {
            for (Annotation a : annotationList) {
                if (a.annotationType().isAnnotationPresent(Validate.class)) {
                    classTests = a.annotationType().getAnnotation(Validate.class).value();
                    break;
                }
            }
        }

        if (classTests == null) {
            return new ArrayList<>();
        }

        List<Exception> exceptions = new ArrayList<>();

        for (Class<?> clzTest : classTests) {

            List<Method> methodList = List.of(clzTest.getDeclaredMethods());

            Object humanTests;
            try {
                Constructor<?> constructor = clzTest.getDeclaredConstructor();
                constructor.setAccessible(true);

                humanTests = constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }

            for (Method method : methodList) {
                method.setAccessible(true);

                if (!method.isAnnotationPresent(Test.class)) continue;

                try {
                    method.invoke(humanTests, obj);

                }
                catch (IllegalAccessException | InvocationTargetException e) {
                    if (e.getCause() instanceof ValidateException) {
                        exceptions.add((Exception) e.getCause());
                    } else {
                        throw new RuntimeException(e.getCause());
                    }
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        }
        return exceptions;

    }


    public static List<Exception> validate(Object...objects) {
        List<Exception> exceptions = new ArrayList<>();
        for (Object obj : objects)
            exceptions.addAll(validate(obj));
        return exceptions;
    }


    // 7.1.6

    @SuppressWarnings("unchecked")
    public static<T> T cache(T object) {
        if (object == null)  throw new IllegalArgumentException("object равен null");

        Class<?> clz = object.getClass();
        ClassLoader classLoader = clz.getClassLoader();

        Map<Method, Object> cacheMethods = new HashMap<>();
        Map<Field, Object> fieldValueMap = new HashMap<>();

        if (clz.isInterface())
            return (T) Proxy.newProxyInstance(classLoader, new Class[]{clz}, new CacheHandler(object));

        T resultProxyObject = (T) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                for (Field field : clz.getDeclaredFields()) {

                    if (!fieldValueMap.containsKey(field)) {
                        fieldValueMap.put(field, field.get(object));
                        cacheMethods.put(method, method.invoke(object));
                    } else if (fieldValueMap.containsKey(field) &&
                            fieldValueMap.get(field) != clz.getDeclaredField(field.getName()).get(object)) {

                        fieldValueMap.put(field, field.get(object));
                        cacheMethods.put(method, method.invoke(object));
                    } /*else {
                        Object value = clz
                                .getMethod(method.getName())
                                .invoke(object);
                        if (value != cacheMethods.get(method)) {
                            cacheMethods.put(method, value);
                        }
                    }*/
                }

                return cacheMethods.get(method);

            }
        });

        return (T) resultProxyObject;

    }

    // 7.3.1
    public static Map<String, Object> collect(Class...classes) {
        Map<String, Object> resultMap = new HashMap<>();

        for (Class clz : classes) {
            List<Method> methods = List.of(clz.getDeclaredMethods());

            for (Method method : methods) {
                method.setAccessible(true);

                if (!method.isAnnotationPresent(Invoke.class) ||
                        method.getParameterCount() != 0 ||
                        method.getReturnType() == void.class) {

                    continue;
                }

                try {

                    if (Modifier.isStatic(method.getModifiers())) {
                        resultMap.put(method.getName(), method.invoke(null));
                    }
                    else if (!method.getReturnType().isPrimitive()) {
                        resultMap.put(method.getName(), method.invoke(clz.getDeclaredConstructor().newInstance()));
                    }

                } catch (IllegalAccessException | InvocationTargetException | InstantiationException |
                         NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return resultMap;
    }


    // 7.3.2
    public static void reset(Object...objects) {
        for (Object obj : objects) {
            List<Field> fields = fieldCollection(obj);

            if (obj.getClass().isAnnotationPresent(Default.class)) {
                for (Field field : fields) {
                    DefaultValues.setFieldValue(obj, field, field.getType());
                }

            } else {

                for (Field field : fields) {
                    Default fieldDefaultAnnotation = field.getAnnotation(Default.class);

                    if (fieldDefaultAnnotation != null) {
                        Class fieldDefaultValue = fieldDefaultAnnotation.value();
                        DefaultValues.setFieldValue(obj, field, fieldDefaultValue);
                    }

                }
            }

        }
    }


}
