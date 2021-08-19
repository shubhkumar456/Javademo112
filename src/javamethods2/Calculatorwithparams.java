package javamethods2;

public class Calculatorwithparams {

    //addition, substraction, multiplication, division//
    public void addition(int a, int b){
        int result= a+b;
        System.out.println("the sum of two number in addition is---- "+result);
    }

    public void substraction(int a, int b){
        int result= a-b;
        System.out.println("the sum of two number in substraction is---- "+result);
    }

    public void multiplication(int a, int b){
        int result= a*b;
        System.out.println("the sum of two number in multiplication is---- "+result);
    }

    public void division(int a, int b){
        int result= a/b;
        System.out.println("the sum of two number in division is---- "+result);
    }

    public static void main(String[] args) {
        Calculatorwithparams obj = new Calculatorwithparams();
           obj.addition(89,67);
           obj.substraction(756,567);
           obj.multiplication(432,656);
           obj.division(889,11);
    }
}
