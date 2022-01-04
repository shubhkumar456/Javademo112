package anagram;

import java.util.Arrays;

public class Anagram3 {
    public static void main(String[] args) {
        String name="Gully Boy";
        String name2="BellBottom";
        System.out.println("Both are anagrams::"+anagram(name,name2));
    }
    public static boolean anagram(String name,String name2){
        char[] ch1=name.toCharArray();
        char[] ch2=name2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
