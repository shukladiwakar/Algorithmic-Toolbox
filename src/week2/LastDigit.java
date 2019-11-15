package week2;
import java.util.Scanner;

public class LastDigit {
    public  static  void  main ( String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcFib(n));
    }

    public  static  long calcFib(int n){
        long [] tmp = new long[n+2];
        tmp[0]=0;
        tmp[1]=1;

        for(int i =2;i<=n;i++){
            tmp[i]= tmp[i-1]+ tmp[i-2];
            tmp[i] %=10;
        }
        return tmp[n] % 10;
    }
}
