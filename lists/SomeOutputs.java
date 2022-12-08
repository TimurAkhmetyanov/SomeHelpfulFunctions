package functions.lists;

public class SomeOutputs {
    public static int beforeDigit (char[] line, int digit) {
        int n = 0;
        for (char c : line) {
            if (c == (char)(digit + '0'))
                return n;
            else {
                n = n * 10 + Integer.parseInt(String.valueOf(c));
            }
        }
        return n;
    }

    public static StringBuilder beforeSymbol (String line, String symbol) {
        char[] chars = line.toCharArray();
        char ch = symbol.charAt(0);
        StringBuilder out = new StringBuilder();
        for (char c : chars) {
            if (c == ch) {
                return out;
            }
            else {
                out.append(String.valueOf(c));
            }
        }
        return out;
    }
}
