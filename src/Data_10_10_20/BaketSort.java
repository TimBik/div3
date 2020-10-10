package Data_10_10_20;

import java.util.Arrays;
import java.util.Scanner;

public class BaketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 100;
        int[] a = new int[]{1, 3, 99, 4, 2, 2, 4};
        int[] c = new int[k];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        int[] aSort = new int[a.length];
        int id = 0;
        //k <= 10^7
        //O(n + k)
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i]; j++) {
                aSort[id++] = i;
            }
        }
        System.out.println(Arrays.toString(aSort));
    }
}