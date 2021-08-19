package javamethods2;

public class Inputpmtr {

    public void addition(int a,int b,int c,int d, int e){

        int result = a+b+c+c+d+e;
        System.out.println("The sum of all the numbers in addition  --- " +result);
    }

    public void substraction(int a,int b,int c,int d, int e){

        int result = a-b-c-c-d-e;
        System.out.println("The sum of all the numbers in substraction  --- " +result);
    }

    public void multiplication(int a,int b,int c,int d, int e){

        int result = a*b*c*c*d*e;
        System.out.println("The sum of all the numbers in multiplication  --- " +result);
    }

    public void division(int a,int b,int c,int d, int e){

        int result = a/b/c/d/e;
        System.out.println("The sum of all the numbers in division  --- " +result);
    }

    public static void main(String[] args) {
        Inputpmtr object = new Inputpmtr();
          object.addition(100,200,300,600,999);
          object.substraction(5000,500,300,1000,700);
          object.multiplication(32,43,54,65,89);
          object.division(20000,300,30,20,10);
    }
}
