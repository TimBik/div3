package Date_21_11_20;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 8, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
