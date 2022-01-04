package reverseStringwithPalindrome;

import java.awt.*;

public class ReversePalin {
    public static void main(String[] args) {
        String name="Madam";
        String rev="";
        String Org_Str=name;

        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Original string::" +name);
        System.out.println("Reverse string::"+rev);
        if (Org_Str.equals(rev))
            System.out.println("It is plaindrome");
        else
            System.out.println("It is not palindrome");
    }
}
