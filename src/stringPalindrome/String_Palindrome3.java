package stringPalindrome;

import java.util.Scanner;

public class String_Palindrome3 {
    public static void main(String[] args) {
        String book, var ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name");
        book = sc.nextLine();

        int lenght =book.length();
        for (int i=lenght-1; i>=0; i--){
            var = var+book.charAt(i);
        }
        if (book.equals(var))
            System.out.println("This book is palindrome");
        else
            System.out.println("This book is not palindrome");

    }
}
