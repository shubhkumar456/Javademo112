package anagram;

import java.util.Arrays;

public class Ana {
    public static void main(String[] args) {
        String one="java";
        String two="avaj";
        System.out.println("both string are anagram::"+anagram(one,two));

    }
    public static boolean anagram(String one, String two){
        char[] ch1=one.toCharArray();
        char[] ch2=two.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
