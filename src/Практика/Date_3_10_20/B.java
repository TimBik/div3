//package Практика.Date_3_10_20;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = sc.nextInt();
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(a[i], max);
            min = Math.min(a[i], min);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != min && a[i] != max) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
