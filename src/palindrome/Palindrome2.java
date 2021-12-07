package palindrome;

public class Palindrome2 {

    public static void main(String[] args) {
        int r, sum=0,temp;
        int n=234;
        temp=n;
        while (temp>0){
            r=temp%10;
            sum= (sum*10)+r;
            temp=temp/10;
        }
        if(temp==sum)
            System.out.println("palindrome no.");

        else
            System.out.println("not palindrome");
    }
}
