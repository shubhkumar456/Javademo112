package javamethods2;

public class Inputpmtr2 {

    public void addition(double a,double b,double c,double d, double e){

        double result = a+b+c+c+d+e;
        System.out.println("The sum of all the numbers in addition  --- " +result);
    }

    public void multi(double a,double b,double c,double d, double e){

        double result = a*b*c*c*d*e;
        System.out.println("The sum of all the numbers in multiplication  --- " +result);
    }

    public void subs(double a,double b,double c,double d, double e){

        double result = a-b-c-c-d-e;
        System.out.println("The sum of all the numbers in substraction  --- " +result);
    }

    public void division(double a,double b,double c,double d, double e){

        double result = a/b/c/c/d/e;
        System.out.println("The sum of all the numbers in division  --- " +result);
    }


    public static void main(String[] args) {
        Inputpmtr2 object = new Inputpmtr2();
         object.addition(20.6,30.5,32.5,45.8,50.5);
         object.multi(11.2,12.3,32.3,43.2,54.6);
         object.subs(500.6,30.7,45.6,67.5,12.4);
         object.division(1255.5,2.5,3.5,4.5,5.6);
    }
}
