package Fibonacci;

import java.util.Scanner;

public class ScannerFibbo {
    public static void main(String[] args) {
        int a,b=1,c=1;
        Scanner sc = new Scanner(System.in);
        a=0;
        System.out.println("Enter the value");
        int m= sc.nextInt();
        while (a<=m){
            a=b+c;
            System.out.println(a+" ");
            b=c;
            c=a;
        }
    }
}
