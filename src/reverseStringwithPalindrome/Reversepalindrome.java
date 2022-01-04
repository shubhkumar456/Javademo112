package reverseStringwithPalindrome;

public class Reversepalindrome {
    public static void main(String[] args) {
        String var="Madam";
        String reverse="";
        String org_str=var;

        for (int i=var.length()-1;i>=0;i--){
            reverse=reverse+var.charAt(i);
        }
        System.out.println("Original String::"+var);
        System.out.println("Reverse String::"+reverse);
        if (org_str.equals(reverse)){
            System.out.println(org_str+" Palindrome ");
        }
        System.out.println(org_str+" Not Palindrome ");
    }
}
