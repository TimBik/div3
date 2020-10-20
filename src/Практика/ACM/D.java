package Практика.ACM;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        if (m == 0) {
            System.out.println(a[n - 1] - a[0]);
        }
        for (int i = n - 2; i >= 0 && m > 0; i--, m--) {
            a[n - 1] += a[i];
        }
        System.out.println(a[n - 1]);
    }
}
