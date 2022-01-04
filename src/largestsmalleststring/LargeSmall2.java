package largestsmalleststring;

public class LargeSmall2 {
    public static void main(String[] args) {
        String name="Shubendra Kumar";
        String [] a=name.split(" ");
        String shortest=a[0], longest="";

        for (String a1:a){
            if (a1.length()<shortest.length()){
                shortest=a1;
            }
            else if (a1.length()>longest.length()){
                longest=a1;
            }
        }
        System.out.println("Shortest is::"+shortest);
        System.out.println("longest is::"+longest);
    }
}
