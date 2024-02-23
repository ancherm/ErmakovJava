package ru.chermashentsev.lections;

import ru.chermashentsev.etc.Methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Lection1 {

/**<h2> Рефлексия:</h2>
 *
 *<h3>1. Инспекция - проверить в классе есть</h3>
 *<h3>2. Изменение - добавить в класс поля, методы, конструкты</h3>
 *<h3>3. Использование - создать объект, вызывать метод, работать с полем</h3>
 **/

//TODO
// Зачем нужна рефлексия


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();



        /*Class cls1 = a.getClass(); // метод
        Class cls2 = A.class; // литерал класса*/


        //System.out.println(cls3);

//        System.out.println(cls4.isAnnotation());

        /*System.out.println(int.class);
        System.out.println(void.class);*/




        // 1. Найди какой-то класс
        Class cls3 = Class.forName(sc.next()); // литерал класса

        // 2. Создай его объект
        Constructor constructor = cls3.getDeclaredConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);

        // 3. Найди какое-то поле
        Field field = cls3.getDeclaredField(sc.next());
        field.setAccessible(true);

        // 4. Считываем значение и записываем в поле
        field.set(o, sc.next());

        // 5. Находим метод без параметров и вызываем его
        Method method = cls3.getMethod(sc.next());
        method.setAccessible(true);
        method.invoke(cls3);
        System.out.println(method);

    }
}





class A implements Able{

    String x;
    @ToString2() // нормальная
    int num = 42;
    public A() {}
    public void m() {
        System.out.println("A: " + x);
    }
}