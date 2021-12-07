package palindrome;

import java.util.Scanner;

public class Palindrome3 {

    public static void main(String[] args) {
        int a; int sum=0; int temp,x;

        System.out.println("enter value");
        Scanner S = new Scanner(System.in);
        a=S.nextInt();
        temp=a;
        while (a>0){
            x=a%10;
            sum=(sum*10)+x;
            a=a/10;
        }
        if (temp==sum)
            System.out.println("palindrome number");
        else
            System.out.println("not Palindrome");
    }
}
