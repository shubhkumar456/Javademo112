package reverseStringwithPalindrome;

public class Reversewithpalindrome {
    public static void main(String[] args) {
        String name="JAVA";
        String rev="";
        String org_str=name;

        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("original string::"+name);
        System.out.println("reverse string::"+rev);

        if (org_str.equals(rev)){
            System.out.println(org_str+" is Palindrome");
        }
        else
            System.out.println(org_str+" is not Palindrome");
    }
}
