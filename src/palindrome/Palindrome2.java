package palindrome;

public class Palindrome2 {
    public static void main(String[] args) {
        int a;
        int sum =0;
        int x=161;
        int temp=x;
        while (x>0){
            a=x%10;
            x=x/10;
            sum = sum*10+a;
        }
        if (temp==sum)
            System.out.println("it is palindrome");
        else
            System.out.println("it is not palindrome");

    }
}
