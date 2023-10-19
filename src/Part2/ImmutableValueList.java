package Part2;

import java.util.Arrays;

public class ImmutableValueList {
    private int[] array;

    //???
    public ImmutableValueList(int[] array) {
        this.array = array.clone();
    }
    public ImmutableValueList(int firstElement, int... numbers) {
        this(concat(firstElement, numbers));
    }
    public ImmutableValueList(ImmutableValueList array) {
        this(array.array);
    }

    private static int[] concat(int firstElement, int[] numbers) {
        // TODO
        return new int[numbers.length + 1];
    }
}
