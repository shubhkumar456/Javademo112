package anagram;

public class Anagram1 {
    public static void main(String[] args) {
        int r, sum=0;
        int n=153;
        int temp=n;
        while (n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if (temp==sum)
            System.out.println("This is anagram");
        else
            System.out.println("This is not anagram");
    }
}
