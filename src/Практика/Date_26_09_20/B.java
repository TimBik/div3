//package Практика.Date_26_09_20;

import java.io.PrintWriter;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt() + 1;

        boolean[] tr = new boolean[n + 1];
        //O(n(log(log(n))))
        for (int i = 2; i <= n; i++) {
            if (!tr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    tr[j] = true;
                }
            }
        }
        // 2 3 - 2
        if (n < 4) {
            pw.println(1);
        } else {
            pw.println(2);
        }
        for (int i = 2; i <= n; i++) {
            pw.print((tr[i] ? 2 : 1) + " ");
        }
        pw.close();
    }
}
