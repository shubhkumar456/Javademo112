package Fibonacci;

import java.util.Scanner;

public class Fibbo2 {

    public static void main(String[] args) {
        int term,a=0, b=1,c;
        System.out.println("Enter number");
        Scanner S = new Scanner(System.in);
        term = S.nextInt();
        for (int i=1; i<=term;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
