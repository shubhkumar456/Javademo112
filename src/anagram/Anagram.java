package anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 ="Shangul";
        String str2 ="Gulshan";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()==str2.length()){
            char[] ch= str1.toCharArray();
            char[] ch2= str2.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch,ch2);

            if (result){
                System.out.println(str1+" and " +str2+ " are anagram.");
            }
            else {
                System.out.println(str1+" and "+str2+" are not anagram.");
            }
        }
        else {
            System.out.println(str1+" and "+str2+" are not anagram.");

        }
    }
}
