package Factorial;

public class Factorial1 {
    public static void main(String[] args) {
     int r, fact=1;
     int num=10;
     for (r=1;r<=num;r++){
         fact=fact*r;
     }

        System.out.println("Factorial of ten is ="+fact);
    }
}
