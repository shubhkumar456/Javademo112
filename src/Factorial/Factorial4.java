package Factorial;

public class Factorial4 {
    public static void main(String[] args) {
        int r,fact=1;
        int num=12;
        for (r=1;r<=num;r++){
            fact=fact*r;
        }
        System.out.println("the factorial of twelve is :"+fact);
    }
}
