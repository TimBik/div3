package Date_19_09_20.PrimeСheck;

import java.util.Scanner;

public class PrimeСheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();

        boolean f = false;
        for (int i = 2; i <= Math.sqrt(p) && !f; i++) {
            if (p % i == 0) {
                System.out.println("p - не простое");
                f = true;
            }
        }
        if (!f) {
            System.out.println("p - простое");
        }
    }
}
