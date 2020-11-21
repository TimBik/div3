package Date_21_11_20;

public class BubleSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, -1, 4, 2, 2, 7};
        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        a[j] = a[j] ^ a[j + 1];
                        a[j + 1] = a[j] ^ a[j + 1];
                        a[j] = a[j] ^ a[j + 1];
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
