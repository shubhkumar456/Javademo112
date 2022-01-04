package swappingwithscanner;

import java.util.Scanner;

public class Swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Print value x and y before swap "+x+" "+y);
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println("Print value x and y after swap "+x+" "+y);
    }
}
