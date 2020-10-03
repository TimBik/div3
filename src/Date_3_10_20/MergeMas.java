package Date_3_10_20;

import java.util.Arrays;

public class MergeMas {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 7, 10, 11, 120, 130};
        int[] b = new int[]{2, 3};
        int[] c = new int[a.length + b.length];
        int al = 0;
        int bl = 0;
        for (int i = 0; i < c.length && al < a.length && bl < b.length; i++) {
            int k;
            if (a[al] < b[bl]) {
                k = a[al];
                al++;
            } else {
                k = b[bl];
                bl++;
            }
            c[i] = k;
        }
        while (al < a.length) {
            c[b.length + al] = a[al];
            al++;
        }
        while (bl < b.length) {
            c[a.length + bl] = b[bl];
            bl++;
        }
        System.out.println(Arrays.toString(c));
    }
}
