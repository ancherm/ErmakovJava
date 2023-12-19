package ru.chermashentsev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

// T = String
public class MyStream<T> {
    private List<T> mainList;

    private MyStream(List<T> list) {
        this.mainList = list;
    }

    private List<T> mainList() {
        return mainList;
    }

    @SafeVarargs
    public static <P> MyStream<P> of(P... values) {
        return new MyStream<>((Arrays.asList(values)));
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T element : mainList) {
            if (predicate.test(element)) filteredList.add(element);
        }
        return new MyStream<>(filteredList);
    }

    public <P> MyStream<P> map(Function<T, P> function) {
        List<P> resultList = new ArrayList<>();

        for (T element : mainList) {
            resultList.add(function.apply(element));
        }

        return new MyStream<>(resultList);
    }

    public Optional<T> reduce(BinaryOperator<T> sumUp) {
        if (mainList.isEmpty()) {
            return Optional.empty();
        }

        T result = mainList.get(0);

        for (int i = 1; i < mainList.size(); i++) {
            result = sumUp.apply(result, mainList.get(i));
        }

        return Optional.of(result);
    }

    public Optional<T> orElse(T defaultValue) {
        if (mainList.isEmpty()) {
            return Optional.of(defaultValue);
        }
        else {
            return Optional.of(mainList.get(0));
        }
    }

}

