package Date_24_10_20;

import java.util.Scanner;

public class Palindrom {
    static int[][] dp;
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.next();
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        schet(0, n - 1);
        System.out.println(dp[0][n - 1]);
    }


    private static void schet(int l, int r) {
        if (l > r) {
            dp[l][r] = 0;
            return;
        }
        if (l == r) {
            dp[l][r] = 1;
            return;
        }
        if (s.charAt(l) == s.charAt(r)) {
            if (dp[l + 1][r - 1] == -1) schet(l + 1, r - 1);
            dp[l][r] = 2 + dp[l + 1][r - 1];
        } else {
            if (dp[l + 1][r] == -1) schet(l + 1, r);
            if (dp[l][r - 1] == -1) schet(l, r - 1);
            dp[l][r] = Math.max(dp[l + 1][r], dp[l][r - 1]);
        }

    }
}
