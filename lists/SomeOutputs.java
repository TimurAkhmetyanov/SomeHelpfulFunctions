package functions.lists;

public class SomeOutputs {

    public static StringBuilder beforeSymbol(String line, String symbol) {
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
