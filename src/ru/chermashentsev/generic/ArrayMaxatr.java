package ru.chermashentsev.generic;

import java.util.function.Function;

public class ArrayMaxatr implements Function<Integer[], Integer> {
    @Override
    public Integer apply(Integer[] array) {
        Integer result = array[0];

        for (Integer x : array) {
            if (x > result) result = x;
        }
        return result;
    }
}
