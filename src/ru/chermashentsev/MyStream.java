package ru.chermashentsev;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

// T = String
public class MyStream<T> {
    private List<T> mainList;
    private List<Object> actions = new ArrayList<>();

    private MyStream() {
    }

    @SafeVarargs
    public static <P> MyStream<P> of(P... values) {
        MyStream<P> stream = new MyStream<>();
        stream.mainList = List.of(values);

        return stream;
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        actions.add(predicate);

//        List<T> filteredList = new ArrayList<>();
//
//        for (T element : mainList) {
//            if (predicate.test(element)) filteredList.add(element);
//        }
//        mainList = filteredList;

        return this;
    }

    public <P> MyStream<P> map(Function<T, P> function) {
        actions.add(function);

        MyStream<P> result = (MyStream<P>) this;
//        List<P> resultList = new ArrayList<>();
//
//        for (T element : mainList) {
//            resultList.add(function.apply(element));
//        }
//
//        mainList = (List<T>) resultList;

        return result;
    }

    public T reduce(BinaryOperator<T> sumUp, T init) {
//        if (mainList.isEmpty()) {
//            return Optional.empty();
//        }


        up:
        for (T value : mainList) {
            for (Object action : actions) {
                if (action instanceof Predicate) {
                    Predicate<T> predicate = (Predicate<T>) action;
                    if (predicate.test(value)) continue;
                    else continue up;
                }

                Function function = (Function) action;
                value = (T) function.apply(value);
            }
            init = sumUp.apply(init, value);
        }
        return init;
    }


}

