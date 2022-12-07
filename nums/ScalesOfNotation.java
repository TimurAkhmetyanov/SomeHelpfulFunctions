package functions.nums;


public class ScalesOfNotation  {
    public static String decimalToBinaryString(int base10) {
        int b;
        StringBuilder num = new StringBuilder();
        while (base10 != 0) {
            b = base10 % 2;
            num.append(String.valueOf(b));
            base10 = base10 / 2;
        }
        num.reverse();
        return num.toString();
    }

    public static int decimalToBinaryInt(int base10) {
        int b;
        StringBuilder num1 = new StringBuilder();
        while (base10 != 0) {
            b = base10 % 2;
            num1.append(String.valueOf(b));
            base10 = base10/2;
        }
        num1.reverse();
        int num = 0;
        char[] chars = num1.toString().toCharArray();
        for (char c : chars) {
            num = num * 10 + Integer.parseInt(String.valueOf(c));
        }
        return num;
    }
    public static int binaryToDecimal(String base2) {
        int a = Integer.parseInt(base2);
        if (a==0) return 0;
        StringBuilder result = new StringBuilder();
        while (a != 0) {
            result.append(a & 1);
            a >>>= 1;
        }
        return Integer.parseInt(result.reverse().toString());
    }

    public static int binaryToDecimal(int base2) {
        if (base2 == 0) {
            return 0;
        }
        StringBuilder result = new StringBuilder();
        while (base2 != 0) {
            result.append(base2 & 1);
            base2 >>>= 1;
        }
        return Integer.parseInt(result.reverse().toString());
    }
}
