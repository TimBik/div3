package Практика.ACM;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 4 || n == 2 || n == 1) {
            System.out.println(-1);
        } else {
            if (n % 3 == 0) {
                System.out.println(n / 3 + " " + 0 + " " + 0);
            } else if (n % 3 == 1) {
                System.out.println((n - 7) / 3 + " " + 0 + " " + 1);
            } else {
                System.out.println((n - 5) / 3 + " " + 1 + " " + 0);
            }
        }
    }
}
