package swappingwithscanner;

import java.util.Scanner;

public class Swap_4 {

    public static void main(String[] args) {

        System.out.println("Please enter value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: "+a+" "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap: "+a+" "+ b);
    }
}
