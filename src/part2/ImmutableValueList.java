package part2;

import java.util.Arrays;

public class ImmutableValueList {
    private int[] array;


    public ImmutableValueList(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public ImmutableValueList(ImmutableValueList array) {
        this(array.array);
    }


    protected void isRightIndex(int index) {
        if (index < 0 || index > array.length-1)    throw new IndexOutOfBoundsException("Выход за пределы массива");
    }


    public int getValue(int index) {
        isRightIndex(index);
        return array[index];
    }

    public int getCurrentLength() {
        return array.length;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void changeValue(int value, int index) {
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
