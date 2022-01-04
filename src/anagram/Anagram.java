package anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Shangul";
        String str2 = "Gulshan";
        System.out.println("Both strings are anagram ::"+anagram(str1,str2));
    }
    public static boolean anagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }





}