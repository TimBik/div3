//package Практика.Date_26_09_20;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cons = (int) 1e5 + 10;
        int[] a = new int[cons];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()]++;
        }
        // 0 0 1 0 ... 0
        boolean[] tr = new boolean[cons];
        int ans[] = new int[cons];
        for (int i = 2; i < cons; i++) {
            if (!tr[i]) {
                ans[i] += a[i];
                for (int j = i * 2; j < cons; j += i) {
                    tr[j] = true;
                    ans[i] += a[j];
                }
            }
        }
        int max = 1;
        for (int i = 0; i < ans.length; i++) {
            max = Math.max(ans[i],max);
        }
        System.out.println(max);
    }
}
