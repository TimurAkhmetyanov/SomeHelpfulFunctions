package functions.nums;

public class ScalesOfNotation  {
    public static String decimalToBinaryString(int a) {
        int b;
        StringBuilder num = new StringBuilder();
        while (a != 0) {
            b = a%2;
            num.append(String.valueOf(b));
            a = a/2;
        }
        num.reverse();
        return num.toString();
    }

    public static int decimalToBinaryInt(int a) {
        int b;
        StringBuilder num1 = new StringBuilder();
        while (a != 0) {
            b = a%2;
            num1.append(String.valueOf(b));
            a = a/2;
        }
        num1.reverse();
        int num = 0;
        char[] chars = num1.toString().toCharArray();
        for (char c : chars) {
            num = num * 10 + Integer.parseInt(String.valueOf(c));
        }
        return num;
    }
}
