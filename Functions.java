package functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Functions {



    public static int dividers (int num) {
        int sum = 0;
        if (num != 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sum += 1;
                }
            }
            return sum + 2;
        }
        return 1;
    }

    public static ArrayList<Integer> binary(int a) {
        int b;
        ArrayList<Integer> num = new ArrayList<>();
        while (a != 0) {
            b = a%2;
            num.add(b);
            a = a/2;
        }
        Collections.reverse(num);
        return num;
    }

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
