package Date_21_11_20;

public class QuickSort {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 6, 6, 3, 2, -1, 7, 2};
        quickSort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    private static void quickSort(int[] mas) {
        quickSort(mas, 0, mas.length - 1);
    }

    private static void quickSort(int[] mas, int ll, int rr) {
        if (rr - ll <= 0) return;
        int k = ll + (rr - ll) << 1; //int k = (ll + ll + rr - ll) / 2;
        int l = ll;
        int r = rr;
        while (l < r) {
            while (mas[l] <= mas[k] && l < k) {
                l++;
            }
            while (mas[r] > mas[k] && r > k) {
                r--;
            }
            if (l == r) break;
            mas[l] = mas[l] ^ mas[r];
            mas[r] = mas[l] ^ mas[r];
            mas[l] = mas[l] ^ mas[r];
            if (l == k) {
                k = r;
            } else if (r == k) {
                k = l;
            }
        }
        quickSort(mas, ll, l - 1);
        quickSort(mas, r + 1, rr);
    }
}
