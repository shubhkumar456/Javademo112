package Fibonacci;

public class Fibbo {
    public static void main(String[] args) {
        int a, b = 1, c = 1;
        a=0;
        System.out.println("1 1 ");
        while (a<=50){
            a=b+c;
            System.out.println(a+" ");
            b=c;
            c=a;

        }


    }
}