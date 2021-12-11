package anagram;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String ch = "clad";
        String ch2= "Deal";

        ch = ch.toLowerCase();
        ch2= ch2.toLowerCase();

        if (ch.length()==ch2.length()){
            char[] var = ch.toCharArray();
            char[] var2= ch2.toCharArray();

            Arrays.sort(var);
            Arrays.sort(var2);

            boolean output = Arrays.equals(var,var2);

            if (output){
                System.out.println(ch+" and "+ch2+" is anagram");
            }
            else{
                System.out.println(ch+" and "+ch2+" are not anagram");
            }

        }
        else{
            System.out.println(ch+" and "+ch2+" are not anagram");
        }

    }
}
