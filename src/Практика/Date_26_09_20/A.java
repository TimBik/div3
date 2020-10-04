package Практика.Date_26_09_20;//package Практика;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] p = new boolean[n + 1];
        int[] list = new int[1000000];
        int idList = 0;
        //O(nloglog(n))
        for (int i = 2; i <= n; i++) {
            if (!p[i]) {
                list[idList] = i;
                idList++;
                for (int j = i * 2; j <= n; j += i) {
                    p[j] = true;
                }
            }
        }
        // O(n/ln(n))
        for (int i = 0; i < list.length - 1; i++) {
            int id = list[i] + list[i + 1] + 1;
            if (id < p.length && !p[id]) {
                k--;
            }
        }
        if (k <= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
