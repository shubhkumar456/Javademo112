package anagram;

import java.util.Arrays;

public class Anagram3 {
    public static void main(String[] args) {
        String name= "lenskart";
        String name2= "Opticals";

        name=name.toLowerCase();
        name2=name2.toLowerCase();

        if (name.length()==name2.length()){
            char[] n = name.toCharArray();
            char[] n2=name2.toCharArray();

            Arrays.sort(n);
            Arrays.sort(n2);
            boolean result = Arrays.equals(n,n2);

            if (result){
                System.out.println(name+" and "+name2+" are anagram ");
            }
            else {
                System.out.println(name+" and "+name2+" are not anagram ");
            }
        }
        else {
            System.out.println(name+" and "+name2+" are not anagram ");
        }
    }
}
