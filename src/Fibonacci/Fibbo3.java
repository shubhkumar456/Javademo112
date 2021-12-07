package Fibonacci;

import java.util.Scanner;

public class Fibbo3 {
    public static void main(String[] args) {
        int term, a=0,b=1,c;
        System.out.println("Enter Number");
        Scanner var = new Scanner(System.in);
        term = var.nextInt();
        for (int i=1; i<=term; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
}
