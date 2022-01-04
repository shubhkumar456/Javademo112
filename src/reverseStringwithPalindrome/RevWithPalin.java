package reverseStringwithPalindrome;

public class RevWithPalin {
    public static void main(String[] args) {
        String name="Shubendra Kumar";
        String reverse="";
        String org= name;

        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("original string:"+name);
        System.out.println("reverse string:"+reverse);

        if (org.equals(reverse)){
            System.out.println("This is palindrome");
        }
        else System.out.println("This is not plaindrome");
    }
}
