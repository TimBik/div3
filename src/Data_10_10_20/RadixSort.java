package Data_10_10_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        int k = 3;
        int[] a = new int[]{111, 233, 299, 114, 32, 12, 4};
        int st = 10;
        int kp = 1;
        ArrayList<Integer>[] pr = new ArrayList[st + 1];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < st + 1; j++) {
                pr[j] = new ArrayList<>();
            }

            for (int j = 0; j < a.length; j++) {
                if (a[j] / kp > 0) {
                    pr[(a[j] / kp) % 10].add(j);
                } else {
                    pr[st].add(j);
                }
            }

            int id = 0;
            int[] b = new int[a.length];

            for (int j = 0; j < pr[st].size(); j++) {
                b[id++] = a[pr[st].get(j)];
            }

            for (int j = 0; j < st; j++) {
                for (int l = 0; l < pr[j].size(); l++) {
                    b[id++] = a[pr[j].get(l)];
                }
            }

            a = b;
            kp *= st;
        }
        System.out.println(Arrays.toString(a));
    }
}
