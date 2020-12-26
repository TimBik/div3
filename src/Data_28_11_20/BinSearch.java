package Data_28_11_20;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println(binSearch(c));
    }

    static double eps = 1e-6;

    private static double binSearch(double c) {
        double start = 1.;
        double end = 1e10 + 1;
        while (start + eps < end) {
            double mid = start + (end - start) / 2;
            if (f(mid) <= c) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static double f(double x) {
        return x * x + Math.sqrt(x);
    }

}
