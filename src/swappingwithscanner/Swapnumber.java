package swappingwithscanner;

import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Please enter the value before swap "+x+" "+y);
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println("Print value x and y before swap "+x+" "+y);

    }
}
