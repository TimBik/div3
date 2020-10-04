//package Практика.Date_26_09_20;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        //O(nlog(n))
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            while (a[i] % 2 == 0) {
                a[i] /= 2;
            }
            while (a[i] % 3 == 0) {
                a[i] /= 3;
            }
        }
        boolean ans = true;
        int k = a[0];
        for (int i = 1; i < n && ans; i++) {
            if (k != a[i]) {
                ans = false;
//                System.out.println();
//                System.exit(0);
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }


}
