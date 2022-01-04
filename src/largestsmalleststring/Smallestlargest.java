package largestsmalleststring;

public class Smallestlargest {
        public static void main(String[] args) {
                String var = "Java is a programming language";
                String [] s = var.split(" ");
                String shortest= s[0], longest="";
                for (String s1:s){
                        if (s1.length()<shortest.length())
                                shortest=s1;
                        else if (s1.length()>longest.length())
                                longest=s1;
                }
                System.out.println("Shortest string is::"+shortest);
                System.out.println("Longest string is::"+longest);

        }
        }
