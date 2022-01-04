package Fibonacci;

public class Fibbo2 {
    public static void main(String[] args) {
        int x,y=1,z=1;
        x=0;
        System.out.println("1 1 ");
        while (x<=100){
            x=y+z;
            System.out.println(x+ " ");
            y=z;
            z=x;
        }
    }
}
