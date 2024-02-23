package ru.chermashentsev.reflect;

public class ReflectHuman {
    private String name;
    private int age;

    public ReflectHuman(String name) {
        this(0, name);
    }

    public ReflectHuman(int age) {
        this(age, "");
    }

    public ReflectHuman(int age, String name) {
        this.name = name;
        this.age = age;
    }
}
