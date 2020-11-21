package Date_21_11_20;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 1, 8, -1, 2};
        a = merge(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int[] merge(int[] a) {
        if (a.length <= 1) return a;
        int mid = a.length / 2;
        int[] l = new int[mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        l = merge(l);
        int r[] = new int[a.length - l.length];
        for (int i = l.length, j = 0; i < a.length; i++, j++) {
            r[j] = a[i];
        }
        r = merge(r);
        int id = 0;
        int ll = 0;
        int rr = 0;
        for (; ll < l.length && rr < r.length; ) {
            if (l[ll] < r[rr]) {
                a[id] = l[ll];
                ll++;
            } else {
                a[id] = r[rr];
                rr++;
            }
            id++;
        }
        if (ll < l.length) {
            for (int i = ll; i < l.length; i++) {
                a[id++] = l[i];
            }
        }
        if (rr < r.length) {
            for (int i = rr; i < r.length; i++) {
                a[id++] = r[i];
            }
        }
        return a;
    }
}
