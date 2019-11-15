package week2;//package com.company.assignment2;

import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        System.out.println(calculateLCM(number1, number2));
    }

    public  static  long calculateLCM (long number1 , long number2){

        long hcf = calcy(number1,number2);
        long multiple = number1*number2;
        return multiple / hcf;
    }


    public static long calcy(long a, long b) {
        if (b == 0)
            return a;
        return calcy(b, a%b);
    }
}
