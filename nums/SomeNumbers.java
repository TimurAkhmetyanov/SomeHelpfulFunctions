package functions.nums;

import java.util.HashMap;

public class SomeNumbers {

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

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static int akkerman(int m, int n) {
        if (0 == m) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return akkerman(m - 1, 1);
        }
        return akkerman(m - 1, akkerman(m, n - 1));
    }

    public static int tribonacciByNumber(int n) {
        HashMap<Integer, Integer> cashTri = new HashMap<>();
        if (!cashTri.containsKey(1) || !cashTri.containsKey(2) || !cashTri.containsKey(3)) {
            cashTri.put(1, 0);
            cashTri.put(2, 0);
            cashTri.put(3, 1);
            cashTri.put(4, 1);
            cashTri.put(5, 2);
            cashTri.put(6, 4);
        }
        if (!cashTri.containsKey(n)) {
            cashTri.put(n, tribonacciByNumber(n - 1) + tribonacciByNumber(n - 2) + tribonacciByNumber(n - 3));
        }
        return cashTri.get(n);
    }

    public static int fibonacciByNumber(int n) {
        HashMap<Integer, Integer> cashFi = new HashMap<>();
        if (!cashFi.containsKey(1) || !cashFi.containsKey(2)) {
            cashFi.put(1, 0);
            cashFi.put(2, 1);
            cashFi.put(3, 1);
        }
        if (!cashFi.containsKey(n)) {
            cashFi.put(n, fibonacciByNumber(n - 1) + fibonacciByNumber(n - 2));
        }
        return cashFi.get(n);
    }
}
