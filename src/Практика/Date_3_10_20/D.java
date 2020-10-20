//package Практика.Date_3_10_20;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] aa = new int[5];
        int[] bb = new int[5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            aa[a[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            bb[b[i] - 1]++;
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int del = Math.abs(aa[i] - bb[i]);
            if (del % 2 == 1) {
                System.out.println(-1);
                return;
            }
            sum += del / 2;
        }
        System.out.println(sum / 2);
    }
}
