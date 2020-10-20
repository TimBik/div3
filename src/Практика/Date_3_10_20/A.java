//package Практика.Date_3_10_20;
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = x;
        }
        int[] ans = new int[]{0, 0};
        int l = 0;
        int r = n - 1;
        for (int i = 0; i < n; i++) {
            int x = a[r];
            if (a[l] > a[r]) {
                x = a[l];
                l++;
            } else {
                r--;
            }
            ans[i % 2] += x;
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
