package Date_3_10_20;

import java.util.Scanner;

public class AboutXor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            ans = ans ^ a;
        }
        System.out.println(ans);
    }
}
