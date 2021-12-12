package stringPalindrome;

import java.util.Scanner;

public class String_palindrome4 {
    public static void main(String[] args) {
        String mobile, val ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        mobile = sc.nextLine();

        int length = mobile.length();
        for (int i=length-1; i>=0; i--){
            val = val+mobile.charAt(i);
        }
        if (mobile.equals(val))
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
    }
}
