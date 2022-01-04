package reverseStringwithPalindrome;

public class ReverseString {
    public static void main(String[] args) {
        String name = "sir";
        String reverse="";
        String org=name;
        for (int i=name.length()-1; i>=0; i--){
            reverse =reverse+name.charAt(i);
        }
        System.out.println("Original string "+name);
        System.out.println("Reverse name "+reverse);

        if (org.equals(reverse)){
            System.out.println(org+" is palindrome");
        }
        else
            System.out.println(org+" is not palindrome");
    }
}
