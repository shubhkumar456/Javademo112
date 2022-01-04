package anagram;

import java.util.Arrays;

public class Anagram5 {
    public static void main(String[] args) {
        String first="Java";
        String second="avaJ";
        System.out.println("both string are anagram::"+anagram(first,second));
    }
    public static boolean anagram(String first,String second){
        char[] ch=first.toCharArray();
        char[]ch1=second.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }
}
