package Date_19_09_20.SieveOfEratosthenes;

import java.util.Scanner;

public class SieveEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] p = new boolean[n + 1];

        for (int i = 2; i < n + 1; i++) {
            if (!p[i]) {
                System.out.print(i + " ");
                for (int j = i * 2; j < 1 + n; j += i) {
                    p[j] = true;
                }
            }
        }
    }
}
