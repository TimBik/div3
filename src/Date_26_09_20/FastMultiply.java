package Date_26_09_20;

public class FastMultiply {
    public static void main(String[] args) {
        int a = 192;
        long p = 1234567891011L;
        //возведем число a в степень p
        System.out.println(power(a, p));
    }

    //выводим ответ по этому модулю
    static long mod = (long) (1e9 + 7);

    //возведение в степень
    //работате за O(log(p)),
    //так как степень возведение
    //на каждой итерации цикла
    //уменьшается минимум в 2 раза
    private static long power(long a, long p) {
        long ans = 1;
        while (p > 0) {
            if (p % 2 != 0) {
                ans *= a;
                ans %= mod;
                p--;
            }
            a *= a;
            a %= mod;
            p /= 2;
        }
        return ans;
    }

    //нахождение С из n по k
    //число сочетаний по модулю
    //O(n + k)
    private static long CNK(int n, int k) {
        long ch = fact(n);
        long znam1 = fact(k);
        long znam2 = fact(n - k);
        long znam = (znam1 * znam2) % mod;
        //по малой теореме Ферма
        //м.т.Ферма: b^(p-1) mod p = 1
        //есди p и b не имеют общих делителей
        //Мы выяснили, что a/b mod p =
        // = a * 1/b mod p =
        // = a * b^(p-2) mod p
        znam = power(znam, mod - 2);
        return znam * ch;
    }

    static long fact(long a) {
        long ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }

    //            if (p % 2 == 0) {
//                a *= a;
//                p /= 2;
//            } else {
//                ans *= a;
//                p--;
//            }
}
