package Data_28_11_20;

public class Tern {
    public static void main(String[] args) {
        int[] a = new int[]{1, 6, 8, 10, 4, 2};
        System.out.println(ternarSearch(a));
    }

    private static int ternarSearch(int[] a) {
        int start = 0;
        int end = a.length;
        while (start + 1 < end) {
            int x = (end + start) / 3 - 1;
            int y = (end + start) / 3 * 2 - 1;
            if (a[x] > a[y]) {
                end = y;
            } else {
                start = x;
            }
        }
        return a[start];
    }
}
