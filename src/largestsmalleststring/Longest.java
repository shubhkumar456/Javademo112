package largestsmalleststring;

public class Longest {
    public static void main(String[] args) {
        String name="this is Spring booot project";
        String [] s= name.split(" ");
        String shortest=s[0],longest="";
        for (String s1 : s){
            if (s1.length()<shortest.length())
                shortest=s1;
            else if
            (s1.length()>longest.length())
                longest=s1;
        }
        System.out.println("shortest string ::"+shortest);
        System.out.println("Longest string is::"+longest);
    }
}
