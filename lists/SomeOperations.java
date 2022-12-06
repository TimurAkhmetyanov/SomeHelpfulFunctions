package functions.lists;

import java.util.stream.IntStream;

public class SomeOperations {
    public static int[] remove(int[] a, int index) {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        return IntStream.range(0, a.length)
                .filter(i -> i != index)
                .map(i -> a[i])
                .toArray();
    }
}
