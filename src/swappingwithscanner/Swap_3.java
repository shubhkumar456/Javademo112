package swappingwithscanner;

import java.util.Scanner;

public class Swap_3 {
    public static void main(String[] args) {

        System.out.println("enter value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Values before swapping:"+ a+" "+ b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values after swapping: "+a+" "+ b);
    }
}
