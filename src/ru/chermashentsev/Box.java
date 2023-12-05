package ru.chermashentsev;

public class Box<T> {
    T obj;

    public T getObj() {
        T tmpObj = obj;
        obj = null;
        return tmpObj;
    }

    public void setObj(T obj) {
        if (isFill()) throw new IllegalStateException("В коробке уже находится объект");
        this.obj = obj;
    }

    public boolean isFill() {
        return obj != null;
    }


    public String toString() {
        return String.valueOf(obj);
    }
}
