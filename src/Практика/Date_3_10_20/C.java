package Практика.Date_3_10_20;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum = m;
        int sad = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("+")) {
                sum += sc.nextInt();
            } else {
                int x = sc.nextInt();
                if (sum >= x) {
                    sum -= x;
                } else {
                    sad++;
                }
            }
        }
        System.out.println(sum + " " + sad);
    }
}
