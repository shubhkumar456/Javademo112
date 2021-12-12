package stringPalindrome;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String name, var="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        name = sc.nextLine();

        int length = name.length();
        for (int i=length-1;i>=0; i--){
            var = var+name.charAt(i);
        }
        if (name.equals(var))
            System.out.println("This is palindrome");
        else
            System.out.println("This is not palindrome");
    }
}
