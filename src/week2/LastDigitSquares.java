package week2;

import java.util.Scanner;

public class LastDigitSquares {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(calcFib(n));

    }

    public static String calcFib(long n) {
        // Base Case n=0,1
        long a = 0;
        long b = 1;
        if (n <= 1)
            return String.valueOf(n);

        long c = 1;
        long mul = 0;
        long sum = 0;
        long temp = n > 30 ? (n - 1) % 30 : n;
        for (long j = 2; j <= temp; j++) {
            c = a + b;
            a = b;
            b = c;

            c = c % 10;

            mul = (c * c);
            sum = (sum + mul) % 10;

        }

        return String.valueOf(mul % 10);

    }
}
