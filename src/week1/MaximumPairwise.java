package week1;

import java.util.Scanner;


public class MaximumPairwise {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long arr[] = new long[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxProduct(arr, number));
    }

    public static long maxProduct(long arr[], int n) {
        if (n < 2) {
            return -1;
        }
        if (n == 2) {
            return arr[0]*arr[1];
        }

        long posa = 0, posb = 0;
        long nega = 0, negb = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > posa) {
                posb = posa;
                posa = arr[i];
            } else if (arr[i] > posb)
                posb = arr[i];

            if (arr[i] < 0 && Math.abs(arr[i]) >
                    Math.abs(nega)) {
                negb = nega;
                nega = arr[i];
            } else if (arr[i] < 0 && Math.abs(arr[i])
                    > Math.abs(negb))
                negb = arr[i];
        }
       // System.out.println( nega +" "+negb);
       // System.out.println( posa +" "+posb);
        if (nega * negb > posa * posb){
            return nega * negb;
        }
        else{
            return posa * posb;
        }
    }
}
