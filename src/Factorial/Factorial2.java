package Factorial;

public class Factorial2 {
    public static void main(String[] args) {
        int a,sum=1;
        int value = 7;
        for (a=1;a<=value;a++){
            sum=sum*a;
        }
        System.out.println("factorial of :"+value+ " is "+sum);
    }
}
