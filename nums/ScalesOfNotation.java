package functions.nums;

public class ScalesOfNotation  {
    public static String decimalToBinaryString(int base2) {
        int b;
        StringBuilder num = new StringBuilder();
        while (base2 != 0) {
            b = base2%2;
            num.append(String.valueOf(b));
            base2 = base2/2;
        }
        num.reverse();
        return num.toString();
    }

    public static int decimalToBinaryInt(int base2) {
        int b;
        StringBuilder num1 = new StringBuilder();
        while (base2 != 0) {
            b = base2%2;
            num1.append(String.valueOf(b));
            base2 = base2/2;
        }
        num1.reverse();
        int num = 0;
        char[] chars = num1.toString().toCharArray();
        for (char c : chars) {
            num = num * 10 + Integer.parseInt(String.valueOf(c));
        }
        return num;
    }
    public static int binaryToDecimal(String base10) {
        int a = Integer.parseInt(base10);
        if (a==0) return 0;
        StringBuilder result = new StringBuilder();
        while (a != 0) {
            result.append(a & 1);
            a >>>= 1;
        }
        return Integer.parseInt(result.reverse().toString());
    }

    public static int binaryToDecimal(int base10) {
        if (base10==0) return 0;
        StringBuilder result = new StringBuilder();
        while (base10 != 0) {
            result.append(base10 & 1);
            base10 >>>= 1;
        }
        return Integer.parseInt(result.reverse().toString());
    }
}
