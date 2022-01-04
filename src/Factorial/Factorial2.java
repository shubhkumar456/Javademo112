package Factorial;

public class Factorial2 {
    public static void main(String[] args) {
        int r, fact =1;
        int num =11;
        for ( r=1;r<=num;r++){
            fact=fact*r;
        }
        System.out.println("Factorial of eleven is :"+fact);
    }
}
