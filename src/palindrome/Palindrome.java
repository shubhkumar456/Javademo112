package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int x;
        int sum = 0;
        int y = sc.nextInt();
        int temp = y;

        while (y > 0) {
            x = y % 10;
            y = y / 10;
            sum = sum * 10 + x;
        }
        if (temp==sum)
            System.out.println("It is palindrome");
        else
            System.out.println("it is not");
    }
}