package reverseStringwithPalindrome;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Revpalin {
    public static void main(String[] args) {
        String name="madam";
        String reverse="";
        String org=name;

        for (int i=name.length()-1; i>=0; i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if (org.equals(reverse))
            System.out.println("it is plaindrome");
        else
            System.out.println("It is not plaindrome");
    }

}
