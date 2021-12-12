package stringPalindrome;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        String name, var = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        name = s.nextLine();

        int length = name.length();
        for (int i = length - 1; i >= 0; i--) {
            var = var + name.charAt(i);

        }

        if (name.equals(var))
            System.out.println("This is palindrome");
        else
            System.out.println("Not palindrome");
    }
}