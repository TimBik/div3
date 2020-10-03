package Date_3_10_20;

import java.util.Arrays;
import java.util.Scanner;

public class A768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mas[i] = x;
        }
        Arrays.sort(mas);
        // 7 4 9 2 2 5
        // 2 2 4 5 7 9
        int min = mas[0];
        int max = mas[n - 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (mas[i] != min && mas[i] != max) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
