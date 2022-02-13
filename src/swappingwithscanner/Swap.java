package swappingwithscanner;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        System.out.println(" before swap::"+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swap::"+x+" "+y);

    }
}
