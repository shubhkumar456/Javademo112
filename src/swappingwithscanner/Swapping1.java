package swappingwithscanner;

import java.util.Scanner;

public class Swapping1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Value before swapping:"+x+" : "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Value after swapping:"+x+" : "+y);
    }
}
