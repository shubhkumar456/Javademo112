package javamethods2;

public class Calwithparamsdoubleforms {

    public void addition(double a, double b){
        double result= a+b;
        System.out.println("the sum of two number in addition is---- "+result);
    }

    public void multiplication(double a, double b){
        double result= a*b;
        System.out.println("the sum of two number in multiplication is---- "+result);
    }

    public void substraction(double a, double b){
        double result= a-b;
        System.out.println("the sum of two number in substraction is---- "+result);
    }

    public void division(double a, double b){
        double result= a/b;
        System.out.println("the sum of two number in division is---- "+result);
    }

    public static void main(String[] args) {

        Calwithparamsdoubleforms obj = new Calwithparamsdoubleforms();
             obj.addition(354.67,452.89);
             obj.multiplication(67.5,89.3);
             obj.substraction(432.7,234.8);
             obj.division(456.5,7.5);
    }
}
