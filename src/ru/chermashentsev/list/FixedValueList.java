package ru.chermashentsev.list;

import java.util.Arrays;

public class FixedValueList extends ImmutableValueList {
    private int[] array;
    private int currentLength = 0;

    public FixedValueList() {
//        array = new int[100];
        this(100);
    }
    public FixedValueList(int countMaxElements) {
        array = new int[countMaxElements];
    }
    public FixedValueList(FixedValueList list) {
        int[] listArray = list.array;
        array = Arrays.copyOf(listArray, listArray.length);
    }


    private void isFullArray() {
        if (array.length == currentLength) {
            throw new IndexOutOfBoundsException("Массив заполнен целиком");
        }
    }

    public void append(int value){
        isFullArray();
        array[currentLength++] = value;
//        array = Arrays.copyOf(array, array.length);
    }

    public void insert(int index, int...value) {
        isRightIndex(index);
        isFullArray();

        int[] tmpArr = new int[value.length];

        System.arraycopy(value, 0, array, index, value.length);
//        array[index] = value;
//        System.arraycopy(array, index, newArr, index+1, array.length - index);
//
//        return newArr;
    }
}
