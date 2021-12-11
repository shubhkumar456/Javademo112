package anagram;

import java.util.Arrays;

public class Anagram4 {
    public static void main(String[] args) {
        String S="Lenovo";
        String S2="Asus";

        S=S.toLowerCase();
        S2=S2.toLowerCase();

        if (S.length()==S2.length()){
            char[]a=S.toCharArray();
            char[]a2=S2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(a2);
            boolean result = Arrays.equals(a,a2);
            if(result){
                System.out.println(S+" and "+S2+" are anagram ");
            }
            else {
                System.out.println(S+" and "+S2+" are not anagram ");
            }
        }
        else {
            System.out.println(S+" and "+S2+" are not anagram ");
        }
    }
}
