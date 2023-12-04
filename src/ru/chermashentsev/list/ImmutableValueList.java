package ru.chermashentsev.list;

import java.util.Arrays;

public class ImmutableValueList<T> {
    private T[] array;


    @SafeVarargs
    public ImmutableValueList(T... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public ImmutableValueList(ImmutableValueList<T> array) {
        this(array.array);
    }


    protected void isRightIndex(int index) {
        if (index < 0 || index > array.length-1)    throw new IndexOutOfBoundsException("Выход за пределы массива");
    }


    public T getValue(int index) {
        isRightIndex(index);
        return array[index];
    }

    public int getCurrentLength() {
        return array.length;
    }

    public T[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void changeValue(T value, int index) {
        isRightIndex(index);
        array[index] = value;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
