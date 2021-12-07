package Fibonacci;

import java.util.Scanner;

public class Fibbo4 {
    public static void main(String[] args) {
        int var, a=0,b=1,c;
        System.out.println("Enter Value");
        Scanner C = new Scanner(System.in);
        var = C.nextInt();
        for (int i=1; i<=var;i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
