package largestsmalleststring;

public class largeSmall {
    public static void main(String[] args) {
        String name = "This is Java Programme Language";
        String[] s = name.split(" ");
        String shortest = s[0], longest = "";

        for (String s1 : s) {
            if (s1.length() < shortest.length())
                shortest = s1;
             else if (s1.length() > longest.length())
                longest = s1;
            }
        System.out.println("Shortest string::" + shortest);
        System.out.println("Longest String::" + longest);
        }
    }
