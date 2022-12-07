package functions;


public class Sorts {
    public static int[] sortByBubbleGrowth(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] sortByBubbleDecrease(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] sortBySelectionGrowth(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            int k = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j] < min){
                    min = a[j];
                    k = j;
                }
            }
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
        return a;
    }

    public static int[] sortBySelectionDecrease(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            int k = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j] > max){
                    max = a[j];
                    k = j;
                }
            }
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
        return a;
    }
}
