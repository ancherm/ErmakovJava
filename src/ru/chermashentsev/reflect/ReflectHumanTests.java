package ru.chermashentsev.reflect;

import java.lang.reflect.Field;

public class ReflectHumanTests {
    private void testAge(ReflectHuman obj) throws Exception {
        Field ageField = null;
        int age = 0;

        try {
            ageField = obj.getClass().getDeclaredField("age");
            ageField.setAccessible(true);
            age = (int) ageField.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        if (age <= 1 || age >= 200) {
            throw new ValidateException("возраст не в диапозоне от 1 до 200");
        }

//        System.out.println("testAge() прошел");

    }

    private void testName(ReflectHuman obj) throws ValidateException{
        Field nameField = null;
        String name = "";

        try {
            nameField = obj.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            name = (String) nameField.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        char[] nameArray = name.toCharArray();

        if ((nameArray[0] >= 'а' && nameArray[0] <= 'я') || name.length() < 2) {
            throw new ValidateException("имя нужно с большой буквы или длину больше двух");
        }

//        System.out.println("testName() прошел");

    }
}
