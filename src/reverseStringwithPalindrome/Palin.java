package reverseStringwithPalindrome;

public class Palin {
    public static void main(String[] args) {
        String name = "madam";
        String reverse = "";
        String org_str=name;

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse=reverse+name.charAt(i);
        }
        System.out.println("Original string::"+name);
        System.out.println("Reverse string::"+reverse);

        if (org_str.equals(reverse)) {
            System.out.println("it is palindrome");
        }
        else
            System.out.println("it is not palindrome");

    }
}