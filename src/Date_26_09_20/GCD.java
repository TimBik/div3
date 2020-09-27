package Date_26_09_20;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));

        // свапаем числа
        int c = a;
        a = b;
        b = c;

        a = a + b;
        // a -> a + b;
        b = a - b;
        // a -> a + b;
        // b -> a;
        a = a - b;

        a = a ^ b;
        // a -> a ^ b
        b = a ^ b;
        // b -> (a ^ b) ^ b = a ^ (b ^ b) = a ^ 0 = a
        // a -> a ^ b
        a = a ^ b;
        // b -> a
        // a -> (a ^ b) ^ a = (a ^ a) ^ b = 0 ^ b = b

        // ^ = xor
        // 0011101011 ^ 0010101001 = смотрим на каждый бит числа
        // и заменяем этот бит на сумму по модулю 2
        // (1 + 1) % 2 = 0 => самый правый бит = 0
        // (1 + 0) % 2 = 1 => пред последний бит = 1
        //....
        // 0011101011 ^ 0010101001 = 1001000010

    }

    // находим НОД двух чисел
    // gcd(a,b) = gcd(b,a%b) = gcd(a%b,b % (a % b)) =
    // = ... = gcd(b',0) = b'
    private static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    // находим НОД двух чисел, используя рекурсию
    private long gcd2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd2(b, a % b);
    }

    // находим НОД двух чисел, используя
    // рекурсию и тернарные условия
    private long gcd3(int a, int b) {
        return b == 0 ? a : gcd3(b, a % b);
    }

    //находим НОК двух чисел
    //заметим, что НОК(a,b) = a * b / НОД(a,b)
    private long gck(int a, int b) {
        return a * b / gcd(a, b);
    }

    //Находим НОД(a1,a2,...,an)
    //пример: НОД(a1,a2,a3,a4) = НОД(НОД(НОД(a1,a2),a3),a4)
    //Чтобы найти НОД(...) нескольких чисел
    //достаточно брать последовательно НОД у
    // любых двух чисел, каждую итерацию
    // кол-во чисел будет уменьшаться на 1
    private long gcd(int[] a) {
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans = gcd(ans, a[i]);
        }
        return ans;
    }

}
