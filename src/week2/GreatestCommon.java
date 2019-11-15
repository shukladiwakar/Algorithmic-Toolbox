package week2;

import java.util.Scanner;

public class GreatestCommon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(calcy(number1, number2));
    }

    public static int calcy(int a, int b) {
        if (b == 0)
            return a;
        return calcy(b, a%b);
    }
}
