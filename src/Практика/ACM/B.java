package Практика.ACM;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] R = new int[n];
        int[] prefixL = new int[n];
        int[] prefixR = new int[n];
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                L[i] = 1;
            } else {
                R[i] = 1;
            }
        }
        prefixL[0] = L[0];
        prefixR[0] = R[0];
        for (int i = 1; i < n; i++) {
            prefixL[i] = prefixL[i - 1] + L[i];
            prefixR[i] = prefixR[i - 1] + R[i];
        }
        int min = (prefixR[n - 1] - prefixR[0]);
        for (int i = 1; i < n; i++) {
            int nowMin = prefixL[i - 1] + (prefixR[n - 1] - prefixR[i]);
            min = Math.min(min, nowMin);
        }
        System.out.println(min);

    }
}
