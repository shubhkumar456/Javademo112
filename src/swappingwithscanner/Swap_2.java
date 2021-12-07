package swappingwithscanner;

import java.util.Scanner;

public class Swap_2 {

    public static void main(String[] args) {

        System.out.println("Enter the value of a and b");
        Scanner S = new Scanner(System.in);
        int a =S.nextInt();
        int b =S.nextInt();

        System.out.println("before swapping numbers :"+a +" "+ b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swapping the number: "+a+" "+ b);
    }

}
