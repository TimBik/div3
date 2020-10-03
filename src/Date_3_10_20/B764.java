package Date_3_10_20;

import java.util.Arrays;
import java.util.Scanner;

public class B764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        int l = (n - 1) / 2;// n = 8 -> l = 3
        int r = n / 2;// n = 8 -> r = 4
        while (l > -1) {
            if (k % 2 == 1) {
                //свапаем
                //подробнее можно посмотреть в папке 26.09.20
                a[l] = a[l] ^ a[r];
                a[r] = a[l] ^ a[r];
                a[l] = a[l] ^ a[r];
            }
            k++;
            l--;
            r++;
        }
        System.out.println(Arrays.toString(a));
    }
}
