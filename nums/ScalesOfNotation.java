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

    public static int someToDecimal (int num, int base) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int j = 0;
        int base10 = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            base10 += (chars[i] - '0') * Math.pow(7, j);
            j++;
        }
        return base10;
    }

    public static int someToDecimal (String num, int base) {
        char[] chars = num.toCharArray();
        int j = 0;
        int base10 = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            base10 += (chars[i] - '0') * Math.pow(7, j);
            j++;
        }
        return base10;
    }
}