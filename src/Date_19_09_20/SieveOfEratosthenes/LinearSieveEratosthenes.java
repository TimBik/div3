package Date_19_09_20.SieveOfEratosthenes;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSieveEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> p = new ArrayList<>();

        int[] lp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (lp[i] == 0) {
                lp[i] = i;
                p.add(i);
            }
            for (int j = 0; j < p.size() && p.get(j) <= lp[i] && i * p.get(j) < lp.length; j++) {
                lp[i * p.get(j)] = p.get(j);
            }
        }

        for (int i = 0; i < p.size(); i++) {
            System.out.print(p.get(i) + " ");
        }
    }
}