package Date_24_10_20;

import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - w[i] >= 0 && c[i] + dp[i - 1][j - w[i]] > dp[i][j]) {
                    dp[i][j] = c[i] + dp[i - 1][j - w[i]];
                }
            }
        }
    }
}
