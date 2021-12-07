package swappingwithscanner;

import java.util.Scanner;

public class Swap_5 {

    public static void main(String[] args) {

        System.out.println("Please Enter Value Of A and B");
        Scanner swap = new Scanner(System.in);
        int A = swap.nextInt();
        int B = swap.nextInt();
        System.out.println("Values Before Swapping "+A+" "+ B);

        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("Values AfterSystem.out.println(\"Values Before Swapping \"+A+\" \"+ B); Swapping "+A+" "+ B);
    }
}
