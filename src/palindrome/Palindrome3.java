package palindrome;

public class Palindrome3 {
    public static void main(String[] args) {
        int r, sum=0;
        int n=121;
        int temp=n;
        while (n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
            if (temp==sum)
                System.out.println("This is Palindrome number");
            else
                System.out.println("This is not Palindrome number");
    }
}
