package largestsmalleststring;

public class LargeSmall1 {
    public static void main(String[] args) {
        String var="Java Is a Programming Language";
        String[] a=var.split(" ");
        String shortest=a[0],longest="";
        for (String a1:a){
            if (a1.length()<shortest.length())
                shortest=a1;
            else if (a1.length()>longest.length())
                longest=a1;
        }
        System.out.println("Shortest length is::"+shortest);
        System.out.println("Longest length is::"+longest);
    }
}
