package ru.chermashentsev.lections;

import ru.chermashentsev.reflect.annotation.Invoke;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;



public class Calc {
    Supplier<Model> supplier;
    Consumer<Model> consumer;
    Map<String, BinaryOperator<Integer>> ops;


    public Calc(Supplier<Model> supplier, Consumer<Model> consumer, Map<String, BinaryOperator<Integer>> ops) {
        this.supplier = supplier;
        this.consumer = consumer;
        this.ops = ops;
    }

    void make() {
        Model model = supplier.get();
        model.res = ops.get(model.operation).apply(model.x, model.y);
        consumer.accept(model);
    }
}


class Model {
    int x, y, res;
    String operation;
}
