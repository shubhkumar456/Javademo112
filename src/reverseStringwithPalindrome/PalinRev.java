package reverseStringwithPalindrome;

public class PalinRev {
    public static void main(String[] args) {
        String name= "Shubendra Kumar";
        String reverse= "";
        String org_str=name;

        for (int i=name.length()-1;i>=0;i--){
            reverse= reverse+name.charAt(i);
        }
        System.out.println("Reversed String::"+reverse);

        if (org_str.equals(reverse))
            System.out.println("The string is Palindrome");
        else System.out.println("The String is not Palindrome");
    }
}
