package javamethods2;

public class Calwithparamsd2 {

    public void addition(double a, double b){
        double result= a+b;
        System.out.println("the sum of two number in addition is---- "+result);
    }

    public void substraction(double a, double b){
        double result= a-b;
        System.out.println("the sum of two number in substraction is---- "+result);
    }

    public void division(double a, double b){
        double result= a/b;
        System.out.println("the sum of two number in division is---- "+result);
    }

    public void multiplication(double a, double b){
        double result= a*b;
        System.out.println("the sum of two number in multiplication is---- "+result);
    }

    public static void main(String[] args) {
        Calwithparamsd2 obj =new Calwithparamsd2();
             obj.addition(786.5,667.7);
             obj.substraction(989.10,320.87);
             obj.division(656.4,9.5);
             obj.multiplication(65.7,89.3);
    }
}
