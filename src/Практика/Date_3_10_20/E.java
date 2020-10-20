package Практика.Date_3_10_20;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println(1);
            System.out.println(1);
        } else if (n == 3) {
            System.out.println(2);
            System.out.println(1 + " " + 3);
        } else {
            System.out.println(n);
            for (int i = 2; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }

        }
    }
}
