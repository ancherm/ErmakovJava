package ru.chermashentsev.reflect;

import ru.chermashentsev.reflect.annotation.Invoke;

public class CollectTest {
    @Invoke
    String m1() {
        return "base";
    }

    static Integer m2() {
        return 52;
    }

    @Invoke
    static int m3() {
        return 17;
    }

    @Invoke
    static String m4(String str) {
        return "static with str";
    }

    @Invoke
    static String m5() {
        return "static";
    }
}
