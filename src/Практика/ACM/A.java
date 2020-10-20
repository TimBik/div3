package Практика.ACM;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        int ans = 3 * (n / sum);
        n -= (n / sum) * sum;
        for (int i = 0; i < 3; i++) {
            if (n >= a[i]) {
                n -= a[i];
                ans++;
            }
        }
        System.out.println(ans);

    }
}
